package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoCOFINSNaoTributavel {

    //Enum NFNotaInfoSituacaoTributariaCOFINS
    private String situacaoTributaria;

    public NFNotaInfoItemImpostoCOFINSNaoTributavel() {
        this.situacaoTributaria = null;
    }

    public void setSituacaoTributaria(final String situacaoTributaria) {

        this.situacaoTributaria = situacaoTributaria;
    }

    public String getSituacaoTributaria() {
        return this.situacaoTributaria;
    }
}
