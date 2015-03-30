package com.nfe.control;

import com.emissor.nfe310.classes.NFRetornoStatus;
import com.emissor.nfe310.webservices.WSFacade;
import com.nfe.config.CarregaConfig310;
import com.nfe.model.ConsultaCadastro;
import com.nfe.model.ConsultaStatus;
import com.nfe.model.NFEnviaEventoInutilizacao;
import com.nfe.model.NFEventoLote;
import com.nfe.model.NFLoteEnvio;
import com.nfe.modelintegracao.Integracao;
import com.nfe.tools.ControleLogs;
import com.nfe.tools.ValidaCertificadoDigital;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo Monteiro
 */
public class GenericControl {

    public Integracao getProcesso(Integracao integracao) {
        try {
            WSFacade ws = initConf();
            initAplicacao(integracao);
            //fazer pase de objetos
            switch (integracao.getTpSolicitacao()) {
                case 0:

                    ConsultaStatus status = new ConsultaStatus();
                    status.setUf_consulta(integracao.getcServico().getUf());
                    //parse object
                    status = new StatusControl().getConsultaStatus(status, ws);
                    System.out.println(status.getRetstatus() + "-" + NFRetornoStatus.valueOfCodigo(status.getRetstatus()).getMotivo());

                    //parse integracao
                    break;
                case 1:
                    ConsultaCadastro consulta = new ConsultaCadastro();
                    consulta = new ConsultaCadastroControl().getConsultaCadastro(consulta, ws);
                    System.out.println(consulta.getRetornoStatus() + "-" + NFRetornoStatus.valueOfCodigo(consulta.getRetornoStatus()).getMotivo());
                    break;
                case 2: {

                    NFEnviaEventoInutilizacao inu = new NFEnviaEventoInutilizacao();

                    inu = new InutilizacaoControl().getInutilizacao(inu, ws);
                    inu.getRetstatus();
                    break;
                }
                case 3: {
                    NFLoteEnvio lote = new NFLoteEnvio();
                    lote = new EnvioLoteControl().getEnviaLote(lote, ws);
                    lote.getIdLote();
                }

                case 4: {
                    NFEventoLote loteEvento = new NFEventoLote();
                    //pesquisa notas fiscais existentes !

                    loteEvento = new CancelaControl().getCancelanota(loteEvento, ws);
                }

                case 5: {
                    NFLoteEnvio lote = new NFLoteEnvio();
                    lote = new ConsultaLoteControl().getConsultaLote(lote, ws);
                }

                case 6: {

                    new ConsultaNotaControl().getConsultaNota(integracao, ws);
                }
                case 7: {
                    NFEventoLote loteEvento = new NFEventoLote();
                    loteEvento = new CorrigeNotaControl().getCorrigeNota(loteEvento, ws);

                }

                case 8: {
                    new ConsultaNota2Control().getConsultaNota2(integracao);
                }

                default:
                    throw new IllegalStateException("Opção Invalida   : " + integracao);

            }
        } catch (Exception e) {
            e.printStackTrace();
            gravaLog(e.toString());
            List<String> mensagens = new ArrayList<>();
            integracao.setMensagens(mensagens);
            integracao.getMensagens().add(e.toString());
            return integracao;
        }

        return integracao;
    }

    private WSFacade initConf() {

        //buscar parametros no sistema e carrega para arquivo !
        WSFacade ws;
        try {
            ws = CarregaConfig310.getConfig();
        } catch (IOException ex) {

            throw new IllegalStateException("Erro ao carregar parametros  : " + ex);
        }
        return ws;
    }

    private void validaCertificadoDigital(String cnpj) throws Exception {

        //busca parametros pelo cnpj e dados certificado
        //buscar certificado valido para cnpj informado contribuinte
        ValidaCertificadoDigital.validaCertificado(CarregaConfig310.config.getCertificado().getAbsolutePath(), CarregaConfig310.config.getCertificadoSenha(), CarregaConfig310.config.getKeyStore());

    }

    private void initAplicacao(Integracao integracao) {
        try {
            validaCertificadoDigital(integracao.getCnpjPrincipal());
        } catch (Exception ex) {
            throw new IllegalStateException("Erro no certificado  : " + ex);
        }

        try {
            ControleLogs.gravaLogTxt("Recebido : " + integracao);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private void gravaLog(String e) {
        try {
            ControleLogs.gravaLogTxt(e);
        } catch (Exception ex) {
            System.out.println("Erro ao Gravar Log");
        }
    }

}
