package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoIPITributado {

    //Enum NFNotaInfoSituacaoTributariaIPI
    private String situacaoTributaria;

    private String valorBaseCalculo;

    private String percentualAliquota;

    private String quantidade;

    private String valorUnidadeTributavel;

    private String valorTributo;

    public NFNotaInfoItemImpostoIPITributado() {
        this.situacaoTributaria = null;
        this.valorBaseCalculo = null;
        this.percentualAliquota = null;
        this.quantidade = null;
        this.valorUnidadeTributavel = null;
        this.valorTributo = null;
    }

    public void setSituacaoTributaria(final String situacaoTributaria) {

        this.situacaoTributaria = situacaoTributaria;
    }

    public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {

        this.valorBaseCalculo = String.valueOf(valorBaseCalculo);
    }

    public void setPercentualAliquota(final BigDecimal aliquota) {

        this.percentualAliquota = String.valueOf(aliquota);
    }

    public void setQuantidade(final BigDecimal quantidade) {

        this.quantidade = String.valueOf(quantidade);
    }

    public void setValorUnidadeTributavel(final BigDecimal valorUnitario) {

        this.valorUnidadeTributavel = String.valueOf(valorUnitario);
    }

    public void setValorTributo(final BigDecimal valorTributo) {
        this.valorTributo = String.valueOf(valorTributo);
    }

    public String getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public String getPercentualAliquota() {
        return this.percentualAliquota;
    }

    public String getQuantidade() {
        return this.quantidade;
    }

    public String getValorUnidadeTributavel() {
        return this.valorUnidadeTributavel;
    }

    public String getValorTributo() {
        return this.valorTributo;
    }
}
