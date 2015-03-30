package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemProdutoCombustivelCIDE {

    private String quantidadeBCCIDE;

    private String valorAliquota;

    private String valor;

    public NFNotaInfoItemProdutoCombustivelCIDE() {
        this.quantidadeBCCIDE = null;
        this.valorAliquota = null;
        this.valor = null;
    }

    public void setQuantidadeBCCIDE(final BigDecimal quantidade) {
        this.quantidadeBCCIDE = String.valueOf(quantidade);
    }

    public void setValorAliquota(final BigDecimal valorAliquota) {
        this.valorAliquota = String.valueOf(valorAliquota);
    }

    public void setValor(final BigDecimal valor) {
        this.valor = String.valueOf(valor);
    }

    public String getQuantidadeBCCIDE() {
        return this.quantidadeBCCIDE;
    }

    public String getValorAliquota() {
        return this.valorAliquota;
    }

    public String getValor() {
        return this.valor;
    }
}
