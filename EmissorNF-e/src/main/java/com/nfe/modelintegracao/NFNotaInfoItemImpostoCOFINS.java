package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoCOFINS {

    private NFNotaInfoItemImpostoCOFINSAliquota aliquota;

    private NFNotaInfoItemImpostoCOFINSQuantidade quantidade;

    private NFNotaInfoItemImpostoCOFINSNaoTributavel naoTributavel;

    private NFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes;

    public void setAliquota(final NFNotaInfoItemImpostoCOFINSAliquota aliquota) {

        this.aliquota = aliquota;
    }

    public void setQuantidade(final NFNotaInfoItemImpostoCOFINSQuantidade quantidade) {

        this.quantidade = quantidade;
    }

    public void setNaoTributavel(final NFNotaInfoItemImpostoCOFINSNaoTributavel naoTributavel) {

        this.naoTributavel = naoTributavel;
    }

    public void setOutrasOperacoes(final NFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes) {

        this.outrasOperacoes = outrasOperacoes;
    }

    public NFNotaInfoItemImpostoCOFINSAliquota getAliquota() {
        return this.aliquota;
    }

    public NFNotaInfoItemImpostoCOFINSQuantidade getQuantidade() {
        return this.quantidade;
    }

    public NFNotaInfoItemImpostoCOFINSNaoTributavel getNaoTributavel() {
        return this.naoTributavel;
    }

    public NFNotaInfoItemImpostoCOFINSOutrasOperacoes getOutrasOperacoes() {
        return this.outrasOperacoes;
    }
}
