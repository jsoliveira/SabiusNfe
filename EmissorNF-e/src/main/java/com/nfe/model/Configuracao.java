package com.nfe.model;

import com.nfe.model.pk.ConfiguracaoPk;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Rodrigo Monteiro
 */
@Entity
public class Configuracao implements Serializable {

    //chave primaria
    @EmbeddedId
    private ConfiguracaoPk configuracaoPk;

    @OneToOne
    private Empresa empresa;

    @OneToOne
    private Certificado certificado;

    private Integer getAmbiente;

    private String cadeiraCertificados;
    private String arquivosXsd;
    private Integer CUF;
    private Integer tipoEmissao;
    private Integer tipoImpressao;
    private Integer sincrono;
    private String logEmissao;

    public Configuracao() {
    }

    public Configuracao(ConfiguracaoPk configuracaoPk) {
        this.configuracaoPk = configuracaoPk;
    }

    public Configuracao(Long idConfiguracao, Long idEmpresa) {
        this.configuracaoPk = new ConfiguracaoPk(idConfiguracao, idEmpresa);
    }

    public ConfiguracaoPk getConfiguracaoPk() {
        return configuracaoPk;
    }

    public void setConfiguracaoPk(ConfiguracaoPk configuracaoPk) {
        this.configuracaoPk = configuracaoPk;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Certificado getCertificado() {
        return certificado;
    }

    public void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

    public Integer getGetAmbiente() {
        return getAmbiente;
    }

    public void setGetAmbiente(Integer getAmbiente) {
        this.getAmbiente = getAmbiente;
    }

    public String getCadeiraCertificados() {
        return cadeiraCertificados;
    }

    public void setCadeiraCertificados(String cadeiraCertificados) {
        this.cadeiraCertificados = cadeiraCertificados;
    }

    public String getArquivosXsd() {
        return arquivosXsd;
    }

    public void setArquivosXsd(String arquivosXsd) {
        this.arquivosXsd = arquivosXsd;
    }

    public Integer getCUF() {
        return CUF;
    }

    public void setCUF(Integer CUF) {
        this.CUF = CUF;
    }

    public Integer getTipoEmissao() {
        return tipoEmissao;
    }

    public void setTipoEmissao(Integer tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
    }

    public Integer getTipoImpressao() {
        return tipoImpressao;
    }

    public void setTipoImpressao(Integer tipoImpressao) {
        this.tipoImpressao = tipoImpressao;
    }

    public Integer getSincrono() {
        return sincrono;
    }

    public void setSincrono(Integer sincrono) {
        this.sincrono = sincrono;
    }

    public String getLogEmissao() {
        return logEmissao;
    }

    public void setLogEmissao(String logEmissao) {
        this.logEmissao = logEmissao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.configuracaoPk);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Configuracao other = (Configuracao) obj;
        if (!Objects.equals(this.configuracaoPk, other.configuracaoPk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Configuracao{" + "configuracaoPk=" + configuracaoPk + ", empresa=" + empresa + ", certificado=" + certificado + ", getAmbiente=" + getAmbiente + ", cadeiraCertificados=" + cadeiraCertificados + ", arquivosXsd=" + arquivosXsd + ", CUF=" + CUF + ", tipoEmissao=" + tipoEmissao + ", tipoImpressao=" + tipoImpressao + ", sincrono=" + sincrono + ", logEmissao=" + logEmissao + '}';
    }

    
}
