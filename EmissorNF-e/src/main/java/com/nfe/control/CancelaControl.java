package com.nfe.control;

import com.emissor.nfe310.classes.evento.NFEnviaEventoRetorno;
import com.emissor.nfe310.webservices.WSFacade;
import com.nfe.model.NFEventoLote;
import com.nfe.modelintegracao.Integracao;

/**
 *
 * @author Rodrigo Monteiro
 */
public class CancelaControl {

    public NFEventoLote getCancelanota(NFEventoLote eve, WSFacade ws) {

        try {
            NFEnviaEventoRetorno retorno = ws.cancelaNota("41150377567899000404550010000000351000000357", "141150000203007", "NOTA EM AMBIENTE DE TESTE");
            System.out.println(retorno.getCodigoStatusReposta());
            System.out.println(retorno.getMotivo());

        } catch (Exception ex) {

            throw new IllegalStateException("Erro ao cancelar nota  : " + ex);
        }
        return eve;

    }
}
