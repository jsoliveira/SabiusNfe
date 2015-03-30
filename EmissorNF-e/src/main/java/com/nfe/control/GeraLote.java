
package com.nfe.control;

import com.sabios.nfe.control.teste.ConfiguracaoTeste;
import com.emissor.nfe310.NFeConfig;
import com.emissor.nfe310.classes.NFAmbiente;
import com.emissor.nfe310.classes.NFEndereco;
import com.emissor.nfe310.classes.NFFinalidade;
import com.emissor.nfe310.classes.NFFormaPagamentoPrazo;
import com.emissor.nfe310.classes.NFModalidadeFrete;
import com.emissor.nfe310.classes.NFNotaInfoCombustivelTipo;
import com.emissor.nfe310.classes.NFNotaInfoEspecieVeiculo;
import com.emissor.nfe310.classes.NFNotaInfoItemProdutoArmamentoTipo;
import com.emissor.nfe310.classes.NFNotaInfoItemProdutoVeiculoCondicao;
import com.emissor.nfe310.classes.NFNotaInfoItemProdutoVeiculoCondicaoChassi;
import com.emissor.nfe310.classes.NFNotaInfoItemProdutoVeiculoRestricao;
import com.emissor.nfe310.classes.NFNotaInfoItemProdutoVeiculoTipoOperacao;
import com.emissor.nfe310.classes.NFNotaInfoSituacaoTributariaCOFINS;
import com.emissor.nfe310.classes.NFNotaInfoSituacaoTributariaIPI;
import com.emissor.nfe310.classes.NFNotaInfoSituacaoTributariaPIS;
import com.emissor.nfe310.classes.NFNotaInfoTipoVeiculo;
import com.emissor.nfe310.classes.NFNotaInfoVeiculoCor;
import com.emissor.nfe310.classes.NFNotaSituacaoOperacionalSimplesNacional;
import com.emissor.nfe310.classes.NFOrigem;
import com.emissor.nfe310.classes.NFOrigemProcesso;
import com.emissor.nfe310.classes.NFProcessoEmissor;
import com.emissor.nfe310.classes.NFProdutoCompoeValorNota;
import com.emissor.nfe310.classes.NFRegimeTributario;
import com.emissor.nfe310.classes.NFTipo;
import com.emissor.nfe310.classes.NFTipoEmissao;
import com.emissor.nfe310.classes.NFTipoImpressao;
import com.emissor.nfe310.classes.NFUnidadeFederativa;
import com.emissor.nfe310.classes.lote.envio.NFLoteEnvio;
import com.emissor.nfe310.classes.nota.NFFormaImportacaoIntermediacao;
import com.emissor.nfe310.classes.nota.NFFormaPagamentoMoeda;
import com.emissor.nfe310.classes.nota.NFIdentificadorLocalDestinoOperacao;
import com.emissor.nfe310.classes.nota.NFIndicadorIEDestinatario;
import com.emissor.nfe310.classes.nota.NFIndicadorPresencaComprador;
import com.emissor.nfe310.classes.nota.NFInfoCupomFiscalReferenciado;
import com.emissor.nfe310.classes.nota.NFInfoModelo1Por1AReferenciada;
import com.emissor.nfe310.classes.nota.NFInfoProdutorRuralReferenciada;
import com.emissor.nfe310.classes.nota.NFInfoReferenciada;
import com.emissor.nfe310.classes.nota.NFNota;
import com.emissor.nfe310.classes.nota.NFNotaInfo;
import com.emissor.nfe310.classes.nota.NFNotaInfoAvulsa;
import com.emissor.nfe310.classes.nota.NFNotaInfoCana;
import com.emissor.nfe310.classes.nota.NFNotaInfoCanaDeducao;
import com.emissor.nfe310.classes.nota.NFNotaInfoCanaFornecimentoDiario;
import com.emissor.nfe310.classes.nota.NFNotaInfoCobranca;
import com.emissor.nfe310.classes.nota.NFNotaInfoCompra;
import com.emissor.nfe310.classes.nota.NFNotaInfoDestinatario;
import com.emissor.nfe310.classes.nota.NFNotaInfoDuplicata;
import com.emissor.nfe310.classes.nota.NFNotaInfoEmitente;
import com.emissor.nfe310.classes.nota.NFNotaInfoExportacao;
import com.emissor.nfe310.classes.nota.NFNotaInfoFatura;
import com.emissor.nfe310.classes.nota.NFNotaInfoICMSTotal;
import com.emissor.nfe310.classes.nota.NFNotaInfoIdentificacao;
import com.emissor.nfe310.classes.nota.NFNotaInfoInformacoesAdicionais;
import com.emissor.nfe310.classes.nota.NFNotaInfoItem;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemDetalheExportacao;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemExportacaoIndireta;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemImposto;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemImpostoCOFINS;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemImpostoCOFINSNaoTributavel;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemImpostoICMS;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemImpostoICMSSN500;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemImpostoIPI;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemImpostoIPINaoTributado;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemImpostoPIS;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemImpostoPISNaoTributado;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemProduto;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemProdutoArmamento;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemProdutoCombustivel;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemProdutoCombustivelCIDE;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemProdutoDeclaracaoImportacao;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemProdutoMedicamento;
import com.emissor.nfe310.classes.nota.NFNotaInfoItemProdutoVeiculo;
import com.emissor.nfe310.classes.nota.NFNotaInfoLacre;
import com.emissor.nfe310.classes.nota.NFNotaInfoLocal;
import com.emissor.nfe310.classes.nota.NFNotaInfoObservacao;
import com.emissor.nfe310.classes.nota.NFNotaInfoPagamento;
import com.emissor.nfe310.classes.nota.NFNotaInfoProcessoReferenciado;
import com.emissor.nfe310.classes.nota.NFNotaInfoReboque;
import com.emissor.nfe310.classes.nota.NFNotaInfoTotal;
import com.emissor.nfe310.classes.nota.NFNotaInfoTransportador;
import com.emissor.nfe310.classes.nota.NFNotaInfoTransporte;
import com.emissor.nfe310.classes.nota.NFNotaInfoVolume;
import com.emissor.nfe310.classes.nota.NFOperacaoConsumidorFinal;
import com.emissor.nfe310.classes.nota.NFPessoaAutorizadaDownloadNFe;
import com.emissor.nfe310.classes.nota.NFViaTransporteInternacional;
import com.nfe.tools.GerarChaveAcessoNfe;
import com.nfe.tools.autoCompletar;
import com.nfe.config.CarregaConfig310;
import com.nfe.webservice.WebServiceSabios;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.LocalDateTime;

/**
 *
 * @author Rodrigo Monteiro
 */
public class GeraLote {

    public NFLoteEnvio getLote() throws IOException {
        NFLoteEnvio lote = new NFLoteEnvio();
        lote.setIdLote("1");
        lote.setVersao(NFeConfig.VERSAO_NFE);
        lote.setIndicadorProcessamento(CarregaConfig310.config.getSincrono());

        List<NFNota> notas = new ArrayList<>();
        notas.add(getNota());

        lote.setNotas(notas);

        return lote;
    }

    private NFNota getNota() throws IOException {

        NFNota nota = new NFNota();
        nota.setIdentificadorLocal(44);
        nota.setInfo(getInfoNota());

        return nota;
    }

    private NFNotaInfo getInfoNota() throws IOException {
        NFNotaInfo info = new NFNotaInfo();

        String chave = new GerarChaveAcessoNfe().gerarChave(ConfiguracaoTeste.cdUF.getCodigoIbge(), ConfiguracaoTeste.data, ConfiguracaoTeste.cnpj, ConfiguracaoTeste.mod, ConfiguracaoTeste.serie, CarregaConfig310.config.getTipoEmissao().getCodigo(), ConfiguracaoTeste.nNf, ConfiguracaoTeste.cNf);

        info.setIdentificador(chave);

        info.setIdentificacao(getIdentificacao());
        info.setEmitente(getEmitente());
        info.setDestinatario(getDestinatario());

//        info.getPagamentos().add(getPagamentos());
//        info.getPessoasAutorizadasDownloadNFe().add(getAutDowlondNFE());
//        info.setAvulsa(getAvulsa());
//        info.setCana(getCana());
//        info.setCobranca(getCobranca());
//        info.setCompra(getCompra());
//
//        info.setEntrega(getEntrega());
//        info.setExportacao(getExportacao());
        //info.setRetirada(getRetirada());
        info.setTotal(getTotal());
        info.setTransporte(getTransporte());
        info.setInformacoesAdicionais(getInfAdicionais());

        List<NFNotaInfoItem> itens = new ArrayList<>();
        itens.add(getItens());
        info.setItens(itens);

        info.setVersao(NFeConfig.VERSAO_NFE);
        info.setVersao(NFeConfig.VERSAO_NFE);

        return info;
    }

