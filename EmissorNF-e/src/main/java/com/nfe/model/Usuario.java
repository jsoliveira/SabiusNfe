package com.nfe.model;

/**
 *
 * @author Rodrigo Monteiro
 */
public class Usuario {

    private Integer cd_usuario;
    private String ds_usuario;
    private String senha;

    public Integer getCd_usuario() {
        return cd_usuario;
    }

    public void setCd_usuario(Integer cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

    public String getDs_usuario() {
        return ds_usuario;
    }

    public void setDs_usuario(String ds_usuario) {
        this.ds_usuario = ds_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
