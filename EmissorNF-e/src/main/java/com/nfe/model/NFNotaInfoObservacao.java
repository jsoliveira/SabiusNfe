package com.nfe.model;

public class NFNotaInfoObservacao {

    private String identificacaoCampo;
    private String conteudoCampo;

    public void setIdentificacaoCampo(final String identificacaoCampo) {
        this.identificacaoCampo = identificacaoCampo;
    }

    public void setConteudoCampo(final String conteudoCampo) {
        this.conteudoCampo = conteudoCampo;
    }

    public String getConteudoCampo() {
        return this.conteudoCampo;
    }

    public String getIdentificacaoCampo() {
        return this.identificacaoCampo;
    }
}
