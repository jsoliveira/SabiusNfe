package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNota {

    private long identificadorLocal;

    private NFNotaInfo info;

    private String assinatura;

    public void setInfo(final NFNotaInfo info) {
        this.info = info;
    }

    public NFNotaInfo getInfo() {
        return this.info;
    }

    /**
     * Utilizado para identificacao interna do sistema
     */
    public void setIdentificadorLocal(final long identificadorLocal) {
        this.identificadorLocal = identificadorLocal;
    }

    public long getIdentificadorLocal() {
        return this.identificadorLocal;
    }

    public void setAssinatura(final String assinatura) {
        this.assinatura = assinatura;
    }

    public String getAssinatura() {
        return this.assinatura;
    }
}
