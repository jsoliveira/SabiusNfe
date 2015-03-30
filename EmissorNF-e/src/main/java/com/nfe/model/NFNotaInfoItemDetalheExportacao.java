package com.nfe.model;

import java.math.BigInteger;

public class NFNotaInfoItemDetalheExportacao {

    private BigInteger ExportaatoConcessorioDrawback;
    private BigInteger ExportIndiretanumeroRegistroExportacao;
    private String ExportIndiretachaveAcessoNFe;
    private String ExportIndiretaquantidadeItemEfetivamenteExportado;

    public BigInteger getExportaatoConcessorioDrawback() {
        return ExportaatoConcessorioDrawback;
    }

    public void setExportaatoConcessorioDrawback(BigInteger ExportaatoConcessorioDrawback) {
        this.ExportaatoConcessorioDrawback = ExportaatoConcessorioDrawback;
    }

    public BigInteger getExportIndiretanumeroRegistroExportacao() {
        return ExportIndiretanumeroRegistroExportacao;
    }

    public void setExportIndiretanumeroRegistroExportacao(BigInteger ExportIndiretanumeroRegistroExportacao) {
        this.ExportIndiretanumeroRegistroExportacao = ExportIndiretanumeroRegistroExportacao;
    }

    public String getExportIndiretachaveAcessoNFe() {
        return ExportIndiretachaveAcessoNFe;
    }

    public void setExportIndiretachaveAcessoNFe(String ExportIndiretachaveAcessoNFe) {
        this.ExportIndiretachaveAcessoNFe = ExportIndiretachaveAcessoNFe;
    }

    public String getExportIndiretaquantidadeItemEfetivamenteExportado() {
        return ExportIndiretaquantidadeItemEfetivamenteExportado;
    }

    public void setExportIndiretaquantidadeItemEfetivamenteExportado(String ExportIndiretaquantidadeItemEfetivamenteExportado) {
        this.ExportIndiretaquantidadeItemEfetivamenteExportado = ExportIndiretaquantidadeItemEfetivamenteExportado;
    }

}
