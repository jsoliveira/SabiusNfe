package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoCOFINSOutrasOperacoes {

    //Enum NFNotaInfoSituacaoTributariaCOFINS
    private String situacaoTributaria;

    private String valorBaseCalculo;

    private String percentualCOFINS;

    private String quantidadeVendida;

    private String valorAliquota;

    private String valorCOFINS;

    public void setSituacaoTributaria(final String situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = String.valueOf(valorBaseCalculo);
    }

    public void setPercentualCOFINS(final BigDecimal percentualCOFINS) {
        this.percentualCOFINS = String.valueOf(percentualCOFINS);
    }

    public void setQuantidadeVendida(final BigDecimal quantidadeVendida) {
        this.quantidadeVendida = String.valueOf(quantidadeVendida);
    }

    public void setValorAliquota(final BigDecimal valorAliquota) {
        this.valorAliquota = String.valueOf(valorAliquota);
    }

    public void setValorCOFINS(final BigDecimal valorTributo) {
        this.valorCOFINS = String.valueOf(valorTributo);
    }

    public String getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public String getPercentualCOFINS() {
        return this.percentualCOFINS;
    }

    public String getQuantidadeVendida() {
        return this.quantidadeVendida;
    }

    public String getValorAliquota() {
        return this.valorAliquota;
    }

    public String getValorCOFINS() {
        return this.valorCOFINS;
    }
}
