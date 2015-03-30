package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMS30 {

    //Enum NFOrigem
    private String origem;

    //Enum NFNotaInfoImpostoTributacaoICMS
    private String situacaoTributaria;

    //Enum NFNotaInfoItemModalidadeBCICMSST
    private String modalidadeDeterminacaoBC;

    private String percentualMargemValorAdicionadoICMSST;

    private String percentualReducaoBCICMSST;

    private String valorBCICMSST;

    private String percentualAliquotaImpostoICMSST;

    private String valorImpostoICMSST;

    private String valorICMSDesoneracao;

    //Enum NFNotaMotivoDesoneracaoICMS
    private String desoneracao;

    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final String situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setModalidadeDeterminacaoBC(final String modalidadeDeterminacaoBC) {
        this.modalidadeDeterminacaoBC = modalidadeDeterminacaoBC;
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

    public void setValorImpostoICMSST(final BigDecimal valorImpostoICMSST) {
        this.valorImpostoICMSST = String.valueOf(valorImpostoICMSST);
    }

    public void setDesoneracao(final String nfNotaMotivoDesoneracaoICMS) {
        this.desoneracao = nfNotaMotivoDesoneracaoICMS;
    }

    public void setValorICMSDesoneracao(final BigDecimal valorICMSDesoneracao) {
        this.valorICMSDesoneracao = String.valueOf(valorICMSDesoneracao);
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getModalidadeDeterminacaoBC() {
        return this.modalidadeDeterminacaoBC;
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

    public String getValorImpostoICMSST() {
        return this.valorImpostoICMSST;
    }

    public String getValorICMSDesoneracao() {
        return this.valorICMSDesoneracao;
    }

    public String getDesoneracao() {
        return this.desoneracao;
    }
}
