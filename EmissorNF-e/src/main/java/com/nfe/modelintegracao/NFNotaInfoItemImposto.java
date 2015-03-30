package com.nfe.modelintegracao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFNotaInfoItemImposto {

    private String valorTotalTributos;

    private NFNotaInfoItemImpostoICMS icms;

    private NFNotaInfoItemImpostoIPI ipi;

    private NFNotaInfoItemImpostoImportacao impostoImportacao;

    private NFNotaInfoItemImpostoISSQN issqn;

    private NFNotaInfoItemImpostoPIS pis;

    private NFNotaInfoItemImpostoPISST pisst;

    private NFNotaInfoItemImpostoCOFINS cofins;

    private NFNotaInfoItemImpostoCOFINSST cofinsst;

    public void setIcms(final NFNotaInfoItemImpostoICMS icms) {

        this.icms = icms;
    }

    public void setIpi(final NFNotaInfoItemImpostoIPI ipi) {

        this.ipi = ipi;
    }

    public void setImpostoImportacao(final NFNotaInfoItemImpostoImportacao impostoImportacao) {

        this.impostoImportacao = impostoImportacao;
    }

    public void setIssqn(final NFNotaInfoItemImpostoISSQN issqn) {
        this.issqn = issqn;
    }

    public void setPis(final NFNotaInfoItemImpostoPIS pis) {
        this.pis = pis;
    }

    public void setPisst(final NFNotaInfoItemImpostoPISST pisst) {
        this.pisst = pisst;
    }

    public void setCofins(final NFNotaInfoItemImpostoCOFINS cofins) {
        this.cofins = cofins;
    }

    public void setCofinsst(final NFNotaInfoItemImpostoCOFINSST cofinsst) {
        this.cofinsst = cofinsst;
    }

    public void setValorTotalTributos(final BigDecimal valorTotalTributos) {
        this.valorTotalTributos = String.valueOf(valorTotalTributos);
    }

    public String getValorTotalTributos() {
        return this.valorTotalTributos;
    }

    public NFNotaInfoItemImpostoICMS getIcms() {
        return this.icms;
    }

    public NFNotaInfoItemImpostoIPI getIpi() {
        return this.ipi;
    }

    public NFNotaInfoItemImpostoImportacao getImpostoImportacao() {
        return this.impostoImportacao;
    }

    public NFNotaInfoItemImpostoISSQN getIssqn() {
        return this.issqn;
    }

    public NFNotaInfoItemImpostoPIS getPis() {
        return this.pis;
    }

    public NFNotaInfoItemImpostoPISST getPisst() {
        return this.pisst;
    }

    public NFNotaInfoItemImpostoCOFINS getCofins() {
        return this.cofins;
    }

    public NFNotaInfoItemImpostoCOFINSST getCofinsst() {
        return this.cofinsst;
    }
}
