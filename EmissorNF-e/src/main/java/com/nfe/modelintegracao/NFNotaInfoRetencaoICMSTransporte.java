package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoRetencaoICMSTransporte {

    private String valorServico;

    private String bcRetencaoICMS;

    private String aliquotaRetencao;

    private String valorICMSRetido;

    private Integer cfop;

    private Integer codigoMunicipioOcorrenciaFatoGeradorICMSTransporte;

    public void setValorServico(final BigDecimal valorServico) {
        this.valorServico = String.valueOf(valorServico);
    }

    public void setBcRetencaoICMS(final BigDecimal bcRetencaoICMS) {
        this.bcRetencaoICMS = String.valueOf(bcRetencaoICMS);
    }

    public void setAliquotaRetencao(final BigDecimal aliquotaRetencao) {
        this.aliquotaRetencao = String.valueOf(aliquotaRetencao);
    }

    public void setValorICMSRetido(final BigDecimal valorICMSRetido) {
        this.valorICMSRetido = String.valueOf(valorICMSRetido);
    }

    public void setCfop(final Integer cfop) {

        this.cfop = cfop;
    }

    public void setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte(final Integer codigoMunicioOcorrenciaFatoGeradorICMSTransporte) {

        this.codigoMunicipioOcorrenciaFatoGeradorICMSTransporte = codigoMunicioOcorrenciaFatoGeradorICMSTransporte;
    }

    public String getValorServico() {
        return this.valorServico;
    }

    public String getBcRetencaoICMS() {
        return this.bcRetencaoICMS;
    }

    public String getAliquotaRetencao() {
        return this.aliquotaRetencao;
    }

    public String getValorICMSRetido() {
        return this.valorICMSRetido;
    }

    public Integer getCfop() {
        return this.cfop;
    }

    public Integer getCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte() {
        return this.codigoMunicipioOcorrenciaFatoGeradorICMSTransporte;
    }
}
