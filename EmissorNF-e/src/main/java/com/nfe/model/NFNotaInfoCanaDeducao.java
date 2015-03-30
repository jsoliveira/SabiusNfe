package com.nfe.model;

import java.math.BigDecimal;

public class NFNotaInfoCanaDeducao {

    private String descricaoDeducao;
    private String valorDeducao;

    public void setDescricaoDeducao(final String descricaoDeducao) {

        this.descricaoDeducao = descricaoDeducao;
    }

    public void setValorDeducao(final BigDecimal valorDeducao) {
        this.valorDeducao = String.valueOf(valorDeducao);
    }

    public String getDescricaoDeducao() {
        return this.descricaoDeducao;
    }

    public String getValorDeducao() {
        return this.valorDeducao;
    }
}
