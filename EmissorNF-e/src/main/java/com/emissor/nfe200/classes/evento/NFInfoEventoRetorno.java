package com.emissor.nfe200.classes.evento;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.joda.time.LocalDateTime;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import com.emissor.nfe200.classes.NFAmbiente;
import com.emissor.nfe200.classes.NFBase;
import com.emissor.nfe200.classes.NFUnidadeFederativa;

public class NFInfoEventoRetorno extends NFBase {

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name = "tpAmb", required = true)
    private NFAmbiente ambiente;

    @Element(name = "verAplic", required = true)
    private String versaoAplicativo;

    @Element(name = "cOrgao", required = false)
    private NFUnidadeFederativa orgao;

    @Element(name = "cStat", required = true)
    private Integer codigoStatus;

    @Element(name = "xMotivo", required = true)
    private String motivo;

    @Element(name = "chNFe", required = false)
    private String chave;

    @Element(name = "tpEvento", required = false)
    private String tipoEvento;

    @Element(name = "xEvento", required = false)
    private String descricaoEvento;

    @Element(name = "nSeqEvento", required = false)
    private Integer numeroSequencialEvento;

    @Element(name = "CNPJDest", required = false)
    private String cpnj;

    @Element(name = "CPFDest", required = false)
    private String cpf;

    @Element(name = "emailDest", required = false)
    private String email;

    @Element(name = "dhRegEvento", required = true)
    private String dataHoraRegistro;

    @Element(name = "nProt", required = false)
    private String numeroProtocolo;

    public String getId() {
        return this.id;
    }

    public NFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public String getVersaoAplicativo() {
        return this.versaoAplicativo;
    }

    public NFUnidadeFederativa getOrgao() {
        return this.orgao;
    }

    public Integer getCodigoStatus() {
        return this.codigoStatus;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public String getChave() {
        return this.chave;
    }

    public String getTipoEvento() {
        return this.tipoEvento;
    }

    public String getDescricaoEvento() {
        return this.descricaoEvento;
    }

    public Integer getNumeroSequencialEvento() {
        return this.numeroSequencialEvento;
    }

    public String getCpnj() {
        return this.cpnj;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public LocalDateTime getDataHoraRegistro() throws ParseException {
        return LocalDateTime.fromDateFields(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").parse(this.dataHoraRegistro));
    }

    public String getNumeroProtocolo() {
        return this.numeroProtocolo;
    }
}