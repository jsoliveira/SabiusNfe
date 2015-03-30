package com.emissor.nfe200.webservices;

import java.io.IOException;

import com.emissor.nfe200.NFEConfig;
import com.emissor.nfe200.classes.NFUnidadeFederativa;
import com.emissor.nfe200.classes.lote.consulta.NFLoteConsultaRetorno;
import com.emissor.nfe200.classes.lote.envio.NFLoteEnvio;
import com.emissor.nfe200.classes.lote.envio.NFLoteEnvioRetorno;
import com.emissor.nfe200.classes.nota.consulta.NFNotaConsultaRetorno;
import com.emissor.nfe200.classes.statusservico.consulta.NFStatusServicoConsultaRetorno;
import com.emissor.nfe200.validadores.xsd.XMLValidador;
import com.nfe.tools.SocketFactoryDinamico;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import org.apache.commons.httpclient.protocol.Protocol;

public class WSFacade {

    private final WSLoteEnvio wsLoteEnvio;
    private final WSLoteConsulta wsLoteConsulta;
    private final WSStatusConsulta wsStatusConsulta;
    private final WSNotaConsulta wsNotaConsulta;

    public WSFacade(final NFEConfig config) throws IOException, KeyStoreException, NoSuchAlgorithmException, Exception {
//        System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
//        System.setProperty("javax.net.ssl.trustStoreType", "JKS");
//        System.setProperty("javax.net.ssl.trustStore", config.getCadeiaCertificados().getAbsolutePath());
//        System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
//        System.setProperty("javax.net.ssl.keyStore", config.getCertificado().getAbsolutePath());
//        System.setProperty("javax.net.ssl.keyStorePassword", config.getCertificadoSenha());

        InputStream entrada = new FileInputStream(config.getCertificado());

        KeyStore ks = KeyStore.getInstance(config.getKeyStore());
        try {
            ks.load(entrada, config.getCertificadoSenha().toCharArray());
        } catch (IOException e) {
            throw new Exception("Senha do Certificado Digital esta incorreta ou Certificado inválido.");
        }

        String alias = "";

        Enumeration<String> aliasesEnum = ks.aliases();
        while (aliasesEnum.hasMoreElements()) {
            alias = (String) aliasesEnum.nextElement();
            if (ks.isKeyEntry(alias)) {
                break;
            }
        }

        X509Certificate certificate = (X509Certificate) ks.getCertificate(alias);
        PrivateKey privateKey = (PrivateKey) ks.getKey(alias, config.getCertificadoSenha().toCharArray());
        SocketFactoryDinamico socketFactoryDinamico = new SocketFactoryDinamico(certificate, privateKey);
        socketFactoryDinamico.setFileCacerts(config.getCadeiaCertificados().getAbsolutePath());

        Protocol protocol = new Protocol("https", socketFactoryDinamico, config.getsslPort());
        Protocol.registerProtocol("https", protocol);

        this.wsLoteEnvio = new WSLoteEnvio(config);
        this.wsLoteConsulta = new WSLoteConsulta(config);
        this.wsStatusConsulta = new WSStatusConsulta(config);
        this.wsNotaConsulta = new WSNotaConsulta(config);
    }

    public NFLoteEnvioRetorno enviaLote(final NFLoteEnvio lote) throws Exception {
        XMLValidador.validaLote(lote.toString());
        return this.wsLoteEnvio.enviaLote(lote);
    }

    public NFLoteConsultaRetorno consultaLote(final String numeroRecibo) throws Exception {
        return this.wsLoteConsulta.consultaLote(numeroRecibo);
    }

    public NFStatusServicoConsultaRetorno consultaStatus(final NFUnidadeFederativa uf) throws Exception {
        return this.wsStatusConsulta.consultaStatus(uf);
    }

    public NFNotaConsultaRetorno consultaNota(final String chaveDeAcesso) throws Exception {
        return this.wsNotaConsulta.consultaNota(chaveDeAcesso);
    }
}
