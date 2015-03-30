package com.emissor.nfe200;

import java.io.File;
import java.io.IOException;

import com.emissor.nfe200.classes.NFAmbiente;
import com.emissor.nfe200.classes.NFTipoEmissao;
import com.emissor.nfe200.classes.NFUnidadeFederativa;
import com.emissor.nfe200.classes.NFTipoImpressao;

public interface NFEConfig {

    final static String VERSAO_NFE = "2.00";

    final static String NFE_NAMESPACE = "http://www.portalfiscal.inf.br/nfe";

    public NFAmbiente getAmbiente();

    public File getCertificado() throws IOException;

    public File getCadeiaCertificados() throws IOException;

    public String getCertificadoSenha() throws IOException;

    public NFUnidadeFederativa getCUF() throws IOException;

    public NFTipoEmissao getTipoEmissao() throws IOException;

    public Integer getsslPort() throws IOException;

    public String getKeyStore() throws IOException;

    public NFTipoImpressao getTipoImpressao() throws IOException;
}
