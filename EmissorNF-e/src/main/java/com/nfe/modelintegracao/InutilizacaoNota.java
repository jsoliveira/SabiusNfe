package com.nfe.modelintegracao;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rodrigo Monteiro
 */
@XmlRootElement
public class InutilizacaoNota {

    private Integer anoInutilizacaoNumeracao;
    private String cnpjEmitente;
    private String serie;
    private String numeroInicial;
    private String numeroFinal;
    private String justificativa;
    private List<String> mensagens;

    public Integer getAnoInutilizacaoNumeracao() {
        return anoInutilizacaoNumeracao;
    }

    public void setAnoInutilizacaoNumeracao(Integer anoInutilizacaoNumeracao) {
        this.anoInutilizacaoNumeracao = anoInutilizacaoNumeracao;
    }

    public String getCnpjEmitente() {
        return cnpjEmitente;
    }

    public void setCnpjEmitente(String cnpjEmitente) {
        this.cnpjEmitente = cnpjEmitente;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumeroInicial() {
        return numeroInicial;
    }

    public void setNumeroInicial(String numeroInicial) {
        this.numeroInicial = numeroInicial;
    }

    public String getNumeroFinal() {
        return numeroFinal;
    }

    public void setNumeroFinal(String numeroFinal) {
        this.numeroFinal = numeroFinal;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<String> mensagens) {
        this.mensagens = mensagens;
    }

}
