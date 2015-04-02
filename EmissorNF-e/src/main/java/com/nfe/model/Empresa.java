package com.nfe.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Rodrigo Monteiro
 */

@Entity
public class Empresa implements Serializable{


    @Id
    private Long id;
    
    private String nrCnpj;
    
    private String nmFantasia;
    

    private Timestamp dtCadastro;

    public Empresa() {
    }

    public Empresa(Long id, String nrCnpj, String nmFantasia, Timestamp dtCadastro) {
        this.id = id;
        this.nrCnpj = nrCnpj;
        this.nmFantasia = nmFantasia;
        this.dtCadastro = dtCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNrCnpj() {
        return nrCnpj;
    }

    public void setNrCnpj(String nrCnpj) {
        this.nrCnpj = nrCnpj;
    }

    public String getNmFantasia() {
        return nmFantasia;
    }

    public void setNmFantasia(String nmFantasia) {
        this.nmFantasia = nmFantasia;
    }

    public Timestamp getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Timestamp dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.id);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nrCnpj=" + nrCnpj + ", nmFantasia=" + nmFantasia + ", dtCadastro=" + dtCadastro + '}';
    }
    
    
    
}