    private NFNotaInfoItem getItens() {
        NFNotaInfoItem nfNotaInfoItem = new NFNotaInfoItem();

        //-------------------------------------dados item----------------------------------
        nfNotaInfoItem.setNumeroItem(1);

        //-------------------------------------dados produto-------------------------------
        NFNotaInfoItemProduto nfNotaInfoItemProduto = new NFNotaInfoItemProduto();

//        nfNotaInfoItemProduto.getArmamentos().add(getArmamentos());
//        nfNotaInfoItemProduto.getDeclaracoesImportacao().add(getDeclaracaoImportacoes());
//        nfNotaInfoItemProduto.getDetalhesExportacao().add(getDetalhesImportacao());
//        nfNotaInfoItemProduto.getMedicamentos().add(getMedicamentos());
//        nfNotaInfoItemProduto.getNomeclaturaValorAduaneiroEstatistica().add("");
        nfNotaInfoItemProduto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        //nfNotaInfoItemProduto.setVeiculo(getVeiculo());
        //nfNotaInfoItemProduto.setCombustivel(getCombustivel());

        nfNotaInfoItemProduto.setCodigo("2");
        nfNotaInfoItemProduto.setCodigoDeBarras("");
        nfNotaInfoItemProduto.setCodigoDeBarrasTributavel("");
        nfNotaInfoItemProduto.setDescricao("Exemplo geracao XML JAXB");
        nfNotaInfoItemProduto.setExtipi(12);
        nfNotaInfoItemProduto.setNcm("58050020");
        nfNotaInfoItemProduto.setCfop("5102");

//        nfNotaInfoItemProduto.setNumeroControleFCI("111");
        //nfNotaInfoItemProduto.setNumeroPedidoCliente("222");
        //nfNotaInfoItemProduto.setNumeroPedidoItemCliente(12);
        //nfNotaInfoItemProduto.setNumeroRECOPI("");
        nfNotaInfoItemProduto.setQuantidadeComercial(new BigDecimal("1.00"));
        nfNotaInfoItemProduto.setQuantidadeTributavel(new BigDecimal("1.00"));
        nfNotaInfoItemProduto.setUnidadeComercial("UND");
        nfNotaInfoItemProduto.setUnidadeTributavel("UND");
        //nfNotaInfoItemProduto.setValorDesconto(BigDecimal.ZERO);
        //nfNotaInfoItemProduto.setValorFrete(BigDecimal.ZERO);
        //nfNotaInfoItemProduto.setValorOutrasDespesasAcessorias(BigDecimal.ZERO);
        //nfNotaInfoItemProduto.setValorSeguro(BigDecimal.ZERO);
        nfNotaInfoItemProduto.setValorTotalBruto(new BigDecimal("180.00"));
        nfNotaInfoItemProduto.setValorUnitario(new BigDecimal("180.00"));
        nfNotaInfoItemProduto.setValorUnitarioTributavel(new BigDecimal("180.00"));

        nfNotaInfoItem.setProduto(nfNotaInfoItemProduto);

        //-------------------------------------------dados imposto---------------------------------
        NFNotaInfoItemImposto nfNotaInfoItemImposto = new NFNotaInfoItemImposto();

        //
        //INICIO
        NFNotaInfoItemImpostoCOFINS nfNotaInfoItemImpostoCOFINS = new NFNotaInfoItemImpostoCOFINS();

//        NFNotaInfoItemImpostoCOFINSAliquota nfNotaInfoItemImpostoCOFINSAliquota = new NFNotaInfoItemImpostoCOFINSAliquota();
//        nfNotaInfoItemImpostoCOFINSAliquota.setPercentualAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoCOFINSAliquota.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OUTRAS_OPERACOES);
//        nfNotaInfoItemImpostoCOFINSAliquota.setValor(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoCOFINSAliquota.setValorBaseCalulo(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoCOFINS.setAliquota(nfNotaInfoItemImpostoCOFINSAliquota);
        NFNotaInfoItemImpostoCOFINSNaoTributavel nfNotaInfoItemImpostoCOFINSNaoTributavel = new NFNotaInfoItemImpostoCOFINSNaoTributavel();
        nfNotaInfoItemImpostoCOFINSNaoTributavel.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_ISENTA_CONTRIBUICAO);
        nfNotaInfoItemImpostoCOFINS.setNaoTributavel(nfNotaInfoItemImpostoCOFINSNaoTributavel);

//        NFNotaInfoItemImpostoCOFINSOutrasOperacoes nfNotaInfoItemImpostoCOFINSOutrasOperacoes = new NFNotaInfoItemImpostoCOFINSOutrasOperacoes();
//        nfNotaInfoItemImpostoCOFINSOutrasOperacoes.setPercentualCOFINS(BigDecimal.ONE);
//        nfNotaInfoItemImpostoCOFINSOutrasOperacoes.setQuantidadeVendida(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoCOFINSOutrasOperacoes.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OUTRAS_OPERACOES);
//        nfNotaInfoItemImpostoCOFINSOutrasOperacoes.setValorAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoCOFINSOutrasOperacoes.setValorBaseCalculo(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoCOFINSOutrasOperacoes.setValorCOFINS(BigDecimal.TEN);
//        nfNotaInfoItemImpostoCOFINS.setOutrasOperacoes(nfNotaInfoItemImpostoCOFINSOutrasOperacoes);
//        NFNotaInfoItemImpostoCOFINSQuantidade nfNotaInfoItemImpostoCOFINSQuantidade = new NFNotaInfoItemImpostoCOFINSQuantidade();
//        nfNotaInfoItemImpostoCOFINSQuantidade.setQuantidadeVendida(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoCOFINSQuantidade.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_SEM_INCIDENCIA_CONTRIBUICAO);
//        nfNotaInfoItemImpostoCOFINSQuantidade.setValorAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoCOFINSQuantidade.setValorTributo(BigDecimal.TEN);
//        nfNotaInfoItemImpostoCOFINS.setQuantidade(nfNotaInfoItemImpostoCOFINSQuantidade);
//
        nfNotaInfoItemImposto.setCofins(nfNotaInfoItemImpostoCOFINS);
        //FIM
//
        //
        //INICIO
//        NFNotaInfoItemImpostoCOFINSST nfNotaInfoItemImpostoCOFINSST = new NFNotaInfoItemImpostoCOFINSST();
//        nfNotaInfoItemImpostoCOFINSST.setPercentualAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoCOFINSST.setQuantidadeVendida(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoCOFINSST.setValorAliquotaCOFINS(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoCOFINSST.setValorBaseCalculo(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoCOFINSST.setValorCOFINS(BigDecimal.TEN);
//        nfNotaInfoItemImposto.setCofinsst(nfNotaInfoItemImpostoCOFINSST);
        //FIM
        //
        //
        //INICIO
        NFNotaInfoItemImpostoICMS nfNotaInfoItemImpostoICMS = new NFNotaInfoItemImpostoICMS();
//
//        NFNotaInfoItemImpostoICMS00 nfNotaInfoItemImpostoICMS00 = new NFNotaInfoItemImpostoICMS00();
//        nfNotaInfoItemImpostoICMS00.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.VALOR_OPERACAO);
//        nfNotaInfoItemImpostoICMS00.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMS00.setPercentualAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS00.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
//        nfNotaInfoItemImpostoICMS00.setValorBaseCalculo(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS00.setValorTributo(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMS.setIcms00(nfNotaInfoItemImpostoICMS00);
//
//        NFNotaInfoItemImpostoICMS10 nfNotaInfoItemImpostoICMS10 = new NFNotaInfoItemImpostoICMS10();
//        nfNotaInfoItemImpostoICMS10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.VALOR_OPERACAO);
//        nfNotaInfoItemImpostoICMS10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
//        nfNotaInfoItemImpostoICMS10.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMS10.setPercentualAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS10.setPercentualAliquotaImpostoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS10.setPercentualMargemValorICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS10.setPercentualReducaoBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
//        nfNotaInfoItemImpostoICMS10.setValorBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS10.setValorBaseCalculo(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS10.setValorICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS10.setValorTributo(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMS.setIcms10(nfNotaInfoItemImpostoICMS10);
//
//        NFNotaInfoItemImpostoICMS20 nfNotaInfoItemImpostoICMS20 = new NFNotaInfoItemImpostoICMS20();
//        nfNotaInfoItemImpostoICMS20.setDesoneracao(NFNotaMotivoDesoneracaoICMS.TAXI);
//        nfNotaInfoItemImpostoICMS20.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.VALOR_OPERACAO);
//        nfNotaInfoItemImpostoICMS20.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMS20.setPercentualAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS20.setPercentualReducaoBC(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
//        nfNotaInfoItemImpostoICMS20.setValorBCICMS(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS20.setValorICMSDesoneracao(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS20.setValorTributo(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMS.setIcms20(nfNotaInfoItemImpostoICMS20);
//
//        NFNotaInfoItemImpostoICMS30 nfNotaInfoItemImpostoICMS30 = new NFNotaInfoItemImpostoICMS30();
//        nfNotaInfoItemImpostoICMS30.setDesoneracao(NFNotaMotivoDesoneracaoICMS.VENDA_ORGAOS_PUBLICOS);
//        nfNotaInfoItemImpostoICMS30.setModalidadeDeterminacaoBC(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
//        nfNotaInfoItemImpostoICMS30.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMS30.setPercentualAliquotaImpostoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS30.setPercentualMargemValorAdicionadoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS30.setPercentualReducaoBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS30.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
//        nfNotaInfoItemImpostoICMS30.setValorBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS30.setValorICMSDesoneracao(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS30.setValorImpostoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS.setIcms30(nfNotaInfoItemImpostoICMS30);
//
//        NFNotaInfoItemImpostoICMS40 nfNotaInfoItemImpostoICMS40 = new NFNotaInfoItemImpostoICMS40();
//        nfNotaInfoItemImpostoICMS40.setMotivoDesoneracaoICMS(NFNotaMotivoDesoneracaoICMS.VENDA_ORGAOS_PUBLICOS);
//        nfNotaInfoItemImpostoICMS40.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMS40.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
//        nfNotaInfoItemImpostoICMS40.setValorICMSDesoneracao(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS.setIcms40(nfNotaInfoItemImpostoICMS40);
//
//        NFNotaInfoItemImpostoICMS51 nfNotaInfoItemImpostoICMS51 = new NFNotaInfoItemImpostoICMS51();
//        nfNotaInfoItemImpostoICMS51.setModalidadeBC(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.MVA);
//        nfNotaInfoItemImpostoICMS51.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMS51.setPercentualDiferimento(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS51.setPercentualICMS(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS51.setPercentualReducaoBC(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS51.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
//        nfNotaInfoItemImpostoICMS51.setValorBCICMS(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS51.setValorICMSDiferimento(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS51.setValorICMSOperacao(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS.setIcms51(nfNotaInfoItemImpostoICMS51);
//
//        NFNotaInfoItemImpostoICMS60 nfNotaInfoItemImpostoICMS60 = new NFNotaInfoItemImpostoICMS60();
//        nfNotaInfoItemImpostoICMS60.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMS60.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
//        nfNotaInfoItemImpostoICMS60.setValorBCICMSSTRetido(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS60.setValorICMSSTRetido(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS.setIcms60(nfNotaInfoItemImpostoICMS60);
//
//        NFNotaInfoItemImpostoICMS70 nfNotaInfoItemImpostoICMS70 = new NFNotaInfoItemImpostoICMS70();
//        nfNotaInfoItemImpostoICMS70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.TAXI);
//        nfNotaInfoItemImpostoICMS70.setModalidadeBC(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.MVA);
//        nfNotaInfoItemImpostoICMS70.setModalidadeDeterminacaoBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
//        nfNotaInfoItemImpostoICMS70.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMS70.setPercentualAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS70.setPercentualAliquotaImpostoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS70.setPercentualMargemValorAdicionadoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS70.setPercentualReducaoBC(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS70.setPercentualReducaoBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
//        nfNotaInfoItemImpostoICMS70.setValorBC(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS70.setValorBCST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS70.setValorICMSDesoneracao(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS70.setValorICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS70.setValorTributo(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMS.setIcms70(nfNotaInfoItemImpostoICMS70);
//
//        NFNotaInfoItemImpostoICMS90 nfNotaInfoItemImpostoICMS90 = new NFNotaInfoItemImpostoICMS90();
//        nfNotaInfoItemImpostoICMS90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.TAXI);
//        nfNotaInfoItemImpostoICMS90.setModalidadeBC(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.MVA);
//        nfNotaInfoItemImpostoICMS90.setModalidadeDeterminacaoBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
//        nfNotaInfoItemImpostoICMS90.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMS90.setPercentualAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS90.setPercentualAliquotaImpostoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS90.setPercentualMargemValorAdicionadoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS90.setPercentualReducaoBC(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS90.setPercentualReducaoBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
//        nfNotaInfoItemImpostoICMS90.setValorBC(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS90.setValorBCST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS90.setValorICMSDesoneracao(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS90.setValorICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS90.setValorTributo(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMS.setIcms90(nfNotaInfoItemImpostoICMS90);
//
//        NFNotaInfoItemImpostoICMSPartilhado nfNotaInfoItemImpostoICMSPartilhado = new NFNotaInfoItemImpostoICMSPartilhado();
//        nfNotaInfoItemImpostoICMSPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
//        nfNotaInfoItemImpostoICMSPartilhado.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PRECO_TABELADO_MAXIMO);
//        nfNotaInfoItemImpostoICMSPartilhado.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMSPartilhado.setPercentualAliquotaImposto(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSPartilhado.setPercentualAliquotaImpostoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSPartilhado.setPercentualBCOperacaoPropria(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSPartilhado.setPercentualMargemValorAdicionadoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSPartilhado.setPercentualReducaoBC(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSPartilhado.setPercentualReducaoBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSPartilhado.setUfICMSST(NFUnidadeFederativa.MT);
//        nfNotaInfoItemImpostoICMSPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
//        nfNotaInfoItemImpostoICMSPartilhado.setUfICMSST(NFUnidadeFederativa.MT);
//        nfNotaInfoItemImpostoICMSPartilhado.setValorBCICMS(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSPartilhado.setValorBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSPartilhado.setValorICMS(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSPartilhado.setValorICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS.setIcmsPartilhado(nfNotaInfoItemImpostoICMSPartilhado);
//
//        NFNotaInfoItemImpostoICMSSN101 nfNotaInfoItemImpostoICMSSN101 = new NFNotaInfoItemImpostoICMSSN101();
//        nfNotaInfoItemImpostoICMSSN101.setCodigoSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.OUTROS);
//        nfNotaInfoItemImpostoICMSSN101.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMSSN101.setPercentualAliquotaAplicavelCalculoCreditoSN(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMSSN101.setValorCreditoICMSSN(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMS.setIcmssn101(nfNotaInfoItemImpostoICMSSN101);
//
//        NFNotaInfoItemImpostoICMSSN102 nfNotaInfoItemImpostoICMSSN102 = new NFNotaInfoItemImpostoICMSSN102();
//        nfNotaInfoItemImpostoICMSSN102.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMSSN102.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.OUTROS);
//        nfNotaInfoItemImpostoICMS.setIcmssn102(nfNotaInfoItemImpostoICMSSN102);
//
//        NFNotaInfoItemImpostoICMSSN201 nfNotaInfoItemImpostoICMSSN201 = new NFNotaInfoItemImpostoICMSSN201();
//        nfNotaInfoItemImpostoICMSSN201.setModalidadeDeterminacaoBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
//        nfNotaInfoItemImpostoICMSSN201.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMSSN201.setPercentualAliquotaAplicavelCalculoCreditoSN(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMSSN201.setPercentualAliquotaImpostoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN201.setPercentualMargemValorAdicionadoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN201.setPercentualReducaoBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN201.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.OUTROS);
//        nfNotaInfoItemImpostoICMSSN201.setValorBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN201.setValorCreditoICMSSN(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMSSN201.setValorICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS.setIcmssn201(nfNotaInfoItemImpostoICMSSN201);
//
//        NFNotaInfoItemImpostoICMSSN202 nfNotaInfoItemImpostoICMSSN202 = new NFNotaInfoItemImpostoICMSSN202();
//        nfNotaInfoItemImpostoICMSSN202.setModalidadeDeterminacaoBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
//        nfNotaInfoItemImpostoICMSSN202.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMSSN202.setPercentualAliquotaImpostoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN202.setPercentualMargemValorAdicionadoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN202.setPercentualReducaoBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN202.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.OUTROS);
//        nfNotaInfoItemImpostoICMSSN202.setValorBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN202.setValorBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN202.setValorICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS.setIcmssn202(nfNotaInfoItemImpostoICMSSN202);

