package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoVeiculo {

    private String placaVeiculo;

    private String uf;

    private String registroNacionalTransportadorCarga;

    public void setPlacaVeiculo(final String placaVeiculo) {

        this.placaVeiculo = placaVeiculo;
    }

    public void setUf(final String uf) {
        this.uf = uf;
    }

    public String getPlacaVeiculo() {
        return this.placaVeiculo;
    }

    public String getRegistroNacionalTransportadorCarga() {
        return this.registroNacionalTransportadorCarga;
    }

    public String getUf() {
        return this.uf;
    }

    public void setRegistroNacionalTransportadorCarga(final String registroNacionalTransportadorCarga) {

        this.registroNacionalTransportadorCarga = registroNacionalTransportadorCarga;
    }
}
