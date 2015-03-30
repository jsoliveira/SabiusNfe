package com.nfe.model;

import java.security.Timestamp;

/**
 *
 * @author Rodrigo Monteiro
 */
public class Empresa {

    //chave primaria
    private String nr_cnpj;
    private String ds_nm_fantasia;
    private Timestamp dt_cadastro;

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

}
