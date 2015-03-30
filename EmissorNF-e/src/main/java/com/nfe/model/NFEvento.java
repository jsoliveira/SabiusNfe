package com.nfe.model;

import java.time.LocalDateTime;
import java.util.List;

public class NFEvento {

    //chave primaria
    private String id;
    private NFNota nota;

    List<Integer> retornoStatus;

    private String versao;
    private String orgao;
    private Integer ambiente;
    private String cnpj;
    private String cpf;
    private String chave;
    private String correcao;
    private String condicaoDeUso;
    private LocalDateTime dataHoraEvento;
    private String codigoEvento;
    private Integer numeroSequencialEvento;
    private String versaoEvento;
    private String Tipoversao;
    private String TipodescricaoEvento;
    private String TipotextoCorrecao;
    private String TipocondicaoUso;
    private String CancprotocoloAutorizacao;
    private String Cancjustificativa;
    private StringBuilder assinatura;

    //Retorno
    private String Retornoversao;
    private String Retornoid;
    private Integer Retornoambiente;
    private String RetornoversaoAplicativo;
    private String Retornoorgao;
    private Integer RetornocodigoStatus;
    private String Retornomotivo;
    private String Retornochave;
    private String RetornotipoEvento;
    private String RetornodescricaoEvento;
    private Integer RetornonumeroSequencialEvento;
    private String Retornocpnj;
    private String Retornocpf;
    private String Retornoemail;
    private LocalDateTime RetornodataHoraRegistro;

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public Integer getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Integer ambiente) {
        this.ambiente = ambiente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public LocalDateTime getDataHoraEvento() {
        return dataHoraEvento;
    }

    public void setDataHoraEvento(LocalDateTime dataHoraEvento) {
        this.dataHoraEvento = dataHoraEvento;
    }

    public String getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(String codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public Integer getNumeroSequencialEvento() {
        return numeroSequencialEvento;
    }

    public void setNumeroSequencialEvento(Integer numeroSequencialEvento) {
        this.numeroSequencialEvento = numeroSequencialEvento;
    }

    public String getVersaoEvento() {
        return versaoEvento;
    }

    public void setVersaoEvento(String versaoEvento) {
        this.versaoEvento = versaoEvento;
    }

    public String getTipoversao() {
        return Tipoversao;
    }

    public void setTipoversao(String Tipoversao) {
        this.Tipoversao = Tipoversao;
    }

    public String getTipodescricaoEvento() {
        return TipodescricaoEvento;
    }

    public void setTipodescricaoEvento(String TipodescricaoEvento) {
        this.TipodescricaoEvento = TipodescricaoEvento;
    }

    public String getTipotextoCorrecao() {
        return TipotextoCorrecao;
    }

    public void setTipotextoCorrecao(String TipotextoCorrecao) {
        this.TipotextoCorrecao = TipotextoCorrecao;
    }

    public String getTipocondicaoUso() {
        return TipocondicaoUso;
    }

    public void setTipocondicaoUso(String TipocondicaoUso) {
        this.TipocondicaoUso = TipocondicaoUso;
    }

    public StringBuilder getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(StringBuilder assinatura) {
        this.assinatura = assinatura;
    }

    public String getCorrecao() {
        return correcao;
    }

    public void setCorrecao(String correcao) {
        this.correcao = correcao;
    }

    public String getCondicaoDeUso() {
        return condicaoDeUso;
    }

    public void setCondicaoDeUso(String condicaoDeUso) {
        this.condicaoDeUso = condicaoDeUso;
    }

    public String getRetornoversao() {
        return Retornoversao;
    }

    public void setRetornoversao(String Retornoversao) {
        this.Retornoversao = Retornoversao;
    }

    public String getRetornoid() {
        return Retornoid;
    }

    public void setRetornoid(String Retornoid) {
        this.Retornoid = Retornoid;
    }

    public Integer getRetornoambiente() {
        return Retornoambiente;
    }

    public void setRetornoambiente(Integer Retornoambiente) {
        this.Retornoambiente = Retornoambiente;
    }

    public String getRetornoversaoAplicativo() {
        return RetornoversaoAplicativo;
    }

    public void setRetornoversaoAplicativo(String RetornoversaoAplicativo) {
        this.RetornoversaoAplicativo = RetornoversaoAplicativo;
    }

    public String getRetornoorgao() {
        return Retornoorgao;
    }

    public void setRetornoorgao(String Retornoorgao) {
        this.Retornoorgao = Retornoorgao;
    }

    public Integer getRetornocodigoStatus() {
        return RetornocodigoStatus;
    }

    public void setRetornocodigoStatus(Integer RetornocodigoStatus) {
        this.RetornocodigoStatus = RetornocodigoStatus;
    }

    public String getRetornomotivo() {
        return Retornomotivo;
    }

    public void setRetornomotivo(String Retornomotivo) {
        this.Retornomotivo = Retornomotivo;
    }

    public String getRetornochave() {
        return Retornochave;
    }

    public void setRetornochave(String Retornochave) {
        this.Retornochave = Retornochave;
    }

    public String getRetornotipoEvento() {
        return RetornotipoEvento;
    }

    public void setRetornotipoEvento(String RetornotipoEvento) {
        this.RetornotipoEvento = RetornotipoEvento;
    }

    public String getRetornodescricaoEvento() {
        return RetornodescricaoEvento;
    }

    public void setRetornodescricaoEvento(String RetornodescricaoEvento) {
        this.RetornodescricaoEvento = RetornodescricaoEvento;
    }

    public Integer getRetornonumeroSequencialEvento() {
        return RetornonumeroSequencialEvento;
    }

    public void setRetornonumeroSequencialEvento(Integer RetornonumeroSequencialEvento) {
        this.RetornonumeroSequencialEvento = RetornonumeroSequencialEvento;
    }

    public String getRetornocpnj() {
        return Retornocpnj;
    }

    public void setRetornocpnj(String Retornocpnj) {
        this.Retornocpnj = Retornocpnj;
    }

    public String getRetornocpf() {
        return Retornocpf;
    }

    public void setRetornocpf(String Retornocpf) {
        this.Retornocpf = Retornocpf;
    }

    public String getRetornoemail() {
        return Retornoemail;
    }

    public void setRetornoemail(String Retornoemail) {
        this.Retornoemail = Retornoemail;
    }

    public LocalDateTime getRetornodataHoraRegistro() {
        return RetornodataHoraRegistro;
    }

    public void setRetornodataHoraRegistro(LocalDateTime RetornodataHoraRegistro) {
        this.RetornodataHoraRegistro = RetornodataHoraRegistro;
    }

    public String getCancprotocoloAutorizacao() {
        return CancprotocoloAutorizacao;
    }

    public void setCancprotocoloAutorizacao(String CancprotocoloAutorizacao) {
        this.CancprotocoloAutorizacao = CancprotocoloAutorizacao;
    }

    public String getCancjustificativa() {
        return Cancjustificativa;
    }

    public void setCancjustificativa(String Cancjustificativa) {
        this.Cancjustificativa = Cancjustificativa;
    }

    public NFNota getNota() {
        return nota;
    }

    public void setNota(NFNota nota) {
        this.nota = nota;
    }

    public List<Integer> getRetornoStatus() {
        return retornoStatus;
    }

    public void setRetornoStatus(List<Integer> retornoStatus) {
        this.retornoStatus = retornoStatus;
    }

}
