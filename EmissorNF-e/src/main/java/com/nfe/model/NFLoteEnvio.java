package com.nfe.model;

import java.util.List;
import org.joda.time.LocalDateTime;

public class NFLoteEnvio {

    private String versao;
    private String idLote;
    private Integer indicadorProcessamento;
    List<NFNota> notas;
    List<Integer> retornoStatus;
    private Integer ambiente;
    private String recibo;

    //retorno envio lote assincrono
    private String versaoAplicacao;
    private String status;
    private String motivo;
    private Integer uf;
    private LocalDateTime dataRecebimento;
    private Integer infoRecebimento;

    //informacoes sincronas
    private String numeroRecibo;
    private String codigoMessage;
    private String mensagem;

    private LocalDateTime dataHoraRecebimento;

    public String getIdLote() {
        return this.idLote;
    }

    public void setIdLote(final String idLote) {

        this.idLote = idLote;
    }

    public void setNotas(final List<NFNota> notas) {

        this.notas = notas;
    }

    public List<NFNota> getNotas() {
        return this.notas;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public void setIndicadorProcessamento(final Integer indicadorProcessamento) {
        this.indicadorProcessamento = indicadorProcessamento;
    }

    public String getVersao() {
        return this.versao;
    }

    public Integer getIndicadorProcessamento() {
        return this.indicadorProcessamento;
    }

    public List<Integer> getRetornoStatus() {
        return retornoStatus;
    }

    public void setRetornoStatus(List<Integer> retornoStatus) {
        this.retornoStatus = retornoStatus;
    }

    public Integer getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Integer ambiente) {
        this.ambiente = ambiente;
    }

    public String getRecibo() {
        return recibo;
    }

    public void setRecibo(String recibo) {
        this.recibo = recibo;
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

    public LocalDateTime getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(LocalDateTime dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public Integer getInfoRecebimento() {
        return infoRecebimento;
    }

    public void setInfoRecebimento(Integer infoRecebimento) {
        this.infoRecebimento = infoRecebimento;
    }

    public String getNumeroRecibo() {
        return numeroRecibo;
    }

    public void setNumeroRecibo(String numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }

    public String getCodigoMessage() {
        return codigoMessage;
    }

    public void setCodigoMessage(String codigoMessage) {
        this.codigoMessage = codigoMessage;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getDataHoraRecebimento() {
        return dataHoraRecebimento;
    }

    public void setDataHoraRecebimento(LocalDateTime dataHoraRecebimento) {
        this.dataHoraRecebimento = dataHoraRecebimento;
    }

}
