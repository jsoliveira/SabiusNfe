package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoCompra {

    private String notaDeEmpenho;

    private String pedido;

    private String contrato;

    public void setNotaDeEmpenho(final String notaDeEmpenho) {

        this.notaDeEmpenho = notaDeEmpenho;
    }

    public void setPedido(final String pedido) {

        this.pedido = pedido;
    }

    public void setContrato(final String contrato) {

        this.contrato = contrato;
    }

    public String getContrato() {
        return this.contrato;
    }

    public String getNotaDeEmpenho() {
        return this.notaDeEmpenho;
    }

    public String getPedido() {
        return this.pedido;
    }
}
