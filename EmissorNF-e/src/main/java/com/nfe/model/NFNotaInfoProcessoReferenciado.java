package com.nfe.model;

public class NFNotaInfoProcessoReferenciado {

    private String identificadorProcessoOuAtoConcessorio;
    private Integer indicadorOrigemProcesso;

    public void setIdentificadorProcessoOuAtoConcessorio(final String identificadorProcessoOuAtoConcessorio) {

        this.identificadorProcessoOuAtoConcessorio = identificadorProcessoOuAtoConcessorio;
    }

    public void setIndicadorOrigemProcesso(final Integer indicadorOrigemProcesso) {
        this.indicadorOrigemProcesso = indicadorOrigemProcesso;
    }

    public String getIdentificadorProcessoOuAtoConcessorio() {
        return this.identificadorProcessoOuAtoConcessorio;
    }

    public Integer getIndicadorOrigemProcesso() {
        return this.indicadorOrigemProcesso;
    }
}
