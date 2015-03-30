package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoRetencoesTributos {

    private String valorRetidoPIS;

    private String valorRetidoCOFINS;

    private String valorRetidoCSLL;

    private String baseCalculoIRRF;

    private String valorRetidoIRRF;

    private String baseCalculoRetencaoPrevidenciaSocial;

    private String valorRetencaoPrevidenciaSocial;

    public void setValorRetidoPIS(final BigDecimal valorRetidoPIS) {
        this.valorRetidoPIS = String.valueOf(valorRetidoPIS);
    }

    public void setValorRetidoCOFINS(final BigDecimal valorRetidoCOFINS) {
        this.valorRetidoCOFINS = String.valueOf(valorRetidoCOFINS);
    }

    public void setValorRetidoCSLL(final BigDecimal valorRetidoCSLL) {
        this.valorRetidoCSLL = String.valueOf(valorRetidoCSLL);
    }

    public void setBaseCalculoIRRF(final BigDecimal baseCalculoIRRF) {
        this.baseCalculoIRRF = String.valueOf(baseCalculoIRRF);
    }

    public void setValorRetidoIRRF(final BigDecimal valorRetidoIRRF) {
        this.valorRetidoIRRF = String.valueOf(valorRetidoIRRF);
    }

    public void setBaseCalculoRetencaoPrevidenciaSocial(final BigDecimal baseCalculoRetencaoPrevidenciaSocial) {
        this.baseCalculoRetencaoPrevidenciaSocial = String.valueOf(baseCalculoRetencaoPrevidenciaSocial);
    }

    public void setValorRetencaoPrevidenciaSocial(final BigDecimal valorRetencaoPrevidenciaSocial) {
        this.valorRetencaoPrevidenciaSocial = String.valueOf(valorRetencaoPrevidenciaSocial);
    }

    public String getValorRetidoPIS() {
        return this.valorRetidoPIS;
    }

    public String getValorRetidoCOFINS() {
        return this.valorRetidoCOFINS;
    }

    public String getValorRetidoCSLL() {
        return this.valorRetidoCSLL;
    }

    public String getBaseCalculoIRRF() {
        return this.baseCalculoIRRF;
    }

    public String getValorRetidoIRRF() {
        return this.valorRetidoIRRF;
    }

    public String getBaseCalculoRetencaoPrevidenciaSocial() {
        return this.baseCalculoRetencaoPrevidenciaSocial;
    }

    public String getValorRetencaoPrevidenciaSocial() {
        return this.valorRetencaoPrevidenciaSocial;
    }
}
