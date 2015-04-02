package com.nfe.model.pk;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author jsoliveira
 */
@Embeddable
public class ConfiguracaoPk implements Serializable {

    private Long idConfiguracao;
    private Long idEmpresa;

    public ConfiguracaoPk() {
    }

    public ConfiguracaoPk(Long idConfiguracao, Long idEmpresa) {
        this.idConfiguracao = idConfiguracao;
        this.idEmpresa = idEmpresa;
    }

    public Long getIdCertificado() {
        return idConfiguracao;
    }

    public void setIdCertificado(Long idConfiguracao) {
        this.idConfiguracao = idConfiguracao;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idConfiguracao);
        hash = 97 * hash + Objects.hashCode(this.idEmpresa);
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
        final ConfiguracaoPk other = (ConfiguracaoPk) obj;
        if (!Objects.equals(this.idConfiguracao, other.idConfiguracao)) {
            return false;
        }
        if (!Objects.equals(this.idEmpresa, other.idEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConfiguracaoPk{" + "idConfiguracao=" + idConfiguracao + ", idEmpresa=" + idEmpresa + '}';
    }

 

}
