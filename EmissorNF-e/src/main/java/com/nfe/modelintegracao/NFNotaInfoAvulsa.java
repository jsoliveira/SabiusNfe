package com.nfe.modelintegracao;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoAvulsa {

    private String cnpj;

    private String orgaoEmitente;

    private String matriculaAgente;

    private String nomeAgente;

    private String fone;

    private String uf;

    private String numeroDocumentoArrecadacaoReceita;

    private LocalDate dataEmissaoDocumentoArrecadacao;

    private String valorTotalConstanteDocumentoArrecadacaoReceita;

    private String reparticaoFiscalEmitente;

    private LocalDate dataPagamentoDocumentoArrecadacao;

    public void setCnpj(final String cnpj) {

        this.cnpj = cnpj;
    }

    public void setOrgaoEmitente(final String orgaoEmitente) {

        this.orgaoEmitente = orgaoEmitente;
    }

    public void setMatriculaAgente(final String matriculaAgente) {

        this.matriculaAgente = matriculaAgente;
    }

    public void setNomeAgente(final String nomeAgente) {

        this.nomeAgente = nomeAgente;
    }

    public void setFone(final String fone) {

        this.fone = fone;
    }

    public void setUf(final String uf) {
        this.uf = uf;
    }

    public void setNumeroDocumentoArrecadacaoReceita(final String numeroDocumentoArrecadacaoReceita) {

        this.numeroDocumentoArrecadacaoReceita = numeroDocumentoArrecadacaoReceita;
    }

    public void setDataEmissaoDocumentoArrecadacao(final LocalDate dataEmissaoDocumentoArrecadacao) {
        this.dataEmissaoDocumentoArrecadacao = dataEmissaoDocumentoArrecadacao;
    }

    public void setValorTotalConstanteDocumentoArrecadacaoReceita(final BigDecimal valorTotalConstanteDocumentoArrecadacaoReceita) {
        this.valorTotalConstanteDocumentoArrecadacaoReceita = String.valueOf(valorTotalConstanteDocumentoArrecadacaoReceita);
    }

    public void setReparticaoFiscalEmitente(final String reparticaoFiscalEmitente) {

        this.reparticaoFiscalEmitente = reparticaoFiscalEmitente;
    }

    public void setDataPagamentoDocumentoArrecadacao(final LocalDate dataPagamentoDocumentoArrecadacao) {
        this.dataPagamentoDocumentoArrecadacao = dataPagamentoDocumentoArrecadacao;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getOrgaoEmitente() {
        return this.orgaoEmitente;
    }

    public String getMatriculaAgente() {
        return this.matriculaAgente;
    }

    public String getNomeAgente() {
        return this.nomeAgente;
    }

    public String getFone() {
        return this.fone;
    }

    public String getUf() {
        return this.uf;
    }

    public String getNumeroDocumentoArrecadacaoReceita() {
        return this.numeroDocumentoArrecadacaoReceita;
    }

    public LocalDate getDataEmissaoDocumentoArrecadacao() {
        return this.dataEmissaoDocumentoArrecadacao;
    }

    public String getValorTotalConstanteDocumentoArrecadacaoReceita() {
        return this.valorTotalConstanteDocumentoArrecadacaoReceita;
    }

    public String getReparticaoFiscalEmitente() {
        return this.reparticaoFiscalEmitente;
    }

    public LocalDate getDataPagamentoDocumentoArrecadacao() {
        return this.dataPagamentoDocumentoArrecadacao;
    }
}
