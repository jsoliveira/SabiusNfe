package com.nfe.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class NFNotaInfoItemProdutoDeclaracaoImportacao {

    private String numeroRegistro;
    private LocalDate dataRegistro;
    private String localDesembaraco;
    private String ufDesembaraco;
    private LocalDate dataDesembaraco;
    private Integer transporteInternacional;
    private String valorAFRMM;
    private Integer formaImportacaoIntermediacao;
    private String cnpj;
    private String ufTerceiro;
    private String codigoExportador;
    private List<NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao> adicoes;

    public void setNumeroRegistro(final String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public void setDataRegistro(final LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public void setLocalDesembaraco(final String localDesembaraco) {

        this.localDesembaraco = localDesembaraco;
    }

    public void setUfDesembaraco(final String ufDesembaraco) {
        this.ufDesembaraco = ufDesembaraco;
    }

    public void setDataDesembaraco(final LocalDate dataDesembaraco) {
        this.dataDesembaraco = dataDesembaraco;
    }

    public void setCodigoExportador(final String codigoExportador) {

        this.codigoExportador = codigoExportador;
    }

    public void setAdicoes(final List<NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao> adicoes) {
        this.adicoes = adicoes;
    }

    public void setTransporteInternacional(final Integer transporteInternacional) {
        this.transporteInternacional = transporteInternacional;
    }

    public void setValorAFRMM(final BigDecimal valorAFRMM) {
        this.valorAFRMM = String.valueOf(valorAFRMM);
    }

    public void setFormaImportacaoIntermediacao(final Integer formaImportacaoIntermediacao) {
        this.formaImportacaoIntermediacao = formaImportacaoIntermediacao;
    }

    public void setCnpj(final String cnpj) {
        this.cnpj = cnpj;
    }

    public void setUfTerceiro(final String ufTerceiro) {
        this.ufTerceiro = ufTerceiro;
    }

    public String getNumeroRegistro() {
        return this.numeroRegistro;
    }

    public LocalDate getDataRegistro() {
        return this.dataRegistro;
    }

    public String getLocalDesembaraco() {
        return this.localDesembaraco;
    }

    public String getUfDesembaraco() {
        return this.ufDesembaraco;
    }

    public LocalDate getDataDesembaraco() {
        return this.dataDesembaraco;
    }

    public Integer getTransporteInternacional() {
        return this.transporteInternacional;
    }

    public String getValorAFRMM() {
        return this.valorAFRMM;
    }

    public Integer getFormaImportacaoIntermediacao() {
        return this.formaImportacaoIntermediacao;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getUfTerceiro() {
        return this.ufTerceiro;
    }

    public String getCodigoExportador() {
        return this.codigoExportador;
    }

    public List<NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao> getAdicoes() {
        return this.adicoes;
    }
}
