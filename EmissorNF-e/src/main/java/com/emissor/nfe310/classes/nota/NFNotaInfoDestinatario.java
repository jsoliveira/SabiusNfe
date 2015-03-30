package com.emissor.nfe310.classes.nota;

import org.simpleframework.xml.Element;

import com.emissor.nfe310.classes.NFBase;
import com.emissor.nfe310.classes.NFEndereco;
import com.fincatto.nfe310.validadores.StringValidador;

public class NFNotaInfoDestinatario extends NFBase {

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "CPF", required = false)
    private String cpf;

    @Element(name = "idEstrangeiro", required = false)
    private String idEstrangeiro;

    @Element(name = "xNome", required = true)
    private String razaoSocial;

    @Element(name = "enderDest", required = false)
    private NFEndereco endereco;

    @Element(name = "indIEDest", required = true)
    private NFIndicadorIEDestinatario indicadorIEDestinatario;

    @Element(name = "IE", required = false)
    private String inscricaoEstadual;

    @Element(name = "ISUF", required = false)
    private String inscricaoSuframa;

    @Element(name = "IM", required = false)
    private String inscricaoMunicipal;

    @Element(name = "email", required = false)
    private String email;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        if (this.cpf != null) {
            throw new IllegalStateException("Nao deve setar CNPJ se CPF esteja setado");
        }
        StringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public void setCpf(final String cpf) {
        if (this.cnpj != null) {
            throw new IllegalStateException("Nao deve setar CPF se CNPJ esteja setado");
        }
        StringValidador.cpf(cpf);
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setRazaoSocial(final String razaoSocial) {
        StringValidador.tamanho60(razaoSocial);
        this.razaoSocial = razaoSocial;
    }

    public void setEndereco(final NFEndereco endereco) {
        this.endereco = endereco;
    }

    public void setInscricaoEstadual(final String inscricaoEstadual) {
        StringValidador.inscricaoEstadual(inscricaoEstadual);
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setInscricaoSuframa(final String inscricaoSuframa) {
        StringValidador.tamanho8a9N(inscricaoSuframa);
        this.inscricaoSuframa = inscricaoSuframa;
    }

    public void setEmail(final String email) {
        StringValidador.tamanho60(email);
        this.email = email;
    }

    public void setIdEstrangeiro(final String idEstrangeiro) {
        StringValidador.tamanho5a20(idEstrangeiro);
        this.idEstrangeiro = idEstrangeiro;
    }

    public void setIndicadorIEDestinatario(final NFIndicadorIEDestinatario indicadorIEDestinatario) {
        this.indicadorIEDestinatario = indicadorIEDestinatario;
    }

    public void setInscricaoMunicipal(final String inscricaoMunicipal) {
        StringValidador.tamanho15(inscricaoMunicipal);
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

    public NFIndicadorIEDestinatario getIndicadorIEDestinatario() {
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