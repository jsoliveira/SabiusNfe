package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoCartao {

    private String cnpj;

    //Enum NFOperadoraCartao
    private String operadoraCartao;

    private String numeroAutorizacaoOperacaoCartao;

    public void setCnpj(final String cnpj) {

        this.cnpj = cnpj;
    }

    public void setNumeroAutorizacaoOperacaoCartao(final String numeroAutorizacaoOperacaoCartao) {

        this.numeroAutorizacaoOperacaoCartao = numeroAutorizacaoOperacaoCartao;
    }

    public void setOperadoraCartao(final String operadoraCartao) {
        this.operadoraCartao = operadoraCartao;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getNumeroAutorizacaoOperacaoCartao() {
        return this.numeroAutorizacaoOperacaoCartao;
    }

    public String getOperadoraCartao() {
        return this.operadoraCartao;
    }
}
