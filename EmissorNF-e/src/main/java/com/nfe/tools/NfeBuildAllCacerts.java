/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nfe.tools;

import com.nfe.config.CarregaConfig310;
import java.io.*;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.*;

/**
 *
 * @author Rodrigo
 */
public class NfeBuildAllCacerts {

    private static String JSSECACERTS;
    private static Integer ssl;
    private static final int TIMEOUT_WS = 30;

    public static void main(String[] args) {
        try {
            JSSECACERTS = CarregaConfig310.config.getCadeiaCertificados().getAbsolutePath();
            ssl = CarregaConfig310.config.getsslPort();
            char[] passphrase = "changeit".toCharArray();

            File file = new File(JSSECACERTS);
            if (file.isFile() == false) {
                char SEP = File.separatorChar;
                File dir = new File(System.getProperty("java.home") + SEP + "lib" + SEP + "security");
                file = new File(dir, JSSECACERTS);
                if (file.isFile() == false) {
                    file = new File(dir, "cacerts");
                }
            }

            info("| Loading KeyStore " + file + "...");
            InputStream in = new FileInputStream(file);
            KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
            ks.load(in, passphrase);
            in.close();

            /**
             * AM - 2.00: homnfe.sefaz.am.gov.br BA - 2.00: hnfe.sefaz.ba.gov.br
             * CE - 2.00: nfeh.sefaz.ce.gov.br GO - 2.00:
             * homolog.sefaz.go.gov.br MG - 2.00: hnfe.fazenda.mg.gov.br MS -
             * 2.00: homologacao.nfe.ms.gov.br MT - 2.00:
             * homologacao.sefaz.mt.gov.br PE - 2.00: nfehomolog.sefaz.pe.gov.br
             * PR - 2.00: homologacao.nfe2.fazenda.pr.gov.br RS - 2.00:
             * homologacao.nfe.sefaz.rs.gov.br SP - 2.00:
             * homologacao.nfe.fazenda.sp.gov.br SCAN - 2.00:
             * hom.nfe.fazenda.gov.br SVAN - 2.00:
             * hom.sefazvirtual.fazenda.gov.br SVRS - 2.00:
             * homologacao.nfe.sefazvirtual.rs.gov.br
             */
            get("homnfe.sefaz.am.gov.br", ssl, ks);
            get("hnfe.sefaz.ba.gov.br", ssl, ks);
            get("nfeh.sefaz.ce.gov.br", ssl, ks);
            get("homolog.sefaz.go.gov.br", ssl, ks);
            get("hnfe.fazenda.mg.gov.br", ssl, ks);
            get("homologacao.nfe.ms.gov.br", ssl, ks);
            get("homologacao.sefaz.mt.gov.br", ssl, ks);
            get("nfehomolog.sefaz.pe.gov.br", ssl, ks);
            get("homologacao.nfe2.fazenda.pr.gov.br", ssl, ks);
            get("homologacao.nfe.sefaz.rs.gov.br", ssl, ks);
            get("homologacao.nfe.fazenda.sp.gov.br", ssl, ks);
            get("hom.nfe.fazenda.gov.br", ssl, ks);
            get("hom.sefazvirtual.fazenda.gov.br", ssl, ks);
            get("homologacao.nfe.sefazvirtual.rs.gov.br", ssl, ks);

            get("www.nfe.fazenda.gov.br", ssl, ks);
            get("nfe.sefazvirtual.rs.gov.br", ssl, ks);
            get("www.svc.fazenda.gov.br", ssl, ks);
            get("nfe.sefazvirtual.rs.gov.br", ssl, ks);
            get("www.sefazvirtual.fazenda.gov.br", ssl, ks);
            get("nfe.fazenda.sp.gov.br", ssl, ks);
            get("nfe.sefaz.rs.gov.br", ssl, ks);
            get("nfe.fazenda.pr.gov.br", ssl, ks);
            get("nfe.sefaz.pe.gov.br", ssl, ks);
            get("nfe.sefaz.mt.gov.br", ssl, ks);
            get("nfe.fazenda.ms.gov.br", ssl, ks);
            get("sistemas.sefaz.ma.gov.br", ssl, ks);
            get("nfe.fazenda.mg.gov.br", ssl, ks);
            get("nfe.sefaz.go.gov.br", ssl, ks);
            get("nfe.sefaz.ce.gov.br", ssl, ks);
            get("nfe.sefaz.ba.gov.br", ssl, ks);
            get("nfe.sefaz.am.gov.br", ssl, ks);

            File cafile = new File(JSSECACERTS);
            OutputStream out = new FileOutputStream(cafile);
            ks.store(out, passphrase);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void get(String host, int port, KeyStore ks) throws Exception {

        System.out.println("\n\nHost : " + host);
        SSLContext context = SSLContext.getInstance("TLS");
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(
                TrustManagerFactory.getDefaultAlgorithm());
        tmf.init(ks);
        X509TrustManager defaultTrustManager = (X509TrustManager) tmf.getTrustManagers()[0];
        SavingTrustManager tm = new SavingTrustManager(defaultTrustManager);
        context.init(null, new TrustManager[]{tm}, null);
        SSLSocketFactory factory = context.getSocketFactory();

        info("| Opening connection to " + host + ":" + port + "...");
        SSLSocket socket = (SSLSocket) factory.createSocket(host, port);
        socket.setSoTimeout(TIMEOUT_WS * 1000);
        try {
            info("| Starting SSL handshake...");
            socket.startHandshake();
            socket.close();
            info("| No errors, certificate is already trusted");
        } catch (SSLHandshakeException e) {
            /**
             * PKIX path building failed:
             * sun.security.provider.certpath.SunCertPathBuilderException:
             * unable to find valid certification path to requested target Não
             * tratado, pois sempre ocorre essa exceção quando o cacerts nao
             * esta gerado.
             */
        } catch (SSLException e) {
            error("| " + e.toString());
        }

        X509Certificate[] chain = tm.chain;
        if (chain == null) {
            info("| Could not obtain server certificate chain");
        }

        info("| Server sent " + chain.length + " certificate(s):");
        MessageDigest sha1 = MessageDigest.getInstance("SHA1");
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        for (int i = 0; i < chain.length; i++) {
            X509Certificate cert = chain[i];
            sha1.update(cert.getEncoded());
            md5.update(cert.getEncoded());
            String alias = host + "-" + (i);
            ks.setCertificateEntry(alias, cert);
            info("| Added certificate to keystore '" + JSSECACERTS + "' using alias '" + alias + "'");
        }
    }

    private static class SavingTrustManager implements X509TrustManager {

        private final X509TrustManager tm;
        private X509Certificate[] chain;

        SavingTrustManager(X509TrustManager tm) {
            this.tm = tm;
        }

        public X509Certificate[] getAcceptedIssuers() {
            throw new UnsupportedOperationException();
        }

        public void checkClientTrusted(X509Certificate[] chain, String authType)
                throws CertificateException {
            throw new UnsupportedOperationException();
        }

        public void checkServerTrusted(X509Certificate[] chain, String authType)
                throws CertificateException {
            this.chain = chain;
            tm.checkServerTrusted(chain, authType);
        }
    }

    private static void info(String log) {
        System.out.println("INFO: " + log);
    }

    private static void error(String log) {
        System.out.println("ERROR: " + log);
    }
}
