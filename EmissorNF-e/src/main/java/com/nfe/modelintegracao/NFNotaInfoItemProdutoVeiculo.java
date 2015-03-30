package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemProdutoVeiculo {

    //Enum NFNotaInfoItemProdutoVeiculoTipoOperacao
    private String tipoOperacao;

    private String chassi;

    private String codigoCor;

    private String descricaoCor;

    private String potencia;

    private String cilindrada;

    private String pesoLiquido;

    private String pesoBruto;

    private String numeroSerie;

    //Enum NFNotaInfoCombustivelTipo
    private String tipoCombustivel;

    private String numeroMotor;

    private String capacidadeMaximaTracao;

    private String distanciaEntreEixos;

    private Integer anoModeloFabricacao;

    private Integer anoFabricacao;

    private String tipoPintura;

    //Enum NFNotaInfoTipoVeiculo
    private String tipoVeiculo;

    //Enum NFNotaInfoEspecieVeiculo
    private String especieVeiculo;

    //Enum NFNotaInfoItemProdutoVeiculoCondicaoChassi
    private String condicaoChassi;

    //Enum NFNotaInfoItemProdutoVeiculoCondicao
    private String condicao;

    private String codigoMarcaModelo;

    //Enum NFNotaInfoVeiculoCor
    private String corDENATRAN;

    private Integer lotacao;

    //Enum NFNotaInfoItemProdutoVeiculoRestricao
    private String restricao;

    public void setTipoOperacao(final String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public void setChassi(final String chassi) {

        this.chassi = chassi;
    }

    public void setCodigoCor(final String codigoCor) {

        this.codigoCor = codigoCor;
    }

    public void setDescricaoCor(final String descricaoCor) {

        this.descricaoCor = descricaoCor;
    }

    public void setPotencia(final String potencia) {

        this.potencia = potencia;
    }

    public void setCilindrada(final String cilindrada) {

        this.cilindrada = cilindrada;
    }

    public void setPesoLiquido(final BigDecimal pesoLiquido) {
        this.pesoLiquido = String.valueOf(pesoLiquido);
    }

    public void setPesoBruto(final BigDecimal pesoBruto) {
        this.pesoBruto = String.valueOf(pesoBruto);
    }

    public void setNumeroSerie(final String numeroSerie) {

        this.numeroSerie = numeroSerie;
    }

    public void setTipoCombustivel(final String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setNumeroMotor(final String numeroMotor) {

        this.numeroMotor = numeroMotor;
    }

    public void setCapacidadeMaximaTracao(final BigDecimal capacidadeMaximaTracao) {
        this.capacidadeMaximaTracao = String.valueOf(capacidadeMaximaTracao);
    }

    public void setDistanciaEntreEixos(final String distanciaEntreEixos) {

        this.distanciaEntreEixos = distanciaEntreEixos;
    }

    public void setAnoModeloFabricacao(final int anoModeloFabricacao) {

        this.anoModeloFabricacao = anoModeloFabricacao;
    }

    public void setAnoFabricacao(final int anoFabricacao) {

        this.anoFabricacao = anoFabricacao;
    }

    public void setTipoPintura(final String tipoPintura) {

        this.tipoPintura = tipoPintura;
    }

    public void setTipoVeiculo(final String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void setEspecieVeiculo(final String especieVeiculo) {
        this.especieVeiculo = especieVeiculo;
    }

    public void setCondicaoChassi(final String condicaoChassi) {
        this.condicaoChassi = condicaoChassi;
    }

    public void setCondicao(final String condicao) {
        this.condicao = condicao;
    }

    public void setCodigoMarcaModelo(final String codigoMarcaModelo) {

        this.codigoMarcaModelo = codigoMarcaModelo;
    }

    public void setCodigoCorDENATRAN(final String corDENATRAN) {
        this.corDENATRAN = corDENATRAN;
    }

    public void setLotacao(final int lotacao) {

        this.lotacao = lotacao;
    }

    public void setRestricao(final String restricao) {
        this.restricao = restricao;
    }

    public String getTipoOperacao() {
        return this.tipoOperacao;
    }

    public String getChassi() {
        return this.chassi;
    }

    public String getCodigoCor() {
        return this.codigoCor;
    }

    public String getDescricaoCor() {
        return this.descricaoCor;
    }

    public String getPotencia() {
        return this.potencia;
    }

    public String getCilindrada() {
        return this.cilindrada;
    }

    public String getPesoLiquido() {
        return this.pesoLiquido;
    }

    public String getPesoBruto() {
        return this.pesoBruto;
    }

    public String getNumeroSerie() {
        return this.numeroSerie;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    public String getNumeroMotor() {
        return this.numeroMotor;
    }

    public String getCapacidadeMaximaTracao() {
        return this.capacidadeMaximaTracao;
    }

    public String getDistanciaEntreEixos() {
        return this.distanciaEntreEixos;
    }

    public Integer getAnoModeloFabricacao() {
        return this.anoModeloFabricacao;
    }

    public Integer getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public String getTipoPintura() {
        return this.tipoPintura;
    }

    public String getTipoVeiculo() {
        return this.tipoVeiculo;
    }

    public String getEspecieVeiculo() {
        return this.especieVeiculo;
    }

    public String getCondicaoChassi() {
        return this.condicaoChassi;
    }

    public String getCondicao() {
        return this.condicao;
    }

    public String getCodigoMarcaModelo() {
        return this.codigoMarcaModelo;
    }

    public String getCorDENATRAN() {
        return this.corDENATRAN;
    }

    public Integer getLotacao() {
        return this.lotacao;
    }

    public String getRestricao() {
        return this.restricao;
    }
}
