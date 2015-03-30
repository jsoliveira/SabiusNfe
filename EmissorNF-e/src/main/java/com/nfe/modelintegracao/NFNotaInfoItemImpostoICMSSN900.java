package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMSSN900 {

    //Enum NFOrigem
    private String origem;

    //Enum NFNotaSituacaoOperacionalSimplesNacional
    private String situacaoOperacaoSN;

    //Enum NFNotaInfoItemImpostoICMSModalidadeBaseCalulo
    private String modalidadeDeterminacaoBCICMS;

    private String valorBCICMS;

    private String percentualReducaoBC;

    private String percentualAliquotaImposto;

    private String valorICMS;

    //Enum NFNotaInfoItemModalidadeBCICMSST
    private String modalidadeBCICMSST;

    private String percentualMargemValorAdicionadoICMSST;

    private String percentualReducaoBCICMSST;

    private String valorBCICMSST;

    private String percentualAliquotaImpostoICMSST;

    private String valorICMSST;

    private String aliquotaAplicavelCalculoCreditoSN;

    private String valorCreditoICMSSN;

    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public void setSituacaoOperacaoSN(final String situacaoOperacaoSN) {
        this.situacaoOperacaoSN = situacaoOperacaoSN;
    }

    public void setModalidadeDeterminacaoBCICMS(final String modalidadeDeterminacaoBCICMS) {
        this.modalidadeDeterminacaoBCICMS = modalidadeDeterminacaoBCICMS;
    }

    public void setValorBCICMS(final BigDecimal valorBCICMS) {
        this.valorBCICMS = String.valueOf(valorBCICMS);
    }

    public void setPercentualReducaoBC(final BigDecimal percentualReducaoBC) {
        this.percentualReducaoBC = String.valueOf(percentualReducaoBC);
    }

    public void setPercentualAliquotaImposto(final BigDecimal aliquotaImposto) {
        this.percentualAliquotaImposto = String.valueOf(aliquotaImposto);
    }

    public void setValorICMS(final BigDecimal valorICMS) {
        this.valorICMS = String.valueOf(valorICMS);
    }

    public void setModalidadeBCICMSST(final String modalidadeBCICMSST) {
        this.modalidadeBCICMSST = modalidadeBCICMSST;
    }

    public void setPercentualMargemValorAdicionadoICMSST(final BigDecimal percentualMargemValorAdicionadoICMSST) {
        this.percentualMargemValorAdicionadoICMSST = String.valueOf(percentualMargemValorAdicionadoICMSST);
    }

    public void setPercentualReducaoBCICMSST(final BigDecimal percentualReducaoBCICMSST) {
        this.percentualReducaoBCICMSST = String.valueOf(percentualReducaoBCICMSST);
    }

    public void setValorBCICMSST(final BigDecimal valorBCICMSST) {
        this.valorBCICMSST = String.valueOf(valorBCICMSST);
    }

    public void setPercentualAliquotaImpostoICMSST(final BigDecimal aliquotaImpostoICMSST) {
        this.percentualAliquotaImpostoICMSST = String.valueOf(aliquotaImpostoICMSST);
    }

    public void setValorICMSST(final BigDecimal valorICMSST) {
        this.valorICMSST = String.valueOf(valorICMSST);
    }

    public void setAliquotaAplicavelCalculoCreditoSN(final BigDecimal aliquotaAplicavelCalculoCreditoSN) {
        this.aliquotaAplicavelCalculoCreditoSN = String.valueOf(aliquotaAplicavelCalculoCreditoSN);
    }

    public void setValorCreditoICMSSN(final BigDecimal valorCreditoICMSSN) {
        this.valorCreditoICMSSN = String.valueOf(valorCreditoICMSSN);
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getSituacaoOperacaoSN() {
        return this.situacaoOperacaoSN;
    }

    public String getModalidadeDeterminacaoBCICMS() {
        return this.modalidadeDeterminacaoBCICMS;
    }

    public String getValorBCICMS() {
        return this.valorBCICMS;
    }

    public String getPercentualReducaoBC() {
        return this.percentualReducaoBC;
    }

    public String getPercentualAliquotaImposto() {
        return this.percentualAliquotaImposto;
    }

    public String getValorICMS() {
        return this.valorICMS;
    }

    public String getModalidadeBCICMSST() {
        return this.modalidadeBCICMSST;
    }

    public String getPercentualMargemValorAdicionadoICMSST() {
        return this.percentualMargemValorAdicionadoICMSST;
    }

    public String getPercentualReducaoBCICMSST() {
        return this.percentualReducaoBCICMSST;
    }

    public String getValorBCICMSST() {
        return this.valorBCICMSST;
    }

    public String getPercentualAliquotaImpostoICMSST() {
        return this.percentualAliquotaImpostoICMSST;
    }

    public String getValorICMSST() {
        return this.valorICMSST;
    }

    public String getAliquotaAplicavelCalculoCreditoSN() {
        return this.aliquotaAplicavelCalculoCreditoSN;
    }

    public String getValorCreditoICMSSN() {
        return this.valorCreditoICMSSN;
    }
}
