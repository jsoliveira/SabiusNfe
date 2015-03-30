package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFInfoCupomFiscalReferenciado {

    private String modeloDocumentoFiscal;
    private String numeroOrdemSequencialECF;
    private String numeroContadorOrdemOperacao;

    public void setModeloDocumentoFiscal(final String modeloDocumentoFiscal) {

        this.modeloDocumentoFiscal = modeloDocumentoFiscal;
    }

    public void setNumeroOrdemSequencialECF(final String numeroOrdemSequencialECF) {

        this.numeroOrdemSequencialECF = numeroOrdemSequencialECF;
    }

    public void setNumeroContadorOrdemOperacao(final String numeroContadorOrdemOperacao) {

        this.numeroContadorOrdemOperacao = numeroContadorOrdemOperacao;
    }

    public String getModeloDocumentoFiscal() {
        return this.modeloDocumentoFiscal;
    }

    public String getNumeroContadorOrdemOperacao() {
        return this.numeroContadorOrdemOperacao;
    }

    public String getNumeroOrdemSequencialECF() {
        return this.numeroOrdemSequencialECF;
    }
}
