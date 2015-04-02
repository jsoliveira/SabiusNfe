package com.nfe.model.pk;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author jsoliveira
 */
@Embeddable
public class CertificadoPk implements Serializable {

    private Long idCertificado;
    private Long idEmpresa;

    public CertificadoPk() {
    }

    public CertificadoPk(Long idCertificado, Long idEmpresa) {
        this.idCertificado = idCertificado;
        this.idEmpresa = idEmpresa;
    }

    public Long getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(Long idCertificado) {
        this.idCertificado = idCertificado;
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
        hash = 97 * hash + Objects.hashCode(this.idCertificado);
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
        final CertificadoPk other = (CertificadoPk) obj;
        if (!Objects.equals(this.idCertificado, other.idCertificado)) {
            return false;
        }
        if (!Objects.equals(this.idEmpresa, other.idEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CertificadoPk{" + "idCertificado=" + idCertificado + ", idEmpresa=" + idEmpresa + '}';
    }

}
