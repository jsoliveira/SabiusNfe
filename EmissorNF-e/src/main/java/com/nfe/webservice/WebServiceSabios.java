package com.nfe.webservice;

import com.nfe.control.GenericControl;
import com.nfe.modelintegracao.Integracao;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Rodrigo Monteiro
 */
@Path("integracao")
public class WebServiceSabios {

    public WebServiceSabios() {
    }

    @POST
    @Path("nfe")
    @Consumes({MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_XML})
    public Integracao getXml(Integracao integracao) {

        return new GenericControl().getProcesso(integracao);

    }

}
