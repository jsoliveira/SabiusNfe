package com.nfe.modelintegracao;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfo {

    private String identificador;

    private String versao;

    private NFNotaInfoIdentificacao identificacao;

    private NFNotaInfoEmitente emitente;

    private NFNotaInfoAvulsa avulsa;

    private NFNotaInfoDestinatario destinatario;

    private NFNotaInfoLocal retirada;

    private NFNotaInfoLocal entrega;

    private List<NFPessoaAutorizadaDownloadNFe> pessoasAutorizadasDownloadNFe;

    private List<NFNotaInfoItem> itens;

    private NFNotaInfoTotal total;

    private NFNotaInfoTransporte transporte;

    private NFNotaInfoCobranca cobranca;

    private List<NFNotaInfoPagamento> pagamentos;

    private NFNotaInfoInformacoesAdicionais informacoesAdicionais;

    private NFNotaInfoExportacao exportacao;

    private NFNotaInfoCompra compra;

    private NFNotaInfoCana cana;

    public void setIdentificador(final String identificador) {

        this.identificador = identificador;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = String.valueOf(versao);
    }

    public NFNotaInfoIdentificacao getIdentificacao() {
        return this.identificacao;
    }

    public void setIdentificacao(final NFNotaInfoIdentificacao identificacao) {
        this.identificacao = identificacao;
    }

    public void setEmitente(final NFNotaInfoEmitente emitente) {
        this.emitente = emitente;
    }

    public void setAvulsa(final NFNotaInfoAvulsa avulsa) {
        this.avulsa = avulsa;
    }

    public NFNotaInfoDestinatario getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(final NFNotaInfoDestinatario destinatario) {
        this.destinatario = destinatario;
    }

    public void setItens(final List<NFNotaInfoItem> itens) {

        this.itens = itens;
    }

    public void setRetirada(final NFNotaInfoLocal retirada) {
        this.retirada = retirada;
    }

    public void setEntrega(final NFNotaInfoLocal entrega) {
        this.entrega = entrega;
    }

    public void setCobranca(final NFNotaInfoCobranca cobranca) {
        this.cobranca = cobranca;
    }

    public void setTotal(final NFNotaInfoTotal total) {
        this.total = total;
    }

    public void setTransporte(final NFNotaInfoTransporte transporte) {
        this.transporte = transporte;
    }

    public void setInformacoesAdicionais(final NFNotaInfoInformacoesAdicionais informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public void setExportacao(final NFNotaInfoExportacao exportacao) {
        this.exportacao = exportacao;
    }

    public void setCompra(final NFNotaInfoCompra compra) {
        this.compra = compra;
    }

    public void setCana(final NFNotaInfoCana cana) {
        this.cana = cana;
    }

    public void setPessoasAutorizadasDownloadNFe(final List<NFPessoaAutorizadaDownloadNFe> pessoasAutorizadasDownloadNFe) {

        this.pessoasAutorizadasDownloadNFe = pessoasAutorizadasDownloadNFe;
    }

    public void setPagamentos(final List<NFNotaInfoPagamento> pagamentos) {

        this.pagamentos = pagamentos;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public NFNotaInfoEmitente getEmitente() {
        return this.emitente;
    }

    public NFNotaInfoAvulsa getAvulsa() {
        return this.avulsa;
    }

    public NFNotaInfoLocal getRetirada() {
        return this.retirada;
    }

    public NFNotaInfoLocal getEntrega() {
        return this.entrega;
    }

    public List<NFPessoaAutorizadaDownloadNFe> getPessoasAutorizadasDownloadNFe() {
        return this.pessoasAutorizadasDownloadNFe;
    }

    public List<NFNotaInfoItem> getItens() {
        return this.itens;
    }

    public NFNotaInfoTotal getTotal() {
        return this.total;
    }

    public NFNotaInfoTransporte getTransporte() {
        return this.transporte;
    }

    public NFNotaInfoCobranca getCobranca() {
        return this.cobranca;
    }

    public List<NFNotaInfoPagamento> getPagamentos() {
        return this.pagamentos;
    }

    public NFNotaInfoInformacoesAdicionais getInformacoesAdicionais() {
        return this.informacoesAdicionais;
    }

    public NFNotaInfoExportacao getExportacao() {
        return this.exportacao;
    }

    public NFNotaInfoCompra getCompra() {
        return this.compra;
    }

    public NFNotaInfoCana getCana() {
        return this.cana;
    }
}
