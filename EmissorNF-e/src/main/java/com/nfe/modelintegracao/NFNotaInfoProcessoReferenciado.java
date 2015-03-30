package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoProcessoReferenciado {

    private String identificadorProcessoOuAtoConcessorio;

    //Enum NFOrigemProcesso
    private String indicadorOrigemProcesso;

    public void setIdentificadorProcessoOuAtoConcessorio(final String identificadorProcessoOuAtoConcessorio) {

        this.identificadorProcessoOuAtoConcessorio = identificadorProcessoOuAtoConcessorio;
    }

    public void setIndicadorOrigemProcesso(final String indicadorOrigemProcesso) {
        this.indicadorOrigemProcesso = indicadorOrigemProcesso;
    }

    public String getIdentificadorProcessoOuAtoConcessorio() {
        return this.identificadorProcessoOuAtoConcessorio;
    }

    public String getIndicadorOrigemProcesso() {
        return this.indicadorOrigemProcesso;
    }
}
