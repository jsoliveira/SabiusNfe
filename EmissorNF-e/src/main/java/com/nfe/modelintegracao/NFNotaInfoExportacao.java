package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoExportacao {

    private String ufEmbarqueProduto;

    private String localEmbarqueProdutos;

    private String localDespachoProdutos;

    public void setUfEmbarqueProduto(final String ufEmbarqueProduto) {
        this.ufEmbarqueProduto = ufEmbarqueProduto;
    }

    public void setLocalEmbarqueProdutos(final String localEmbarqueProdutos) {

        this.localEmbarqueProdutos = localEmbarqueProdutos;
    }

    public void setLocalDespachoProdutos(final String localDespachoProdutos) {

        this.localDespachoProdutos = localDespachoProdutos;
    }

    public String getLocalDespachoProdutos() {
        return this.localDespachoProdutos;
    }

    public String getLocalEmbarqueProdutos() {
        return this.localEmbarqueProdutos;
    }

    public String getUfEmbarqueProduto() {
        return this.ufEmbarqueProduto;
    }
}
