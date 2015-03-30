package com.nfe.model;

import java.util.List;

/**
 *
 * @author Rodrigo Monteiro
 */
public class ConsultaCadastro {

    //chave primaria
    private Integer nr_seq_consulta;
    private Empresa empresa;

    private Integer retornoStatus;

    private String uf;
    private String cnpj_consultado;

    //retorno 
    private String Retversao;
    private String RetversaoAplicacao;
    private String Retmotivo;
    private String RetinscricaoEstadual;
    private String Retcnpj;
    private String Retcpf;
    private String RetdataHoraProcessamento;
    private String RetufAutorizadora;
    private List<NFRetornoSituacaoCadastral> RetsituacaoCadastral;

    public Integer getNr_seq_consulta() {
        return nr_seq_consulta;
    }

    public void setNr_seq_consulta(Integer nr_seq_consulta) {
        this.nr_seq_consulta = nr_seq_consulta;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Integer getRetornoStatus() {
        return retornoStatus;
    }

    public void setRetornoStatus(Integer retornoStatus) {
        this.retornoStatus = retornoStatus;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCnpj_consultado() {
        return cnpj_consultado;
    }

    public void setCnpj_consultado(String cnpj_consultado) {
        this.cnpj_consultado = cnpj_consultado;
    }

    public String getRetversao() {
        return Retversao;
    }

    public void setRetversao(String Retversao) {
        this.Retversao = Retversao;
    }

    public String getRetversaoAplicacao() {
        return RetversaoAplicacao;
    }

    public void setRetversaoAplicacao(String RetversaoAplicacao) {
        this.RetversaoAplicacao = RetversaoAplicacao;
    }

    public String getRetmotivo() {
        return Retmotivo;
    }

    public void setRetmotivo(String Retmotivo) {
        this.Retmotivo = Retmotivo;
    }

    public String getRetinscricaoEstadual() {
        return RetinscricaoEstadual;
    }

    public void setRetinscricaoEstadual(String RetinscricaoEstadual) {
        this.RetinscricaoEstadual = RetinscricaoEstadual;
    }

    public String getRetcnpj() {
        return Retcnpj;
    }

    public void setRetcnpj(String Retcnpj) {
        this.Retcnpj = Retcnpj;
    }

    public String getRetcpf() {
        return Retcpf;
    }

    public void setRetcpf(String Retcpf) {
        this.Retcpf = Retcpf;
    }

    public String getRetdataHoraProcessamento() {
        return RetdataHoraProcessamento;
    }

    public void setRetdataHoraProcessamento(String RetdataHoraProcessamento) {
        this.RetdataHoraProcessamento = RetdataHoraProcessamento;
    }

    public String getRetufAutorizadora() {
        return RetufAutorizadora;
    }

    public void setRetufAutorizadora(String RetufAutorizadora) {
        this.RetufAutorizadora = RetufAutorizadora;
    }

    public List<NFRetornoSituacaoCadastral> getRetsituacaoCadastral() {
        return RetsituacaoCadastral;
    }

    public void setRetsituacaoCadastral(List<NFRetornoSituacaoCadastral> RetsituacaoCadastral) {
        this.RetsituacaoCadastral = RetsituacaoCadastral;
    }

}
