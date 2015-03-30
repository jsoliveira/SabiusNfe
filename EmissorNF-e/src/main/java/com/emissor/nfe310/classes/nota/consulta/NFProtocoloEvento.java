package com.emissor.nfe310.classes.nota.consulta;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import com.emissor.nfe310.classes.NFBase;
import com.emissor.nfe310.classes.evento.NFEvento;
import com.emissor.nfe310.classes.evento.NFEventoRetorno;

public class NFProtocoloEvento extends NFBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "evento", required = true)
    private NFEvento evento;

    @Element(name = "retEvento", required = true)
    private NFEventoRetorno eventoRetorno;

    public NFEvento getEventoCartaCorrecao() {
        return this.evento;
    }

    public void setEventoCartaCorrecao(final NFEvento eventoCartaCorrecao) {
        this.evento = eventoCartaCorrecao;
    }

    public NFEventoRetorno getInfoEventoRetorno() {
        return this.eventoRetorno;
    }

    public void setEventoRetorno(final NFEventoRetorno infoEventoRetorno) {
        this.eventoRetorno = infoEventoRetorno;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }
    
    
}