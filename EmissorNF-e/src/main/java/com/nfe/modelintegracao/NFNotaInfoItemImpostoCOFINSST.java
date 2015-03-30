package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoCOFINSST {

    private String valorBaseCalculo;

    private String percentualAliquota;

    private String quantidadeVendida;

    private String valorAliquotaCOFINS;

    private String valorCOFINS;

    public NFNotaInfoItemImpostoCOFINSST() {
        this.valorBaseCalculo = null;
        this.percentualAliquota = null;
        this.quantidadeVendida = null;
        this.valorAliquotaCOFINS = null;
        this.valorCOFINS = null;
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

    public void setValorAliquotaCOFINS(final BigDecimal valorAliquota) {

        this.valorAliquotaCOFINS = String.valueOf(valorAliquota);
    }

    public void setValorCOFINS(final BigDecimal valorTributo) {
        this.valorCOFINS = String.valueOf(valorTributo);
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

    public String getValorAliquotaCOFINS() {
        return this.valorAliquotaCOFINS;
    }

    public String getValorCOFINS() {
        return this.valorCOFINS;
    }
}
