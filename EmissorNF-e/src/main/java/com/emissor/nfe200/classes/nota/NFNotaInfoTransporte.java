package com.emissor.nfe200.classes.nota;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import com.emissor.nfe200.classes.NFBase;
import com.emissor.nfe200.classes.NFModalidadeFrete;
import com.emissor.nfe200.validadores.ListValidador;
import com.emissor.nfe200.validadores.StringValidador;

public class NFNotaInfoTransporte extends NFBase {
    @Element(name = "modFrete", required = true)
    private NFModalidadeFrete modalidadeFrete;

    @Element(name = "transporta", required = false)
    private NFNotaInfoTransportador transportador;

    @Element(name = "retTransp", required = false)
    private NFNotaInfoRetencaoICMSTransporte icmsTransporte;

    @Element(name = "veicTransp", required = false)
    private NFNotaInfoVeiculo veiculo;

    @ElementList(entry = "reboque", inline = true, required = false)
    private List<NFNotaInfoReboque> reboques;

    @Element(name = "vagao", required = false)
    private String vagao;

    @Element(name = "balsa", required = false)
    private String balsa;

    @ElementList(entry = "vol", inline = true, required = false)
    private List<NFNotaInfoVolume> volumes;

    public void setModalidadeFrete(final NFModalidadeFrete modalidadeFrete) {
        this.modalidadeFrete = modalidadeFrete;
    }

    public void setTransportador(final NFNotaInfoTransportador transportador) {
        this.transportador = transportador;
    }

    public void setIcmsTransporte(final NFNotaInfoRetencaoICMSTransporte icmsTransporte) {
        this.icmsTransporte = icmsTransporte;
    }

    public void setVeiculo(final NFNotaInfoVeiculo veiculo) {
        if (this.reboques != null || this.balsa != null || this.vagao != null) {
            throw new IllegalStateException("Veiculo, balsa, reboque e vagao sao mutuamente exclusivos");
        }
        this.veiculo = veiculo;
    }

    public void setReboques(final List<NFNotaInfoReboque> reboques) {
        if (this.veiculo != null || this.balsa != null || this.vagao != null) {
            throw new IllegalStateException("Veiculo, balsa, reboque e vagao sao mutuamente exclusivos");
        }
        ListValidador.tamanho5(reboques);
        this.reboques = reboques;
    }

    public void setVolumes(final List<NFNotaInfoVolume> volumes) {
        ListValidador.tamanho5000(volumes);
        this.volumes = volumes;
    }

    public void setVagao(final String vagao) {
        if (this.balsa != null || this.reboques != null || this.veiculo != null) {
            throw new IllegalStateException("Veiculo, balsa, reboque e vagao e reboque sao mutuamente exclusivo");
        }
        StringValidador.tamanho20(vagao);
        this.vagao = vagao;
    }

    public void setBalsa(final String balsa) {
        if (this.vagao != null || this.reboques != null || this.veiculo != null) {
            throw new IllegalStateException("Veiculo, balsa, reboque e vagao e reboque sao mutuamente exclusivo");
        }
        StringValidador.tamanho20(balsa);
        this.balsa = balsa;
    }

    public NFModalidadeFrete getModalidadeFrete() {
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