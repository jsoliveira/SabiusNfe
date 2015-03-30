package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemProdutoCombustivel {

    private String codigoProdutoANP;

    private String percentualGasNatural;

    private String codigoAutorizacaoCOFIF;

    private String quantidade;

    private String uf;

    private NFNotaInfoItemProdutoCombustivelCIDE cide;

    public NFNotaInfoItemProdutoCombustivel() {
        this.codigoProdutoANP = null;
        this.codigoAutorizacaoCOFIF = null;
        this.quantidade = null;
        this.uf = null;
        this.cide = null;
    }

    public void setCodigoProdutoANP(final String codigoProdutoANP) {

        this.codigoProdutoANP = codigoProdutoANP;
    }

    public void setCodigoAutorizacaoCODIF(final String codigoAutorizacaoCOFIF) {

        this.codigoAutorizacaoCOFIF = codigoAutorizacaoCOFIF;
    }

    public void setQuantidade(final BigDecimal quantidade) {
        this.quantidade = String.valueOf(quantidade);
    }

    public void setUf(final String uf) {
        this.uf = uf;
    }

    public void setCide(final NFNotaInfoItemProdutoCombustivelCIDE cide) {
        this.cide = cide;
    }

    public void setPercentualGasNatural(final BigDecimal percentualGasNatural) {
        this.percentualGasNatural = String.valueOf(percentualGasNatural);
    }

    public String getCodigoProdutoANP() {
        return this.codigoProdutoANP;
    }

    public String getPercentualGasNatural() {
        return this.percentualGasNatural;
    }

    public String getCodigoAutorizacaoCOFIF() {
        return this.codigoAutorizacaoCOFIF;
    }

    public String getQuantidade() {
        return this.quantidade;
    }

    public String getUf() {
        return this.uf;
    }

    public NFNotaInfoItemProdutoCombustivelCIDE getCide() {
        return this.cide;
    }
}