        NFNotaInfoItemImpostoICMSSN500 nfNotaInfoItemImpostoICMSSN500 = new NFNotaInfoItemImpostoICMSSN500();
        nfNotaInfoItemImpostoICMSSN500.setOrigem(NFOrigem.NACIONAL);
        nfNotaInfoItemImpostoICMSSN500.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.ICMS_COBRADO_ANTERIORMENTE_POR_SUBSTITUICAO_TRIBUTARIA_SUBSIDIO_OU_POR_ANTECIPACAO);
        nfNotaInfoItemImpostoICMSSN500.setValorBCICMSSTRetido(BigDecimal.ZERO);
        nfNotaInfoItemImpostoICMSSN500.setValorICMSSTRetido(BigDecimal.ZERO);
        nfNotaInfoItemImpostoICMS.setIcmssn500(nfNotaInfoItemImpostoICMSSN500);

//        NFNotaInfoItemImpostoICMSSN900 nfNotaInfoItemImpostoICMSSN900 = new NFNotaInfoItemImpostoICMSSN900();
//        nfNotaInfoItemImpostoICMSSN900.setAliquotaAplicavelCalculoCreditoSN(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMSSN900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
//        nfNotaInfoItemImpostoICMSSN900.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PRECO_TABELADO_MAXIMO);
//        nfNotaInfoItemImpostoICMSSN900.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMSSN900.setPercentualAliquotaImposto(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN900.setPercentualAliquotaImpostoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN900.setPercentualMargemValorAdicionadoICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN900.setPercentualReducaoBC(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN900.setPercentualReducaoBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.OUTROS);
//        nfNotaInfoItemImpostoICMSSN900.setValorBCICMS(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN900.setValorBCICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN900.setValorCreditoICMSSN(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMSSN900.setValorICMS(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSSN900.setValorICMSST(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMS.setIcmssn900(nfNotaInfoItemImpostoICMSSN900);
//
//        NFNotaInfoItemImpostoICMSST nfNotaInfoItemImpostoICMSST = new NFNotaInfoItemImpostoICMSST();
//        nfNotaInfoItemImpostoICMSST.setOrigem(NFOrigem.NACIONAL);
//        nfNotaInfoItemImpostoICMSST.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
//        nfNotaInfoItemImpostoICMSST.setValorBCICMSSTRetidoUFRemetente(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSST.setValorBCICMSSTUFDestino(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMSST.setValorICMSSTRetidoUFRemetente(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoICMSST.setValorICMSSTUFDestino(BigDecimal.TEN);
//        nfNotaInfoItemImpostoICMS.setIcmsst(nfNotaInfoItemImpostoICMSST);
        nfNotaInfoItemImposto.setIcms(nfNotaInfoItemImpostoICMS);
        //FIM
        //
        //
        //INICIO

