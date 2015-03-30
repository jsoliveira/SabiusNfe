package com.nfe.modelintegracao;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoInformacoesAdicionais {

    private String informacoesAdicionaisInteresseFisco;

    private String informacoesComplementaresInteresseContribuinte;

    private List<NFNotaInfoObservacao> observacoesContribuinte;

    private List<NFNotaInfoObservacao> observacoesFisco;

    private List<NFNotaInfoProcessoReferenciado> processosRefenciado;

    public void setInformacoesAdicionaisInteresseFisco(final String informacoesAdicionaisInteresseFisco) {

        this.informacoesAdicionaisInteresseFisco = informacoesAdicionaisInteresseFisco;
    }

    public void setInformacoesComplementaresInteresseContribuinte(final String informacoesComplementaresInteresseContribuinte) {

        this.informacoesComplementaresInteresseContribuinte = informacoesComplementaresInteresseContribuinte;
    }

    public void setObservacoesContribuinte(final List<NFNotaInfoObservacao> observacoesContribuinte) {

        this.observacoesContribuinte = observacoesContribuinte;
    }

    public void setObservacoesFisco(final List<NFNotaInfoObservacao> observacoesFisco) {

        this.observacoesFisco = observacoesFisco;
    }

    public void setProcessosRefenciado(final List<NFNotaInfoProcessoReferenciado> processosRefenciado) {

        this.processosRefenciado = processosRefenciado;
    }

    public String getInformacoesAdicionaisInteresseFisco() {
        return this.informacoesAdicionaisInteresseFisco;
    }

    public String getInformacoesComplementaresInteresseContribuinte() {
        return this.informacoesComplementaresInteresseContribuinte;
    }

    public List<NFNotaInfoObservacao> getObservacoesContribuinte() {
        return this.observacoesContribuinte;
    }

    public List<NFNotaInfoObservacao> getObservacoesFisco() {
        return this.observacoesFisco;
    }

    public List<NFNotaInfoProcessoReferenciado> getProcessosRefenciado() {
        return this.processosRefenciado;
    }
}
