package com.nfe.model;

import com.nfe.model.pk.ConsultaCadastroPk;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author Rodrigo Monteiro
 */

@Entity
public class ConsultaCadastro implements Serializable{

    @EmbeddedId
    private ConsultaCadastroPk consultaCadastroPk;
    
    private Empresa empresa;

    private Integer retornoStatus;

    private String uf;
    
    private String cnpjConsultado;

    //retorno 
    private String retversao;
    
    private String retversaoAplicacao;
    
    private String retmotivo;
    
    private String retinscricaoEstadual;
    
    private String retcnpj;
    
    private String retcpf;
    
    private String retdataHoraProcessamento;
    
    private String retufAutorizadora;
    
    private List<NFRetornoSituacaoCadastral> retsituacaoCadastral;

    public ConsultaCadastro() {
    }

    public ConsultaCadastro(ConsultaCadastroPk consultaCadastroPk) {
        this.consultaCadastroPk = consultaCadastroPk;
    }

    public ConsultaCadastro(Long nrSeqCadastro, Long idEmpresa) {
        this.consultaCadastroPk = new ConsultaCadastroPk(Long.MIN_VALUE, Long.MIN_VALUE);
    }

    public ConsultaCadastroPk getConsultaCadastroPk() {
        return consultaCadastroPk;
    }

    public void setConsultaCadastroPk(ConsultaCadastroPk consultaCadastroPk) {
        this.consultaCadastroPk = consultaCadastroPk;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Integer getRetornoStatus() {
        return retornoStatus;
    }

    public void setRetornoStatus(Integer retornoStatus) {
        this.retornoStatus = retornoStatus;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCnpjConsultado() {
        return cnpjConsultado;
    }

    public void setCnpjConsultado(String cnpjConsultado) {
        this.cnpjConsultado = cnpjConsultado;
    }

    public String getRetversao() {
        return retversao;
    }

    public void setRetversao(String retversao) {
        this.retversao = retversao;
    }

    public String getRetversaoAplicacao() {
        return retversaoAplicacao;
    }

    public void setRetversaoAplicacao(String retversaoAplicacao) {
        this.retversaoAplicacao = retversaoAplicacao;
    }

    public String getRetmotivo() {
        return retmotivo;
    }

    public void setRetmotivo(String retmotivo) {
        this.retmotivo = retmotivo;
    }

    public String getRetinscricaoEstadual() {
        return retinscricaoEstadual;
    }

    public void setRetinscricaoEstadual(String retinscricaoEstadual) {
        this.retinscricaoEstadual = retinscricaoEstadual;
    }

    public String getRetcnpj() {
        return retcnpj;
    }

    public void setRetcnpj(String retcnpj) {
        this.retcnpj = retcnpj;
    }

    public String getRetcpf() {
        return retcpf;
    }

    public void setRetcpf(String retcpf) {
        this.retcpf = retcpf;
    }

    public String getRetdataHoraProcessamento() {
        return retdataHoraProcessamento;
    }

    public void setRetdataHoraProcessamento(String retdataHoraProcessamento) {
        this.retdataHoraProcessamento = retdataHoraProcessamento;
    }

    public String getRetufAutorizadora() {
        return retufAutorizadora;
    }

    public void setRetufAutorizadora(String retufAutorizadora) {
        this.retufAutorizadora = retufAutorizadora;
    }

    public List<NFRetornoSituacaoCadastral> getRetsituacaoCadastral() {
        return retsituacaoCadastral;
    }

    public void setRetsituacaoCadastral(List<NFRetornoSituacaoCadastral> retsituacaoCadastral) {
        this.retsituacaoCadastral = retsituacaoCadastral;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.consultaCadastroPk);
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
        final ConsultaCadastro other = (ConsultaCadastro) obj;
        if (!Objects.equals(this.consultaCadastroPk, other.consultaCadastroPk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConsultaCadastro{" + "consultaCadastroPk=" + consultaCadastroPk + ", empresa=" + empresa + ", retornoStatus=" + retornoStatus + ", uf=" + uf + ", cnpjConsultado=" + cnpjConsultado + ", retversao=" + retversao + ", retversaoAplicacao=" + retversaoAplicacao + ", retmotivo=" + retmotivo + ", retinscricaoEstadual=" + retinscricaoEstadual + ", retcnpj=" + retcnpj + ", retcpf=" + retcpf + ", retdataHoraProcessamento=" + retdataHoraProcessamento + ", retufAutorizadora=" + retufAutorizadora + ", retsituacaoCadastral=" + retsituacaoCadastral + '}';
    }

        
}
