package com.nfe.control;

import com.emissor.nfe310.webservices.WSFacade;
import com.emissor.nfe310.classes.NFUnidadeFederativa;
import com.emissor.nfe310.classes.cadastro.NFRetornoConsultaCadastro;
import com.emissor.nfe310.classes.cadastro.NFRetornoConsultaCadastroSituacaoCadastral;
import com.nfe.model.ConsultaCadastro;
import com.nfe.model.NFRetornoSituacaoCadastral;

/**
 *
 * @author Rodrigo Monteiro
 */
public class ConsultaCadastroControl {

    public ConsultaCadastro getConsultaCadastro(ConsultaCadastro cadastro, WSFacade ws) {

        try {

            //grava solicitacao
            NFRetornoConsultaCadastro retorno = ws.consultaCadastro(cadastro.getCnpjConsultado(), NFUnidadeFederativa.valueOfCodigo(cadastro.getUf()));
            System.out.println(retorno.getDados().getStatusResposta());
            System.out.println(retorno.getDados().getMotivo());

            cadastro = parseObjet(retorno);

        } catch (Exception ex) {

            throw new IllegalStateException("Erro ao consultar cadastro  : " + ex);
        }

        return cadastro;

    }

    private ConsultaCadastro parseObjet(NFRetornoConsultaCadastro retorno) {
        ConsultaCadastro cadastro = new ConsultaCadastro();
        cadastro.setRetcnpj(retorno.getDados().getCnpj());
        cadastro.setRetcpf(retorno.getDados().getCpf());
        cadastro.setRetdataHoraProcessamento(String.valueOf(retorno.getDados().getDataHoraProcessamento()));
        cadastro.setRetinscricaoEstadual(retorno.getDados().getInscricaoEstadual());
        cadastro.setRetmotivo(retorno.getDados().getMotivo());
        cadastro.setRetornoStatus(Integer.parseInt(retorno.getDados().getStatusResposta()));

        for (int i = 0; i < 10; i++) {
            NFRetornoConsultaCadastroSituacaoCadastral situacao = retorno.getDados().getSituacaoCadastral().get(i);

            NFRetornoSituacaoCadastral ret = new NFRetornoSituacaoCadastral();
            //preencher a partir do situacao cadastral
            ret.setBairro(situacao.getEndereco().getBairro());
            ret.setCep(situacao.getEndereco().getCep());
            ret.setCnaePrincipalContribuinte(situacao.getCnaePrincipalContribuinte());
            ret.setCnpj(situacao.getCnpj());
            ret.setCodigoMunicipio(situacao.getEndereco().getCodigoMunicipio());
            ret.setComplemento(situacao.getEndereco().getComplemento());
            ret.setCpf(situacao.getCpf());
            ret.setDataInicioAtividade(situacao.getDataInicioAtividade());
            ret.setDataOcorrenciaBaixa(situacao.getDataOcorrenciaBaixa());
            ret.setDataUltimaModificacaoSituacaoCadastral(situacao.getDataUltimaModificacaoSituacaoCadastral());
            ret.setDescricaoMunicipio(situacao.getEndereco().getDescricaoMunicipio());
            ret.setIndicadorContribuinteNFe(situacao.getIndicadorContribuinteNFe().getCodigo());
            ret.setIndicaodrContribuinteCTe(situacao.getIndicaodrContribuinteCTe().getCodigo());
            ret.setInscricaoEstadual(situacao.getInscricaoEstadual());
            ret.setInscricaoEstadualAtual(situacao.getInscricaoEstadualAtual());
            ret.setInscricaoEstadualUnica(situacao.getInscricaoEstadualUnica());
            ret.setLogradouro(situacao.getEndereco().getLogradouro());
            ret.setNomeFantasia(situacao.getNomeFantasia());
            ret.setNumero(situacao.getEndereco().getNumero());
            ret.setRazaoSocial(situacao.getRazaoSocial());
            ret.setRegimeApuracaoICMSContribuinte(situacao.getRegimeApuracaoICMSContribuinte());
            ret.setSituacaoContribuinte(situacao.getSituacaoContribuinte().getCodigo());
            ret.setUf(situacao.getUf().getCodigoIbge());

            cadastro.getRetsituacaoCadastral().add(ret);
        }

        cadastro.setRetufAutorizadora(retorno.getDados().getUfAutorizadora().getCodigoIbge());
        cadastro.setRetversao(retorno.getVersao());
        cadastro.setRetversaoAplicacao(retorno.getDados().getVersaoAplicacao());

        return cadastro;
    }

}
