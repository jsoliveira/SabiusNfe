package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoPISAliquota {

    //Enum NFNotaInfoSituacaoTributariaPIS
    private String situacaoTributaria;

    private String valorBaseCalculo;

    private String percentualAliquota;

    private String valorTributo;

    public NFNotaInfoItemImpostoPISAliquota() {
        this.situacaoTributaria = null;
        this.valorBaseCalculo = null;
        this.percentualAliquota = null;
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

    public void setValorTributo(final BigDecimal valor) {
        this.valorTributo = String.valueOf(valor);
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

    public String getValorTributo() {
        return this.valorTributo;
    }
}
