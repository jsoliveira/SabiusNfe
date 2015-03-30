package com.nfe.modelintegracao;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImpostoIPI {

    private String classeEnquadramento;

    private String cnpjProdutor;

    private String codigoSelo;

    private BigInteger quantidadeSelo;

    private String codigoEnquadramento;

    private NFNotaInfoItemImpostoIPITributado tributado;

    private NFNotaInfoItemImpostoIPINaoTributado naoTributado;

    public NFNotaInfoItemImpostoIPI() {
        this.classeEnquadramento = null;
        this.cnpjProdutor = null;
        this.codigoSelo = null;
        this.quantidadeSelo = null;
        this.codigoEnquadramento = null;
        this.tributado = null;
        this.naoTributado = null;
    }

    public void setClasseEnquadramento(final String classeEnquadramento) {

        this.classeEnquadramento = classeEnquadramento;
    }

    public void setCnpjProdutor(final String cnpjProdutor) {

        this.cnpjProdutor = cnpjProdutor;
    }

    public void setCodigoSelo(final String codigoSelo) {

        this.codigoSelo = codigoSelo;
    }

    public void setQuantidadeSelo(final BigInteger quantidadeSelo) {

        this.quantidadeSelo = quantidadeSelo;
    }

    public void setCodigoEnquadramento(final String codigoEnquadramento) {

        this.codigoEnquadramento = codigoEnquadramento;
    }

    public void setTributado(final NFNotaInfoItemImpostoIPITributado tributado) {
        if (this.naoTributado != null) {
            throw new IllegalStateException("IPI tributado e nao tributado sao mutuamente exclusivos");
        }
        this.tributado = tributado;
    }

    public void setNaoTributado(final NFNotaInfoItemImpostoIPINaoTributado naoTributado) {
        if (this.tributado != null) {
            throw new IllegalStateException("IPI tributado e nao tributado sao mutuamente exclusivos");
        }
        this.naoTributado = naoTributado;
    }

    public String getClasseEnquadramento() {
        return this.classeEnquadramento;
    }

    public String getCnpjProdutor() {
        return this.cnpjProdutor;
    }

    public String getCodigoSelo() {
        return this.codigoSelo;
    }

    public BigInteger getQuantidadeSelo() {
        return this.quantidadeSelo;
    }

    public String getCodigoEnquadramento() {
        return this.codigoEnquadramento;
    }

    public NFNotaInfoItemImpostoIPITributado getTributado() {
        return this.tributado;
    }

    public NFNotaInfoItemImpostoIPINaoTributado getNaoTributado() {
        return this.naoTributado;
    }
}
