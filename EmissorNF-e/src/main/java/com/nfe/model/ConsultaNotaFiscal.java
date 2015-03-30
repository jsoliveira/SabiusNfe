/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nfe.model;

import java.util.List;
import org.joda.time.LocalDateTime;

/**
 *
 * @author Rodrigo Monteiro
 */
public class ConsultaNotaFiscal {

    private Empresa empresa;
    private Integer cd_consulta;

    private String versao;
    private Integer ambiente;
    private String servico;
    private String chave;

    private String versaoAplicacao;
    private String status;
    private String motivo;
    private Integer uf;
    private LocalDateTime dataHoraRecibo;
    private String identificador;
    private String dataRecebimento;
    private String numeroProtocolo;
    private String validador;
    private String protstatus;
    private String protmotivo;
    private List<NFEvento> protocoloEvento;

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

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Integer getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Integer ambiente) {
        this.ambiente = ambiente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getVersaoAplicacao() {
        return versaoAplicacao;
    }

    public void setVersaoAplicacao(String versaoAplicacao) {
        this.versaoAplicacao = versaoAplicacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getUf() {
        return uf;
    }

    public void setUf(Integer uf) {
        this.uf = uf;
    }

    public LocalDateTime getDataHoraRecibo() {
        return dataHoraRecibo;
    }

    public void setDataHoraRecibo(LocalDateTime dataHoraRecibo) {
        this.dataHoraRecibo = dataHoraRecibo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(String dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public String getValidador() {
        return validador;
    }

    public void setValidador(String validador) {
        this.validador = validador;
    }

    public String getProtstatus() {
        return protstatus;
    }

    public void setProtstatus(String protstatus) {
        this.protstatus = protstatus;
    }

    public String getProtmotivo() {
        return protmotivo;
    }

    public void setProtmotivo(String protmotivo) {
        this.protmotivo = protmotivo;
    }

    public List<NFEvento> getProtocoloEvento() {
        return protocoloEvento;
    }

    public void setProtocoloEvento(List<NFEvento> protocoloEvento) {
        this.protocoloEvento = protocoloEvento;
    }

}
