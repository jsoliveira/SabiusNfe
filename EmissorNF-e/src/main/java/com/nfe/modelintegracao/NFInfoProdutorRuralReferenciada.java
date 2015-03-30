package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFInfoProdutorRuralReferenciada {

    private String ufEmitente;

    private String anoMesEmissao;

    private String cnpjEmitente;

    private String cpfEmitente;

    private String ieEmitente;

    private String modeloDocumentoFiscal;

    private Integer serieDocumentoFiscal;

    private Integer numeroDocumentoFiscal;

    public void setUfEmitente(final String ufEmitente) {
        this.ufEmitente = ufEmitente;
    }

    public void setAnoMesEmissao(final String anoMesEmissao) {

        this.anoMesEmissao = anoMesEmissao;
    }

    public void setCnpjEmitente(final String cnpjEmitente) {

        this.cnpjEmitente = cnpjEmitente;
    }

    public void setCpfEmitente(final String cpfEmitente) {

        this.cpfEmitente = cpfEmitente;
    }

    public void setIeEmitente(final String ieEmitente) {

        this.ieEmitente = ieEmitente;
    }

    public void setModeloDocumentoFiscal(final String modeloDocumentoFiscal) {

        this.modeloDocumentoFiscal = modeloDocumentoFiscal;
    }

    public void setSerieDocumentoFiscal(final Integer serieDocumentoFiscal) {

        this.serieDocumentoFiscal = serieDocumentoFiscal;
    }

    public void setNumeroDocumentoFiscal(final Integer numeroDocumentoFiscal) {

        this.numeroDocumentoFiscal = numeroDocumentoFiscal;
    }

    public String getUfEmitente() {
        return this.ufEmitente;
    }

    public String getAnoMesEmissao() {
        return this.anoMesEmissao;
    }

    public String getCnpjEmitente() {
        return this.cnpjEmitente;
    }

    public String getCpfEmitente() {
        return this.cpfEmitente;
    }

    public String getIeEmitente() {
        return this.ieEmitente;
    }

    public String getModeloDocumentoFiscal() {
        return this.modeloDocumentoFiscal;
    }

    public Integer getSerieDocumentoFiscal() {
        return this.serieDocumentoFiscal;
    }

    public Integer getNumeroDocumentoFiscal() {
        return this.numeroDocumentoFiscal;
    }
}
