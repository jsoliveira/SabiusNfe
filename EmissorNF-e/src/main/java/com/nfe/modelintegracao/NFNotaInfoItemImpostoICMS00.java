package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMS00 {

    //Enum NFOrigem
    private String origem;

    //Enum NFNotaInfoImpostoTributacaoICMS
    private String situacaoTributaria;

    //Enum NFNotaInfoItemImpostoICMSModalidadeBaseCalulo
    private String modalidadeBaseCalculo;

    private String valorBaseCalculo;

    private String percentualAliquota;

    private String valorTributo;

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
}
