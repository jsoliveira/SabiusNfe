package com.emissor.nfe200.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import com.emissor.nfe200.classes.NFBase;
import com.emissor.nfe200.classes.NFNotaInfoSituacaoTributariaCOFINS;
import com.emissor.nfe200.validadores.BigDecimalParser;

public class NFNotaInfoItemImpostoCOFINSOutrasOperacoes extends NFBase {

    @Element(name = "CST", required = true)
    private NFNotaInfoSituacaoTributariaCOFINS situacaoTributaria;

    @Element(name = "vBC", required = true)
    private String valorBaseCalculo;

    @Element(name = "pCOFINS", required = true)
    private String percentualCOFINS;

    @Element(name = "qBCProd", required = true)
    private String quantidadeVendida;

    @Element(name = "vAliqProd", required = true)
    private String valorAliquota;

    @Element(name = "vCOFINS", required = true)
    private String valorCOFINS;

    public void setSituacaoTributaria(final NFNotaInfoSituacaoTributariaCOFINS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = BigDecimalParser.tamanho15Com2CasasDecimais(valorBaseCalculo);
    }

    public void setPercentualCOFINS(final BigDecimal percentualCOFINS) {
        this.percentualCOFINS = BigDecimalParser.tamanho5Com2CasasDecimais(percentualCOFINS);
    }

    public void setQuantidadeVendida(final BigDecimal quantidadeVendida) {
        this.quantidadeVendida = BigDecimalParser.tamanho16ComAte4CasasDecimais(quantidadeVendida);
    }

    public void setValorAliquota(final BigDecimal valorAliquota) {
        this.valorAliquota = BigDecimalParser.tamanho15Com4CasasDecimais(valorAliquota);
    }

    public void setValorCOFINS(final BigDecimal valorTributo) {
        this.valorCOFINS = BigDecimalParser.tamanho15Com2CasasDecimais(valorTributo);
    }

    public NFNotaInfoSituacaoTributariaCOFINS getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public String getPercentualCOFINS() {
        return this.percentualCOFINS;
    }

    public String getQuantidadeVendida() {
        return this.quantidadeVendida;
    }

    public String getValorAliquota() {
        return this.valorAliquota;
    }

    public String getValorCOFINS() {
        return this.valorCOFINS;
    }
}