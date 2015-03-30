package com.nfe.control;

import com.emissor.nfe310.classes.evento.inutilizacao.NFRetornoEventoInutilizacao;
import com.emissor.nfe310.webservices.WSFacade;
import com.nfe.model.NFEnviaEventoInutilizacao;

/**
 *
 * @author Rodrigo Monteiro
 */
public class InutilizacaoControl {

    public NFEnviaEventoInutilizacao getInutilizacao(NFEnviaEventoInutilizacao inu, WSFacade ws) {

        try {

            NFRetornoEventoInutilizacao retorno = ws.inutilizaNota(15, "77567899000404", "1", "42", "42", "NOTAS NAO UTILIZADAS");
            System.out.println(retorno.getDados().getStatus());
            System.out.println(retorno.getDados().getMotivo());

        } catch (Exception ex) {

            throw new IllegalStateException("Erro ao inutilizar numeracao  : " + ex);
        }

        return inu;

    }

}
