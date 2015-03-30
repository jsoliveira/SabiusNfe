package com.nfe.model;

/**
 *
 * @author Rodrigo Monteiro
 */
public class Certificado {

    //chave primaria
    private Integer cd_certificado;
    private Empresa emp;

    private String ds_certificado;
    private String caminho_certif;
    private String TipoCertificado;
    private String CertificadoSenha;
    private Integer sslPort;
    private String KeyStore;

    public Integer getCd_certificado() {
        return cd_certificado;
    }

    public void setCd_certificado(Integer cd_certificado) {
        this.cd_certificado = cd_certificado;
    }

    public Empresa getEmp() {
        return emp;
    }

    public void setEmp(Empresa emp) {
        this.emp = emp;
    }

    public String getDs_certificado() {
        return ds_certificado;
    }

    public void setDs_certificado(String ds_certificado) {
        this.ds_certificado = ds_certificado;
    }

    public String getCaminho_certif() {
        return caminho_certif;
    }

    public void setCaminho_certif(String caminho_certif) {
        this.caminho_certif = caminho_certif;
    }

    public String getTipoCertificado() {
        return TipoCertificado;
    }

    public void setTipoCertificado(String TipoCertificado) {
        this.TipoCertificado = TipoCertificado;
    }

    public String getCertificadoSenha() {
        return CertificadoSenha;
    }

    public void setCertificadoSenha(String CertificadoSenha) {
        this.CertificadoSenha = CertificadoSenha;
    }

    public Integer getSslPort() {
        return sslPort;
    }

    public void setSslPort(Integer sslPort) {
        this.sslPort = sslPort;
    }

    public String getKeyStore() {
        return KeyStore;
    }

    public void setKeyStore(String KeyStore) {
        this.KeyStore = KeyStore;
    }

}
