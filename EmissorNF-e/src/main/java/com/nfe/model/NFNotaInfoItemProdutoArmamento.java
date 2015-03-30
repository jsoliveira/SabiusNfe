package com.nfe.model;

public class NFNotaInfoItemProdutoArmamento {

    private Integer tipo;
    private String numeroSerieArma;
    private String numeroSerieCano;
    private String descricao;

    public void setTipo(final Integer tipo) {
        this.tipo = tipo;
    }

    public void setNumeroSerieArma(final String numeroSerieArma) {

        this.numeroSerieArma = numeroSerieArma;
    }

    public void setNumeroSerieCano(final String numeroSerieCano) {

        this.numeroSerieCano = numeroSerieCano;
    }

    public void setDescricao(final String descricao) {

        this.descricao = descricao;
    }

    public Integer getTipo() {
        return this.tipo;
    }

    public String getNumeroSerieArma() {
        return this.numeroSerieArma;
    }

    public String getNumeroSerieCano() {
        return this.numeroSerieCano;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
