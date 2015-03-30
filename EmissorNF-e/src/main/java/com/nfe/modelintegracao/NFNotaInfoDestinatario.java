package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoDestinatario {

    private String cnpj;

    private String cpf;

    private String idEstrangeiro;

    private String razaoSocial;

    private NFEndereco endereco;

    //Enum NFIndicadorIEDestinatario
    private String indicadorIEDestinatario;

    private String inscricaoEstadual;

    private String inscricaoSuframa;

    private String inscricaoMunicipal;

    private String email;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {

        this.cnpj = cnpj;
    }

    public void setCpf(final String cpf) {

        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setRazaoSocial(final String razaoSocial) {

        this.razaoSocial = razaoSocial;
    }

    public void setEndereco(final NFEndereco endereco) {
        this.endereco = endereco;
    }

    public void setInscricaoEstadual(final String inscricaoEstadual) {

        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setInscricaoSuframa(final String inscricaoSuframa) {

        this.inscricaoSuframa = inscricaoSuframa;
    }

    public void setEmail(final String email) {

        this.email = email;
    }

    public void setIdEstrangeiro(final String idEstrangeiro) {

        this.idEstrangeiro = idEstrangeiro;
    }

    public void setIndicadorIEDestinatario(final String indicadorIEDestinatario) {
        this.indicadorIEDestinatario = indicadorIEDestinatario;
    }

    public void setInscricaoMunicipal(final String inscricaoMunicipal) {

        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getIdEstrangeiro() {
        return this.idEstrangeiro;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public NFEndereco getEndereco() {
        return this.endereco;
    }

    public String getIndicadorIEDestinatario() {
        return this.indicadorIEDestinatario;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public String getInscricaoSuframa() {
        return this.inscricaoSuframa;
    }

    public String getInscricaoMunicipal() {
        return this.inscricaoMunicipal;
    }

    public String getEmail() {
        return this.email;
    }
}
