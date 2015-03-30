package com.nfe.modelintegracao;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rodrigo Monteiro
 */
@XmlRootElement
public class Integracao {

    private Integer tpSolicitacao;
    private String cnpjPrincipal;
    private List<String> mensagens;
    private ConsultaStatusServico cServico;
    private ConsultaCadastro cCadastro;
    private InutilizacaoNota inuNota;
    private CancelaNota canNota;
    private ConsultaLote conLote;
    private ConsultaNota consultaNota;
    private CorrigeNota corrigeNota;
    private ConsultaNota2 consultaNota2;
    private List<NotaFiscal> enviaLote;
    private List<NotaProcessada> notaProcessada;

    public Integer getTpSolicitacao() {
        return tpSolicitacao;
    }

    public void setTpSolicitacao(Integer tpSolicitacao) {
        this.tpSolicitacao = tpSolicitacao;
    }

    public String getCnpjPrincipal() {
        return cnpjPrincipal;
    }

    public void setCnpjPrincipal(String cnpjPrincipal) {
        this.cnpjPrincipal = cnpjPrincipal;
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<String> mensagens) {
        this.mensagens = mensagens;
    }

    public ConsultaStatusServico getcServico() {
        return cServico;
    }

    public void setcServico(ConsultaStatusServico cServico) {
        this.cServico = cServico;
    }

    public ConsultaCadastro getcCadastro() {
        return cCadastro;
    }

    public void setcCadastro(ConsultaCadastro cCadastro) {
        this.cCadastro = cCadastro;
    }

    public InutilizacaoNota getInuNota() {
        return inuNota;
    }

    public void setInuNota(InutilizacaoNota inuNota) {
        this.inuNota = inuNota;
    }

    public CancelaNota getCanNota() {
        return canNota;
    }

    public void setCanNota(CancelaNota canNota) {
        this.canNota = canNota;
    }

    public ConsultaLote getConLote() {
        return conLote;
    }

    public void setConLote(ConsultaLote conLote) {
        this.conLote = conLote;
    }

    public ConsultaNota getConsultaNota() {
        return consultaNota;
    }

    public void setConsultaNota(ConsultaNota consultaNota) {
        this.consultaNota = consultaNota;
    }

    public CorrigeNota getCorrigeNota() {
        return corrigeNota;
    }

    public void setCorrigeNota(CorrigeNota corrigeNota) {
        this.corrigeNota = corrigeNota;
    }

    public ConsultaNota2 getConsultaNota2() {
        return consultaNota2;
    }

    public void setConsultaNota2(ConsultaNota2 consultaNota2) {
        this.consultaNota2 = consultaNota2;
    }

    public List<NotaFiscal> getEnviaLote() {
        return enviaLote;
    }

    public void setEnviaLote(List<NotaFiscal> enviaLote) {
        this.enviaLote = enviaLote;
    }

    public List<NotaProcessada> getNotaProcessada() {
        return notaProcessada;
    }

    public void setNotaProcessada(List<NotaProcessada> notaProcessada) {
        this.notaProcessada = notaProcessada;
    }

}
