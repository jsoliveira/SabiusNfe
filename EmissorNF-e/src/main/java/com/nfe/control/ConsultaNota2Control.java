package com.nfe.control;

import com.emissor.nfe200.webservices.WSFacade;
import com.nfe.config.CarregaConfig210;
import com.nfe.modelintegracao.Integracao;

/**
 *
 * @author Rodrigo Monteiro
 */
public class ConsultaNota2Control {

    public Integracao getConsultaNota2(Integracao integracao) {
        try {
            com.emissor.nfe200.classes.nota.consulta.NFNotaConsultaRetorno retorno = initConf210().consultaNota("26150309339936000701550160004393377771930673");
            System.out.println(retorno.getStatus());
            System.out.println(retorno.getMotivo());

        } catch (Exception ex) {

            throw new IllegalStateException("Erro ao consultar nota  : " + ex);
        }
        return integracao;

    }

    private com.emissor.nfe200.webservices.WSFacade initConf210() throws Exception {
        com.emissor.nfe200.webservices.WSFacade ws;
        ws = CarregaConfig210.getConf2();
        return ws;
    }
}
