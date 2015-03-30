package com.nfe.model;

/**
 *
 * @author Rodrigo Monteiro
 */
public class Configuracao {

    //chave primaria
    private Integer nr_sequencia;
    private Empresa empresa;

    private Certificado certificado;

    private Integer getAmbiente;

    private String CadeiraCertificados;
    private String ArquivosXsd;
    private Integer CUF;
    private Integer TipoEmissao;
    private Integer TipoImpressao;
    private Integer Sincrono;
    private String LogEmissao;

    public Integer getGetAmbiente() {
        return getAmbiente;
    }

    public void setGetAmbiente(Integer getAmbiente) {
        this.getAmbiente = getAmbiente;
    }

    public String getCadeiraCertificados() {
        return CadeiraCertificados;
    }

    public void setCadeiraCertificados(String CadeiraCertificados) {
        this.CadeiraCertificados = CadeiraCertificados;
    }

    public String getArquivosXsd() {
        return ArquivosXsd;
    }

    public void setArquivosXsd(String ArquivosXsd) {
        this.ArquivosXsd = ArquivosXsd;
    }

    public Integer getCUF() {
        return CUF;
    }

    public void setCUF(Integer CUF) {
        this.CUF = CUF;
    }

    public Integer getTipoEmissao() {
        return TipoEmissao;
    }

    public void setTipoEmissao(Integer TipoEmissao) {
        this.TipoEmissao = TipoEmissao;
    }

    public Integer getTipoImpressao() {
        return TipoImpressao;
    }

    public void setTipoImpressao(Integer TipoImpressao) {
        this.TipoImpressao = TipoImpressao;
    }

    public Integer getSincrono() {
        return Sincrono;
    }

    public void setSincrono(Integer Sincrono) {
        this.Sincrono = Sincrono;
    }

    public String getLogEmissao() {
        return LogEmissao;
    }

    public void setLogEmissao(String LogEmissao) {
        this.LogEmissao = LogEmissao;
    }

}
