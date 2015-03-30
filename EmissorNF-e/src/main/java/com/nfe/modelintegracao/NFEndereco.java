package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFEndereco {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String codigoMunicipio;
    private String descricaoMunicipio;
    private String uf;
    private String cep;
    private String codigoPais;
    private String descricaoPais;
    private String telefone;

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

    public void setDescricaoMunicipio(final String descricaoMunicipio) {

        this.descricaoMunicipio = descricaoMunicipio;
    }

    public void setUf(final String uf) {
        this.uf = uf;
    }

    public void setCep(final String cep) {

        this.cep = cep;
    }

    public void setCodigoPais(final String codigoPais) {

        this.codigoPais = codigoPais;
    }

    public void setDescricaoPais(final String descricaoPais) {

        this.descricaoPais = descricaoPais;
    }

    public void setTelefone(final String telefone) {

        this.telefone = telefone;
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

    public String getDescricaoMunicipio() {
        return this.descricaoMunicipio;
    }

    public String getUf() {
        return this.uf;
    }

    public String getCep() {
        return this.cep;
    }

    public String getCodigoPais() {
        return this.codigoPais;
    }

    public String getDescricaoPais() {
        return this.descricaoPais;
    }

    public String getTelefone() {
        return this.telefone;
    }
}
