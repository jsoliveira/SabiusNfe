package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoCOFINSQuantidade {

    //Enum NFNotaInfoSituacaoTributariaCOFINS
    private String situacaoTributaria;

    private String quantidadeVendida;

    private String valorAliquota;

    private String valorTributo;

    public NFNotaInfoItemImpostoCOFINSQuantidade() {
        this.situacaoTributaria = null;
        this.quantidadeVendida = null;
        this.valorAliquota = null;
        this.valorTributo = null;
    }

    public void setSituacaoTributaria(final String situacaoTributaria) {

        this.situacaoTributaria = situacaoTributaria;
    }

    public void setQuantidadeVendida(final BigDecimal quantidadeVendida) {
        this.quantidadeVendida = String.valueOf(quantidadeVendida);
    }

    public void setValorAliquota(final BigDecimal valorAliquota) {
        this.valorAliquota = String.valueOf(valorAliquota);
    }

    public void setValorTributo(final BigDecimal valorTributo) {
        this.valorTributo = String.valueOf(valorTributo);
    }

    public String getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getQuantidadeVendida() {
        return this.quantidadeVendida;
    }

    public String getValorAliquota() {
        return this.valorAliquota;
    }

    public String getValorTributo() {
        return this.valorTributo;
    }
}
