package com.emissor.nfe310.webservices;

import java.math.BigDecimal;
import java.util.Arrays;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.log4j.Logger;
import org.joda.time.LocalDateTime;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

import com.emissor.nfe310.NFeConfig;
import com.emissor.nfe310.assinatura.AssinaturaDigital;
import com.emissor.nfe310.classes.NFAutorizador31;
import com.emissor.nfe310.classes.evento.NFEnviaEventoRetorno;
import com.emissor.nfe310.classes.evento.cancelamento.NFEnviaEventoCancelamento;
import com.emissor.nfe310.classes.evento.cancelamento.NFEventoCancelamento;
import com.emissor.nfe310.classes.evento.cancelamento.NFInfoCancelamento;
import com.emissor.nfe310.classes.evento.cancelamento.NFInfoEventoCancelamento;
import com.emissor.nfe310.parsers.NotaFiscalChaveParser;
import com.emissor.nfe310.transformers.NFRegistryMatcher;
import com.emissor.nfe310.webservices.gerado.RecepcaoEventoStub;
import com.emissor.nfe310.webservices.gerado.RecepcaoEventoStub.NfeCabecMsg;
import com.emissor.nfe310.webservices.gerado.RecepcaoEventoStub.NfeCabecMsgE;
import com.emissor.nfe310.webservices.gerado.RecepcaoEventoStub.NfeDadosMsg;
import com.emissor.nfe310.webservices.gerado.RecepcaoEventoStub.NfeRecepcaoEventoResult;

class WSCancelamento {
    private static final String DESCRICAO_EVENTO = "Cancelamento";
    private static final BigDecimal VERSAO_LEIAUTE = new BigDecimal("1.00");
    private static final String EVENTO_CANCELAMENTO = "110111";
    private static final Logger LOG = Logger.getLogger(WSCancelamento.class);
    private final NFeConfig config;

    public WSCancelamento(final NFeConfig config) {
        this.config = config;
    }

    public NFEnviaEventoRetorno cancelaNota(final String chaveAcesso, final String numeroProtocolo, final String motivo) throws Exception {
        final String cancelamentoNotaXML = this.gerarDadosCancelamento(chaveAcesso, numeroProtocolo, motivo).toString();
        final String xmlAssinado = new AssinaturaDigital(this.config).assinarDocumento(cancelamentoNotaXML);
        final OMElement omElementResult = this.efetuaCancelamento(xmlAssinado, chaveAcesso);

        return new Persister(new NFRegistryMatcher(), new Format(0)).read(NFEnviaEventoRetorno.class, omElementResult.toString());
    }

    private OMElement efetuaCancelamento(final String xmlAssinado, final String chaveAcesso) throws Exception {
        final RecepcaoEventoStub.NfeCabecMsg cabecalho = new NfeCabecMsg();
        cabecalho.setCUF(this.config.getCUF().getCodigoIbge());
        cabecalho.setVersaoDados(WSCancelamento.VERSAO_LEIAUTE.toPlainString());

        final RecepcaoEventoStub.NfeCabecMsgE cabecalhoE = new NfeCabecMsgE();
        cabecalhoE.setNfeCabecMsg(cabecalho);

        final RecepcaoEventoStub.NfeDadosMsg dados = new NfeDadosMsg();
        final OMElement omElementXML = AXIOMUtil.stringToOM(xmlAssinado);
        WSCancelamento.LOG.debug(omElementXML);
        dados.setExtraElement(omElementXML);

        final String urlWebService = NFAutorizador31.valueOfChaveAcesso(chaveAcesso).getRecepcaoEvento(this.config.getAmbiente());
        final NfeRecepcaoEventoResult nfeRecepcaoEvento = new RecepcaoEventoStub(urlWebService).nfeRecepcaoEvento(dados, cabecalhoE);
        final OMElement omElementResult = nfeRecepcaoEvento.getExtraElement();
        WSCancelamento.LOG.debug(omElementResult.toString());

        return omElementResult;
    }

    private NFEnviaEventoCancelamento gerarDadosCancelamento(final String chaveAcesso, final String numeroProtocolo, final String motivo) {
        final NotaFiscalChaveParser chaveParser = new NotaFiscalChaveParser(chaveAcesso);

        final NFInfoCancelamento cancelamento = new NFInfoCancelamento();
        cancelamento.setDescricaoEvento(WSCancelamento.DESCRICAO_EVENTO);
        cancelamento.setVersao(WSCancelamento.VERSAO_LEIAUTE);
        cancelamento.setJustificativa(motivo);
        cancelamento.setProtocoloAutorizacao(numeroProtocolo);

        final NFInfoEventoCancelamento infoEvento = new NFInfoEventoCancelamento();
        infoEvento.setAmbiente(this.config.getAmbiente());
        infoEvento.setChave(chaveAcesso);
        infoEvento.setCnpj(chaveParser.getCnpjEmitente());
        infoEvento.setDataHoraEvento(LocalDateTime.now());
        infoEvento.setId(String.format("ID%s%s0%s", WSCancelamento.EVENTO_CANCELAMENTO, chaveAcesso, "1"));
        infoEvento.setNumeroSequencialEvento(1);
        infoEvento.setOrgao(chaveParser.getNFUnidadeFederativa());
        infoEvento.setTipoEvento(WSCancelamento.EVENTO_CANCELAMENTO);
        infoEvento.setVersaoEvento(WSCancelamento.VERSAO_LEIAUTE);
        infoEvento.setCancelamento(cancelamento);

        final NFEventoCancelamento evento = new NFEventoCancelamento();
        evento.setInfoEvento(infoEvento);
        evento.setVersao(WSCancelamento.VERSAO_LEIAUTE);

        final NFEnviaEventoCancelamento enviaEvento = new NFEnviaEventoCancelamento();
        enviaEvento.setEvento(Arrays.asList(evento));
        enviaEvento.setIdLote("1");
        enviaEvento.setVersao(WSCancelamento.VERSAO_LEIAUTE);
        return enviaEvento;
    }
}