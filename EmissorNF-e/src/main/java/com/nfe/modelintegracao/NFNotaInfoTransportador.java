package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoTransportador {

    private String cnpj;

    private String cpf;

    private String razaoSocial;

    private String inscricaoEstadual;

    private String enderecoComplemento;

    private String nomeMunicipio;

    private String uf;

    public void setEnderecoComplemento(final String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
    }

    public void setCnpj(final String cnpj) {

        this.cnpj = cnpj;
    }

    public void setCpf(final String cpf) {

        this.cpf = cpf;
    }

    public void setRazaoSocial(final String razaoSocial) {

        this.razaoSocial = razaoSocial;
    }

    public void setInscricaoEstadual(final String inscricaoEstadual) {

        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setNomeMunicipio(final String nomeMunicipio) {

        this.nomeMunicipio = nomeMunicipio;
    }

    public void setUf(final String uf) {
        this.uf = uf;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public String getEnderecoComplemento() {
        return this.enderecoComplemento;
    }

    public String getNomeMunicipio() {
        return this.nomeMunicipio;
    }

    public String getUf() {
        return this.uf;
    }
}
