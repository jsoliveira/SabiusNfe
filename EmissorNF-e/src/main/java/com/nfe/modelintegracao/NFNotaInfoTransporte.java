package com.nfe.modelintegracao;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoTransporte {

    //Enum NFModalidadeFrete
    private String modalidadeFrete;

    private NFNotaInfoTransportador transportador;

    private NFNotaInfoRetencaoICMSTransporte icmsTransporte;

    private NFNotaInfoVeiculo veiculo;

    private List<NFNotaInfoReboque> reboques;

    private String vagao;

    private String balsa;

    private List<NFNotaInfoVolume> volumes;

    public void setModalidadeFrete(final String modalidadeFrete) {
        this.modalidadeFrete = modalidadeFrete;
    }

    public void setTransportador(final NFNotaInfoTransportador transportador) {
        this.transportador = transportador;
    }

    public void setIcmsTransporte(final NFNotaInfoRetencaoICMSTransporte icmsTransporte) {
        this.icmsTransporte = icmsTransporte;
    }

    public void setVeiculo(final NFNotaInfoVeiculo veiculo) {

        this.veiculo = veiculo;
    }

    public void setReboques(final List<NFNotaInfoReboque> reboques) {

        this.reboques = reboques;
    }

    public void setVolumes(final List<NFNotaInfoVolume> volumes) {

        this.volumes = volumes;
    }

    public void setVagao(final String vagao) {

        this.vagao = vagao;
    }

    public void setBalsa(final String balsa) {

        this.balsa = balsa;
    }

    public String getModalidadeFrete() {
        return this.modalidadeFrete;
    }

    public NFNotaInfoTransportador getTransportador() {
        return this.transportador;
    }

    public NFNotaInfoRetencaoICMSTransporte getIcmsTransporte() {
        return this.icmsTransporte;
    }

    public NFNotaInfoVeiculo getVeiculo() {
        return this.veiculo;
    }

    public List<NFNotaInfoReboque> getReboques() {
        return this.reboques;
    }

    public String getVagao() {
        return this.vagao;
    }

    public String getBalsa() {
        return this.balsa;
    }

    public List<NFNotaInfoVolume> getVolumes() {
        return this.volumes;
    }
}
