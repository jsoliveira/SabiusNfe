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

    //chave primaria
    @Id
    private String nr_cnpj;
    
    private String ds_nm_fantasia;
    

    private Timestamp dt_cadastro;

    public Empresa() {
    }

    public Empresa(String nr_cnpj, String ds_nm_fantasia, Timestamp dt_cadastro) {
        this.nr_cnpj = nr_cnpj;
        this.ds_nm_fantasia = ds_nm_fantasia;
        this.dt_cadastro = dt_cadastro;
    }
    
    

    public String getNr_cnpj() {
        return nr_cnpj;
    }

    public void setNr_cnpj(String nr_cnpj) {
        this.nr_cnpj = nr_cnpj;
    }

    public String getDs_nm_fantasia() {
        return ds_nm_fantasia;
    }

    public void setDs_nm_fantasia(String ds_nm_fantasia) {
        this.ds_nm_fantasia = ds_nm_fantasia;
    }

    public Timestamp getDt_cadastro() {
        return dt_cadastro;
    }

    public void setDt_cadastro(Timestamp dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nr_cnpj);
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
        if (!Objects.equals(this.nr_cnpj, other.nr_cnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nr_cnpj=" + nr_cnpj + ", ds_nm_fantasia=" + ds_nm_fantasia + ", dt_cadastro=" + dt_cadastro + '}';
    }

    
    
    
}
