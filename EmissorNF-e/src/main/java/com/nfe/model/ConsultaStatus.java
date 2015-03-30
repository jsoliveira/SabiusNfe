package com.nfe.model;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

/**
 *
 * @author Rodrigo Monteiro
 */
public class ConsultaStatus {

    //chave primaria
    private Empresa empresa;
    private Integer cd_consulta;

    private Integer retornoStatus;

    private String uf_consulta;

    private String Retversao;
    private Integer Retambiente;
    private String RetversaoAplicacao;
    private String Retstatus;
    private String Retmotivo;
    private String Retuf;
    private LocalDateTime RetdataRecebimento;
    private DateTime RetdataRetorno;
    private String Retobservacao;
    private String RettempoMedio;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Integer getCd_consulta() {
        return cd_consulta;
    }

    public void setCd_consulta(Integer cd_consulta) {
        this.cd_consulta = cd_consulta;
    }

    public String getUf_consulta() {
        return uf_consulta;
    }

    public void setUf_consulta(String uf_consulta) {
        this.uf_consulta = uf_consulta;
    }

    public String getRetversao() {
        return Retversao;
    }

    public void setRetversao(String Retversao) {
        this.Retversao = Retversao;
    }

    public Integer getRetambiente() {
        return Retambiente;
    }

    public void setRetambiente(Integer Retambiente) {
        this.Retambiente = Retambiente;
    }

    public String getRetversaoAplicacao() {
        return RetversaoAplicacao;
    }

    public void setRetversaoAplicacao(String RetversaoAplicacao) {
        this.RetversaoAplicacao = RetversaoAplicacao;
    }

    public String getRetstatus() {
        return Retstatus;
    }

    public void setRetstatus(String Retstatus) {
        this.Retstatus = Retstatus;
    }

    public String getRetmotivo() {
        return Retmotivo;
    }

    public void setRetmotivo(String Retmotivo) {
        this.Retmotivo = Retmotivo;
    }

    public String getRetuf() {
        return Retuf;
    }

    public void setRetuf(String Retuf) {
        this.Retuf = Retuf;
    }

    public LocalDateTime getRetdataRecebimento() {
        return RetdataRecebimento;
    }

    public void setRetdataRecebimento(LocalDateTime RetdataRecebimento) {
        this.RetdataRecebimento = RetdataRecebimento;
    }

    public DateTime getRetdataRetorno() {
        return RetdataRetorno;
    }

    public void setRetdataRetorno(DateTime RetdataRetorno) {
        this.RetdataRetorno = RetdataRetorno;
    }

    public String getRetobservacao() {
        return Retobservacao;
    }

    public void setRetobservacao(String Retobservacao) {
        this.Retobservacao = Retobservacao;
    }

    public String getRettempoMedio() {
        return RettempoMedio;
    }

    public void setRettempoMedio(String RettempoMedio) {
        this.RettempoMedio = RettempoMedio;
    }

    public Integer getRetornoStatus() {
        return retornoStatus;
    }

    public void setRetornoStatus(Integer retornoStatus) {
        this.retornoStatus = retornoStatus;
    }

}
