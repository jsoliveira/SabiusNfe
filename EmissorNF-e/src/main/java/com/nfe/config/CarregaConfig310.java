package com.nfe.config;

import com.emissor.nfe310.NFeConfig;
import com.emissor.nfe310.classes.NFAmbiente;
import com.emissor.nfe310.classes.NFTipoEmissao;
import com.emissor.nfe310.classes.NFTipoImpressao;
import com.emissor.nfe310.classes.NFUnidadeFederativa;
import com.emissor.nfe310.classes.lote.envio.NFLoteIndicadorProcessamento;
import com.emissor.nfe310.webservices.WSFacade;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Rodrigo Monteiro
 */
public class CarregaConfig310 {

    public static NFeConfig config;

    public static WSFacade getConfig() throws IOException {

        config = new NFeConfig() {

            //pesquisar configuração no banco de dados e carregar nos campos!!!!!
            
            @Override
            public NFAmbiente getAmbiente() {
                return NFAmbiente.HOMOLOGACAO;
            }

            @Override
            public File getCertificado() throws IOException {
                return new File("C:/SabiosNF-e/Config/CERTIFICADO/AGROPECUARIA IPE 2014.pfx");
            }

            @Override
            public String getTipoCertificado() throws IOException {
                return "A1";
            }

            @Override
            public String getCertificadoSenha() {
                return "ITE@defesa";
            }

            @Override
            public NFUnidadeFederativa getCUF() {
                return NFUnidadeFederativa.PR;
            }

            @Override
            public NFTipoEmissao getTipoEmissao() {
                return NFTipoEmissao.EMISSAO_NORMAL;
            }

            @Override
            public File getCadeiaCertificados() throws IOException {

                return new File("C:/SabiosNF-e/NFeCacerts");
            }

            @Override
            public Integer getsslPort() throws IOException {

                return 443;
            }

            @Override
            public String getKeyStore() throws IOException {

                return "pkcs12";
            }

            @Override
            public NFTipoImpressao getTipoImpressao() throws IOException {

                return NFTipoImpressao.DANFE_NORMAL_RETRATO;
            }

            @Override
            public NFLoteIndicadorProcessamento getSincrono() throws IOException {
                return NFLoteIndicadorProcessamento.PROCESSAMENTO_SINCRONO;
            }

            @Override
            public String getArquivosXsd() throws IOException {
                return "com/emissor/nfe310/validadores/xsd/schemas";
            }

            @Override
            public String getLogEmissao() throws IOException {
                return "C:\\SabiosNF-e\\log";
            }

        };

        try {
            return new WSFacade(config);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Erro : " + ex);
            throw new IllegalStateException("Carga Parametros : " + ex);
        }

    }
}
