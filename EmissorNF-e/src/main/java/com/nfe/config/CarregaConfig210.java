package com.nfe.config;

import com.emissor.nfe200.NFEConfig;
import com.emissor.nfe200.classes.NFAmbiente;
import com.emissor.nfe200.classes.NFTipoEmissao;
import com.emissor.nfe200.classes.NFTipoImpressao;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Rodrigo Monteiro
 */
public class CarregaConfig210 {

    public static com.emissor.nfe200.webservices.WSFacade getConf2() throws Exception {

        NFEConfig conf;

        conf = new NFEConfig() {

            @Override
            public NFAmbiente getAmbiente() {
                return NFAmbiente.valueOfCodigo(CarregaConfig310.config.getAmbiente().getCodigo());
            }

            @Override
            public File getCertificado() throws IOException {
                return CarregaConfig310.config.getCertificado().getAbsoluteFile();
            }

            @Override
            public File getCadeiaCertificados() throws IOException {
                return CarregaConfig310.config.getCadeiaCertificados().getAbsoluteFile();
            }

            @Override
            public String getCertificadoSenha() throws IOException{
                return CarregaConfig310.config.getCertificadoSenha();
            }

            @Override
            public com.emissor.nfe200.classes.NFUnidadeFederativa getCUF() throws IOException{
                return com.emissor.nfe200.classes.NFUnidadeFederativa.valueOfCodigo(CarregaConfig310.config.getCUF().getCodigo());
            }

            @Override
            public NFTipoEmissao getTipoEmissao() throws IOException {

                return NFTipoEmissao.valueOfCodigo(CarregaConfig310.config.getTipoEmissao().getCodigo());
            }

            @Override
            public Integer getsslPort() throws IOException {
                return CarregaConfig310.config.getsslPort();
            }

            @Override
            public String getKeyStore() throws IOException {
                return CarregaConfig310.config.getKeyStore();
            }

            @Override
            public NFTipoImpressao getTipoImpressao() throws IOException {
                return NFTipoImpressao.valueOfCodigo(CarregaConfig310.config.getTipoImpressao().getCodigo());
            }
        };

        try {
            return new com.emissor.nfe200.webservices.WSFacade(conf);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Erro : " + ex);
            throw new IllegalStateException("Carga Parametros : " + ex);
        }

    }
}
