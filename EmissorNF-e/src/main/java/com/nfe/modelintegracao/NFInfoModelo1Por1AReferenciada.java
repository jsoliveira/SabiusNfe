package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFInfoModelo1Por1AReferenciada {

    private String uf;
    private String anoMesEmissaoNFe;
    private String cnpj;
    private String modeloDocumentoFiscal;
    private Integer serie;
    private String numeroDocumentoFiscal;

    public void setUf(final String uf) {
        this.uf = uf;
    }

    public void setAnoMesEmissaoNFe(final String anoMesEmissaoNFe) {

        this.anoMesEmissaoNFe = anoMesEmissaoNFe;
    }

    public void setCnpj(final String cnpj) {

        this.cnpj = cnpj;
    }

    public void setModeloDocumentoFiscal(final String modeloDocumentoFiscal) {

        this.modeloDocumentoFiscal = modeloDocumentoFiscal;
    }

    public void setSerie(final Integer serie) {

        this.serie = serie;
    }

    public void setNumeroDocumentoFiscal(final String numeroDocumentoFiscal) {

        this.numeroDocumentoFiscal = numeroDocumentoFiscal;
    }

    public String getUf() {
        return this.uf;
    }

    public String getAnoMesEmissaoNFe() {
        return this.anoMesEmissaoNFe;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getModeloDocumentoFiscal() {
        return this.modeloDocumentoFiscal;
    }

    public Integer getSerie() {
        return this.serie;
    }

    public String getNumeroDocumentoFiscal() {
        return this.numeroDocumentoFiscal;
    }
}
