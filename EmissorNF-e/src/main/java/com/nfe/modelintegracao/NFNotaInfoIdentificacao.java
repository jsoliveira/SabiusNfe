package com.nfe.modelintegracao;

import java.time.LocalDateTime;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoIdentificacao {

    private String uf;

    private String codigoRandomico;

    private String naturezaOperacao;

    //Enum NFFormaPagamentoPrazo
    private String formaPagamento;

    private String modelo;

    private String serie;

    private String numeroNota;

    private LocalDateTime dataHoraEmissao;

    private LocalDateTime dataHoraSaidaOuEntrada;

    //Enum NFTipo
    private String tipo;

    // Enum NFIdentificadorLocalDestinoOperacao
    private String identificadorLocalDestinoOperacao;

    private String codigoMunicipio;

    private Integer digitoVerificador;

    //Enum NFFinalidade
    private String finalidade;

    //Enum NFOperacaoConsumidorFinal
    private String operacaoConsumidorFinal;

    //Enum NFIndicadorPresencaComprador
    private String indicadorPresencaComprador;

    private String versaoEmissor;

    private LocalDateTime dataHoraContigencia;

    private String justificativaEntradaContingencia;

    private List<NFInfoReferenciada> referenciadas;

    public void setUf(final String uf) {
        this.uf = uf;
    }

    public void setCodigoRandomico(final String codigoRandomico) {

        this.codigoRandomico = codigoRandomico;
    }

    public void setNaturezaOperacao(final String naturezaOperacao) {

        this.naturezaOperacao = naturezaOperacao;
    }

    public void setFormaPagamento(final String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setModelo(final String modelo) {

        this.modelo = modelo;
    }

    public void setSerie(final String serie) {

        this.serie = serie;
    }

    public void setNumeroNota(final String numeroNota) {

        this.numeroNota = numeroNota;
    }

    public void setDataHoraEmissao(final LocalDateTime dataEmissao) {
        this.dataHoraEmissao = dataEmissao;
    }

    public void setDataHoraSaidaOuEntrada(final LocalDateTime dataHoraSaidaOuEntrada) {
        this.dataHoraSaidaOuEntrada = dataHoraSaidaOuEntrada;
    }

    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }

    public void setCodigoMunicipio(final String codigoMunicipio) {

        this.codigoMunicipio = codigoMunicipio;
    }

    public void setReferenciadas(final List<NFInfoReferenciada> referenciadas) {

        this.referenciadas = referenciadas;
    }

    public void setDigitoVerificador(final Integer digitoVerificador) {

        this.digitoVerificador = digitoVerificador;
    }

    public void setFinalidade(final String finalidade) {
        this.finalidade = finalidade;
    }

    public void setVersaoEmissor(final String versaoEmissor) {

        this.versaoEmissor = versaoEmissor;
    }

    public void setDataHoraContigencia(final LocalDateTime dataHoraContigencia) {
        this.dataHoraContigencia = dataHoraContigencia;
    }

    public void setJustificativaEntradaContingencia(final String justificativaEntradaContingencia) {

        this.justificativaEntradaContingencia = justificativaEntradaContingencia;
    }

    public void setIdentificadorLocalDestinoOperacao(final String identificadorLocalDestinoOperacao) {
        this.identificadorLocalDestinoOperacao = identificadorLocalDestinoOperacao;
    }

    public void setOperacaoConsumidorFinal(final String operacaoConsumidorFinal) {
        this.operacaoConsumidorFinal = operacaoConsumidorFinal;
    }

    public void setIndicadorPresencaComprador(final String indicadorPresencaComprador) {
        this.indicadorPresencaComprador = indicadorPresencaComprador;
    }

    public String getUf() {
        return this.uf;
    }

    public String getCodigoRandomico() {
        return this.codigoRandomico;
    }

    public String getNaturezaOperacao() {
        return this.naturezaOperacao;
    }

    public String getFormaPagamento() {
        return this.formaPagamento;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getSerie() {
        return this.serie;
    }

    public String getNumeroNota() {
        return this.numeroNota;
    }

    public LocalDateTime getDataHoraEmissao() {
        return this.dataHoraEmissao;
    }

    public LocalDateTime getDataHoraSaidaOuEntrada() {
        return this.dataHoraSaidaOuEntrada;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getIdentificadorLocalDestinoOperacao() {
        return this.identificadorLocalDestinoOperacao;
    }

    public String getCodigoMunicipio() {
        return this.codigoMunicipio;
    }

    public Integer getDigitoVerificador() {
        return this.digitoVerificador;
    }

    public String getFinalidade() {
        return this.finalidade;
    }

    public String getOperacaoConsumidorFinal() {
        return this.operacaoConsumidorFinal;
    }

    public String getIndicadorPresencaComprador() {
        return this.indicadorPresencaComprador;
    }

    public String getVersaoEmissor() {
        return this.versaoEmissor;
    }

    public LocalDateTime getDataHoraContigencia() {
        return this.dataHoraContigencia;
    }

    public String getJustificativaEntradaContingencia() {
        return this.justificativaEntradaContingencia;
    }

    public List<NFInfoReferenciada> getReferenciadas() {
        return this.referenciadas;
    }

}
