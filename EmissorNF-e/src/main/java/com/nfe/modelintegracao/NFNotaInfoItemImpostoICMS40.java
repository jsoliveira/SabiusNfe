package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMS40 {

    //Enum NFOrigem  
    private String origem;

    //Enum NFNotaInfoImpostoTributacaoICMS
    private String situacaoTributaria;

    private String valorICMSDesoneracao;

    //Enum NFNotaMotivoDesoneracaoICMS
    private String motivoDesoneracaoICMS;

    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final String situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setValorICMSDesoneracao(final BigDecimal valorICMSDesoneracao) {
        this.valorICMSDesoneracao = String.valueOf(valorICMSDesoneracao);
    }

    public void setMotivoDesoneracaoICMS(final String motivoDesoneracaoICMS) {
        this.motivoDesoneracaoICMS = motivoDesoneracaoICMS;
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getValorICMSDesoneracao() {
        return this.valorICMSDesoneracao;
    }

    public String getMotivoDesoneracaoICMS() {
        return this.motivoDesoneracaoICMS;
    }
}
