package com.nfe.control;

import com.emissor.nfe310.classes.nota.consulta.NFNotaConsultaRetorno;
import com.emissor.nfe310.webservices.WSFacade;
import com.nfe.modelintegracao.Integracao;

/**
 *
 * @author Rodrigo Monteiro
 */
public class ConsultaNotaControl {

    public Integracao getConsultaNota(Integracao integracao, WSFacade ws) {

        try {
            NFNotaConsultaRetorno retorno = ws.consultaNota("26150309339936000701550160004393377771930673");
            System.out.println(retorno.getStatus());
            System.out.println(retorno.getMotivo());

        } catch (Exception ex) {

            throw new IllegalStateException("Erro ao consultar nota  : " + ex);
        }
        return integracao;

    }

}
