package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoCOFINSAliquota {

    //Enum NFNotaInfoSituacaoTributariaCOFINS
    private String situacaoTributaria;

    private String valorBaseCalulo;

    private String percentualAliquota;

    private String valor;

    public void setSituacaoTributaria(final String situacaoTributaria) {

        this.situacaoTributaria = situacaoTributaria;
    }

    public void setValorBaseCalulo(final BigDecimal valorBaseCalulo) {
        this.valorBaseCalulo = String.valueOf(valorBaseCalulo);
    }

    public void setPercentualAliquota(final BigDecimal aliquota) {
        this.percentualAliquota = String.valueOf(aliquota);
    }

    public void setValor(final BigDecimal valor) {
        this.valor = String.valueOf(valor);
    }

    public String getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getValorBaseCalulo() {
        return this.valorBaseCalulo;
    }

    public String getPercentualAliquota() {
        return this.percentualAliquota;
    }

    public String getValor() {
        return this.valor;
    }
}
