package com.emissor.nfe310.webservices;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Arrays;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;
import org.joda.time.LocalDateTime;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

import com.emissor.nfe310.NFeConfig;
import com.emissor.nfe310.assinatura.AssinaturaDigital;
import com.emissor.nfe310.classes.NFAutorizador31;
import com.emissor.nfe310.classes.evento.NFEnviaEventoRetorno;
import com.emissor.nfe310.classes.evento.NFEvento;
import com.emissor.nfe310.classes.evento.NFInfoEvento;
import com.emissor.nfe310.classes.evento.NFTipoEvento;
import com.emissor.nfe310.classes.evento.cartacorrecao.NFEnviaEventoCartaCorrecao;
import com.emissor.nfe310.parsers.NotaFiscalChaveParser;
import com.emissor.nfe310.transformers.NFRegistryMatcher;
import com.emissor.nfe310.webservices.gerado.RecepcaoEventoStub;
import com.emissor.nfe310.webservices.gerado.RecepcaoEventoStub.NfeCabecMsg;
import com.emissor.nfe310.webservices.gerado.RecepcaoEventoStub.NfeCabecMsgE;
import com.emissor.nfe310.webservices.gerado.RecepcaoEventoStub.NfeDadosMsg;
import com.emissor.nfe310.webservices.gerado.RecepcaoEventoStub.NfeRecepcaoEventoResult;
import java.io.IOException;

class WSCartaCorrecao {

    private final static Logger LOG = Logger.getLogger(WSCartaCorrecao.class);
    private static final String EVENTO_CARTA_CORRECAO = "110110";
    private static final BigDecimal VERSAO_LEIAUTE = new BigDecimal("1.00");
    private final NFeConfig config;

    public WSCartaCorrecao(final NFeConfig config) {
        this.config = config;
    }

    public NFEnviaEventoRetorno corrigeNota(final String chaveAcesso, final String textoCorrecao) throws Exception {
        final String cartaCorrecaoXML = this.gerarDadosCartaCorrecao(chaveAcesso, textoCorrecao).toString();
        final String xmlAssinado = new AssinaturaDigital(this.config).assinarDocumento(cartaCorrecaoXML);
        final OMElement omElementResult = this.efetuaCorrecao(xmlAssinado);

        return new Persister(new NFRegistryMatcher(), new Format(0)).read(NFEnviaEventoRetorno.class, omElementResult.toString());
    }

    private OMElement efetuaCorrecao(final String xmlAssinado) throws XMLStreamException, RemoteException, AxisFault, IOException {
        final RecepcaoEventoStub.NfeCabecMsg cabecalho = new NfeCabecMsg();
        cabecalho.setCUF(this.config.getCUF().getCodigoIbge());
        cabecalho.setVersaoDados(WSCartaCorrecao.VERSAO_LEIAUTE.toPlainString());

        final RecepcaoEventoStub.NfeCabecMsgE cabecalhoE = new NfeCabecMsgE();
        cabecalhoE.setNfeCabecMsg(cabecalho);

        final RecepcaoEventoStub.NfeDadosMsg dados = new NfeDadosMsg();
        final OMElement omElementXML = AXIOMUtil.stringToOM(xmlAssinado);
        WSCartaCorrecao.LOG.debug(omElementXML);
        dados.setExtraElement(omElementXML);

        final String urlWebService = NFAutorizador31.valueOfCodigoUF(this.config.getCUF()).getRecepcaoEvento(this.config.getAmbiente());
        final NfeRecepcaoEventoResult nfeRecepcaoEvento = new RecepcaoEventoStub(urlWebService).nfeRecepcaoEvento(dados, cabecalhoE);
        final OMElement omElementResult = nfeRecepcaoEvento.getExtraElement();
        WSCartaCorrecao.LOG.debug(omElementResult.toString());

        return omElementResult;
    }

    private NFEnviaEventoCartaCorrecao gerarDadosCartaCorrecao(final String chaveAcesso, final String textoCorrecao) {
        final NotaFiscalChaveParser chaveParser = new NotaFiscalChaveParser(chaveAcesso);

        // final NFInfoCartaCorrecao cartaCorrecao = new NFInfoCartaCorrecao();
        final NFTipoEvento cartaCorrecao = new NFTipoEvento();
        cartaCorrecao.setCondicaoUso("A Carta de Correcao e disciplinada pelo paragrafo 1o-A do art. 7o do Convenio S/N, de 15 de dezembro de 1970 e pode ser utilizada para regularizacao de erro ocorrido na emissao de documento fiscal, desde que o erro nao esteja relacionado com: I - as variaveis que determinam o valor do imposto tais como: base de calculo, aliquota, diferenca de preco, quantidade, valor da operacao ou da prestacao; II - a correcao de dados cadastrais que implique mudanca do remetente ou do destinatario; III - a data de emissao ou de saida.");
        cartaCorrecao.setTextoCorrecao(textoCorrecao);
        cartaCorrecao.setDescricaoEvento("Carta de Correcao");
        cartaCorrecao.setVersao(WSCartaCorrecao.VERSAO_LEIAUTE);

        final NFInfoEvento infoEvento = new NFInfoEvento();
        infoEvento.setAmbiente(this.config.getAmbiente());
        infoEvento.setDadosEvento(cartaCorrecao);
        infoEvento.setChave(chaveAcesso);
        infoEvento.setCnpj(chaveParser.getCnpjEmitente());
        infoEvento.setDataHoraEvento(LocalDateTime.now());
        infoEvento.setId(String.format("ID%s%s0%s", WSCartaCorrecao.EVENTO_CARTA_CORRECAO, chaveAcesso, "1"));
        infoEvento.setNumeroSequencialEvento(1);
        infoEvento.setOrgao(chaveParser.getNFUnidadeFederativa());
        infoEvento.setTipoEvento(WSCartaCorrecao.EVENTO_CARTA_CORRECAO);
        infoEvento.setVersaoEvento(WSCartaCorrecao.VERSAO_LEIAUTE);

        final NFEvento evento = new NFEvento();
        evento.setInfoEvento(infoEvento);
        evento.setVersao(WSCartaCorrecao.VERSAO_LEIAUTE);

        final NFEnviaEventoCartaCorrecao enviaEvento = new NFEnviaEventoCartaCorrecao();
        enviaEvento.setEvento(Arrays.asList(evento));
        enviaEvento.setIdLote("1");
        enviaEvento.setVersao(WSCartaCorrecao.VERSAO_LEIAUTE);
        return enviaEvento;
    }
}
