package com.emissor.nfe200.classes.evento.cartacorrecao;

import org.simpleframework.xml.Element;

import com.emissor.nfe200.classes.evento.NFTipoEvento;
import com.emissor.nfe200.validadores.StringValidador;

public class NFInfoCartaCorrecao extends NFTipoEvento {
    @Element(name = "xCorrecao", required = false)
    private String correcao;

    @Element(name = "xCondUso", required = false)
    private String condicaoDeUso;

    public void setCondicaoDeUso(final String condicaoDeUso) {
        this.condicaoDeUso = condicaoDeUso;
    }

    public void setCorrecao(final String correcao) {
        StringValidador.tamanho15a1000(correcao);
        this.correcao = correcao;
    }

    @Override
    public String getVersao() {
        return super.getVersao();
    }

    @Override
    public String getDescricaoEvento() {
        return super.getDescricaoEvento();
    }

    public String getCondicaoDeUso() {
        return this.condicaoDeUso;
    }

    public String getCorrecao() {
        return this.correcao;
    }
}