package com.nfe.modelintegracao;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rodrigo Monteiro
 */
@XmlRootElement
public class ConsultaCadastro {

    private String cnpj_consultado;
    private List<String> mensagens;

    public String getCnpj_consultado() {
        return cnpj_consultado;
    }

    public void setCnpj_consultado(String cnpj_consultado) {
        this.cnpj_consultado = cnpj_consultado;
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<String> mensagens) {
        this.mensagens = mensagens;
    }

}
