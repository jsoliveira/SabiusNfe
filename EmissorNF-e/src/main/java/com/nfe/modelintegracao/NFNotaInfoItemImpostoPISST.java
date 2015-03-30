package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoPISST {

    private String valorBaseCalculo;

    private String percentualAliquota;

    private String quantidadeVendida;

    private String valorAliquota;

    private String valorTributo;

    public NFNotaInfoItemImpostoPISST() {
        this.valorBaseCalculo = null;
        this.percentualAliquota = null;
        this.quantidadeVendida = null;
        this.valorAliquota = null;
        this.valorTributo = null;
    }

    public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {

        this.valorBaseCalculo = String.valueOf(valorBaseCalculo);
    }

    public void setPercentualAliquota(final BigDecimal aliquota) {

        this.percentualAliquota = String.valueOf(aliquota);
    }

    public void setQuantidadeVendida(final BigDecimal quantidadeVendida) {

        this.quantidadeVendida = String.valueOf(quantidadeVendida);
    }

    public void setValorAliquota(final BigDecimal valorAliquota) {

        this.valorAliquota = String.valueOf(valorAliquota);
    }

    public void setValorTributo(final BigDecimal valorTributo) {
        this.valorTributo = String.valueOf(valorTributo);
    }

    public String getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public String getPercentualAliquota() {
        return this.percentualAliquota;
    }

    public String getQuantidadeVendida() {
        return this.quantidadeVendida;
    }

    public String getValorAliquota() {
        return this.valorAliquota;
    }

    public String getValorTributo() {
        return this.valorTributo;
    }
}
