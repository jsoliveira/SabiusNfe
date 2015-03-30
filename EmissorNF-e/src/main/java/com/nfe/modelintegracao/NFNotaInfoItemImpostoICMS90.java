package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMS90 {

    //Enum NFOrigem
    private String origem;

    //Enum NFNotaInfoImpostoTributacaoICMS
    private String situacaoTributaria;

    //Enum NFNotaInfoItemImpostoICMSModalidadeBaseCalulo
    private String modalidadeBC;

    private String valorBC;

    private String percentualReducaoBC;

    private String percentualAliquota;

    private String valorTributo;

    //Enum NFNotaInfoItemModalidadeBCICMSST
    private String modalidadeDeterminacaoBCICMSST;

    private String percentualMargemValorAdicionadoICMSST;

    private String percentualReducaoBCICMSST;

    private String valorBCST;

    private String percentualAliquotaImpostoICMSST;

    private String valorICMSST;

    private String valorICMSDesoneracao;

    //Enum NFNotaMotivoDesoneracaoICMS
    private String desoneracao;

    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final String situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setModalidadeBC(final String modalidadeBC) {
        this.modalidadeBC = modalidadeBC;
    }

    public void setValorBC(final BigDecimal valorBC) {
        this.valorBC = String.valueOf(valorBC);
    }

    public void setPercentualReducaoBC(final BigDecimal percentualReducaoBC) {
        this.percentualReducaoBC = String.valueOf(percentualReducaoBC);
    }

    public void setPercentualAliquota(final BigDecimal aliquota) {
        this.percentualAliquota = String.valueOf(aliquota);
    }

    public void setValorTributo(final BigDecimal valorTributo) {
        this.valorTributo = String.valueOf(valorTributo);
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

    public void setValorBCST(final BigDecimal valorBCST) {
        this.valorBCST = String.valueOf(valorBCST);
    }

    public void setPercentualAliquotaImpostoICMSST(final BigDecimal aliquotaImpostoICMSST) {
        this.percentualAliquotaImpostoICMSST = String.valueOf(aliquotaImpostoICMSST);
    }

    public void setValorICMSST(final BigDecimal valorICMSST) {
        this.valorICMSST = String.valueOf(valorICMSST);
    }

    public void setDesoneracao(final String desoneracao) {
        this.desoneracao = desoneracao;
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

    public String getModalidadeBC() {
        return this.modalidadeBC;
    }

    public String getValorBC() {
        return this.valorBC;
    }

    public String getPercentualReducaoBC() {
        return this.percentualReducaoBC;
    }

    public String getPercentualAliquota() {
        return this.percentualAliquota;
    }

    public String getValorTributo() {
        return this.valorTributo;
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

    public String getValorBCST() {
        return this.valorBCST;
    }

    public String getPercentualAliquotaImpostoICMSST() {
        return this.percentualAliquotaImpostoICMSST;
    }

    public String getValorICMSST() {
        return this.valorICMSST;
    }

    public String getValorICMSDesoneracao() {
        return this.valorICMSDesoneracao;
    }

    public String getDesoneracao() {
        return this.desoneracao;
    }
}
