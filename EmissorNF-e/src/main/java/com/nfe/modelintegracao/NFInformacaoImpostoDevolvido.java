package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFInformacaoImpostoDevolvido {

    private String valorIPIDevolvido;

    public String getValorIPIDevolvido() {
        return this.valorIPIDevolvido;
    }

    public void setValorIPIDevolvido(final BigDecimal valorIPIDevolvido) {
        this.valorIPIDevolvido = String.valueOf(valorIPIDevolvido);
    }

}