//        NFNotaInfoItemImpostoImportacao nfNotaInfoItemImpostoImportacao = new NFNotaInfoItemImpostoImportacao();
//        nfNotaInfoItemImpostoImportacao.setValorBaseCalculo(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoImportacao.setValorDespesaAduaneira(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoImportacao.setValorIOF(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoImportacao.setValorImpostoImportacao(BigDecimal.ZERO);
//        nfNotaInfoItemImposto.setImpostoImportacao(nfNotaInfoItemImpostoImportacao);
        //FIM
        //
        //
        //INICIO
        NFNotaInfoItemImpostoIPI nfNotaInfoItemImpostoIPI = new NFNotaInfoItemImpostoIPI();
        nfNotaInfoItemImpostoIPI.setClasseEnquadramento("0.000");
        //nfNotaInfoItemImpostoIPI.setCnpjProdutor("");
        nfNotaInfoItemImpostoIPI.setCodigoEnquadramento("000");
        nfNotaInfoItemImpostoIPI.setCodigoSelo("0");
        nfNotaInfoItemImpostoIPI.setQuantidadeSelo(BigInteger.ZERO);

        NFNotaInfoItemImpostoIPINaoTributado nfNotaInfoItemImpostoIPINaoTributado = new NFNotaInfoItemImpostoIPINaoTributado();
        nfNotaInfoItemImpostoIPINaoTributado.setSituacaoTributaria(NFNotaInfoSituacaoTributariaIPI.SAIDA_ISENTA);
        nfNotaInfoItemImpostoIPI.setNaoTributado(nfNotaInfoItemImpostoIPINaoTributado);

//        NFNotaInfoItemImpostoIPITributado nfNotaInfoItemImpostoIPITributado = new NFNotaInfoItemImpostoIPITributado();
//        //nfNotaInfoItemImpostoIPITributado.setPercentualAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoIPITributado.setQuantidade(BigDecimal.valueOf(0.0));
//        nfNotaInfoItemImpostoIPITributado.setSituacaoTributaria(NFNotaInfoSituacaoTributariaIPI.SAIDA_NAO_TRIBUTADA);
//        nfNotaInfoItemImpostoIPITributado.setValorBaseCalculo(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoIPITributado.setValorTributo(BigDecimal.TEN);
//        nfNotaInfoItemImpostoIPITributado.setValorUnidadeTributavel(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoIPI.setTributado(nfNotaInfoItemImpostoIPITributado);
        nfNotaInfoItemImposto.setIpi(nfNotaInfoItemImpostoIPI);

        //FIM
        //
        //
        //INICIO
//        NFNotaInfoItemImpostoISSQN nfNotaInfoItemImpostoISSQN = new NFNotaInfoItemImpostoISSQN();
//        nfNotaInfoItemImpostoISSQN.setCodigoMunicipio(4100459);
//        nfNotaInfoItemImpostoISSQN.setCodigoMunicipioIncidenciaImposto("4100459");
//        nfNotaInfoItemImpostoISSQN.setCodigoPais("1058");
//        //nfNotaInfoItemImpostoISSQN.setCodigoServico("");
//        nfNotaInfoItemImpostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.ISENCAO);
//        nfNotaInfoItemImpostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.NAO);
////        nfNotaInfoItemImpostoISSQN.setItemListaServicos("");
////        nfNotaInfoItemImpostoISSQN.setNumeroProcesso("");
//        nfNotaInfoItemImpostoISSQN.setValor(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoISSQN.setValorAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoISSQN.setValorBaseCalculo(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoISSQN.setValorDeducao(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoISSQN.setValorDescontoCondicionado(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoISSQN.setValorDescontoIncondicionado(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoISSQN.setValorOutro(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoISSQN.setValorRetencaoISS(BigDecimal.ZERO);
//        nfNotaInfoItemImposto.setIssqn(nfNotaInfoItemImpostoISSQN);
        //FIM
        //
        //
        //INICIO
        NFNotaInfoItemImpostoPIS nfNotaInfoItemImpostoPIS = new NFNotaInfoItemImpostoPIS();

        //  NFNotaInfoItemImpostoPISAliquota nfNotaInfoItemImpostoPISAliquota = new NFNotaInfoItemImpostoPISAliquota();
//        nfNotaInfoItemImpostoPISAliquota.setPercentualAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPISAliquota.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.OUTRAS_OPERACOES);
//        nfNotaInfoItemImpostoPISAliquota.setValorBaseCalculo(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPISAliquota.setValorTributo(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPIS.setAliquota(nfNotaInfoItemImpostoPISAliquota);
        NFNotaInfoItemImpostoPISNaoTributado nfNotaInfoItemImpostoPISNaoTributado = new NFNotaInfoItemImpostoPISNaoTributado();
        nfNotaInfoItemImpostoPISNaoTributado.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.OPERACAO_ISENTA_CONTRIBUICAO);
        nfNotaInfoItemImpostoPIS.setNaoTributado(nfNotaInfoItemImpostoPISNaoTributado);

//        NFNotaInfoItemImpostoPISOutrasOperacoes nfNotaInfoItemImpostoPISOutrasOperacoes = new NFNotaInfoItemImpostoPISOutrasOperacoes();
//        nfNotaInfoItemImpostoPISOutrasOperacoes.setPercentualAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPISOutrasOperacoes.setQuantidadeVendida(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPISOutrasOperacoes.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.OUTRAS_OPERACOES);
//        nfNotaInfoItemImpostoPISOutrasOperacoes.setValorAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPISOutrasOperacoes.setValorBaseCalculo(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPISOutrasOperacoes.setValorTributo(BigDecimal.TEN);
//        nfNotaInfoItemImpostoPIS.setOutrasOperacoes(nfNotaInfoItemImpostoPISOutrasOperacoes);
//        NFNotaInfoItemImpostoPISQuantidade nfNotaInfoItemImpostoPISQuantidade = new NFNotaInfoItemImpostoPISQuantidade();
//        nfNotaInfoItemImpostoPISQuantidade.setQuantidadeVendida(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPISQuantidade.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.OUTRAS_OPERACOES);
//        nfNotaInfoItemImpostoPISQuantidade.setValorAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPISQuantidade.setValorTributo(BigDecimal.TEN);
//        nfNotaInfoItemImpostoPIS.setQuantidade(nfNotaInfoItemImpostoPISQuantidade);
        nfNotaInfoItemImposto.setPis(nfNotaInfoItemImpostoPIS);
        //FIM
        //
        //
        //INICIO
//        NFNotaInfoItemImpostoPISST nfNotaInfoItemImpostoPISST = new NFNotaInfoItemImpostoPISST();
//        nfNotaInfoItemImpostoPISST.setPercentualAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPISST.setQuantidadeVendida(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPISST.setValorAliquota(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPISST.setValorBaseCalculo(BigDecimal.ZERO);
//        nfNotaInfoItemImpostoPISST.setValorTributo(BigDecimal.TEN);
//        nfNotaInfoItemImposto.setPisst(nfNotaInfoItemImpostoPISST);
        //FIM
        //
        //
        //INICIO
        nfNotaInfoItemImposto.setValorTotalTributos(BigDecimal.ZERO);
        //FIM
        //

        nfNotaInfoItem.setImposto(nfNotaInfoItemImposto);

        //---------------------------------------dados imposto devol-----------------------------------
