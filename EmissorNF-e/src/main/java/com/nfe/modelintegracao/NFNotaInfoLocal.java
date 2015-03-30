package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoLocal {

    private String cnpj;

    private String cpf;

    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private String codigoMunicipio;

    private String nomeMunicipio;

    private String uf;

    public void setCnpj(final String cnpj) {

        this.cnpj = cnpj;
    }

    public void setCpf(final String cpf) {

        this.cpf = cpf;
    }

    public void setLogradouro(final String logradouro) {

        this.logradouro = logradouro;
    }

    public void setNumero(final String numero) {

        this.numero = numero;
    }

    public void setComplemento(final String complemento) {

        this.complemento = complemento;
    }

    public void setBairro(final String bairro) {

        this.bairro = bairro;
    }

    public void setCodigoMunicipio(final String codigoMunicipio) {

        this.codigoMunicipio = codigoMunicipio;
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

    public String getLogradouro() {
        return this.logradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCodigoMunicipio() {
        return this.codigoMunicipio;
    }

    public String getNomeMunicipio() {
        return this.nomeMunicipio;
    }

    public String getUf() {
        return this.uf;
    }
}
