package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoISSQN {

    private String valorBaseCalculo;

    private String valorAliquota;

    private String valor;

    private Integer codigoMunicipio;

    private String itemListaServicos;

    private String valorDeducao;

    private String valorOutro;

    private String valorDescontoIncondicionado;

    private String valorDescontoCondicionado;

    private String valorRetencaoISS;

    //Enum NFNotaInfoItemIndicadorExigibilidadeISS
    private String indicadorExigibilidadeISS;

    private String codigoServico;

    private String codigoMunicipioIncidenciaImposto;

    private String codigoPais;

    private String numeroProcesso;

    //Enum NFNotaInfoItemIndicadorIncentivoFiscal
    private String indicadorIncentivoFiscal;

    public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = String.valueOf(valorBaseCalculo);
    }

    public void setValorAliquota(final BigDecimal valorAliquota) {
        this.valorAliquota = String.valueOf(valorAliquota);
    }

    public void setValor(final BigDecimal valor) {
        this.valor = String.valueOf(valor);
    }

    public void setCodigoMunicipio(final Integer codigoMunicipio) {

        this.codigoMunicipio = codigoMunicipio;
    }

    public void setItemListaServicos(final String itemListaServicos) {

        this.itemListaServicos = itemListaServicos;
    }

    public void setCodigoMunicipioIncidenciaImposto(final String codigoMunicipioIncidenciaImposto) {

        this.codigoMunicipioIncidenciaImposto = codigoMunicipioIncidenciaImposto;
    }

    public void setCodigoPais(final String codigoPais) {

        this.codigoPais = codigoPais;
    }

    public void setCodigoServico(final String codigoServico) {

        this.codigoServico = codigoServico;
    }

    public void setIndicadorExigibilidadeISS(final String indicadorExigibilidadeISS) {
        this.indicadorExigibilidadeISS = indicadorExigibilidadeISS;
    }

    public void setIndicadorIncentivoFiscal(final String indicadorIncentivoFiscal) {
        this.indicadorIncentivoFiscal = indicadorIncentivoFiscal;
    }

    public void setNumeroProcesso(final String numeroProcesso) {

        this.numeroProcesso = numeroProcesso;
    }

    public void setValorDeducao(final BigDecimal valorDeducao) {
        this.valorDeducao = String.valueOf(valorDeducao);
    }

    public void setValorDescontoCondicionado(final BigDecimal valorDescontoCondicionado) {
        this.valorDescontoCondicionado = String.valueOf(valorDescontoCondicionado);
    }

    public void setValorDescontoIncondicionado(final BigDecimal valorDescontoIncondicionado) {
        this.valorDescontoIncondicionado = String.valueOf(valorDescontoIncondicionado);
    }

    public void setValorOutro(final BigDecimal valorOutro) {
        this.valorOutro = String.valueOf(valorOutro);
    }

    public void setValorRetencaoISS(final BigDecimal valorRetencaoISS) {
        this.valorRetencaoISS = String.valueOf(valorRetencaoISS);
    }

    public String getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public String getValorAliquota() {
        return this.valorAliquota;
    }

    public String getValor() {
        return this.valor;
    }

    public Integer getCodigoMunicipio() {
        return this.codigoMunicipio;
    }

    public String getItemListaServicos() {
        return this.itemListaServicos;
    }

    public String getValorDeducao() {
        return this.valorDeducao;
    }

    public String getValorOutro() {
        return this.valorOutro;
    }

    public String getValorDescontoIncondicionado() {
        return this.valorDescontoIncondicionado;
    }

    public String getValorDescontoCondicionado() {
        return this.valorDescontoCondicionado;
    }

    public String getValorRetencaoISS() {
        return this.valorRetencaoISS;
    }

    public String getIndicadorExigibilidadeISS() {
        return this.indicadorExigibilidadeISS;
    }

    public String getCodigoServico() {
        return this.codigoServico;
    }

    public String getCodigoMunicipioIncidenciaImposto() {
        return this.codigoMunicipioIncidenciaImposto;
    }

    public String getCodigoPais() {
        return this.codigoPais;
    }

    public String getNumeroProcesso() {
        return this.numeroProcesso;
    }

    public String getIndicadorIncentivoFiscal() {
        return this.indicadorIncentivoFiscal;
    }
}
