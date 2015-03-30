package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoFatura {

    private String numeroFatura;

    private String valorOriginalFatura;

    private String valorDesconto;

    private String valorLiquidoFatura;

    public void setNumeroFatura(final String numeroFatura) {

        this.numeroFatura = numeroFatura;
    }

    public void setValorOriginalFatura(final BigDecimal valorOriginalFatura) {
        this.valorOriginalFatura = String.valueOf(valorOriginalFatura);
    }

    public void setValorDesconto(final BigDecimal valorDesconto) {
        this.valorDesconto = String.valueOf(valorDesconto);
    }

    public void setValorLiquidoFatura(final BigDecimal valorLiquidoFatura) {
        this.valorLiquidoFatura = String.valueOf(valorLiquidoFatura);
    }

    public String getValorOriginalFatura() {
        return this.valorOriginalFatura;
    }

    public void setValorOriginalFatura(final String valorOriginalFatura) {
        this.valorOriginalFatura = valorOriginalFatura;
    }

    public String getValorDesconto() {
        return this.valorDesconto;
    }

    public void setValorDesconto(final String valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getValorLiquidoFatura() {
        return this.valorLiquidoFatura;
    }

    public void setValorLiquidoFatura(final String valorLiquidoFatura) {
        this.valorLiquidoFatura = valorLiquidoFatura;
    }

    public String getNumeroFatura() {
        return this.numeroFatura;
    }
}
