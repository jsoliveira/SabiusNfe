package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMS10 {

    //Enum NFOrigem
    private String origem;

    //Enum NFNotaInfoImpostoTributacaoICMS
    private String situacaoTributaria;

    //Enum NFNotaInfoItemImpostoICMSModalidadeBaseCalulo
    private String modalidadeBaseCalculo;

    private String valorBaseCalculo;

    private String percentualAliquota;

    private String valorTributo;

    //Enum NFNotaInfoItemModalidadeBCICMSST
    private String modalidadeDeterminacaoBCICMS;

    private String percentualMargemValorICMSST;

    private String percentualReducaoBCICMSST;

    private String valorBCICMSST;

    private String percentualAliquotaImpostoICMSST;

    private String valorICMSST;

    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final String situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setModalidadeBaseCalculo(final String modalidadeBaseCalculo) {
        this.modalidadeBaseCalculo = modalidadeBaseCalculo;
    }

    public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = String.valueOf(valorBaseCalculo);
    }

    public void setPercentualAliquota(final BigDecimal aliquota) {
        this.percentualAliquota = String.valueOf(aliquota);
    }

    public void setValorTributo(final BigDecimal valorTributo) {
        this.valorTributo = String.valueOf(valorTributo);
    }

    public void setModalidadeDeterminacaoBCICMS(final String modalidadeDeterminacaoBCICMS) {
        this.modalidadeDeterminacaoBCICMS = modalidadeDeterminacaoBCICMS;
    }

    public void setPercentualMargemValorICMSST(final BigDecimal percentualMargemValorICMSST) {
        this.percentualMargemValorICMSST = String.valueOf(percentualMargemValorICMSST);
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

    public String getOrigem() {
        return this.origem;
    }

    public String getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getModalidadeBaseCalculo() {
        return this.modalidadeBaseCalculo;
    }

    public String getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public String getPercentualAliquota() {
        return this.percentualAliquota;
    }

    public String getValorTributo() {
        return this.valorTributo;
    }

    public String getModalidadeDeterminacaoBCICMS() {
        return this.modalidadeDeterminacaoBCICMS;
    }

    public String getPercentualMargemValorICMSST() {
        return this.percentualMargemValorICMSST;
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
}
