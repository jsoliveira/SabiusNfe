package com.nfe.model;

public class NFNotaInfoPagamento {

    private Integer formaPagamentoMoeda;
    private String valorPagamento;
    private String cartaocnpj;
    private Integer operadoraCartao;
    private String numeroAutorizacaoOperacaoCartao;

    public Integer getFormaPagamentoMoeda() {
        return formaPagamentoMoeda;
    }

    public void setFormaPagamentoMoeda(Integer formaPagamentoMoeda) {
        this.formaPagamentoMoeda = formaPagamentoMoeda;
    }

    public String getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(String valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getCartaocnpj() {
        return cartaocnpj;
    }

    public void setCartaocnpj(String cartaocnpj) {
        this.cartaocnpj = cartaocnpj;
    }

    public Integer getOperadoraCartao() {
        return operadoraCartao;
    }

    public void setOperadoraCartao(Integer operadoraCartao) {
        this.operadoraCartao = operadoraCartao;
    }

    public String getNumeroAutorizacaoOperacaoCartao() {
        return numeroAutorizacaoOperacaoCartao;
    }

    public void setNumeroAutorizacaoOperacaoCartao(String numeroAutorizacaoOperacaoCartao) {
        this.numeroAutorizacaoOperacaoCartao = numeroAutorizacaoOperacaoCartao;
    }

}
