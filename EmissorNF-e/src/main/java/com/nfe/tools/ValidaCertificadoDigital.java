package com.nfe.tools;

import com.nfe.config.CarregaConfig310;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.primefaces.model.UploadedFile;

/**
 *
 * @author jsoliveira
 */
public class ValidaCertificadoDigital implements Serializable {

    private static String nmCertificado;
    private static String emissorCertficado;
    private static String dtInicio;
    private static String dtVencimento;
    private static String cnpj;
    private static String keyStore;
    private static String senha;
    private static String tpAssinatura;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    //"PKCS12"
    //"ITE@defesa"
    public static void validaCertificado(String localDoArquivo, String senha, String keyStore) throws KeyStoreException, FileNotFoundException, IOException, NoSuchAlgorithmException, CertificateException {

        setKeyStore(keyStore);
        setSenha(senha);

        ////  String fileName = "D:\\BackUp\\AGROPECUARIA-IPE-2012.pfx";
        String fileName = localDoArquivo;

        KeyStore ks = KeyStore.getInstance(keyStore);
        FileInputStream fis = new FileInputStream(fileName);

        //load the keystore  
        ks.load(fis, senha.toCharArray());

        /// String alias = "agropecuaria ipe ltda:3548967";
        System.out.println(ks);
        Enumeration<String> aliasesEnum = ks.aliases();
        while (aliasesEnum.hasMoreElements()) {

            System.out.println("Certificado");

            String alias = aliasesEnum.nextElement();
            System.out.println("Alias: " + alias);

            X509Certificate certif = (X509Certificate) ks.getCertificate(alias);
            System.out.println("SN =     " + certif.getSerialNumber().toString(16));

            String certificador = certif.getIssuerDN().toString();
            System.out.println("Issuer = " + certificador);

            String dadosEmpresa = certif.getSubjectDN().toString();
            System.out.println("subject= " + dadosEmpresa);

            String sigla = certif.getSigAlgName().toString();
            System.out.println("sigalgname " + sigla);

            keyStore = certif.getSigAlgName().toString();
            System.out.println("sigalgname " + sigla);

            dtInicio = dateFormat.format(certif.getNotBefore());
            dtVencimento = dateFormat.format(certif.getNotAfter());

            System.out.println("Data de Inicio : " + dtInicio);
            System.out.println("Data de Vencimento : " + dtVencimento);

            setNmCertificado(alias.toUpperCase());
            setEmissorCertficado(certificador.substring(certificador.indexOf("CN=") + 3, certificador.indexOf(",")).toUpperCase());
            setTpAssinatura(CarregaConfig310.config.getTipoCertificado());//recuperar do 
            setCnpj(cnpj);//recuperar cnpj do certificado!
            setDtInicio(dtInicio);
            setDtVencimento(dtVencimento);

            try {
                if (dateFormat.parse(dtInicio).after(new Date())) {
                    throw new IllegalStateException("Certificado com data de Inicio superior ao periodo  : " + dtInicio);
                }

                ///  JOptionPane.showMessageDialog(null, getNmCertificado() + " " + getEmissorCertficado() + " " + getDtValCertificado());
            } catch (ParseException ex) {
                throw new IllegalStateException("Erro ao converter data Inicial Certificado Validação  : " + ex);
            }

            try {
                if (dateFormat.parse(dtVencimento).before(new Date())) {
                    throw new IllegalStateException("Certificado com data inferior ao periodo  : " + dtInicio);
                }

                ///  JOptionPane.showMessageDialog(null, getNmCertificado() + " " + getEmissorCertficado() + " " + getDtValCertificado());
            } catch (ParseException ex) {
                throw new IllegalStateException("Erro ao converter data Inicial Certificado Validação  : " + ex);
            }
        }

    }

//    public boolean validaCertificado(UploadedFile arq, String senha, String keyStore) {
//
//        try {
//
//            setKeyStore(keyStore);
//            setSenha(senha);
//
//            ////  String fileName = "D:\\BackUp\\AGROPECUARIA-IPE-2012.pfx";
//            KeyStore ks = KeyStore.getInstance(keyStore);
//            InputStream fis = arq.getInputstream();
//
//            //load the keystore  
//            ks.load(fis, senha.toCharArray());
//
//            /// String alias = "agropecuaria ipe ltda:3548967";
//            System.out.println(ks);
//            Enumeration<String> aliasesEnum = ks.aliases();
//            while (aliasesEnum.hasMoreElements()) {
//
//                System.out.println("Certificado");
//
//                String alias = aliasesEnum.nextElement();
//                System.out.println("Alias: " + alias);
//
//                X509Certificate certif = (X509Certificate) ks.getCertificate(alias);
//                System.out.println("SN =     " + certif.getSerialNumber().toString(16));
//
//                String certificador = certif.getIssuerDN().toString();
//                System.out.println("Issuer = " + certificador);
//
//                String dadosEmpresa = certif.getSubjectDN().toString();
//                System.out.println("subject= " + dadosEmpresa);
//
//                String sigla = certif.getSigAlgName().toString();
//                System.out.println("sigalgname " + sigla);
//
//                keyStore = certif.getSigAlgName().toString();
//                System.out.println("sigalgname " + sigla);
//
//                dtInicio = dateFormat.format(certif.getNotBefore());
//                dtVencimento = dateFormat.format(certif.getNotAfter());
//
//                setNmCertificado(alias.toUpperCase());
//                String emissor = certificador.substring(certificador.indexOf("CN=") + 3, certificador.indexOf(",")).toUpperCase();
//                setEmissorCertficado(emissor);
//                setTpAssinatura("A1");//recuperar do 
//                setCnpj(cnpj);//recuperar cnpj do certificado!
//                setDtInicio(dtInicio);
//                setDtVencimento(dtVencimento);
//
//                ///  JOptionPane.showMessageDialog(null, getNmCertificado() + " " + getEmissorCertficado() + " " + getDtValCertificado());
//            }
//
//            return true;
//        } catch (KeyStoreException ex) {
//            Logger.getLogger(ValidaCertificadoDigital.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ValidaCertificadoDigital.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        } catch (IOException ex) {
//            Logger.getLogger(ValidaCertificadoDigital.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        } catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(ValidaCertificadoDigital.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        } catch (CertificateException ex) {
//            Logger.getLogger(ValidaCertificadoDigital.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//
//    }
    public static String getNmCertificado() {
        return nmCertificado;
    }

