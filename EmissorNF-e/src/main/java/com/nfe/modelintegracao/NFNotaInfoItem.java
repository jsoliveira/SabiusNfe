package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItem {

    private Integer numeroItem;

    private NFNotaInfoItemProduto produto;

    private NFNotaInfoItemImposto imposto;

    private NFImpostoDevolvido impostoDevolvido;

    private String informacoesAdicionais;

    public void setNumeroItem(final Integer numeroItem) {

        this.numeroItem = numeroItem;
    }

    public void setInformacoesAdicionais(final String informacoesAdicionais) {

        this.informacoesAdicionais = informacoesAdicionais;
    }

    public void setProduto(final NFNotaInfoItemProduto produto) {
        this.produto = produto;
    }

    public void setImposto(final NFNotaInfoItemImposto imposto) {
        this.imposto = imposto;
    }

    public Integer getNumeroItem() {
        return this.numeroItem;
    }

    public NFNotaInfoItemProduto getProduto() {
        return this.produto;
    }

    public NFNotaInfoItemImposto getImposto() {
        return this.imposto;
    }

    public String getInformacoesAdicionais() {
        return this.informacoesAdicionais;
    }

    public NFImpostoDevolvido getImpostoDevolvido() {
        return this.impostoDevolvido;
    }

    public void setImpostoDevolvido(final NFImpostoDevolvido impostoDevolvido) {
        this.impostoDevolvido = impostoDevolvido;
    }
}
