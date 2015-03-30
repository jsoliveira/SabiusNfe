package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoICMSTotal {

    private String baseCalculoICMS;

    private String valorTotalICMS;

    private String valorICMSDesonerado;

    private String valor;

    private String valorTotalICMSST;

    private String valorTotalDosProdutosServicos;

    private String valorTotalFrete;

    private String valorTotalSeguro;

    private String valorTotalDesconto;

    private String valorTotalII;

    private String valorTotalIPI;

    private String valorPIS;

    private String valorCOFINS;

    private String outrasDespesasAcessorias;

    private String valorTotalNFe;

    private String valorTotalTributos;

    public void setBaseCalculoICMS(final BigDecimal baseCalculoICMS) {
        this.baseCalculoICMS = String.valueOf(baseCalculoICMS);
    }

    public void setValorTotalICMS(final BigDecimal valorTotalICMS) {
        this.valorTotalICMS = String.valueOf(valorTotalICMS);
    }

    public void setValor(final BigDecimal valor) {
        this.valor = String.valueOf(valor);
    }

    public void setValorTotalICMSST(final BigDecimal valorTotalICMSST) {
        this.valorTotalICMSST = String.valueOf(valorTotalICMSST);
    }

    public void setValorTotalDosProdutosServicos(final BigDecimal valorTotalDosProdutosServicos) {
        this.valorTotalDosProdutosServicos = String.valueOf(valorTotalDosProdutosServicos);
    }

    public void setValorTotalFrete(final BigDecimal valorTotalFrete) {
        this.valorTotalFrete = String.valueOf(valorTotalFrete);
    }

    public void setValorTotalSeguro(final BigDecimal valorTotalSeguro) {
        this.valorTotalSeguro = String.valueOf(valorTotalSeguro);
    }

    public void setValorTotalDesconto(final BigDecimal valorTotalDesconto) {
        this.valorTotalDesconto = String.valueOf(valorTotalDesconto);
    }

    public void setValorTotalII(final BigDecimal valorTotalII) {
        this.valorTotalII = String.valueOf(valorTotalII);
    }

    public void setValorTotalIPI(final BigDecimal valorTotalIPI) {
        this.valorTotalIPI = String.valueOf(valorTotalIPI);
    }

    public void setValorPIS(final BigDecimal valorPIS) {
        this.valorPIS = String.valueOf(valorPIS);
    }

    public void setValorCOFINS(final BigDecimal valorCOFINS) {
        this.valorCOFINS = String.valueOf(valorCOFINS);
    }

    public void setOutrasDespesasAcessorias(final BigDecimal outrasDespesasAcessorias) {
        this.outrasDespesasAcessorias = String.valueOf(outrasDespesasAcessorias);
    }

    public void setValorTotalNFe(final BigDecimal valorTotalNFe) {
        this.valorTotalNFe = String.valueOf(valorTotalNFe);
    }

    public void setValorTotalTributos(final BigDecimal valorTotalTributos) {
        this.valorTotalTributos = String.valueOf(valorTotalTributos);
    }

    public void setValorICMSDesonerado(final BigDecimal valorICMSDesonerado) {
        this.valorICMSDesonerado = String.valueOf(valorICMSDesonerado);
    }

    public String getBaseCalculoICMS() {
        return this.baseCalculoICMS;
    }

    public String getValorTotalICMS() {
        return this.valorTotalICMS;
    }

    public String getValorICMSDesonerado() {
        return this.valorICMSDesonerado;
    }

    public String getValor() {
        return this.valor;
    }

    public String getValorTotalICMSST() {
        return this.valorTotalICMSST;
    }

    public String getValorTotalDosProdutosServicos() {
        return this.valorTotalDosProdutosServicos;
    }

    public String getValorTotalFrete() {
        return this.valorTotalFrete;
    }

    public String getValorTotalSeguro() {
        return this.valorTotalSeguro;
    }

    public String getValorTotalDesconto() {
        return this.valorTotalDesconto;
    }

    public String getValorTotalII() {
        return this.valorTotalII;
    }

    public String getValorTotalIPI() {
        return this.valorTotalIPI;
    }

    public String getValorPIS() {
        return this.valorPIS;
    }

    public String getValorCOFINS() {
        return this.valorCOFINS;
    }

    public String getOutrasDespesasAcessorias() {
        return this.outrasDespesasAcessorias;
    }

    public String getValorTotalNFe() {
        return this.valorTotalNFe;
    }

    public String getValorTotalTributos() {
        return this.valorTotalTributos;
    }
}
