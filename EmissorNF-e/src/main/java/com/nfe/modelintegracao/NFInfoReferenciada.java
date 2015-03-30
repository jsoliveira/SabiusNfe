package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFInfoReferenciada {

    private String chaveAcesso;

    private NFInfoModelo1Por1AReferenciada modelo1por1Referenciada;

    private NFInfoProdutorRuralReferenciada infoNFProdutorRuralReferenciada;

    private String chaveAcessoCTReferenciada;

    private NFInfoCupomFiscalReferenciado cupomFiscalReferenciado;

    public void setChaveAcesso(final String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public void setModelo1por1Referenciada(final NFInfoModelo1Por1AReferenciada modelo1por1Referenciada) {

        this.modelo1por1Referenciada = modelo1por1Referenciada;
    }

    public void setChaveAcessoCTReferenciada(final String chaveAcessoCTReferenciada) {

        this.chaveAcessoCTReferenciada = chaveAcessoCTReferenciada;
    }

    public void setInfoNFProdutorRuralReferenciada(final NFInfoProdutorRuralReferenciada infoNFProdutorRuralReferenciada) {

        this.infoNFProdutorRuralReferenciada = infoNFProdutorRuralReferenciada;
    }

    public void setCupomFiscalReferenciado(final NFInfoCupomFiscalReferenciado cupomFiscalReferenciado) {

        this.cupomFiscalReferenciado = cupomFiscalReferenciado;
    }

    public String getChaveAcesso() {
        return this.chaveAcesso;
    }

    public NFInfoModelo1Por1AReferenciada getModelo1por1Referenciada() {
        return this.modelo1por1Referenciada;
    }

    public NFInfoProdutorRuralReferenciada getInfoNFProdutorRuralReferenciada() {
        return this.infoNFProdutorRuralReferenciada;
    }

    public String getChaveAcessoCTReferenciada() {
        return this.chaveAcessoCTReferenciada;
    }

    public NFInfoCupomFiscalReferenciado getCupomFiscalReferenciado() {
        return this.cupomFiscalReferenciado;
    }
}