    public static void setNmCertificado(String nmCertificado) {
        ValidaCertificadoDigital.nmCertificado = nmCertificado;
    }

    public static String getEmissorCertficado() {
        return emissorCertficado;
    }

    public static void setEmissorCertficado(String emissorCertficado) {
        ValidaCertificadoDigital.emissorCertficado = emissorCertficado;
    }

    public static String getDtInicio() {
        return dtInicio;
    }

    public static void setDtInicio(String dtInicio) {
        ValidaCertificadoDigital.dtInicio = dtInicio;
    }

    public static String getDtVencimento() {
        return dtVencimento;
    }

    public static void setDtVencimento(String dtVencimento) {
        ValidaCertificadoDigital.dtVencimento = dtVencimento;
    }

    public static String getCnpj() {
        return cnpj;
    }

    public static void setCnpj(String cnpj) {
        ValidaCertificadoDigital.cnpj = cnpj;
    }

    public static String getKeyStore() {
        return keyStore;
    }

    public static void setKeyStore(String keyStore) {
        ValidaCertificadoDigital.keyStore = keyStore;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        ValidaCertificadoDigital.senha = senha;
    }

    public static String getTpAssinatura() {
        return tpAssinatura;
    }

    public static void setTpAssinatura(String tpAssinatura) {
        ValidaCertificadoDigital.tpAssinatura = tpAssinatura;
    }

}
