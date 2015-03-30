package com.nfe.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class NFNotaInfoVolume {

    private BigInteger quantidadeVolumesTransportados;
    private String especieVolumesTransportados;
    private String marca;
    private String numeracaoVolumesTransportados;
    private String pesoLiquido;
    private String pesoBruto;
    private List<NFNotaInfoLacre> lacres;

    public void setQuantidadeVolumesTransportados(final BigInteger quantidadeVolumesTransportados) {
        this.quantidadeVolumesTransportados = quantidadeVolumesTransportados;
    }

    public void setNumeracaoVolumesTransportados(final String numeracaoVolumesTransportados) {
        this.numeracaoVolumesTransportados = numeracaoVolumesTransportados;
    }

    public void setEspecieVolumesTransportados(final String especieVolumesTransportados) {
        this.especieVolumesTransportados = especieVolumesTransportados;
    }

    public void setMarca(final String marca) {
        this.marca = marca;
    }

    public void setPesoLiquido(final BigDecimal pesoLiquido) {
        this.pesoLiquido = String.valueOf(pesoLiquido);
    }

    public void setPesoBruto(final BigDecimal pesoBruto) {
        this.pesoBruto = String.valueOf(pesoBruto);
    }

    public void setLacres(final List<NFNotaInfoLacre> lacres) {
        this.lacres = lacres;
    }

    public BigInteger getQuantidadeVolumesTransportados() {
        return this.quantidadeVolumesTransportados;
    }

    public String getEspecieVolumesTransportados() {
        return this.especieVolumesTransportados;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getNumeracaoVolumesTransportados() {
        return this.numeracaoVolumesTransportados;
    }

    public String getPesoLiquido() {
        return this.pesoLiquido;
    }

    public String getPesoBruto() {
        return this.pesoBruto;
    }

    public List<NFNotaInfoLacre> getLacres() {
        return this.lacres;
    }
}
