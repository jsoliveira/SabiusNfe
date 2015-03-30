package com.nfe.modelintegracao;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoCana {

    private String safra;

    private String referencia;

    private List<NFNotaInfoCanaFornecimentoDiario> fornecimentosDiario;

    private List<NFNotaInfoCanaDeducao> deducoes;

    private String quantidadeTotalMes;

    private String quantidadeTotalAnterior;

    private String quantidadeTotalGeral;

    private String valorFornecimento;

    private String valorTotalDeducao;

    private String valorLiquidoFornecimento;

    public void setSafra(final String safra) {
        if (safra.length() != 4 && safra.length() != 9) {
            throw new IllegalStateException("Tamanho invalido");
        }

        final Pattern pattern = safra.length() == 4 ? Pattern.compile("[0-9]{4}") : Pattern.compile("[0-9]{4}/[0-9]{4}");
        final Matcher matcher = pattern.matcher(safra);
        if (!matcher.find()) {
            throw new IllegalStateException("Padrao invalido");
        }

        this.safra = safra;
    }

    public void setReferencia(final String referencia) {

        this.referencia = referencia;
    }

    public void setFornecimentosDiario(final List<NFNotaInfoCanaFornecimentoDiario> fornecimentosDiario) {

        this.fornecimentosDiario = fornecimentosDiario;
    }

    public void setDeducoes(final List<NFNotaInfoCanaDeducao> deducoes) {

        this.deducoes = deducoes;
    }

    public void setQuantidadeTotalMes(final BigDecimal quantidadeTotalMes) {
        this.quantidadeTotalMes = String.valueOf(quantidadeTotalMes);
    }

    public void setQuantidadeTotalAnterior(final BigDecimal quantidadeTotalAnterior) {
        this.quantidadeTotalAnterior = String.valueOf(quantidadeTotalAnterior);
    }

    public void setQuantidadeTotalGeral(final BigDecimal quantidadeTotalGeral) {
        this.quantidadeTotalGeral = String.valueOf(quantidadeTotalGeral);
    }

    public void setValorFornecimento(final BigDecimal valorFornecimento) {
        this.valorFornecimento = String.valueOf(valorFornecimento);
    }

    public void setValorTotalDeducao(final BigDecimal valorTotalDeducao) {
        this.valorTotalDeducao = String.valueOf(valorTotalDeducao);
    }

    public void setValorLiquidoFornecimento(final BigDecimal valorLiquidoFornecimento) {
        this.valorLiquidoFornecimento = String.valueOf(valorLiquidoFornecimento);
    }

    public String getSafra() {
        return this.safra;
    }

    public String getReferencia() {
        return this.referencia;
    }

    public List<NFNotaInfoCanaFornecimentoDiario> getFornecimentosDiario() {
        return this.fornecimentosDiario;
    }

    public List<NFNotaInfoCanaDeducao> getDeducoes() {
        return this.deducoes;
    }

    public String getQuantidadeTotalMes() {
        return this.quantidadeTotalMes;
    }

    public String getQuantidadeTotalAnterior() {
        return this.quantidadeTotalAnterior;
    }

    public String getQuantidadeTotalGeral() {
        return this.quantidadeTotalGeral;
    }

    public String getValorFornecimento() {
        return this.valorFornecimento;
    }

    public String getValorTotalDeducao() {
        return this.valorTotalDeducao;
    }

    public String getValorLiquidoFornecimento() {
        return this.valorLiquidoFornecimento;
    }
}
