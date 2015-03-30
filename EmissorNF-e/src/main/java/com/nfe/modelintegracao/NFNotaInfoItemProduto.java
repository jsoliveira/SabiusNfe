package com.nfe.modelintegracao;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemProduto {

    private String codigo;

    private String codigoDeBarras;

    private String descricao;

    private String ncm;

    private List<String> nomeclaturaValorAduaneiroEstatistica;

    private Integer extipi;

    private String cfop;

    private String unidadeComercial;

    private String quantidadeComercial;

    private String valorUnitario;

    private String valorTotalBruto;

    private String codigoDeBarrasTributavel;

    private String unidadeTributavel;

    private String quantidadeTributavel;

    private String valorUnitarioTributavel;

    private String valorFrete;

    private String valorSeguro;

    private String valorDesconto;

    private String valorOutrasDespesasAcessorias;

    //Enum NFProdutoCompoeValorNota
    private String compoeValorNota;

    private List<NFNotaInfoItemProdutoDeclaracaoImportacao> declaracoesImportacao;

    private List<NFNotaInfoItemDetalheExportacao> detalhesExportacao;

    private String numeroPedidoCliente;

    private Integer numeroPedidoItemCliente;

    private String numeroControleFCI;

    private NFNotaInfoItemProdutoVeiculo veiculo;

    private List<NFNotaInfoItemProdutoMedicamento> medicamentos;

    private List<NFNotaInfoItemProdutoArmamento> armamentos;

    private NFNotaInfoItemProdutoCombustivel combustivel;

    private String numeroRECOPI;

    public void setCodigo(final String codigo) {

        this.codigo = codigo;
    }

    public void setCodigoDeBarras(final String codigoDeBarras) {

        this.codigoDeBarras = codigoDeBarras;
    }

    public void setDescricao(final String descricao) {

        this.descricao = descricao;
    }

    public void setNcm(final String ncm) {

        this.ncm = ncm;
    }

    public void setExtipi(final Integer extipi) {

        this.extipi = extipi;
    }

    public void setCfop(final String cfop) {

        this.cfop = cfop;
    }

    public void setUnidadeComercial(final String unidadeComercial) {

        this.unidadeComercial = unidadeComercial;
    }

    public void setQuantidadeComercial(final BigDecimal quantidadeComercial) {
        this.quantidadeComercial = String.valueOf(quantidadeComercial);
    }

    public void setValorUnitario(final BigDecimal valorUnitario) {
        this.valorUnitario = String.valueOf(valorUnitario);
    }

    public void setValorTotalBruto(final BigDecimal valorTotalBruto) {
        this.valorTotalBruto = String.valueOf(valorTotalBruto);
    }

    public void setCodigoDeBarrasTributavel(final String codigoDeBarrasTributavel) {

        this.codigoDeBarrasTributavel = codigoDeBarrasTributavel;
    }

    public void setUnidadeTributavel(final String unidadeTributavel) {

        this.unidadeTributavel = unidadeTributavel;
    }

    public void setQuantidadeTributavel(final BigDecimal quantidadeTributavel) {
        this.quantidadeTributavel = String.valueOf(quantidadeTributavel);
    }

    public void setValorUnitarioTributavel(final BigDecimal valorUnitarioTributavel) {
        this.valorUnitarioTributavel = String.valueOf(valorUnitarioTributavel);
    }

    public void setValorFrete(final BigDecimal valorFrete) {
        this.valorFrete = String.valueOf(valorFrete);
    }

    public void setValorSeguro(final BigDecimal valorSeguro) {
        this.valorSeguro = String.valueOf(valorSeguro);
    }

    public void setValorDesconto(final BigDecimal valorDesconto) {
        this.valorDesconto = String.valueOf(valorDesconto);
    }

    public void setValorOutrasDespesasAcessorias(final BigDecimal valorOutrasDespesasAcessorias) {
        this.valorOutrasDespesasAcessorias = String.valueOf(valorOutrasDespesasAcessorias);
    }

    public void setCampoeValorNota(final String compoeValorNota) {
        this.compoeValorNota = compoeValorNota;
    }

    public void setDeclaracoesImportacao(final List<NFNotaInfoItemProdutoDeclaracaoImportacao> declaracoesImportacao) {
        this.declaracoesImportacao = declaracoesImportacao;
    }

    public void setNumeroPedidoCliente(final String numeroPedidoCliente) {

        this.numeroPedidoCliente = numeroPedidoCliente;
    }

    public void setNumeroPedidoItemCliente(final Integer numeroPedidoItemCliente) {

        this.numeroPedidoItemCliente = numeroPedidoItemCliente;
    }

    public void setNumeroControleFCI(final String numeroControleFCI) {

        this.numeroControleFCI = numeroControleFCI;
    }

    public void setVeiculo(final NFNotaInfoItemProdutoVeiculo veiculo) {

        this.veiculo = veiculo;
    }

    public void setMedicamentos(final List<NFNotaInfoItemProdutoMedicamento> medicamentos) {

        this.medicamentos = medicamentos;
    }

    public void setArmamentos(final List<NFNotaInfoItemProdutoArmamento> armamentos) {

        this.armamentos = armamentos;
    }

    public void setCombustivel(final NFNotaInfoItemProdutoCombustivel combustivel) {

        this.combustivel = combustivel;
    }

    public void setNomeclaturaValorAduaneiroEstatistica(final List<String> nomeclaturaValorAduaneiroEstatistica) {

        this.nomeclaturaValorAduaneiroEstatistica = nomeclaturaValorAduaneiroEstatistica;
    }

    public void setDetalhesExportacao(final List<NFNotaInfoItemDetalheExportacao> detalhesExportacao) {

        this.detalhesExportacao = detalhesExportacao;
    }

    public void setNumeroRECOPI(final String numeroRECOPI) {

        this.numeroRECOPI = numeroRECOPI;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getCodigoDeBarras() {
        return this.codigoDeBarras;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getNcm() {
        return this.ncm;
    }

    public List<String> getNomeclaturaValorAduaneiroEstatistica() {
        return this.nomeclaturaValorAduaneiroEstatistica;
    }

    public Integer getExtipi() {
        return this.extipi;
    }

    public String getCfop() {
        return this.cfop;
    }

    public String getUnidadeComercial() {
        return this.unidadeComercial;
    }

    public String getQuantidadeComercial() {
        return this.quantidadeComercial;
    }

    public String getValorUnitario() {
        return this.valorUnitario;
    }

    public String getValorTotalBruto() {
        return this.valorTotalBruto;
    }

    public String getCodigoDeBarrasTributavel() {
        return this.codigoDeBarrasTributavel;
    }

    public String getUnidadeTributavel() {
        return this.unidadeTributavel;
    }

    public String getQuantidadeTributavel() {
        return this.quantidadeTributavel;
    }

    public String getValorUnitarioTributavel() {
        return this.valorUnitarioTributavel;
    }

    public String getValorFrete() {
        return this.valorFrete;
    }

    public String getValorSeguro() {
        return this.valorSeguro;
    }

    public String getValorDesconto() {
        return this.valorDesconto;
    }

    public String getValorOutrasDespesasAcessorias() {
        return this.valorOutrasDespesasAcessorias;
    }

    public String getCompoeValorNota() {
        return this.compoeValorNota;
    }

    public List<NFNotaInfoItemProdutoDeclaracaoImportacao> getDeclaracoesImportacao() {
        return this.declaracoesImportacao;
    }

    public List<NFNotaInfoItemDetalheExportacao> getDetalhesExportacao() {
        return this.detalhesExportacao;
    }

    public String getNumeroPedidoCliente() {
        return this.numeroPedidoCliente;
    }

    public Integer getNumeroPedidoItemCliente() {
        return this.numeroPedidoItemCliente;
    }

    public String getNumeroControleFCI() {
        return this.numeroControleFCI;
    }

    public NFNotaInfoItemProdutoVeiculo getVeiculo() {
        return this.veiculo;
    }

    public List<NFNotaInfoItemProdutoMedicamento> getMedicamentos() {
        return this.medicamentos;
    }

    public List<NFNotaInfoItemProdutoArmamento> getArmamentos() {
        return this.armamentos;
    }

    public NFNotaInfoItemProdutoCombustivel getCombustivel() {
        return this.combustivel;
    }

    public String getNumeroRECOPI() {
        return this.numeroRECOPI;
    }
}
