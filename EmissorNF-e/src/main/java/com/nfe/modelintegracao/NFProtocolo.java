package com.nfe.modelintegracao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NFProtocolo {

    private String versao;

    private NFProtocoloInfo protocoloInfo;

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public void setProtocoloInfo(final NFProtocoloInfo protocoloInfo) {
        this.protocoloInfo = protocoloInfo;
    }

    public NFProtocoloInfo getProtocoloInfo() {
        return this.protocoloInfo;
    }

    public String getVersao() {
        return this.versao;
    }
}
