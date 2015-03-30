package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoLacre {

    private String numeroLacres;

    public void setNumeroLacre(final String numeroLacres) {

        this.numeroLacres = numeroLacres;
    }

    public String getNumeroLacres() {
        return this.numeroLacres;
    }
}
