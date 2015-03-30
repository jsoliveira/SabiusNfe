package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoIPINaoTributado {

    //Enum NFNotaInfoSituacaoTributariaIPI
    private String situacaoTributaria;

    public NFNotaInfoItemImpostoIPINaoTributado() {
        this.situacaoTributaria = null;
    }

    public void setSituacaoTributaria(final String situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public String getSituacaoTributaria() {
        return this.situacaoTributaria;
    }
}
