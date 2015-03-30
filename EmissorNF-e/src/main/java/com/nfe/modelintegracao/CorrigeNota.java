package com.nfe.modelintegracao;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rodrigo Monteiro
 */
@XmlRootElement
public class CorrigeNota {

    private String chaveDeAcesso;
    private String textoCorrecao;
    private List<String> mensagens;

    public String getChaveDeAcesso() {
        return chaveDeAcesso;
    }

    public void setChaveDeAcesso(String chaveDeAcesso) {
        this.chaveDeAcesso = chaveDeAcesso;
    }

    public String getTextoCorrecao() {
        return textoCorrecao;
    }

    public void setTextoCorrecao(String textoCorrecao) {
        this.textoCorrecao = textoCorrecao;
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<String> mensagens) {
        this.mensagens = mensagens;
    }

}
