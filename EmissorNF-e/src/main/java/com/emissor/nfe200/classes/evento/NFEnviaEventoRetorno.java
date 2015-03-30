package com.emissor.nfe200.classes.evento;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.emissor.nfe200.classes.NFAmbiente;
import com.emissor.nfe200.classes.NFBase;
import com.emissor.nfe200.classes.NFUnidadeFederativa;

@Root(name = "retEnvEvento")
public class NFEnviaEventoRetorno extends NFBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "idLote", required = true)
    private String idLote;

    @Element(name = "tpAmb", required = true)
    private NFAmbiente ambiente;

    @Element(name = "verAplic", required = true)
    private String versaoAplicativo;

    @Element(name = "cOrgao", required = true)
    private NFUnidadeFederativa orgao;

    @Element(name = "cStat", required = true)
    private Integer codigoStatusReposta;

    @Element(name = "xMotivo", required = true)
    private String motivo;

    @ElementList(entry = "retEvento", inline = true, required = true)
    private List<NFEventoRetorno> eventoRetorno;

    public String getVersao() {
        return this.versao;
    }

    public String getIdLote() {
        return this.idLote;
    }

    public NFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public String getVersaoAplicativo() {
        return this.versaoAplicativo;
    }

    public NFUnidadeFederativa getOrgao() {
        return this.orgao;
    }

    public Integer getCodigoStatusReposta() {
        return this.codigoStatusReposta;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public List<NFEventoRetorno> getEventoRetorno() {
        return this.eventoRetorno;
    }
}