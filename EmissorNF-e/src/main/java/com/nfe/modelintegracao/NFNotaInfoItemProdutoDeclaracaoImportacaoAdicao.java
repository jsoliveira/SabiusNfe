package com.nfe.modelintegracao;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao {

    private Integer numero;

    private Integer sequencial;

    private String codigoFabricante;

    private String desconto;

    private BigInteger numeroAtoConcessorioDrawback;

    public void setNumero(final Integer numero) {

        this.numero = numero;
    }

    public void setSequencial(final Integer sequencial) {

        this.sequencial = sequencial;
    }

    public void setCodigoFabricante(final String codigoFabricante) {

        this.codigoFabricante = codigoFabricante;
    }

    public void setDesconto(final BigDecimal desconto) {
        this.desconto = String.valueOf(desconto);
    }

    public void setDesconto(final String desconto) {
        this.desconto = desconto;
    }

    public void setNumeroAtoConcessorioDrawback(final BigInteger numeroAtoConcessorioDrawback) {

        this.numeroAtoConcessorioDrawback = numeroAtoConcessorioDrawback;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public Integer getSequencial() {
        return this.sequencial;
    }

    public String getCodigoFabricante() {
        return this.codigoFabricante;
    }

    public String getDesconto() {
        return this.desconto;
    }

    public BigInteger getNumeroAtoConcessorioDrawback() {
        return this.numeroAtoConcessorioDrawback;
    }
}
