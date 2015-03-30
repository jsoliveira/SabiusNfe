package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaProcessada {

    private String versao;

    private NFNota nota;

    private NFProtocolo protocolo;

    public NFNota getNota() {
        return this.nota;
    }

    public String getVersao() {
        return this.versao;
    }

    public NFProtocolo getProtocolo() {
        return this.protocolo;
    }

    public void setNota(final NFNota nota) {
        this.nota = nota;
    }

    public void setProtocolo(final NFProtocolo protocolo) {
        this.protocolo = protocolo;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = String.valueOf(versao);
    }
}
