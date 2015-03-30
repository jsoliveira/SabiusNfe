package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoEmitente {

    private String cnpj;

    private String cpf;

    private String razaoSocial;

    private String nomeFantasia;

    private NFEndereco endereco;

    private String inscricaoEstadual;

    private String inscricaoEstadualSubstituicaoTributaria;

    private String inscricaoMunicipal;

    private String classificacaoNacionalAtividadesEconomicas;

    //Enum NFRegimeTributario
    private String regimeTributario;

    public void setCnpj(final String cnpj) {

        this.cnpj = cnpj;
    }

    public void setCpf(final String cpf) {

        this.cpf = cpf;
    }

    public void setRazaoSocial(final String razaoSocial) {

        this.razaoSocial = razaoSocial;
    }

    public void setNomeFantasia(final String nomeFantasia) {

        this.nomeFantasia = nomeFantasia;
    }

    public void setEndereco(final NFEndereco endereco) {
        this.endereco = endereco;
    }

    public void setInscricaoEstadual(final String inscricaoEstadual) {

        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setInscricaoEstadualSubstituicaoTributaria(final String inscricaoEstadualSubstituicaoTributaria) {

        this.inscricaoEstadualSubstituicaoTributaria = inscricaoEstadualSubstituicaoTributaria;
    }

    public void setInscricaoMunicipal(final String inscricaoMunicipal) {

        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public void setClassificacaoNacionalAtividadesEconomicas(final String classificacaoNacionalAtividadesEconomicas) {

        this.classificacaoNacionalAtividadesEconomicas = classificacaoNacionalAtividadesEconomicas;
    }

    public void setRegimeTributario(final String regimeTributario) {
        this.regimeTributario = regimeTributario;
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

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public NFEndereco getEndereco() {
        return this.endereco;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public String getInscricaoEstadualSubstituicaoTributaria() {
        return this.inscricaoEstadualSubstituicaoTributaria;
    }

    public String getInscricaoMunicipal() {
        return this.inscricaoMunicipal;
    }

    public String getClassificacaoNacionalAtividadesEconomicas() {
        return this.classificacaoNacionalAtividadesEconomicas;
    }

    public String getRegimeTributario() {
        return this.regimeTributario;
    }
}
