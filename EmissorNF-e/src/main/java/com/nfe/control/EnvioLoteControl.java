/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nfe.control;

import com.emissor.nfe310.classes.lote.envio.NFLoteEnvioRetorno;
import com.emissor.nfe310.classes.nota.NFNotaProcessada;
import com.emissor.nfe310.webservices.WSFacade;
import com.nfe.model.NFLoteEnvio;
import com.nfe.modelintegracao.Integracao;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Rodrigo Monteiro
 */
public class EnvioLoteControl {

    public NFLoteEnvio getEnviaLote(NFLoteEnvio lo, WSFacade ws) {

        try {
            com.emissor.nfe310.classes.lote.envio.NFLoteEnvio lote = new GeraLote().getLote();
            NFLoteEnvioRetorno retorno = ws.enviaLote(lote);

            //sincrono
            NFNotaProcessada nfProcessada = new NFNotaProcessada();
            nfProcessada.setNota(lote.getNotas().get(0));
            nfProcessada.setProtocolo(retorno.getProtocolo());
            nfProcessada.setVersao(new BigDecimal(BigInteger.ONE));

            System.out.println("Nota Processada : " + nfProcessada.toString());

            System.out.println(retorno.getStatus());
            System.out.println(retorno.getMotivo());
            try {
                System.out.println(retorno.getProtocolo().getProtocoloInfo().getMotivo());
            } catch (Exception e) {

            }

        } catch (Exception ex) {

            throw new IllegalStateException("Erro ao enviar lote  : " + ex);
        }
        return lo;

    }
}
