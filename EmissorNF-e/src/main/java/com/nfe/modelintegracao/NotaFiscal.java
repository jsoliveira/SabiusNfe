package com.nfe.modelintegracao;


import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rodrigo Monteiro
 */
@XmlRootElement
class NotaFiscal {

    private NFNota NFNota;
    private List<String> mensagens;

    public NFNota getNFNota() {
        return NFNota;
    }

    public void setNFNota(NFNota NFNota) {
        this.NFNota = NFNota;
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<String> mensagens) {
        this.mensagens = mensagens;
    }

}
