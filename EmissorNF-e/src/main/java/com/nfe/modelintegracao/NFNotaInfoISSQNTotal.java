package com.nfe.modelintegracao;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoISSQNTotal {

    private String valorTotalServicosSobNaoIncidenciaNaoTributadosICMS;

    private String baseCalculoISS;

    private String valorTotalISS;

    private String valorPISsobreServicos;

    private String valorCOFINSsobreServicos;

    private LocalDate dataPrestacaoServico;

    private String valorDeducao;

    private String valorOutros;

    private String valorTotalDescontoIncondicionado;

    private String valorTotalDescontoCondicionado;

    private String valorTotalRetencaoISS;

    // Enum NFNotaInfoRegimeEspecialTributacao
    private String tributacao;

    public void setValorTotalServicosSobNaoIncidenciaNaoTributadosICMS(final BigDecimal valorTotalServicosSobNaoIncidenciaNaoTributadosICMS) {
        this.valorTotalServicosSobNaoIncidenciaNaoTributadosICMS = String.valueOf(valorTotalServicosSobNaoIncidenciaNaoTributadosICMS);
    }

    public void setBaseCalculoISS(final BigDecimal baseCalculoISS) {
        this.baseCalculoISS = String.valueOf(baseCalculoISS);
    }

    public void setValorTotalISS(final BigDecimal valorTotalISS) {
        this.valorTotalISS = String.valueOf(valorTotalISS);
    }

    public void setValorPISsobreServicos(final BigDecimal valorPISsobreServicos) {
        this.valorPISsobreServicos = String.valueOf(valorPISsobreServicos);
    }

    public void setValorCOFINSsobreServicos(final BigDecimal valorCOFINSsobreServicos) {
        this.valorCOFINSsobreServicos = String.valueOf(valorCOFINSsobreServicos);
    }

    public void setDataPrestacaoServico(final LocalDate dataPrestacaoServico) {
        this.dataPrestacaoServico = dataPrestacaoServico;
    }

    public void setValorDeducao(final BigDecimal valorDeducao) {
        this.valorDeducao = String.valueOf(valorDeducao);
    }

    public void setTributacao(final String tributacao) {
        this.tributacao = tributacao;
    }

    public void setValorOutros(final BigDecimal valorOutros) {
        this.valorOutros = String.valueOf(valorOutros);
    }

    public void setValorTotalDescontoCondicionado(final BigDecimal valorTotalDescontoCondicionado) {
        this.valorTotalDescontoCondicionado = String.valueOf(valorTotalDescontoCondicionado);
    }

    public void setValorTotalDescontoIncondicionado(final BigDecimal valorTotalDescontoIncondicionado) {
        this.valorTotalDescontoIncondicionado = String.valueOf(valorTotalDescontoIncondicionado);
    }

    public void setValorTotalRetencaoISS(final BigDecimal valorTotalRetencaoISS) {
        this.valorTotalRetencaoISS = String.valueOf(valorTotalRetencaoISS);
    }

    public String getValorTotalServicosSobNaoIncidenciaNaoTributadosICMS() {
        return this.valorTotalServicosSobNaoIncidenciaNaoTributadosICMS;
    }

    public String getBaseCalculoISS() {
        return this.baseCalculoISS;
    }

    public String getValorTotalISS() {
        return this.valorTotalISS;
    }

    public String getValorPISsobreServicos() {
        return this.valorPISsobreServicos;
    }

    public String getValorCOFINSsobreServicos() {
        return this.valorCOFINSsobreServicos;
    }

    public LocalDate getDataPrestacaoServico() {
        return this.dataPrestacaoServico;
    }

    public String getValorDeducao() {
        return this.valorDeducao;
    }

    public String getValorOutros() {
        return this.valorOutros;
    }

    public String getValorTotalDescontoIncondicionado() {
        return this.valorTotalDescontoIncondicionado;
    }

    public String getValorTotalDescontoCondicionado() {
        return this.valorTotalDescontoCondicionado;
    }

    public String getValorTotalRetencaoISS() {
        return this.valorTotalRetencaoISS;
    }

    public String getTributacao() {
        return this.tributacao;
    }
}
