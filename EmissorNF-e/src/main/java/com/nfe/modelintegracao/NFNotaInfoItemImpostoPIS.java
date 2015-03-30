package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoPIS {

    private NFNotaInfoItemImpostoPISAliquota aliquota;

    private NFNotaInfoItemImpostoPISQuantidade quantidade;

    private NFNotaInfoItemImpostoPISNaoTributado naoTributado;

    private NFNotaInfoItemImpostoPISOutrasOperacoes outrasOperacoes;

    public NFNotaInfoItemImpostoPIS() {
        this.aliquota = null;
        this.quantidade = null;
        this.naoTributado = null;
        this.outrasOperacoes = null;
    }

    public void setAliquota(final NFNotaInfoItemImpostoPISAliquota aliquota) {

        this.aliquota = aliquota;
    }

    public void setQuantidade(final NFNotaInfoItemImpostoPISQuantidade quantidade) {

        this.quantidade = quantidade;
    }

    public void setNaoTributado(final NFNotaInfoItemImpostoPISNaoTributado naoTributado) {

        this.naoTributado = naoTributado;
    }

    public void setOutrasOperacoes(final NFNotaInfoItemImpostoPISOutrasOperacoes outrasOperacoes) {

        this.outrasOperacoes = outrasOperacoes;
    }

    public NFNotaInfoItemImpostoPISAliquota getAliquota() {
        return this.aliquota;
    }

    public NFNotaInfoItemImpostoPISQuantidade getQuantidade() {
        return this.quantidade;
    }

    public NFNotaInfoItemImpostoPISNaoTributado getNaoTributado() {
        return this.naoTributado;
    }

    public NFNotaInfoItemImpostoPISOutrasOperacoes getOutrasOperacoes() {
        return this.outrasOperacoes;
    }
}
