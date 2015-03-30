package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoPISNaoTributado {

    //Enum NFNotaInfoSituacaoTributariaPIS
    private String situacaoTributaria;

    public NFNotaInfoItemImpostoPISNaoTributado() {
        this.situacaoTributaria = null;
    }

    public void setSituacaoTributaria(final String situacaoTributaria) {

        this.situacaoTributaria = situacaoTributaria;
    }

    public String getSituacaoTributaria() {
        return this.situacaoTributaria;
    }
}
