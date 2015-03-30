package com.emissor.nfe310;

import java.io.File;
import java.io.IOException;

import com.emissor.nfe310.classes.NFAmbiente;
import com.emissor.nfe310.classes.NFTipoEmissao;
import com.emissor.nfe310.classes.NFTipoImpressao;
import com.emissor.nfe310.classes.NFUnidadeFederativa;
import com.emissor.nfe310.classes.lote.envio.NFLoteIndicadorProcessamento;

public interface NFeConfig {

    final static String VERSAO_NFE = "3.10";

    final static String NFE_NAMESPACE = "http://www.portalfiscal.inf.br/nfe";

    /**
     *
     * @return 
     */
    public NFAmbiente getAmbiente();

    public File getCertificado() throws IOException;

    public String getTipoCertificado() throws IOException;

    public File getCadeiaCertificados() throws IOException;

    public String getArquivosXsd() throws IOException;

    public String getCertificadoSenha() throws IOException;

    public NFUnidadeFederativa getCUF() throws IOException;

    public NFTipoEmissao getTipoEmissao() throws IOException;

    public Integer getsslPort() throws IOException;

    public String getKeyStore() throws IOException;

    public NFTipoImpressao getTipoImpressao() throws IOException;

    public NFLoteIndicadorProcessamento getSincrono() throws IOException;

    public String getLogEmissao() throws IOException;
}
