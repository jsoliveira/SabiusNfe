package com.nfe.model;

import com.nfe.model.pk.CertificadoPk;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Rodrigo Monteiro
 */
@Entity
public class Certificado implements Serializable {

   
    
    @EmbeddedId
    private CertificadoPk certificadoPk;

    @ManyToOne
    private Empresa emp;

    private String dsCertificado;

    private String caminhoCertif;

    private String tipoCertificado;

    private String certificadoSenha;

    private Integer sslPort;

    private String keyStore;

    public Certificado() {
    }

    public Certificado(CertificadoPk certificadoPk) {
        this.certificadoPk = certificadoPk;
    }
    
    public Certificado(Long idCertificado,Long idEmpresa) {
        this.certificadoPk = new CertificadoPk(idCertificado, idEmpresa);
    }

    public CertificadoPk getCertificadoPk() {
        return certificadoPk;
    }

    public void setCertificadoPk(CertificadoPk certificadoPk) {
        this.certificadoPk = certificadoPk;
    }

    public Empresa getEmp() {
        return emp;
    }

    public void setEmp(Empresa emp) {
        this.emp = emp;
    }

    public String getDsCertificado() {
        return dsCertificado;
    }

    public void setDsCertificado(String dsCertificado) {
        this.dsCertificado = dsCertificado;
    }

    public String getCaminhoCertif() {
        return caminhoCertif;
    }

    public void setCaminhoCertif(String caminhoCertif) {
        this.caminhoCertif = caminhoCertif;
    }

    public String getTipoCertificado() {
        return tipoCertificado;
    }

    public void setTipoCertificado(String tipoCertificado) {
        this.tipoCertificado = tipoCertificado;
    }

    public String getCertificadoSenha() {
        return certificadoSenha;
    }

    public void setCertificadoSenha(String certificadoSenha) {
        this.certificadoSenha = certificadoSenha;
    }

    public Integer getSslPort() {
        return sslPort;
    }

    public void setSslPort(Integer sslPort) {
        this.sslPort = sslPort;
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.certificadoPk);
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
        final Certificado other = (Certificado) obj;
        if (!Objects.equals(this.certificadoPk, other.certificadoPk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Certificado{" + "certificadoPk=" + certificadoPk + ", emp=" + emp + ", dsCertificado=" + dsCertificado + ", caminhoCertif=" + caminhoCertif + ", tipoCertificado=" + tipoCertificado + ", certificadoSenha=" + certificadoSenha + ", sslPort=" + sslPort + ", keyStore=" + keyStore + '}';
    }
    
    
    
}
