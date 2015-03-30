package com.nfe.control;

import com.emissor.nfe310.classes.evento.NFEnviaEventoRetorno;
import com.emissor.nfe310.webservices.WSFacade;
import com.nfe.model.NFEventoLote;

/**
 *
 * @author Rodrigo Monteiro
 */
public class CorrigeNotaControl {

    public NFEventoLote getCorrigeNota(NFEventoLote integracao, WSFacade ws) {

        try {

            NFEnviaEventoRetorno retorno = ws.corrigeNota("41150377567899000404550010000000351000000357", "CARTA DE CORRECAO ITEM VL_TOTAL = 120");
            System.out.println(retorno.getCodigoStatusReposta());
            System.out.println(retorno.getMotivo());

        } catch (Exception ex) {

            throw new IllegalStateException("Erro ao corrigir nota  : " + ex);
        }
        return integracao;

    }
}
