package com.nfe.model;

import java.math.BigDecimal;

public class NFNotaInfoCanaFornecimentoDiario {

    private int dia;
    private String quantidade;

    public void setDia(final int dia) {

        this.dia = dia;
    }

    public void setQuantidade(final BigDecimal quantidade) {
        this.quantidade = String.valueOf(quantidade);
    }

    public int getDia() {
        return this.dia;
    }

    public String getQuantidade() {
        return this.quantidade;
    }
}
