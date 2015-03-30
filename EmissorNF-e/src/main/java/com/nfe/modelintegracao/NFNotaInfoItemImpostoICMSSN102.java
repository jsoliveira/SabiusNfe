package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMSSN102 {

    //Enum NFOrigem
    private String origem;

    //Enum NFNotaSituacaoOperacionalSimplesNacional
    private String situacaoOperacaoSN;

    //Enum NFOrigem
    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public void setSituacaoOperacaoSN(final String situacaoOperacaoSN) {
        this.situacaoOperacaoSN = situacaoOperacaoSN;
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getSituacaoOperacaoSN() {
        return this.situacaoOperacaoSN;
    }
}
