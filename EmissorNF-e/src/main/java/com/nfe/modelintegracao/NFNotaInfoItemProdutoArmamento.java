package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemProdutoArmamento {

    //Enum NFNotaInfoItemProdutoArmamentoTipo
    private String tipo;

    private String numeroSerieArma;

    private String numeroSerieCano;

    private String descricao;

    public void setTipo(final String tipo) {
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

    public String getTipo() {
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
