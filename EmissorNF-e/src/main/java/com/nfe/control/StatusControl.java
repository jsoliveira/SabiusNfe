package com.nfe.control;

import com.emissor.nfe310.classes.NFUnidadeFederativa;
import com.emissor.nfe310.classes.statusservico.consulta.NFStatusServicoConsultaRetorno;
import com.emissor.nfe310.webservices.WSFacade;
import com.nfe.model.ConsultaStatus;

/**
 *
 * @author Rodrigo Monteiro
 */
public class StatusControl {

    public ConsultaStatus getConsultaStatus(ConsultaStatus status, WSFacade ws) {

        //grava solicitacao de consulta
        try {
            NFStatusServicoConsultaRetorno retorno = ws.consultaStatus(NFUnidadeFederativa.valueOfCodigo(status.getUf_consulta()));
            System.out.println(retorno.getStatus());
            System.out.println(retorno.getMotivo());

            status = parseObjet(retorno);

            //grava retorno de consulta
        } catch (Exception ex) {
            //grava erro consulta
            throw new IllegalStateException("Erro ao consultar status  : " + ex);
        }

        return status;
    }

    private ConsultaStatus parseObjet(NFStatusServicoConsultaRetorno retorno) throws Exception {
        ConsultaStatus status = new ConsultaStatus();
        status.setRetambiente(Integer.parseInt(retorno.getAmbiente().getCodigo()));
        status.setRetdataRecebimento(retorno.getDataRecebimento());
        status.setRetdataRetorno(retorno.getDataRetorno());
        status.setRetmotivo(retorno.getMotivo());
        status.setRetobservacao(retorno.getObservacao());
        status.setRetstatus(retorno.getStatus());
        status.setRetornoStatus(Integer.parseInt(retorno.getStatus()));
        status.setRettempoMedio(retorno.getTempoMedio());
        status.setRetversao(retorno.getVersao());
        status.setUf_consulta(retorno.getUf().getCodigoIbge());

        return status;
    }

}
