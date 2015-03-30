package com.emissor.nfe310.webservices;

import java.io.IOException;

import com.emissor.nfe310.NFeConfig;
import com.emissor.nfe310.classes.NFUnidadeFederativa;
import com.emissor.nfe310.classes.cadastro.NFRetornoConsultaCadastro;
import com.emissor.nfe310.classes.evento.NFEnviaEventoRetorno;
import com.emissor.nfe310.classes.evento.inutilizacao.NFRetornoEventoInutilizacao;
import com.emissor.nfe310.classes.lote.consulta.NFLoteConsultaRetorno;
import com.emissor.nfe310.classes.lote.envio.NFLoteEnvio;
import com.emissor.nfe310.classes.lote.envio.NFLoteEnvioRetorno;
import com.emissor.nfe310.classes.nota.consulta.NFNotaConsultaRetorno;
import com.emissor.nfe310.classes.statusservico.consulta.NFStatusServicoConsultaRetorno;
import com.emissor.nfe310.validadores.xsd.XMLValidador;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import org.apache.commons.httpclient.protocol.Protocol;
import com.nfe.tools.SocketFactoryDinamico;

public class WSFacade {

    private final WSLoteEnvio wsLoteEnvio;
    private final WSLoteConsulta wsLoteConsulta;
    private final WSStatusConsulta wsStatusConsulta;
    private final WSNotaConsulta wsNotaConsulta;
    private final WSCartaCorrecao wsCartaCorrecao;
    private final WSCancelamento wsCancelamento;
    private final WSConsultaCadastro wsConsultaCadastro;
    private final WSInutilizacao wsInutilizacao;

    public WSFacade(final NFeConfig config) throws IOException, KeyStoreException, NoSuchAlgorithmException, Exception {
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
        this.wsCartaCorrecao = new WSCartaCorrecao(config);
        this.wsCancelamento = new WSCancelamento(config);
        this.wsConsultaCadastro = new WSConsultaCadastro(config);
        this.wsInutilizacao = new WSInutilizacao(config);
    }

    public NFLoteEnvioRetorno enviaLote(final NFLoteEnvio lote) throws Exception {
        XMLValidador.validaNota(lote.toString());
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

    public NFEnviaEventoRetorno corrigeNota(final String chaveDeAcesso, final String textoCorrecao) throws Exception {
        return this.wsCartaCorrecao.corrigeNota(chaveDeAcesso, textoCorrecao);
    }

    public NFEnviaEventoRetorno cancelaNota(final String chaveAcesso, final String numeroProtocolo, final String motivo) throws Exception {
        return this.wsCancelamento.cancelaNota(chaveAcesso, numeroProtocolo, motivo);
    }

    public NFRetornoEventoInutilizacao inutilizaNota(final int anoInutilizacaoNumeracao, final String cnpjEmitente, final String serie, final String numeroInicial, final String numeroFinal, final String justificativa) throws Exception {
        return this.wsInutilizacao.inutilizaNota(anoInutilizacaoNumeracao, cnpjEmitente, serie, numeroInicial, numeroFinal, justificativa);
    }

    public NFRetornoConsultaCadastro consultaCadastro(final String cnpj, final NFUnidadeFederativa uf) throws Exception {
        return this.wsConsultaCadastro.consultaCadastro(cnpj, uf);
    }
}
