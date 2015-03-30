package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoIPINT {

    //Enum NFNotaInfoSituacaoTributariaIPI
    private String situacaoTributariaIPI;

    public String getSituacaoTributariaIPI() {
        return this.situacaoTributariaIPI;
    }

    public void setSituacaoTributariaIPI(final String situacaoTributariaIPI) {
        this.situacaoTributariaIPI = situacaoTributariaIPI;
    }
}
