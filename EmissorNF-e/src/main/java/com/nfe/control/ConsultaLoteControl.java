package com.nfe.control;

import com.emissor.nfe310.classes.lote.consulta.NFLoteConsultaRetorno;
import com.emissor.nfe310.classes.lote.envio.NFLoteEnvio;
import com.emissor.nfe310.classes.nota.NFNotaProcessada;
import com.emissor.nfe310.webservices.WSFacade;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Rodrigo Monteiro
 */
public class ConsultaLoteControl {

    public com.nfe.model.NFLoteEnvio getConsultaLote(com.nfe.model.NFLoteEnvio integracao, WSFacade ws) {

        try {
            NFLoteConsultaRetorno retorno = ws.consultaLote("ID141150000200358");
            System.out.println(retorno.getCodigoMessage());
            System.out.println(retorno.getMotivo());

            NFNotaProcessada nfProcessada = new NFNotaProcessada();
            NFLoteEnvio lote = new GeraLote().getLote();
            nfProcessada.setNota(lote.getNotas().get(0));
            nfProcessada.setProtocolo(retorno.getProtocolos().get(0));
            nfProcessada.setVersao(new BigDecimal(BigInteger.ONE));

        } catch (Exception ex) {

            throw new IllegalStateException("Erro ao consultar lote  : " + ex);
        }
        return integracao;

    }
}
