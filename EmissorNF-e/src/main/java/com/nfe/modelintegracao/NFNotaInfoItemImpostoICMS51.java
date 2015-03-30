package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMS51 {

    //Enum NFOrigem
    private String origem;

    //Enum NFNotaInfoImpostoTributacaoICMS
    private String situacaoTributaria;

    //Enum NFNotaInfoItemImpostoICMSModalidadeBaseCalulo
    private String modalidadeBC;

    private String percentualReducaoBC;

    private String valorBCICMS;

    private String percentualICMS;

    private String valorICMSOperacao;

    private String percentualDiferimento;

    private String valorICMSDiferimento;

    private String valorICMS;

    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final String situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setModalidadeBC(final String modalidadeBC) {
        this.modalidadeBC = modalidadeBC;
    }

    public void setPercentualReducaoBC(final BigDecimal percentualReducaoBC) {
        this.percentualReducaoBC = String.valueOf(percentualReducaoBC);
    }

    public void setValorBCICMS(final BigDecimal valorBCICMS) {
        this.valorBCICMS = String.valueOf(valorBCICMS);
    }

    public void setPercentualICMS(final BigDecimal percentualICMS) {
        this.percentualICMS = String.valueOf(percentualICMS);
    }

    public void setValorICMS(final BigDecimal valorICMS) {
        this.valorICMS = String.valueOf(valorICMS);
    }

    public void setPercentualDiferimento(final BigDecimal percentualDiferimento) {
        this.percentualDiferimento = String.valueOf(percentualDiferimento);
    }

    public void setValorICMSDiferimento(final BigDecimal valorICMSDiferimento) {
        this.valorICMSDiferimento = String.valueOf(valorICMSDiferimento);
    }

    public void setValorICMSOperacao(final BigDecimal valorICMSOperacao) {
        this.valorICMSOperacao = String.valueOf(valorICMSOperacao);
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getModalidadeBC() {
        return this.modalidadeBC;
    }

    public String getPercentualReducaoBC() {
        return this.percentualReducaoBC;
    }

    public String getValorBCICMS() {
        return this.valorBCICMS;
    }

    public String getPercentualICMS() {
        return this.percentualICMS;
    }

    public String getValorICMSOperacao() {
        return this.valorICMSOperacao;
    }

    public String getPercentualDiferimento() {
        return this.percentualDiferimento;
    }

    public String getValorICMSDiferimento() {
        return this.valorICMSDiferimento;
    }

    public String getValorICMS() {
        return this.valorICMS;
    }
}
