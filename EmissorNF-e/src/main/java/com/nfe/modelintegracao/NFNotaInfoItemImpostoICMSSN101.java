package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMSSN101 {

    //Enum NFOrigem
    private String origem;

    //Enum NFNotaSituacaoOperacionalSimplesNacional
    private String situacaoOperacaoSN;

    private String percentualAliquotaAplicavelCalculoCreditoSN;

    private String valorCreditoICMSSN;

    //Enum NFOrigem
    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public void setCodigoSituacaoOperacaoSN(final String codigoSituacaoOperacaoSN) {
        this.situacaoOperacaoSN = codigoSituacaoOperacaoSN;
    }

    public void setPercentualAliquotaAplicavelCalculoCreditoSN(final BigDecimal percentualAliquotaAplicavelCalculoCreditoSN) {
        this.percentualAliquotaAplicavelCalculoCreditoSN = String.valueOf(percentualAliquotaAplicavelCalculoCreditoSN);
    }

    public void setValorCreditoICMSSN(final BigDecimal valorCreditoICMSSN) {
        this.valorCreditoICMSSN = String.valueOf(valorCreditoICMSSN);
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getSituacaoOperacaoSN() {
        return this.situacaoOperacaoSN;
    }

    public String getPercentualAliquotaAplicavelCalculoCreditoSN() {
        return this.percentualAliquotaAplicavelCalculoCreditoSN;
    }

    public String getValorCreditoICMSSN() {
        return this.valorCreditoICMSSN;
    }
}
