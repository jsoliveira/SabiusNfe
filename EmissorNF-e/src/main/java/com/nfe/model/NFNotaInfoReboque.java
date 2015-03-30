package com.nfe.model;

public class NFNotaInfoReboque {

    private String placaVeiculo;
    private String uf;
    private String registroNacionalTransportadorCarga;

    public void setPlacaVeiculo(final String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public void setUf(final String uf) {
        this.uf = uf;
    }

    public void setRegistroNacionalTransportadorCarga(final String registroNacionalTransportadorCarga) {
        this.registroNacionalTransportadorCarga = registroNacionalTransportadorCarga;
    }

    public String getPlacaVeiculo() {
        return this.placaVeiculo;
    }

    public String getUf() {
        return this.uf;
    }

    public String getRegistroNacionalTransportadorCarga() {
        return this.registroNacionalTransportadorCarga;
    }
}
