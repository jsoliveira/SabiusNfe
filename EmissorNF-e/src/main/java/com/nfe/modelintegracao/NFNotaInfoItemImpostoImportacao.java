package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoImportacao {

    private String valorBaseCalculo;

    private String valorDespesaAduaneira;

    private String valorImpostoImportacao;

    private String valorIOF;

    public NFNotaInfoItemImpostoImportacao() {
        this.valorBaseCalculo = null;
        this.valorDespesaAduaneira = null;
        this.valorImpostoImportacao = null;
        this.valorIOF = null;
    }

    public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = String.valueOf(valorBaseCalculo);
    }

    public void setValorDespesaAduaneira(final BigDecimal valorDespesaAduaneira) {
        this.valorDespesaAduaneira = String.valueOf(valorDespesaAduaneira);
    }

    public void setValorImpostoImportacao(final BigDecimal valorImpostoImportacao) {
        this.valorImpostoImportacao = String.valueOf(valorImpostoImportacao);
    }

    public void setValorIOF(final BigDecimal valorIOF) {
        this.valorIOF = String.valueOf(valorIOF);
    }

    public String getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public String getValorDespesaAduaneira() {
        return this.valorDespesaAduaneira;
    }

    public String getValorImpostoImportacao() {
        return this.valorImpostoImportacao;
    }

    public String getValorIOF() {
        return this.valorIOF;
    }
}
