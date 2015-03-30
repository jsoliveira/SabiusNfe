package com.nfe.modelintegracao;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rodrigo Monteiro
 */
@XmlRootElement
class NotaProcessada {

    private NFNotaProcessada notaProcessada;
    private List<String> mensagens;

    public NFNotaProcessada getNotaProcessada() {
        return notaProcessada;
    }

    public void setNotaProcessada(NFNotaProcessada notaProcessada) {
        this.notaProcessada = notaProcessada;
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<String> mensagens) {
        this.mensagens = mensagens;
    }

}
