package com.nfe.model;

import java.math.BigDecimal;
import java.util.List;

public class NFEventoLote {

    //
    private String idLote;
    private Empresa empresa;

    List<Integer> retornoStatus;

    //envio
    private String versao;
    private List<NFEvento> evento;

    //lote retorno
    private Integer Retambiente;
    private String RetversaoAplicativo;
    private String Retorgao;
    private Integer RetcodigoStatusReposta;

    public void setVersao(final BigDecimal versao) {
        this.versao = String.valueOf(versao);
    }

    public String getVersao() {
        return this.versao;
    }

    public String getIdLote() {
        return this.idLote;
    }

    public void setIdLote(final String idLote) {
        this.idLote = idLote;
    }

    public List<NFEvento> getEvento() {
        return this.evento;
    }

    public void setEvento(final List<NFEvento> evento) {
        this.evento = evento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Integer getRetambiente() {
        return Retambiente;
    }

    public void setRetambiente(Integer Retambiente) {
        this.Retambiente = Retambiente;
    }

    public String getRetversaoAplicativo() {
        return RetversaoAplicativo;
    }

    public void setRetversaoAplicativo(String RetversaoAplicativo) {
        this.RetversaoAplicativo = RetversaoAplicativo;
    }

    public String getRetorgao() {
        return Retorgao;
    }

    public void setRetorgao(String Retorgao) {
        this.Retorgao = Retorgao;
    }

    public Integer getRetcodigoStatusReposta() {
        return RetcodigoStatusReposta;
    }

    public void setRetcodigoStatusReposta(Integer RetcodigoStatusReposta) {
        this.RetcodigoStatusReposta = RetcodigoStatusReposta;
    }

    public List<Integer> getRetornoStatus() {
        return retornoStatus;
    }

    public void setRetornoStatus(List<Integer> retornoStatus) {
        this.retornoStatus = retornoStatus;
    }

}
