package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMS20 {

    //Enum NFOrigem
    private String origem;

    //Enum NFNotaInfoImpostoTributacaoICMS
    private String situacaoTributaria;

    //Enum NFNotaInfoItemImpostoICMSModalidadeBaseCalulo
    private String modalidadeBaseCalculo;

    private String percentualReducaoBC;

    private String valorBCICMS;

    private String percentualAliquota;

    private String valorTributo;

    private String valorICMSDesoneracao;

    //Enum NFNotaMotivoDesoneracaoICMS
    private String desoneracao;

    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final String situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setModalidadeBaseCalculo(final String modalidadeBaseCalculo) {
        this.modalidadeBaseCalculo = modalidadeBaseCalculo;
    }

    public void setPercentualReducaoBC(final BigDecimal percentualReducaoBC) {
        this.percentualReducaoBC = String.valueOf(percentualReducaoBC);
    }

    public void setValorBCICMS(final BigDecimal valorBCICMS) {
        this.valorBCICMS = String.valueOf(valorBCICMS);
    }

    public void setPercentualAliquota(final BigDecimal aliquota) {
        this.percentualAliquota = String.valueOf(aliquota);
    }

    public void setValorTributo(final BigDecimal valorTributo) {
        this.valorTributo = String.valueOf(valorTributo);
    }

    public void setDesoneracao(final String outros) {
        this.desoneracao = outros;
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

    public String getModalidadeBaseCalculo() {
        return this.modalidadeBaseCalculo;
    }

    public String getPercentualReducaoBC() {
        return this.percentualReducaoBC;
    }

    public String getValorBCICMS() {
        return this.valorBCICMS;
    }

    public String getPercentualAliquota() {
        return this.percentualAliquota;
    }

    public String getValorTributo() {
        return this.valorTributo;
    }

    public String getValorICMSDesoneracao() {
        return this.valorICMSDesoneracao;
    }

    public String getDesoneracao() {
        return this.desoneracao;
    }
}
