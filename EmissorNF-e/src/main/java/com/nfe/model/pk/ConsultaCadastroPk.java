package com.nfe.model.pk;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author jsoliveira
 */
@Embeddable
public class ConsultaCadastroPk implements Serializable {

    private Long nrSeqCadastro;
    private Long idEmpresa;

    public ConsultaCadastroPk() {
    }

    public ConsultaCadastroPk(Long nrSeqCadastro, Long idEmpresa) {
        this.nrSeqCadastro = nrSeqCadastro;
        this.idEmpresa = idEmpresa;
    }

    public Long getNrSeqCadastro() {
        return nrSeqCadastro;
    }

    public void setNrSeqCadastro(Long nrSeqCadastro) {
        this.nrSeqCadastro = nrSeqCadastro;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nrSeqCadastro);
        hash = 29 * hash + Objects.hashCode(this.idEmpresa);
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
        final ConsultaCadastroPk other = (ConsultaCadastroPk) obj;
        if (!Objects.equals(this.nrSeqCadastro, other.nrSeqCadastro)) {
            return false;
        }
        if (!Objects.equals(this.idEmpresa, other.idEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConsultaCadastroPk{" + "nrSeqCadastro=" + nrSeqCadastro + ", idEmpresa=" + idEmpresa + '}';
    }

}
