package com.emissor.nfe200.classes.evento.cancelamento;

import org.simpleframework.xml.Element;

import com.emissor.nfe200.classes.evento.NFTipoEvento;
import com.emissor.nfe200.validadores.StringValidador;

public class NFInfoCancelamento extends NFTipoEvento {
    @Element(name = "nProt", required = true)
    private String protocoloAutorizacao;

    @Element(name = "xJust", required = true)
    private String justificativa;

    public void setJustificativa(final String justificativa) {
        StringValidador.tamanho15a256(justificativa);
        this.justificativa = justificativa;
    }

    public void setProtocoloAutorizacao(final String protocoloAutorizacao) {
        StringValidador.exatamente15N(protocoloAutorizacao);
        this.protocoloAutorizacao = protocoloAutorizacao;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    public String getProtocoloAutorizacao() {
        return this.protocoloAutorizacao;
    }
}