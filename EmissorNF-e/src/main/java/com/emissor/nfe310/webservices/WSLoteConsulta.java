package com.emissor.nfe310.webservices;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

import com.emissor.nfe310.NFeConfig;
import com.emissor.nfe310.classes.NFAutorizador31;
import com.emissor.nfe310.classes.NFUnidadeFederativa;
import com.emissor.nfe310.classes.lote.consulta.NFLoteConsulta;
import com.emissor.nfe310.classes.lote.consulta.NFLoteConsultaRetorno;
import com.emissor.nfe310.transformers.NFRegistryMatcher;
import com.emissor.nfe310.webservices.gerado.NfeRetAutorizacaoStub;
import com.emissor.nfe310.webservices.gerado.NfeRetAutorizacaoStub.NfeRetAutorizacaoLoteResult;

class WSLoteConsulta {

    final private static Logger LOG = Logger.getLogger(WSLoteConsulta.class);
    private final NFeConfig config;

    public WSLoteConsulta(final NFeConfig config) {
        this.config = config;
    }

    public NFLoteConsultaRetorno consultaLote(final String numeroRecibo) throws Exception {
        final OMElement omElementConsulta = AXIOMUtil.stringToOM(this.gerarDadosConsulta(numeroRecibo).toString());
        WSLoteConsulta.LOG.info(omElementConsulta);

        final OMElement omElementResult = this.efetuaConsulta(omElementConsulta, this.config.getCUF());
        WSLoteConsulta.LOG.info(omElementResult);

        return new Persister(new NFRegistryMatcher(), new Format(0)).read(NFLoteConsultaRetorno.class, omElementResult.toString());
    }

    private OMElement efetuaConsulta(final OMElement omElement, final NFUnidadeFederativa uf) throws AxisFault, RemoteException {
        final NfeRetAutorizacaoStub.NfeCabecMsg cabec = new NfeRetAutorizacaoStub.NfeCabecMsg();
        cabec.setCUF(uf.getCodigoIbge());
        cabec.setVersaoDados(NFeConfig.VERSAO_NFE);

        final NfeRetAutorizacaoStub.NfeCabecMsgE cabecE = new NfeRetAutorizacaoStub.NfeCabecMsgE();
        cabecE.setNfeCabecMsg(cabec);

        final NfeRetAutorizacaoStub.NfeDadosMsg dados = new NfeRetAutorizacaoStub.NfeDadosMsg();
        dados.setExtraElement(omElement);
        final String urlWebService = NFAutorizador31.valueOfCodigoUF(uf).getNfeRetAutorizacao(this.config.getAmbiente());
        final NfeRetAutorizacaoLoteResult autorizacaoLoteResult = new NfeRetAutorizacaoStub(urlWebService).nfeRetAutorizacaoLote(dados, cabecE);
        return autorizacaoLoteResult.getExtraElement();
    }

    private NFLoteConsulta gerarDadosConsulta(final String numeroRecibo) {
        final NFLoteConsulta consulta = new NFLoteConsulta();
        consulta.setRecibo(numeroRecibo);
        consulta.setAmbiente(this.config.getAmbiente());
        consulta.setVersao(new BigDecimal(NFeConfig.VERSAO_NFE));
        return consulta;
    }
}