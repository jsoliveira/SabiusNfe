package com.nfe.modelintegracao;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemProdutoMedicamento {

    private String lote;

    private String quantidade;

    private LocalDate dataFabricacao;

    private LocalDate dataValidade;

    private String precoMaximoConsumidor;

    public NFNotaInfoItemProdutoMedicamento() {
        this.lote = null;
        this.quantidade = null;
        this.dataFabricacao = null;
        this.dataValidade = null;
        this.precoMaximoConsumidor = null;
    }

    public void setLote(final String lote) {

        this.lote = lote;
    }

    public void setQuantidade(final BigDecimal quantidade) {
        this.quantidade = String.valueOf(quantidade);
    }

    public void setDataFabricacao(final LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void setDataValidade(final LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setPrecoMaximoConsumidor(final BigDecimal precoMaximoConsumidor) {
        this.precoMaximoConsumidor = String.valueOf(precoMaximoConsumidor);
    }

    public String getLote() {
        return this.lote;
    }

    public String getQuantidade() {
        return this.quantidade;
    }

    public LocalDate getDataFabricacao() {
        return this.dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return this.dataValidade;
    }

    public String getPrecoMaximoConsumidor() {
        return this.precoMaximoConsumidor;
    }
}
