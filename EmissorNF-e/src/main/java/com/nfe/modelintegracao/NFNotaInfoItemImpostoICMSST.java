package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoICMSST {

    //Enum NFOrigem
    private String origem;

    //Enum NFNotaInfoImpostoTributacaoICMS
    private String situacaoTributaria;

    private String valorBCICMSSTRetidoUFRemetente;

    private String valorICMSSTRetidoUFRemetente;

    private String valorBCICMSSTUFDestino;

    private String valorICMSSTUFDestino;

    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final String situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setValorBCICMSSTRetidoUFRemetente(final BigDecimal valorBCICMSSTRetidoUFRemetente) {
        this.valorBCICMSSTRetidoUFRemetente = String.valueOf(valorBCICMSSTRetidoUFRemetente);
    }

    public void setValorICMSSTRetidoUFRemetente(final BigDecimal valorICMSSTRetidoUFRemetente) {
        this.valorICMSSTRetidoUFRemetente = String.valueOf(valorICMSSTRetidoUFRemetente);
    }

    public void setValorBCICMSSTUFDestino(final BigDecimal valorBCICMSSTUFDestino) {
        this.valorBCICMSSTUFDestino = String.valueOf(valorBCICMSSTUFDestino);
    }

    public void setValorICMSSTUFDestino(final BigDecimal valorICMSSTUFDestino) {
        this.valorICMSSTUFDestino = String.valueOf(valorICMSSTUFDestino);
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getValorBCICMSSTRetidoUFRemetente() {
        return this.valorBCICMSSTRetidoUFRemetente;
    }

    public String getValorICMSSTRetidoUFRemetente() {
        return this.valorICMSSTRetidoUFRemetente;
    }

    public String getValorBCICMSSTUFDestino() {
        return this.valorBCICMSSTUFDestino;
    }

    public String getValorICMSSTUFDestino() {
        return this.valorICMSSTUFDestino;
    }
}
