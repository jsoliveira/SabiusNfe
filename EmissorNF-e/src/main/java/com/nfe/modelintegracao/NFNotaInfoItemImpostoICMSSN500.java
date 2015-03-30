package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMSSN500 {

    //Enum NFOrigem 
    private String origem;

    //Enum NFNotaSituacaoOperacionalSimplesNacional
    private String situacaoOperacaoSN;

    private String valorBCICMSSTRetido;

    private String valorICMSSTRetido;

    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public void setSituacaoOperacaoSN(final String situacaoOperacaoSN) {
        this.situacaoOperacaoSN = situacaoOperacaoSN;
    }

    public void setValorBCICMSSTRetido(final BigDecimal valorBCICMSSTRetido) {
        this.valorBCICMSSTRetido = String.valueOf(valorBCICMSSTRetido);
    }

    public void setValorICMSSTRetido(final BigDecimal valorICMSSTRetido) {
        this.valorICMSSTRetido = String.valueOf(valorICMSSTRetido);
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getSituacaoOperacaoSN() {
        return this.situacaoOperacaoSN;
    }

    public String getValorBCICMSSTRetido() {
        return this.valorBCICMSSTRetido;
    }

    public String getValorICMSSTRetido() {
        return this.valorICMSSTRetido;
    }
}
