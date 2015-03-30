package com.nfe.modelintegracao;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemExportacaoIndireta {

    private BigInteger numeroRegistroExportacao;

    private String chaveAcessoNFe;

    private String quantidadeItemEfetivamenteExportado;

    public void setChaveAcessoNFe(final String chaveAcessoNFe) {

        this.chaveAcessoNFe = chaveAcessoNFe;
    }

    public void setNumeroRegistroExportacao(final BigInteger numeroRegistroExportacao) {

        this.numeroRegistroExportacao = numeroRegistroExportacao;
    }

    public void setQuantidadeItemEfetivamenteExportado(final BigDecimal quantidadeItemEfetivamenteExportado) {
        this.quantidadeItemEfetivamenteExportado = String.valueOf(quantidadeItemEfetivamenteExportado);
    }

    public String getChaveAcessoNFe() {
        return this.chaveAcessoNFe;
    }

    public BigInteger getNumeroRegistroExportacao() {
        return this.numeroRegistroExportacao;
    }

    public String getQuantidadeItemEfetivamenteExportado() {
        return this.quantidadeItemEfetivamenteExportado;
    }
}