//        NFImpostoDevolvido nfImpostoDevolvido = new NFImpostoDevolvido();
//        NFInformacaoImpostoDevolvido nfInformacaoImpostoDevolvido = new NFInformacaoImpostoDevolvido();
//        nfInformacaoImpostoDevolvido.setValorIPIDevolvido(BigDecimal.ZERO);
//        nfImpostoDevolvido.setInformacaoIPIDevolvido(nfInformacaoImpostoDevolvido);
//        nfImpostoDevolvido.setPercentualDevolucao(BigDecimal.ZERO);
//        nfNotaInfoItem.setImpostoDevolvido(nfImpostoDevolvido);
        //---------------------------------------dados infAdicionais-----------------------------------
        nfNotaInfoItem.setInformacoesAdicionais("Nota Fiscal Eletronica de Exemplo");

        return nfNotaInfoItem;
    }

    private NFNotaInfoPagamento getPagamentos() {

        NFNotaInfoPagamento nfNotaInfoPagamento = new NFNotaInfoPagamento();
        nfNotaInfoPagamento.setCartao(null);
        nfNotaInfoPagamento.setFormaPagamentoMoeda(NFFormaPagamentoMoeda.VALE_PRESENTE);
        nfNotaInfoPagamento.setValorPagamento(BigDecimal.ZERO);

        return nfNotaInfoPagamento;
    }

    private NFPessoaAutorizadaDownloadNFe getAutDowlondNFE() {

        NFPessoaAutorizadaDownloadNFe nfPessoaAutorizadaDownloadNFe = new NFPessoaAutorizadaDownloadNFe();

        nfPessoaAutorizadaDownloadNFe.setCnpj(null);
        nfPessoaAutorizadaDownloadNFe.setCpf(null);

        return nfPessoaAutorizadaDownloadNFe;
    }

    private NFNotaInfoItemProdutoArmamento getArmamentos() {
        NFNotaInfoItemProdutoArmamento nfNotaInfoItemProdutoArmamento = new NFNotaInfoItemProdutoArmamento();
        nfNotaInfoItemProdutoArmamento.setDescricao(null);
        nfNotaInfoItemProdutoArmamento.setNumeroSerieArma(null);
        nfNotaInfoItemProdutoArmamento.setNumeroSerieCano(null);
        nfNotaInfoItemProdutoArmamento.setTipo(NFNotaInfoItemProdutoArmamentoTipo.RESTRITO);
        return nfNotaInfoItemProdutoArmamento;
    }

    private NFNotaInfoItemProdutoDeclaracaoImportacao getDeclaracaoImportacoes() {

        NFNotaInfoItemProdutoDeclaracaoImportacao nfNotaInfoItemProdutoDeclaracaoImportacao = new NFNotaInfoItemProdutoDeclaracaoImportacao();

        nfNotaInfoItemProdutoDeclaracaoImportacao.getAdicoes().add(getImportAdicoes());
        nfNotaInfoItemProdutoDeclaracaoImportacao.setCnpj(null);
        nfNotaInfoItemProdutoDeclaracaoImportacao.setCodigoExportador(null);
        nfNotaInfoItemProdutoDeclaracaoImportacao.setDataDesembaraco(null);
        nfNotaInfoItemProdutoDeclaracaoImportacao.setDataRegistro(null);
        nfNotaInfoItemProdutoDeclaracaoImportacao.setFormaImportacaoIntermediacao(NFFormaImportacaoIntermediacao.IMPORTACAO_CONTA_ORDEM);
        nfNotaInfoItemProdutoDeclaracaoImportacao.setLocalDesembaraco(null);
        nfNotaInfoItemProdutoDeclaracaoImportacao.setNumeroRegistro(null);
        nfNotaInfoItemProdutoDeclaracaoImportacao.setTransporteInternacional(NFViaTransporteInternacional.MARITIMA);
        nfNotaInfoItemProdutoDeclaracaoImportacao.setUfDesembaraco(NFUnidadeFederativa.DF);
        nfNotaInfoItemProdutoDeclaracaoImportacao.setUfTerceiro(NFUnidadeFederativa.MT);
        nfNotaInfoItemProdutoDeclaracaoImportacao.setValorAFRMM(BigDecimal.ZERO);

        return nfNotaInfoItemProdutoDeclaracaoImportacao;
    }

    private NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao getImportAdicoes() {

        NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao nfNotaInfoItemProdutoDeclaracaoImportacaoAdicao = new NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();

        nfNotaInfoItemProdutoDeclaracaoImportacaoAdicao.setCodigoFabricante("");
        nfNotaInfoItemProdutoDeclaracaoImportacaoAdicao.setDesconto(BigDecimal.ZERO);
        nfNotaInfoItemProdutoDeclaracaoImportacaoAdicao.setDesconto("");
        nfNotaInfoItemProdutoDeclaracaoImportacaoAdicao.setNumero(Integer.SIZE);
        nfNotaInfoItemProdutoDeclaracaoImportacaoAdicao.setNumeroAtoConcessorioDrawback(BigInteger.ZERO);
        nfNotaInfoItemProdutoDeclaracaoImportacaoAdicao.setSequencial(Integer.MIN_VALUE);

        return nfNotaInfoItemProdutoDeclaracaoImportacaoAdicao;
    }

    private NFNotaInfoItemDetalheExportacao getDetalhesImportacao() {
        NFNotaInfoItemDetalheExportacao nfNotaInfoItemDetalheExportacao = new NFNotaInfoItemDetalheExportacao();

        NFNotaInfoItemExportacaoIndireta nfNotaInfoItemExportacaoIndireta = new NFNotaInfoItemExportacaoIndireta();
        nfNotaInfoItemExportacaoIndireta.setChaveAcessoNFe(null);
        nfNotaInfoItemExportacaoIndireta.setNumeroRegistroExportacao(BigInteger.ZERO);
        nfNotaInfoItemExportacaoIndireta.setQuantidadeItemEfetivamenteExportado(BigDecimal.ZERO);
        nfNotaInfoItemDetalheExportacao.setExportacaoIndireta(nfNotaInfoItemExportacaoIndireta);

        nfNotaInfoItemDetalheExportacao.setNumeroAtoConcessorioDrawback(BigInteger.ZERO);
        return nfNotaInfoItemDetalheExportacao;
    }

    private NFNotaInfoItemProdutoMedicamento getMedicamentos() {

        NFNotaInfoItemProdutoMedicamento nfNotaInfoItemProdutoMedicamento = new NFNotaInfoItemProdutoMedicamento();
        nfNotaInfoItemProdutoMedicamento.setDataFabricacao(null);
        nfNotaInfoItemProdutoMedicamento.setDataValidade(null);
        nfNotaInfoItemProdutoMedicamento.setLote(null);
        nfNotaInfoItemProdutoMedicamento.setPrecoMaximoConsumidor(BigDecimal.ZERO);
        nfNotaInfoItemProdutoMedicamento.setQuantidade(BigDecimal.ZERO);
        return nfNotaInfoItemProdutoMedicamento;
    }

    private NFNotaInfoItemProdutoCombustivel getCombustivel() {

        NFNotaInfoItemProdutoCombustivel nfNotaInfoItemProdutoCombustivel = new NFNotaInfoItemProdutoCombustivel();

        NFNotaInfoItemProdutoCombustivelCIDE nfNotaInfoItemProdutoCombustivelCIDE = new NFNotaInfoItemProdutoCombustivelCIDE();
        nfNotaInfoItemProdutoCombustivelCIDE.setQuantidadeBCCIDE(BigDecimal.ZERO);
        nfNotaInfoItemProdutoCombustivelCIDE.setValor(BigDecimal.ZERO);
        nfNotaInfoItemProdutoCombustivelCIDE.setValorAliquota(BigDecimal.ZERO);
        nfNotaInfoItemProdutoCombustivel.setCide(nfNotaInfoItemProdutoCombustivelCIDE);

        nfNotaInfoItemProdutoCombustivel.setCodigoAutorizacaoCODIF("");
        nfNotaInfoItemProdutoCombustivel.setCodigoProdutoANP("");
        nfNotaInfoItemProdutoCombustivel.setPercentualGasNatural(BigDecimal.ONE);
        nfNotaInfoItemProdutoCombustivel.setQuantidade(BigDecimal.ZERO);
        nfNotaInfoItemProdutoCombustivel.setUf(NFUnidadeFederativa.PR);

        return nfNotaInfoItemProdutoCombustivel;
    }

    private NFNotaInfoItemProdutoVeiculo getVeiculo() {

        NFNotaInfoItemProdutoVeiculo nfNotaInfoItemProdutoVeiculo = new NFNotaInfoItemProdutoVeiculo();
        nfNotaInfoItemProdutoVeiculo.setAnoFabricacao(2012);
        nfNotaInfoItemProdutoVeiculo.setAnoModeloFabricacao(2012);
        nfNotaInfoItemProdutoVeiculo.setCapacidadeMaximaTracao(BigDecimal.TEN);
        nfNotaInfoItemProdutoVeiculo.setChassi(null);
        nfNotaInfoItemProdutoVeiculo.setCilindrada(null);
        nfNotaInfoItemProdutoVeiculo.setCodigoCor(null);
        nfNotaInfoItemProdutoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.GRENA);
        nfNotaInfoItemProdutoVeiculo.setCodigoMarcaModelo(null);
        nfNotaInfoItemProdutoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        nfNotaInfoItemProdutoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.REMARCADO);
        nfNotaInfoItemProdutoVeiculo.setDescricaoCor(null);
        nfNotaInfoItemProdutoVeiculo.setDistanciaEntreEixos(null);
        nfNotaInfoItemProdutoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.PASSAGEIRO);
        nfNotaInfoItemProdutoVeiculo.setLotacao(5);
        nfNotaInfoItemProdutoVeiculo.setNumeroMotor(null);
        nfNotaInfoItemProdutoVeiculo.setNumeroSerie(null);
        nfNotaInfoItemProdutoVeiculo.setPesoBruto(BigDecimal.ZERO);
        nfNotaInfoItemProdutoVeiculo.setPesoLiquido(BigDecimal.ZERO);
        nfNotaInfoItemProdutoVeiculo.setPotencia(null);
        nfNotaInfoItemProdutoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.NAO_HA);
        nfNotaInfoItemProdutoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.ALCOOL);
        nfNotaInfoItemProdutoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        nfNotaInfoItemProdutoVeiculo.setTipoPintura(null);
        nfNotaInfoItemProdutoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        return nfNotaInfoItemProdutoVeiculo;
    }

    private NFNotaInfoAvulsa getAvulsa() {

        NFNotaInfoAvulsa nfNotaInfoAvulsa = new NFNotaInfoAvulsa();
        nfNotaInfoAvulsa.setCnpj(null);
        nfNotaInfoAvulsa.setDataEmissaoDocumentoArrecadacao(null);
        nfNotaInfoAvulsa.setDataPagamentoDocumentoArrecadacao(null);
        nfNotaInfoAvulsa.setFone(null);
        nfNotaInfoAvulsa.setMatriculaAgente(null);
        nfNotaInfoAvulsa.setNomeAgente(null);
        nfNotaInfoAvulsa.setNumeroDocumentoArrecadacaoReceita(null);
        nfNotaInfoAvulsa.setOrgaoEmitente(null);
        nfNotaInfoAvulsa.setReparticaoFiscalEmitente(null);
        nfNotaInfoAvulsa.setUf(NFUnidadeFederativa.AC);
        nfNotaInfoAvulsa.setValorTotalConstanteDocumentoArrecadacaoReceita(BigDecimal.ZERO);

        return nfNotaInfoAvulsa;
    }

    private NFNotaInfoCana getCana() {

        NFNotaInfoCana nfNotaInfoCana = new NFNotaInfoCana();
        nfNotaInfoCana.getDeducoes().add(getCanaDeducoes());
        nfNotaInfoCana.getFornecimentosDiario().add(getCanaFornecimentosDiario());
        nfNotaInfoCana.setQuantidadeTotalAnterior(BigDecimal.TEN);
        nfNotaInfoCana.setQuantidadeTotalGeral(BigDecimal.TEN);
        nfNotaInfoCana.setQuantidadeTotalMes(BigDecimal.TEN);
        nfNotaInfoCana.setReferencia(null);
        nfNotaInfoCana.setSafra(null);
        nfNotaInfoCana.setValorFornecimento(BigDecimal.ZERO);
        nfNotaInfoCana.setValorLiquidoFornecimento(BigDecimal.ZERO);
        nfNotaInfoCana.setValorTotalDeducao(BigDecimal.TEN);

        return nfNotaInfoCana;
    }

    private NFNotaInfoCanaDeducao getCanaDeducoes() {
        NFNotaInfoCanaDeducao nfNotaInfoCanaDeducao = new NFNotaInfoCanaDeducao();
        nfNotaInfoCanaDeducao.setDescricaoDeducao(null);
        nfNotaInfoCanaDeducao.setValorDeducao(BigDecimal.ZERO);

        return nfNotaInfoCanaDeducao;
    }

    private NFNotaInfoCanaFornecimentoDiario getCanaFornecimentosDiario() {

        NFNotaInfoCanaFornecimentoDiario nfNotaInfoCanaFornecimentoDiario = new NFNotaInfoCanaFornecimentoDiario();

        nfNotaInfoCanaFornecimentoDiario.setDia(1);
        nfNotaInfoCanaFornecimentoDiario.setQuantidade(BigDecimal.ZERO);

        return nfNotaInfoCanaFornecimentoDiario;
    }

    private NFNotaInfoCobranca getCobranca() {

        NFNotaInfoCobranca nfNotaInfoCobranca = new NFNotaInfoCobranca();
        nfNotaInfoCobranca.getDuplicatas().add(getCobrancaDuplicatas());

        NFNotaInfoFatura nfNotaInfoFatura = new NFNotaInfoFatura();
        nfNotaInfoFatura.setNumeroFatura(null);
        nfNotaInfoFatura.setValorDesconto(BigDecimal.ZERO);
        nfNotaInfoFatura.setValorDesconto("");
        nfNotaInfoFatura.setValorLiquidoFatura(BigDecimal.ZERO);
        nfNotaInfoFatura.setValorLiquidoFatura("");
        nfNotaInfoFatura.setValorOriginalFatura(BigDecimal.ZERO);
        nfNotaInfoFatura.setValorOriginalFatura("");
        nfNotaInfoCobranca.setFatura(nfNotaInfoFatura);

        return nfNotaInfoCobranca;
    }

    private NFNotaInfoDuplicata getCobrancaDuplicatas() {

        NFNotaInfoDuplicata nfNotaInfoDuplicata = new NFNotaInfoDuplicata();

        nfNotaInfoDuplicata.setDataVencimento(null);
        nfNotaInfoDuplicata.setNumeroDuplicata(null);
        nfNotaInfoDuplicata.setValorDuplicata(BigDecimal.ZERO);
        nfNotaInfoDuplicata.setValorDuplicata("");

        return nfNotaInfoDuplicata;
    }

    private NFNotaInfoCompra getCompra() {

        NFNotaInfoCompra nfNotaInfoCompra = new NFNotaInfoCompra();

        nfNotaInfoCompra.setContrato(null);
        nfNotaInfoCompra.setNotaDeEmpenho(null);
        nfNotaInfoCompra.setPedido(null);

        return nfNotaInfoCompra;
    }

    private NFNotaInfoDestinatario getDestinatario() {

        NFNotaInfoDestinatario nfNotaInfoDestinatario = new NFNotaInfoDestinatario();

        //nfNotaInfoDestinatario.setCnpj("");
        nfNotaInfoDestinatario.setCpf("07906171969");
        nfNotaInfoDestinatario.setEmail("rodrigo.monteiro.nascimento@gmail.com");

        NFEndereco nfEndereco = new NFEndereco();
        nfEndereco.setBairro("WEB");
        nfEndereco.setCep("87302070");
        nfEndereco.setCodigoMunicipio("4100459");
        nfEndereco.setCodigoPais("1058");
        nfEndereco.setComplemento("Comercio");
        nfEndereco.setDescricaoMunicipio("Campo Mourao");
        nfEndereco.setDescricaoPais("Brasil");
        nfEndereco.setLogradouro("Rua: Membros JavaC");
        nfEndereco.setNumero("10");
        nfEndereco.setTelefone("4845454545");
        nfEndereco.setUf(NFUnidadeFederativa.PR);
        nfNotaInfoDestinatario.setEndereco(nfEndereco);

        //nfNotaInfoDestinatario.setIdEstrangeiro(null);
        nfNotaInfoDestinatario.setIndicadorIEDestinatario(NFIndicadorIEDestinatario.NAO_CONTRIBUINTE);
        //nfNotaInfoDestinatario.setInscricaoEstadual(null);
        //nfNotaInfoDestinatario.setInscricaoMunicipal(null);
        //nfNotaInfoDestinatario.setInscricaoSuframa(null);
        nfNotaInfoDestinatario.setRazaoSocial("NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");

        return nfNotaInfoDestinatario;
    }

    private NFNotaInfoEmitente getEmitente() {

        NFNotaInfoEmitente nfNotaInfoEmitente = new NFNotaInfoEmitente();

        nfNotaInfoEmitente.setCnpj(ConfiguracaoTeste.cnpj);
        //nfNotaInfoEmitente.setCpf(null);
        NFEndereco nfEndereco = new NFEndereco();
        nfEndereco.setBairro("WEB");
        nfEndereco.setCep("87302070");
        nfEndereco.setCodigoMunicipio("4100459");
        nfEndereco.setCodigoPais("1058");
        nfEndereco.setComplemento("Casa");
        nfEndereco.setDescricaoMunicipio("CAMPO MOURAO");
        nfEndereco.setDescricaoPais("Brasil");
        nfEndereco.setLogradouro("AV. www.javac.com.br");
        nfEndereco.setNumero("170");
        nfEndereco.setTelefone("4812121212");
        nfEndereco.setUf(NFUnidadeFederativa.PR);
        nfNotaInfoEmitente.setEndereco(nfEndereco);
        nfNotaInfoEmitente.setInscricaoEstadual(ConfiguracaoTeste.ie);

        nfNotaInfoEmitente.setNomeFantasia("Agropecuaria Ipe");
        nfNotaInfoEmitente.setRazaoSocial("NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
        nfNotaInfoEmitente.setRegimeTributario(NFRegimeTributario.SIMPLES_NACIONAL);

        //nfNotaInfoEmitente.setInscricaoEstadualSubstituicaoTributaria(null);
        //nfNotaInfoEmitente.setInscricaoMunicipal(null);
        //nfNotaInfoEmitente.setClassificacaoNacionalAtividadesEconomicas(null);
        return nfNotaInfoEmitente;
    }

    private NFNotaInfoLocal getEntrega() {

        NFNotaInfoLocal nfNotaInfoLocal = new NFNotaInfoLocal();

        nfNotaInfoLocal.setBairro(null);
        nfNotaInfoLocal.setCnpj(null);
        nfNotaInfoLocal.setCodigoMunicipio(null);
        nfNotaInfoLocal.setComplemento(null);
        nfNotaInfoLocal.setCpf(null);
        nfNotaInfoLocal.setLogradouro(null);
        nfNotaInfoLocal.setNomeMunicipio(null);
        nfNotaInfoLocal.setNumero(null);
        nfNotaInfoLocal.setUf(NFUnidadeFederativa.AC);

        return nfNotaInfoLocal;
    }

    private NFNotaInfoExportacao getExportacao() {

        NFNotaInfoExportacao nfNotaInfoExportacao = new NFNotaInfoExportacao();

        nfNotaInfoExportacao.setLocalDespachoProdutos(null);
        nfNotaInfoExportacao.setLocalEmbarqueProdutos(null);
        nfNotaInfoExportacao.setUfEmbarqueProduto(NFUnidadeFederativa.AP);

        return nfNotaInfoExportacao;
    }

    private NFNotaInfoIdentificacao getIdentificacao() throws IOException {

        NFNotaInfoIdentificacao nfNotaInfoIdentificacao = new NFNotaInfoIdentificacao();

        nfNotaInfoIdentificacao.setAmbiente(NFAmbiente.HOMOLOGACAO);
        nfNotaInfoIdentificacao.setCodigoMunicipio("4100459");
        nfNotaInfoIdentificacao.setCodigoRandomico(autoCompletar.lpadTo(ConfiguracaoTeste.cNf, 8, '0'));

        try {
            nfNotaInfoIdentificacao.setDataHoraEmissao(LocalDateTime.fromDateFields(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").parse(ConfiguracaoTeste.data1)));
        } catch (ParseException ex) {
            Logger.getLogger(WebServiceSabios.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            nfNotaInfoIdentificacao.setDataHoraSaidaOuEntrada(LocalDateTime.fromDateFields(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").parse(ConfiguracaoTeste.data1)));
        } catch (ParseException ex) {
            Logger.getLogger(WebServiceSabios.class.getName()).log(Level.SEVERE, null, ex);
        }
        nfNotaInfoIdentificacao.setDigitoVerificador(new GerarChaveAcessoNfe().getDigitoVerificador(CarregaConfig310.config.getCUF().getCodigoIbge(), ConfiguracaoTeste.data, ConfiguracaoTeste.cnpj, ConfiguracaoTeste.mod, ConfiguracaoTeste.serie, CarregaConfig310.config.getTipoEmissao().getCodigo(), ConfiguracaoTeste.nNf, ConfiguracaoTeste.cNf));
        nfNotaInfoIdentificacao.setFinalidade(NFFinalidade.NORMAL);
        nfNotaInfoIdentificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_VISTA);
        nfNotaInfoIdentificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        nfNotaInfoIdentificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.OPERACAO_PRESENCIAL);
        //nfNotaInfoIdentificacao.setDataHoraContigencia(null);
        //nfNotaInfoIdentificacao.setJustificativaEntradaContingencia(null);
        nfNotaInfoIdentificacao.setModelo(ConfiguracaoTeste.mod);
        nfNotaInfoIdentificacao.setNaturezaOperacao("5102");
        nfNotaInfoIdentificacao.setNumeroNota(ConfiguracaoTeste.nNf);
        nfNotaInfoIdentificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.NAO);
        nfNotaInfoIdentificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        nfNotaInfoIdentificacao.setSerie(ConfiguracaoTeste.serie);
        nfNotaInfoIdentificacao.setTipo(NFTipo.SAIDA);
        nfNotaInfoIdentificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        nfNotaInfoIdentificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        nfNotaInfoIdentificacao.setUf(NFUnidadeFederativa.PR);
        nfNotaInfoIdentificacao.setVersaoEmissor(NFeConfig.VERSAO_NFE);
        //nfNotaInfoIdentificacao.getReferenciadas().add(getInformacoesReferenciadas());

        return nfNotaInfoIdentificacao;
    }

    private NFInfoReferenciada getInformacoesReferenciadas() {

        NFInfoReferenciada nfInfoReferenciada = new NFInfoReferenciada();

        nfInfoReferenciada.setChaveAcesso(null);
        nfInfoReferenciada.setChaveAcessoCTReferenciada(null);

        NFInfoCupomFiscalReferenciado nfInfoCupomFiscalReferenciado = new NFInfoCupomFiscalReferenciado();
        nfInfoCupomFiscalReferenciado.setModeloDocumentoFiscal(null);
        nfInfoCupomFiscalReferenciado.setNumeroContadorOrdemOperacao(null);
        nfInfoCupomFiscalReferenciado.setNumeroOrdemSequencialECF(null);
        nfInfoReferenciada.setCupomFiscalReferenciado(nfInfoCupomFiscalReferenciado);

        NFInfoProdutorRuralReferenciada nfInfoProdutorRuralReferenciada = new NFInfoProdutorRuralReferenciada();
        nfInfoProdutorRuralReferenciada.setAnoMesEmissao(null);
        nfInfoProdutorRuralReferenciada.setCnpjEmitente(null);
        nfInfoProdutorRuralReferenciada.setCpfEmitente(null);
        nfInfoProdutorRuralReferenciada.setIeEmitente(null);
        nfInfoProdutorRuralReferenciada.setModeloDocumentoFiscal(null);
        nfInfoProdutorRuralReferenciada.setNumeroDocumentoFiscal(Integer.MIN_VALUE);
        nfInfoProdutorRuralReferenciada.setSerieDocumentoFiscal(Integer.MIN_VALUE);
        nfInfoProdutorRuralReferenciada.setUfEmitente(NFUnidadeFederativa.CE);
        nfInfoReferenciada.setInfoNFProdutorRuralReferenciada(nfInfoProdutorRuralReferenciada);

        nfInfoReferenciada.setModelo1por1Referenciada(new NFInfoModelo1Por1AReferenciada());

        return nfInfoReferenciada;
    }

    private NFNotaInfoInformacoesAdicionais getInfAdicionais() {

        NFNotaInfoInformacoesAdicionais nfNotaInfoInformacoesAdicionais = new NFNotaInfoInformacoesAdicionais();

//        nfNotaInfoInformacoesAdicionais.getObservacoesContribuinte().add(getInfAdicionaisContribuinte());
//        nfNotaInfoInformacoesAdicionais.getObservacoesFisco().add(getInfAdicionaisFisco());
//        nfNotaInfoInformacoesAdicionais.getProcessosRefenciado().add(getInfAdicionaisProcessoRefenciado());
//
//        nfNotaInfoInformacoesAdicionais.setInformacoesAdicionaisInteresseFisco(null);
        nfNotaInfoInformacoesAdicionais.setInformacoesComplementaresInteresseContribuinte("Informacoes Adicionais da NF-e.");

        return nfNotaInfoInformacoesAdicionais;
    }

    private NFNotaInfoObservacao getInfAdicionaisContribuinte() {

        NFNotaInfoObservacao nfNotaInfoObservacao = new NFNotaInfoObservacao();
        nfNotaInfoObservacao.setConteudoCampo(null);
        nfNotaInfoObservacao.setIdentificacaoCampo(null);

        return nfNotaInfoObservacao;
    }

    private NFNotaInfoObservacao getInfAdicionaisFisco() {

        NFNotaInfoObservacao nfNotaInfoObservacao = new NFNotaInfoObservacao();
        nfNotaInfoObservacao.setConteudoCampo(null);
        nfNotaInfoObservacao.setIdentificacaoCampo(null);

        return nfNotaInfoObservacao;
    }

    private NFNotaInfoProcessoReferenciado getInfAdicionaisProcessoRefenciado() {

        NFNotaInfoProcessoReferenciado nfNotaInfoProcessoReferenciado = new NFNotaInfoProcessoReferenciado();
        nfNotaInfoProcessoReferenciado.setIdentificadorProcessoOuAtoConcessorio(null);
        nfNotaInfoProcessoReferenciado.setIndicadorOrigemProcesso(NFOrigemProcesso.OUTROS);

        return nfNotaInfoProcessoReferenciado;
    }

    private NFNotaInfoLocal getRetirada() {

        NFNotaInfoLocal nfNotaInfoLocal = new NFNotaInfoLocal();
        nfNotaInfoLocal.setBairro(null);
        nfNotaInfoLocal.setCnpj(null);
        nfNotaInfoLocal.setCodigoMunicipio(null);
        nfNotaInfoLocal.setComplemento(null);
        nfNotaInfoLocal.setCpf(null);
        nfNotaInfoLocal.setLogradouro(null);
        nfNotaInfoLocal.setNomeMunicipio(null);
        nfNotaInfoLocal.setNumero(null);
        nfNotaInfoLocal.setUf(NFUnidadeFederativa.AC);

        return nfNotaInfoLocal;
    }

    private NFNotaInfoTotal getTotal() {

        NFNotaInfoTotal nfNotaInfoTotal = new NFNotaInfoTotal();

        NFNotaInfoICMSTotal nfNotaInfoICMSTotal = new NFNotaInfoICMSTotal();
        nfNotaInfoICMSTotal.setBaseCalculoICMS(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setOutrasDespesasAcessorias(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValor(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValorCOFINS(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValorICMSDesonerado(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValorPIS(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValorTotalDesconto(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValorTotalDosProdutosServicos(new BigDecimal("180.00"));
        nfNotaInfoICMSTotal.setValorTotalFrete(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValorTotalICMS(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValorTotalICMSST(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValorTotalII(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValorTotalIPI(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValorTotalSeguro(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValorTotalTributos(BigDecimal.ZERO);
        nfNotaInfoICMSTotal.setValorTotalNFe(new BigDecimal("180.00"));
        nfNotaInfoTotal.setIcmsTotal(nfNotaInfoICMSTotal);

//        NFNotaInfoISSQNTotal nfNotaInfoISSQNTotal = new NFNotaInfoISSQNTotal();
//        nfNotaInfoISSQNTotal.setBaseCalculoISS(BigDecimal.ZERO);
//        nfNotaInfoISSQNTotal.setDataPrestacaoServico(null);
//        nfNotaInfoISSQNTotal.setTributacao(NFNotaInfoRegimeEspecialTributacao.ESTIMATIVA);
//        nfNotaInfoISSQNTotal.setValorCOFINSsobreServicos(BigDecimal.ONE);
//        nfNotaInfoISSQNTotal.setValorDeducao(BigDecimal.ZERO);
//        nfNotaInfoISSQNTotal.setValorOutros(BigDecimal.ZERO);
//        nfNotaInfoISSQNTotal.setValorPISsobreServicos(BigDecimal.ZERO);
//        nfNotaInfoISSQNTotal.setValorTotalDescontoCondicionado(BigDecimal.TEN);
//        nfNotaInfoISSQNTotal.setValorTotalDescontoIncondicionado(BigDecimal.TEN);
//        nfNotaInfoISSQNTotal.setValorTotalISS(BigDecimal.TEN);
//        nfNotaInfoISSQNTotal.setValorTotalRetencaoISS(BigDecimal.ZERO);
//        nfNotaInfoISSQNTotal.setValorTotalServicosSobNaoIncidenciaNaoTributadosICMS(BigDecimal.TEN);
//        nfNotaInfoTotal.setIssqnTotal(nfNotaInfoISSQNTotal);
//        
//        NFNotaInfoRetencoesTributos nfNotaInfoRetencoesTributos = new NFNotaInfoRetencoesTributos();
//        nfNotaInfoRetencoesTributos.setBaseCalculoIRRF(BigDecimal.ZERO);
//        nfNotaInfoRetencoesTributos.setBaseCalculoRetencaoPrevidenciaSocial(BigDecimal.ZERO);
//        nfNotaInfoRetencoesTributos.setValorRetencaoPrevidenciaSocial(BigDecimal.ZERO);
//        nfNotaInfoRetencoesTributos.setValorRetidoCOFINS(BigDecimal.ZERO);
//        nfNotaInfoRetencoesTributos.setValorRetidoCSLL(BigDecimal.ZERO);
//        nfNotaInfoRetencoesTributos.setValorRetidoIRRF(BigDecimal.ZERO);
//        nfNotaInfoRetencoesTributos.setValorRetidoPIS(BigDecimal.ZERO);
//        nfNotaInfoTotal.setRetencoesTributos(nfNotaInfoRetencoesTributos);
        return nfNotaInfoTotal;
    }

    private NFNotaInfoTransporte getTransporte() {

        NFNotaInfoTransporte nfNotaInfoTransporte = new NFNotaInfoTransporte();
        nfNotaInfoTransporte.setModalidadeFrete(NFModalidadeFrete.SEM_FRETE);
        //nfNotaInfoTransporte.getReboques().add(getReboques());
        //nfNotaInfoTransporte.getVolumes().add(getVolumes());
        //nfNotaInfoTransporte.setBalsa(null);
        //nfNotaInfoTransporte.setVagao(null);

//        NFNotaInfoRetencaoICMSTransporte nfNotaInfoRetencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
//        nfNotaInfoRetencaoICMSTransporte.setAliquotaRetencao(BigDecimal.ZERO);
//        nfNotaInfoRetencaoICMSTransporte.setBcRetencaoICMS(BigDecimal.ZERO);
//        nfNotaInfoRetencaoICMSTransporte.setCfop(Integer.SIZE);
//        nfNotaInfoRetencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte(Integer.MIN_VALUE);
//        nfNotaInfoRetencaoICMSTransporte.setValorICMSRetido(BigDecimal.ZERO);
//        nfNotaInfoRetencaoICMSTransporte.setValorServico(BigDecimal.ZERO);
//        nfNotaInfoTransporte.setIcmsTransporte(nfNotaInfoRetencaoICMSTransporte);
        NFNotaInfoTransportador nfNotaInfoTransportador = new NFNotaInfoTransportador();
        //nfNotaInfoTransportador.setCnpj("34523233000123");
        nfNotaInfoTransportador.setCpf("07906171969");
        nfNotaInfoTransportador.setEnderecoComplemento("AV. www.javac.com.br");
        //nfNotaInfoTransportador.setInscricaoEstadual("121212121");
        nfNotaInfoTransportador.setNomeMunicipio("Java");
        nfNotaInfoTransportador.setRazaoSocial("JavaC - Java Communuty");
        nfNotaInfoTransportador.setUf(NFUnidadeFederativa.PR);
        nfNotaInfoTransporte.setTransportador(nfNotaInfoTransportador);

//        NFNotaInfoVeiculo nfNotaInfoVeiculo = new NFNotaInfoVeiculo();
//        nfNotaInfoVeiculo.setPlacaVeiculo(null);
//        nfNotaInfoVeiculo.setRegistroNacionalTransportadorCarga(null);
//        nfNotaInfoVeiculo.setUf(NFUnidadeFederativa.AC);
//        nfNotaInfoTransporte.setVeiculo(nfNotaInfoVeiculo);
//        
        return nfNotaInfoTransporte;
    }

    private NFNotaInfoReboque getReboques() {

        NFNotaInfoReboque nfNotaInfoReboque = new NFNotaInfoReboque();

        nfNotaInfoReboque.setPlacaVeiculo(null);
        nfNotaInfoReboque.setRegistroNacionalTransportadorCarga(null);
        nfNotaInfoReboque.setUf(NFUnidadeFederativa.AC);

        return nfNotaInfoReboque;
    }

    private NFNotaInfoVolume getVolumes() {

        NFNotaInfoVolume nfNotaInfoVolume = new NFNotaInfoVolume();
        //nfNotaInfoVolume.getLacres().add(getLacres());
        nfNotaInfoVolume.setEspecieVolumesTransportados("0");
        //nfNotaInfoVolume.setMarca(null);
        nfNotaInfoVolume.setNumeracaoVolumesTransportados("0");
        nfNotaInfoVolume.setPesoBruto(BigDecimal.ZERO);
        nfNotaInfoVolume.setPesoLiquido(BigDecimal.ZERO);
        //nfNotaInfoVolume.setQuantidadeVolumesTransportados(BigInteger.TEN);

        return nfNotaInfoVolume;
    }

    private NFNotaInfoLacre getLacres() {

        NFNotaInfoLacre nfNotaInfoLacre = new NFNotaInfoLacre();

        nfNotaInfoLacre.setNumeroLacre(null);

        return nfNotaInfoLacre;
    }

}
