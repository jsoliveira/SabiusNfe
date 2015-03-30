package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMSSN201 {

    //Enum NFOrigem
    private String origem;

    //Enum NFNotaSituacaoOperacionalSimplesNacional
    private String situacaoOperacaoSN;

    //Enum NFNotaInfoItemModalidadeBCICMSST
    private String modalidadeDeterminacaoBCICMSST;

    private String percentualMargemValorAdicionadoICMSST;

    private String percentualReducaoBCICMSST;

    private String valorBCICMSST;

    private String percentualAliquotaImpostoICMSST;

    private String valorICMSST;

    private String percentualAliquotaAplicavelCalculoCreditoSN;

    private String valorCreditoICMSSN;

    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public void setSituacaoOperacaoSN(final String situacaoOperacaoSN) {
        this.situacaoOperacaoSN = situacaoOperacaoSN;
    }

    public void setModalidadeDeterminacaoBCICMSST(final String modalidadeDeterminacaoBCICMSST) {
        this.modalidadeDeterminacaoBCICMSST = modalidadeDeterminacaoBCICMSST;
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

    public void setPercentualAliquotaAplicavelCalculoCreditoSN(final BigDecimal aliquotaAplicavelCalculoCreditoSN) {
        this.percentualAliquotaAplicavelCalculoCreditoSN = String.valueOf(aliquotaAplicavelCalculoCreditoSN);
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

    public String getModalidadeDeterminacaoBCICMSST() {
        return this.modalidadeDeterminacaoBCICMSST;
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

    public String getPercentualAliquotaAplicavelCalculoCreditoSN() {
        return this.percentualAliquotaAplicavelCalculoCreditoSN;
    }

    public String getValorCreditoICMSSN() {
        return this.valorCreditoICMSSN;
    }
}
