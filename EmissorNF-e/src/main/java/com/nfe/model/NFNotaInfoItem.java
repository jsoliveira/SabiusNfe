package com.nfe.model;

import java.math.BigInteger;
import java.util.List;

public class NFNotaInfoItem {

    private Integer numeroItem;

    //Info Produto
    private String codigo;
    private String codigoDeBarras;
    private String descricao;
    private String ncm;
    private Integer extipi;
    private String cfop;
    private String unidadeComercial;
    private String quantidadeComercial;
    private String valorUnitario;
    private String valorTotalBruto;
    private String codigoDeBarrasTributavel;
    private String unidadeTributavel;
    private String quantidadeTributavel;
    private String valorUnitarioTributavel;
    private String valorFrete;
    private String valorSeguro;
    private String valorDesconto;
    private String valorOutrasDespesasAcessorias;
    private Integer compoeValorNota;
    private String numeroPedidoCliente;
    private Integer numeroPedidoItemCliente;
    private String numeroControleFCI;

    //Informacao ProdutoVeiculo
    private Integer VeitipoOperacao;
    private String Veichassi;
    private String VeicodigoCor;
    private String VeidescricaoCor;
    private String Veipotencia;
    private String Veicilindrada;
    private String VeipesoLiquido;
    private String VeipesoBruto;
    private String VeinumeroSerie;
    private Integer VeitipoCombustivel;
    private String VeinumeroMotor;
    private String VeicapacidadeMaximaTracao;
    private String VeidistanciaEntreEixos;
    private Integer VeianoModeloFabricacao;
    private Integer VeianoFabricacao;
    private String VeitipoPintura;
    private Integer VeitipoVeiculo;
    private Integer VeiespecieVeiculo;
    private Integer VeicondicaoChassi;
    private Integer Veicondicao;
    private String VeicodigoMarcaModelo;
    private Integer VeicorDENATRAN;
    private Integer Veilotacao;
    private Integer Veirestricao;

    //Informacao Combustivel
    private String CombscodigoProdutoANP;
    private String CombspercentualGasNatural;
    private String CombscodigoAutorizacaoCOFIF;
    private String Combsquantidade;
    private String Combsuf;
    private String CombCIDEquantidadeBCCIDE;
    private String CombCIDEvalorAliquota;
    private String CombCIDEvalor;

    private String numeroRECOPI;

    private List<String> nomeclaturaValorAduaneiroEstatistica;
    private List<NFNotaInfoItemProdutoMedicamento> medicamentos;
    private List<NFNotaInfoItemProdutoArmamento> armamentos;
    private List<NFNotaInfoItemProdutoDeclaracaoImportacao> declaracoesImportacao;
    private List<NFNotaInfoItemDetalheExportacao> detalhesExportacao;

    //Informacao Imposto
    private String valorTotalTributos;

    //ICMS
    private boolean isSelecionado = false;
    //-ICMS 00
    private Integer icms00origem;
    private Integer icms00situacaoTributaria;
    private Integer icms00modalidadeBaseCalculo;
    private String icms00valorBaseCalculo;
    private String icms00percentualAliquota;
    private String icms00valorTributo;

    //-ICMS 10
    private Integer icms10origem;
    private Integer icms10situacaoTributaria;
    private Integer icms10modalidadeBaseCalculo;
    private String icms10valorBaseCalculo;
    private String icms10percentualAliquota;
    private String icms10valorTributo;
    private Integer icms10modalidadeDeterminacaoBCICMS;
    private String icms10percentualMargemValorICMSST;
    private String icms10percentualReducaoBCICMSST;
    private String icms10valorBCICMSST;
    private String icms10percentualAliquotaImpostoICMSST;
    private String icms10valorICMSST;

    //-ICMS 20
    private Integer icms20origem;
    private Integer icms20situacaoTributaria;
    private Integer icms20modalidadeBaseCalculo;
    private String icms20percentualReducaoBC;
    private String icms20valorBCICMS;
    private String icms20percentualAliquota;
    private String icms20valorTributo;
    private String icms20valorICMSDesoneracao;
    private Integer icms20desoneracao;

    //-ICMS 30
    private Integer icms30origem;
    private Integer icms30situacaoTributaria;
    private Integer icms30modalidadeDeterminacaoBC;
    private String icms30percentualMargemValorAdicionadoICMSST;
    private String icms30percentualReducaoBCICMSST;
    private String icms30valorBCICMSST;
    private String icms30percentualAliquotaImpostoICMSST;
    private String icms30valorImpostoICMSST;
    private String icms30valorICMSDesoneracao;
    private Integer icms30desoneracao;

    //-ICMS 40
    private Integer icms40origem;
    private Integer icms40situacaoTributaria;
    private String icms40valorICMSDesoneracao;
    private Integer icms40motivoDesoneracaoICMS;

    //-ICMS 51
    private Integer icms51origem;
    private Integer icms51situacaoTributaria;
    private Integer icms51modalidadeBC;
    private String icms51percentualReducaoBC;
    private String icms51valorBCICMS;
    private String icms51percentualICMS;
    private String icms51valorICMSOperacao;
    private String icms51percentualDiferimento;
    private String icms51valorICMSDiferimento;
    private String icms51valorICMS;

    //-ICMS 60
    private Integer icms60origem;
    private Integer icms60situacaoTributaria;
    private String icms60valorBCICMSSTRetido;
    private String icms60valorICMSSTRetido;

    private Integer icms70origem;
    private Integer icms70situacaoTributaria;
    private Integer icms70modalidadeBC;
    private String icms70percentualReducaoBC;
    private String icms70valorBC;
    private String icms70percentualAliquota;
    private String icms70valorTributo;
    private Integer icms70modalidadeDeterminacaoBCICMSST;
    private String icms70percentualMargemValorAdicionadoICMSST;
    private String icms70percentualReducaoBCICMSST;
    private String icms70valorBCST;
    private String icms70percentualAliquotaImpostoICMSST;
    private String icms70valorICMSST;
    private String icms70valorICMSDesoneracao;
    private Integer icms70desoneracao;

    //-ICMS 90
    private Integer icms90origem;
    private Integer icms90situacaoTributaria;
    private Integer icms90modalidadeBC;
    private String icms90valorBC;
    private String icms90percentualReducaoBC;
    private String icms90percentualAliquota;
    private String icms90valorTributo;
    private Integer icms90modalidadeDeterminacaoBCICMSST;
    private String icms90percentualMargemValorAdicionadoICMSST;
    private String icms90percentualReducaoBCICMSST;
    private String icms90valorBCST;
    private String icms90percentualAliquotaImpostoICMSST;
    private String icms90valorICMSST;
    private String icms90valorICMSDesoneracao;
    private Integer icms90desoneracao;

    //-ICMS PARTILHADO
    private Integer icmsPartilhadoorigem;
    private Integer icmsPartilhadosituacaoTributaria;
    private Integer icmsPartilhadomodalidadeDeterminacaoBCICMS;
    private String icmsPartilhadovalorBCICMS;
    private String icmsPartilhadopercentualReducaoBC;
    private String icmsPartilhadopercentualAliquotaImposto;
    private String icmsPartilhadovalorICMS;
    private Integer icmsPartilhadomodalidadeBCICMSST;
    private String icmsPartilhadopercentualMargemValorAdicionadoICMSST;
    private String icmsPartilhadopercentualReducaoBCICMSST;
    private String icmsPartilhadovalorBCICMSST;
    private String icmsPartilhadopercentualAliquotaImpostoICMSST;
    private String icmsPartilhadovalorICMSST;
    private String icmsPartilhadopercentualBCOperacaoPropria;
    private String icmsPartilhadoufICMSST;

    //-ICMS SET
    private Integer icmsstorigem;
    private Integer icmsstsituacaoTributaria;
    private String icmsstvalorBCICMSSTRetidoUFRemetente;
    private String icmsstvalorICMSSTRetidoUFRemetente;
    private String icmsstvalorBCICMSSTUFDestino;
    private String icmsstvalorICMSSTUFDestino;

    //-ICMS 101
    private Integer icmssn101origem;
    private Integer icmssn101situacaoOperacaoSN;
    private String icmssn101percentualAliquotaAplicavelCalculoCreditoSN;
    private String icmssn101valorCreditoICMSSN;

    //-ICMS 102
    private Integer icmssn102origem;
    private Integer icmssn102situacaoOperacaoSN;

    //-ICMS 201
    private Integer icmssn201origem;
    private Integer icmssn201situacaoOperacaoSN;
    private Integer icmssn201modalidadeDeterminacaoBCICMSST;
    private String icmssn201percentualMargemValorAdicionadoICMSST;
    private String icmssn201percentualReducaoBCICMSST;
    private String icmssn201valorBCICMSST;
    private String icmssn201percentualAliquotaImpostoICMSST;
    private String icmssn201valorICMSST;
    private String icmssn201percentualAliquotaAplicavelCalculoCreditoSN;
    private String icmssn201valorCreditoICMSSN;

    //-ICMS 202
    private Integer icmssn202origem;
    private Integer icmssn202situacaoOperacaoSN;
    private Integer icmssn202modalidadeDeterminacaoBCICMSST;
    private String icmssn202percentualMargemValorAdicionadoICMSST;
    private String icmssn202percentualReducaoBCICMSST;
    private String icmssn202valorBCICMSST;
    private String icmssn202percentualAliquotaImpostoICMSST;
    private String icmssn202valorICMSST;

    //-ICMS 500
    private Integer icmssn500origem;
    private Integer icmssn500situacaoOperacaoSN;
    private String icmssn500valorBCICMSSTRetido;
    private String icmssn500valorICMSSTRetido;

    //-ICMS 900
    private Integer icmssn900origem;
    private Integer icmssn900situacaoOperacaoSN;
    private Integer icmssn900modalidadeDeterminacaoBCICMS;
    private String icmssn900valorBCICMS;
    private String icmssn900percentualReducaoBC;
    private String icmssn900percentualAliquotaImposto;
    private String icmssn900valorICMS;
    private Integer icmssn900modalidadeBCICMSST;
    private String icmssn900percentualMargemValorAdicionadoICMSST;
    private String icmssn900percentualReducaoBCICMSST;
    private String icmssn900valorBCICMSST;
    private String icmssn900percentualAliquotaImpostoICMSST;
    private String icmssn900valorICMSST;
    private String icmssn900aliquotaAplicavelCalculoCreditoSN;
    private String icmssn900valorCreditoICMSSN;

    //IPI
    private String ipiclasseEnquadramento;
    private String ipicnpjProdutor;
    private String ipicodigoSelo;
    private BigInteger ipiquantidadeSelo;
    private String ipicodigoEnquadramento;

    private Integer ipitributadosituacaoTributaria;
    private String ipitributadovalorBaseCalculo;
    private String ipitributadopercentualAliquota;
    private String ipitributadoquantidade;
    private String ipitributadovalorUnidadeTributavel;
    private String ipitributadovalorTributo;

    private Integer ipinaoTributadoSituacaoTributaria;

    //Imposto Importacao
    private String ImportacaovalorBaseCalculo;
    private String ImportacaovalorDespesaAduaneira;
    private String ImportacaovalorImpostoImportacao;
    private String ImportacaovalorIOF;

    //ISSQN
    private String issqnvalorBaseCalculo;
    private String issqnvalorAliquota;
    private String issqnvalor;
    private Integer issqncodigoMunicipio;
    private String issqnitemListaServicos;
    private String issqnvalorDeducao;
    private String issqnvalorOutro;
    private String issqnvalorDescontoIncondicionado;
    private String issqnvalorDescontoCondicionado;
    private String issqnvalorRetencaoISS;
    private Integer issqnindicadorExigibilidadeISS;
    private String issqncodigoServico;
    private String issqncodigoMunicipioIncidenciaImposto;
    private String issqncodigoPais;
    private String issqnnumeroProcesso;
    private Integer issqnindicadorIncentivoFiscal;

    //PIS
    private Integer pisAliqsituacaoTributaria;
    private String pisAliqvalorBaseCalculo;
    private String pisAliqpercentualAliquota;
    private String pisAliqvalorTributo;

    private Integer pisQtdsituacaoTributaria;
    private String pisQtdquantidadeVendida;
    private String pisQtdvalorAliquota;
    private String pisQtdvalorTributo;

    private Integer pisNTribsituacaoTributaria;

    private Integer pisOutrossituacaoTributaria;
    private String pisOutrosvalorBaseCalculo;
    private String pisOutrospercentualAliquota;
    private String pisOutrosquantidadeVendida;
    private String pisOutrosvalorAliquota;
    private String pisOutrosvalorTributo;

    //PISST
    private String pisstvalorBaseCalculo;
    private String pisstpercentualAliquota;
    private String pisstquantidadeVendida;
    private String pisstvalorAliquota;
    private String pisstvalorTributo;

    //-COFINS   
    private Integer ConfinsAliqsituacaoTributaria;
    private String ConfinsAliqvalorBaseCalulo;
    private String ConfinsAliqpercentualAliquota;
    private String ConfinsAliqvalor;

    private Integer CofinsQtdsituacaoTributaria;
    private String CofinsQtdquantidadeVendida;
    private String CofinsQtdvalorAliquota;

    private Integer CofninsNTributsituacaoTributaria;

    private Integer ConfinsOutrossituacaoTributaria;
    private String ConfinsOutrosvalorBaseCalculo;
    private String ConfinsOutrospercentualCOFINS;
    private String ConfinsOutrosquantidadeVendida;
    private String ConfinsOutrosvalorAliquota;
    private String ConfinsOutrosvalorCOFINS;

    //-CONFINSST
    private String cofinsstvalorBaseCalculo;
    private String cofinsstpercentualAliquota;
    private String cofinsstquantidadeVendida;
    private String cofinsstvalorAliquotaCOFINS;
    private String cofinsstvalorCOFINS;

    //informacao Imposto Devolvido
    private String percentualDevolucao;
    private String valorIPIDevolvido;

    //Informacoes Adicionais
    private String informacoesAdicionais;

    public Integer getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(Integer numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public Integer getExtipi() {
        return extipi;
    }

    public void setExtipi(Integer extipi) {
        this.extipi = extipi;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getUnidadeComercial() {
        return unidadeComercial;
    }

    public void setUnidadeComercial(String unidadeComercial) {
        this.unidadeComercial = unidadeComercial;
    }

    public String getQuantidadeComercial() {
        return quantidadeComercial;
    }

    public void setQuantidadeComercial(String quantidadeComercial) {
        this.quantidadeComercial = quantidadeComercial;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getValorTotalBruto() {
        return valorTotalBruto;
    }

    public void setValorTotalBruto(String valorTotalBruto) {
        this.valorTotalBruto = valorTotalBruto;
    }

    public String getCodigoDeBarrasTributavel() {
        return codigoDeBarrasTributavel;
    }

    public void setCodigoDeBarrasTributavel(String codigoDeBarrasTributavel) {
        this.codigoDeBarrasTributavel = codigoDeBarrasTributavel;
    }

    public String getUnidadeTributavel() {
        return unidadeTributavel;
    }

    public void setUnidadeTributavel(String unidadeTributavel) {
        this.unidadeTributavel = unidadeTributavel;
    }

    public String getQuantidadeTributavel() {
        return quantidadeTributavel;
    }

    public void setQuantidadeTributavel(String quantidadeTributavel) {
        this.quantidadeTributavel = quantidadeTributavel;
    }

    public String getValorUnitarioTributavel() {
        return valorUnitarioTributavel;
    }

    public void setValorUnitarioTributavel(String valorUnitarioTributavel) {
        this.valorUnitarioTributavel = valorUnitarioTributavel;
    }

    public String getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(String valorFrete) {
        this.valorFrete = valorFrete;
    }

    public String getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(String valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public String getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(String valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getValorOutrasDespesasAcessorias() {
        return valorOutrasDespesasAcessorias;
    }

    public void setValorOutrasDespesasAcessorias(String valorOutrasDespesasAcessorias) {
        this.valorOutrasDespesasAcessorias = valorOutrasDespesasAcessorias;
    }

    public Integer getCompoeValorNota() {
        return compoeValorNota;
    }

    public void setCompoeValorNota(Integer compoeValorNota) {
        this.compoeValorNota = compoeValorNota;
    }

    public String getNumeroPedidoCliente() {
        return numeroPedidoCliente;
    }

    public void setNumeroPedidoCliente(String numeroPedidoCliente) {
        this.numeroPedidoCliente = numeroPedidoCliente;
    }

    public Integer getNumeroPedidoItemCliente() {
        return numeroPedidoItemCliente;
    }

    public void setNumeroPedidoItemCliente(Integer numeroPedidoItemCliente) {
        this.numeroPedidoItemCliente = numeroPedidoItemCliente;
    }

    public String getNumeroControleFCI() {
        return numeroControleFCI;
    }

    public void setNumeroControleFCI(String numeroControleFCI) {
        this.numeroControleFCI = numeroControleFCI;
    }

    public Integer getVeitipoOperacao() {
        return VeitipoOperacao;
    }

    public void setVeitipoOperacao(Integer VeitipoOperacao) {
        this.VeitipoOperacao = VeitipoOperacao;
    }

    public String getVeichassi() {
        return Veichassi;
    }

    public void setVeichassi(String Veichassi) {
        this.Veichassi = Veichassi;
    }

    public String getVeicodigoCor() {
        return VeicodigoCor;
    }

    public void setVeicodigoCor(String VeicodigoCor) {
        this.VeicodigoCor = VeicodigoCor;
    }

    public String getVeidescricaoCor() {
        return VeidescricaoCor;
    }

    public void setVeidescricaoCor(String VeidescricaoCor) {
        this.VeidescricaoCor = VeidescricaoCor;
    }

    public String getVeipotencia() {
        return Veipotencia;
    }

    public void setVeipotencia(String Veipotencia) {
        this.Veipotencia = Veipotencia;
    }

    public String getVeicilindrada() {
        return Veicilindrada;
    }

    public void setVeicilindrada(String Veicilindrada) {
        this.Veicilindrada = Veicilindrada;
    }

    public String getVeipesoLiquido() {
        return VeipesoLiquido;
    }

    public void setVeipesoLiquido(String VeipesoLiquido) {
        this.VeipesoLiquido = VeipesoLiquido;
    }

    public String getVeipesoBruto() {
        return VeipesoBruto;
    }

    public void setVeipesoBruto(String VeipesoBruto) {
        this.VeipesoBruto = VeipesoBruto;
    }

    public String getVeinumeroSerie() {
        return VeinumeroSerie;
    }

    public void setVeinumeroSerie(String VeinumeroSerie) {
        this.VeinumeroSerie = VeinumeroSerie;
    }

    public Integer getVeitipoCombustivel() {
        return VeitipoCombustivel;
    }

    public void setVeitipoCombustivel(Integer VeitipoCombustivel) {
        this.VeitipoCombustivel = VeitipoCombustivel;
    }

    public String getVeinumeroMotor() {
        return VeinumeroMotor;
    }

    public void setVeinumeroMotor(String VeinumeroMotor) {
        this.VeinumeroMotor = VeinumeroMotor;
    }

    public String getVeicapacidadeMaximaTracao() {
        return VeicapacidadeMaximaTracao;
    }

    public void setVeicapacidadeMaximaTracao(String VeicapacidadeMaximaTracao) {
        this.VeicapacidadeMaximaTracao = VeicapacidadeMaximaTracao;
    }

    public String getVeidistanciaEntreEixos() {
        return VeidistanciaEntreEixos;
    }

    public void setVeidistanciaEntreEixos(String VeidistanciaEntreEixos) {
        this.VeidistanciaEntreEixos = VeidistanciaEntreEixos;
    }

    public Integer getVeianoModeloFabricacao() {
        return VeianoModeloFabricacao;
    }

    public void setVeianoModeloFabricacao(Integer VeianoModeloFabricacao) {
        this.VeianoModeloFabricacao = VeianoModeloFabricacao;
    }

    public Integer getVeianoFabricacao() {
        return VeianoFabricacao;
    }

    public void setVeianoFabricacao(Integer VeianoFabricacao) {
        this.VeianoFabricacao = VeianoFabricacao;
    }

    public String getVeitipoPintura() {
        return VeitipoPintura;
    }

    public void setVeitipoPintura(String VeitipoPintura) {
        this.VeitipoPintura = VeitipoPintura;
    }

    public Integer getVeitipoVeiculo() {
        return VeitipoVeiculo;
    }

    public void setVeitipoVeiculo(Integer VeitipoVeiculo) {
        this.VeitipoVeiculo = VeitipoVeiculo;
    }

    public Integer getVeiespecieVeiculo() {
        return VeiespecieVeiculo;
    }

    public void setVeiespecieVeiculo(Integer VeiespecieVeiculo) {
        this.VeiespecieVeiculo = VeiespecieVeiculo;
    }

    public Integer getVeicondicaoChassi() {
        return VeicondicaoChassi;
    }

    public void setVeicondicaoChassi(Integer VeicondicaoChassi) {
        this.VeicondicaoChassi = VeicondicaoChassi;
    }

    public Integer getVeicondicao() {
        return Veicondicao;
    }

    public void setVeicondicao(Integer Veicondicao) {
        this.Veicondicao = Veicondicao;
    }

    public String getVeicodigoMarcaModelo() {
        return VeicodigoMarcaModelo;
    }

    public void setVeicodigoMarcaModelo(String VeicodigoMarcaModelo) {
        this.VeicodigoMarcaModelo = VeicodigoMarcaModelo;
    }

    public Integer getVeicorDENATRAN() {
        return VeicorDENATRAN;
    }

    public void setVeicorDENATRAN(Integer VeicorDENATRAN) {
        this.VeicorDENATRAN = VeicorDENATRAN;
    }

    public Integer getVeilotacao() {
        return Veilotacao;
    }

    public void setVeilotacao(Integer Veilotacao) {
        this.Veilotacao = Veilotacao;
    }

    public Integer getVeirestricao() {
        return Veirestricao;
    }

    public void setVeirestricao(Integer Veirestricao) {
        this.Veirestricao = Veirestricao;
    }

    public String getCombscodigoProdutoANP() {
        return CombscodigoProdutoANP;
    }

    public void setCombscodigoProdutoANP(String CombscodigoProdutoANP) {
        this.CombscodigoProdutoANP = CombscodigoProdutoANP;
    }

    public String getCombspercentualGasNatural() {
        return CombspercentualGasNatural;
    }

    public void setCombspercentualGasNatural(String CombspercentualGasNatural) {
        this.CombspercentualGasNatural = CombspercentualGasNatural;
    }

    public String getCombscodigoAutorizacaoCOFIF() {
        return CombscodigoAutorizacaoCOFIF;
    }

    public void setCombscodigoAutorizacaoCOFIF(String CombscodigoAutorizacaoCOFIF) {
        this.CombscodigoAutorizacaoCOFIF = CombscodigoAutorizacaoCOFIF;
    }

    public String getCombsquantidade() {
        return Combsquantidade;
    }

    public void setCombsquantidade(String Combsquantidade) {
        this.Combsquantidade = Combsquantidade;
    }

    public String getCombsuf() {
        return Combsuf;
    }

    public void setCombsuf(String Combsuf) {
        this.Combsuf = Combsuf;
    }

    public String getCombCIDEquantidadeBCCIDE() {
        return CombCIDEquantidadeBCCIDE;
    }

    public void setCombCIDEquantidadeBCCIDE(String CombCIDEquantidadeBCCIDE) {
        this.CombCIDEquantidadeBCCIDE = CombCIDEquantidadeBCCIDE;
    }

    public String getCombCIDEvalorAliquota() {
        return CombCIDEvalorAliquota;
    }

    public void setCombCIDEvalorAliquota(String CombCIDEvalorAliquota) {
        this.CombCIDEvalorAliquota = CombCIDEvalorAliquota;
    }

    public String getCombCIDEvalor() {
        return CombCIDEvalor;
    }

    public void setCombCIDEvalor(String CombCIDEvalor) {
        this.CombCIDEvalor = CombCIDEvalor;
    }

    public String getNumeroRECOPI() {
        return numeroRECOPI;
    }

    public void setNumeroRECOPI(String numeroRECOPI) {
        this.numeroRECOPI = numeroRECOPI;
    }

    public List<String> getNomeclaturaValorAduaneiroEstatistica() {
        return nomeclaturaValorAduaneiroEstatistica;
    }

    public void setNomeclaturaValorAduaneiroEstatistica(List<String> nomeclaturaValorAduaneiroEstatistica) {
        this.nomeclaturaValorAduaneiroEstatistica = nomeclaturaValorAduaneiroEstatistica;
    }

    public List<NFNotaInfoItemProdutoMedicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<NFNotaInfoItemProdutoMedicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public List<NFNotaInfoItemProdutoArmamento> getArmamentos() {
        return armamentos;
    }

    public void setArmamentos(List<NFNotaInfoItemProdutoArmamento> armamentos) {
        this.armamentos = armamentos;
    }

    public List<NFNotaInfoItemProdutoDeclaracaoImportacao> getDeclaracoesImportacao() {
        return declaracoesImportacao;
    }

    public void setDeclaracoesImportacao(List<NFNotaInfoItemProdutoDeclaracaoImportacao> declaracoesImportacao) {
        this.declaracoesImportacao = declaracoesImportacao;
    }

    public List<NFNotaInfoItemDetalheExportacao> getDetalhesExportacao() {
        return detalhesExportacao;
    }

    public void setDetalhesExportacao(List<NFNotaInfoItemDetalheExportacao> detalhesExportacao) {
        this.detalhesExportacao = detalhesExportacao;
    }

    public String getValorTotalTributos() {
        return valorTotalTributos;
    }

    public void setValorTotalTributos(String valorTotalTributos) {
        this.valorTotalTributos = valorTotalTributos;
    }

    public boolean isIsSelecionado() {
        return isSelecionado;
    }

    public void setIsSelecionado(boolean isSelecionado) {
        this.isSelecionado = isSelecionado;
    }

    public Integer getIcms00origem() {
        return icms00origem;
    }

    public void setIcms00origem(Integer icms00origem) {
        this.icms00origem = icms00origem;
    }

    public Integer getIcms00situacaoTributaria() {
        return icms00situacaoTributaria;
    }

    public void setIcms00situacaoTributaria(Integer icms00situacaoTributaria) {
        this.icms00situacaoTributaria = icms00situacaoTributaria;
    }

    public Integer getIcms00modalidadeBaseCalculo() {
        return icms00modalidadeBaseCalculo;
    }

    public void setIcms00modalidadeBaseCalculo(Integer icms00modalidadeBaseCalculo) {
        this.icms00modalidadeBaseCalculo = icms00modalidadeBaseCalculo;
    }

    public String getIcms00valorBaseCalculo() {
        return icms00valorBaseCalculo;
    }

    public void setIcms00valorBaseCalculo(String icms00valorBaseCalculo) {
        this.icms00valorBaseCalculo = icms00valorBaseCalculo;
    }

    public String getIcms00percentualAliquota() {
        return icms00percentualAliquota;
    }

    public void setIcms00percentualAliquota(String icms00percentualAliquota) {
        this.icms00percentualAliquota = icms00percentualAliquota;
    }

    public String getIcms00valorTributo() {
        return icms00valorTributo;
    }

    public void setIcms00valorTributo(String icms00valorTributo) {
        this.icms00valorTributo = icms00valorTributo;
    }

    public Integer getIcms10origem() {
        return icms10origem;
    }

    public void setIcms10origem(Integer icms10origem) {
        this.icms10origem = icms10origem;
    }

    public Integer getIcms10situacaoTributaria() {
        return icms10situacaoTributaria;
    }

    public void setIcms10situacaoTributaria(Integer icms10situacaoTributaria) {
        this.icms10situacaoTributaria = icms10situacaoTributaria;
    }

    public Integer getIcms10modalidadeBaseCalculo() {
        return icms10modalidadeBaseCalculo;
    }

    public void setIcms10modalidadeBaseCalculo(Integer icms10modalidadeBaseCalculo) {
        this.icms10modalidadeBaseCalculo = icms10modalidadeBaseCalculo;
    }

    public String getIcms10valorBaseCalculo() {
        return icms10valorBaseCalculo;
    }

    public void setIcms10valorBaseCalculo(String icms10valorBaseCalculo) {
        this.icms10valorBaseCalculo = icms10valorBaseCalculo;
    }

    public String getIcms10percentualAliquota() {
        return icms10percentualAliquota;
    }

    public void setIcms10percentualAliquota(String icms10percentualAliquota) {
        this.icms10percentualAliquota = icms10percentualAliquota;
    }

    public String getIcms10valorTributo() {
        return icms10valorTributo;
    }

    public void setIcms10valorTributo(String icms10valorTributo) {
        this.icms10valorTributo = icms10valorTributo;
    }

    public Integer getIcms10modalidadeDeterminacaoBCICMS() {
        return icms10modalidadeDeterminacaoBCICMS;
    }

    public void setIcms10modalidadeDeterminacaoBCICMS(Integer icms10modalidadeDeterminacaoBCICMS) {
        this.icms10modalidadeDeterminacaoBCICMS = icms10modalidadeDeterminacaoBCICMS;
    }

    public String getIcms10percentualMargemValorICMSST() {
        return icms10percentualMargemValorICMSST;
    }

    public void setIcms10percentualMargemValorICMSST(String icms10percentualMargemValorICMSST) {
        this.icms10percentualMargemValorICMSST = icms10percentualMargemValorICMSST;
    }

    public String getIcms10percentualReducaoBCICMSST() {
        return icms10percentualReducaoBCICMSST;
    }

    public void setIcms10percentualReducaoBCICMSST(String icms10percentualReducaoBCICMSST) {
        this.icms10percentualReducaoBCICMSST = icms10percentualReducaoBCICMSST;
    }

    public String getIcms10valorBCICMSST() {
        return icms10valorBCICMSST;
    }

    public void setIcms10valorBCICMSST(String icms10valorBCICMSST) {
        this.icms10valorBCICMSST = icms10valorBCICMSST;
    }

    public String getIcms10percentualAliquotaImpostoICMSST() {
        return icms10percentualAliquotaImpostoICMSST;
    }

    public void setIcms10percentualAliquotaImpostoICMSST(String icms10percentualAliquotaImpostoICMSST) {
        this.icms10percentualAliquotaImpostoICMSST = icms10percentualAliquotaImpostoICMSST;
    }

    public String getIcms10valorICMSST() {
        return icms10valorICMSST;
    }

    public void setIcms10valorICMSST(String icms10valorICMSST) {
        this.icms10valorICMSST = icms10valorICMSST;
    }

    public Integer getIcms20origem() {
        return icms20origem;
    }

    public void setIcms20origem(Integer icms20origem) {
        this.icms20origem = icms20origem;
    }

    public Integer getIcms20situacaoTributaria() {
        return icms20situacaoTributaria;
    }

    public void setIcms20situacaoTributaria(Integer icms20situacaoTributaria) {
        this.icms20situacaoTributaria = icms20situacaoTributaria;
    }

    public Integer getIcms20modalidadeBaseCalculo() {
        return icms20modalidadeBaseCalculo;
    }

    public void setIcms20modalidadeBaseCalculo(Integer icms20modalidadeBaseCalculo) {
        this.icms20modalidadeBaseCalculo = icms20modalidadeBaseCalculo;
    }

    public String getIcms20percentualReducaoBC() {
        return icms20percentualReducaoBC;
    }

    public void setIcms20percentualReducaoBC(String icms20percentualReducaoBC) {
        this.icms20percentualReducaoBC = icms20percentualReducaoBC;
    }

    public String getIcms20valorBCICMS() {
        return icms20valorBCICMS;
    }

    public void setIcms20valorBCICMS(String icms20valorBCICMS) {
        this.icms20valorBCICMS = icms20valorBCICMS;
    }

    public String getIcms20percentualAliquota() {
        return icms20percentualAliquota;
    }

    public void setIcms20percentualAliquota(String icms20percentualAliquota) {
        this.icms20percentualAliquota = icms20percentualAliquota;
    }

    public String getIcms20valorTributo() {
        return icms20valorTributo;
    }

    public void setIcms20valorTributo(String icms20valorTributo) {
        this.icms20valorTributo = icms20valorTributo;
    }

    public String getIcms20valorICMSDesoneracao() {
        return icms20valorICMSDesoneracao;
    }

    public void setIcms20valorICMSDesoneracao(String icms20valorICMSDesoneracao) {
        this.icms20valorICMSDesoneracao = icms20valorICMSDesoneracao;
    }

    public Integer getIcms20desoneracao() {
        return icms20desoneracao;
    }

    public void setIcms20desoneracao(Integer icms20desoneracao) {
        this.icms20desoneracao = icms20desoneracao;
    }

    public Integer getIcms30origem() {
        return icms30origem;
    }

    public void setIcms30origem(Integer icms30origem) {
        this.icms30origem = icms30origem;
    }

    public Integer getIcms30situacaoTributaria() {
        return icms30situacaoTributaria;
    }

    public void setIcms30situacaoTributaria(Integer icms30situacaoTributaria) {
        this.icms30situacaoTributaria = icms30situacaoTributaria;
    }

    public Integer getIcms30modalidadeDeterminacaoBC() {
        return icms30modalidadeDeterminacaoBC;
    }

    public void setIcms30modalidadeDeterminacaoBC(Integer icms30modalidadeDeterminacaoBC) {
        this.icms30modalidadeDeterminacaoBC = icms30modalidadeDeterminacaoBC;
    }

    public String getIcms30percentualMargemValorAdicionadoICMSST() {
        return icms30percentualMargemValorAdicionadoICMSST;
    }

    public void setIcms30percentualMargemValorAdicionadoICMSST(String icms30percentualMargemValorAdicionadoICMSST) {
        this.icms30percentualMargemValorAdicionadoICMSST = icms30percentualMargemValorAdicionadoICMSST;
    }

    public String getIcms30percentualReducaoBCICMSST() {
        return icms30percentualReducaoBCICMSST;
    }

    public void setIcms30percentualReducaoBCICMSST(String icms30percentualReducaoBCICMSST) {
        this.icms30percentualReducaoBCICMSST = icms30percentualReducaoBCICMSST;
    }

    public String getIcms30valorBCICMSST() {
        return icms30valorBCICMSST;
    }

    public void setIcms30valorBCICMSST(String icms30valorBCICMSST) {
        this.icms30valorBCICMSST = icms30valorBCICMSST;
    }

    public String getIcms30percentualAliquotaImpostoICMSST() {
        return icms30percentualAliquotaImpostoICMSST;
    }

    public void setIcms30percentualAliquotaImpostoICMSST(String icms30percentualAliquotaImpostoICMSST) {
        this.icms30percentualAliquotaImpostoICMSST = icms30percentualAliquotaImpostoICMSST;
    }

    public String getIcms30valorImpostoICMSST() {
        return icms30valorImpostoICMSST;
    }

    public void setIcms30valorImpostoICMSST(String icms30valorImpostoICMSST) {
        this.icms30valorImpostoICMSST = icms30valorImpostoICMSST;
    }

    public String getIcms30valorICMSDesoneracao() {
        return icms30valorICMSDesoneracao;
    }

    public void setIcms30valorICMSDesoneracao(String icms30valorICMSDesoneracao) {
        this.icms30valorICMSDesoneracao = icms30valorICMSDesoneracao;
    }

    public Integer getIcms30desoneracao() {
        return icms30desoneracao;
    }

    public void setIcms30desoneracao(Integer icms30desoneracao) {
        this.icms30desoneracao = icms30desoneracao;
    }

    public Integer getIcms40origem() {
        return icms40origem;
    }

    public void setIcms40origem(Integer icms40origem) {
        this.icms40origem = icms40origem;
    }

    public Integer getIcms40situacaoTributaria() {
        return icms40situacaoTributaria;
    }

    public void setIcms40situacaoTributaria(Integer icms40situacaoTributaria) {
        this.icms40situacaoTributaria = icms40situacaoTributaria;
    }

    public String getIcms40valorICMSDesoneracao() {
        return icms40valorICMSDesoneracao;
    }

    public void setIcms40valorICMSDesoneracao(String icms40valorICMSDesoneracao) {
        this.icms40valorICMSDesoneracao = icms40valorICMSDesoneracao;
    }

    public Integer getIcms40motivoDesoneracaoICMS() {
        return icms40motivoDesoneracaoICMS;
    }

    public void setIcms40motivoDesoneracaoICMS(Integer icms40motivoDesoneracaoICMS) {
        this.icms40motivoDesoneracaoICMS = icms40motivoDesoneracaoICMS;
    }

    public Integer getIcms51origem() {
        return icms51origem;
    }

    public void setIcms51origem(Integer icms51origem) {
        this.icms51origem = icms51origem;
    }

    public Integer getIcms51situacaoTributaria() {
        return icms51situacaoTributaria;
    }

    public void setIcms51situacaoTributaria(Integer icms51situacaoTributaria) {
        this.icms51situacaoTributaria = icms51situacaoTributaria;
    }

    public Integer getIcms51modalidadeBC() {
        return icms51modalidadeBC;
    }

    public void setIcms51modalidadeBC(Integer icms51modalidadeBC) {
        this.icms51modalidadeBC = icms51modalidadeBC;
    }

    public String getIcms51percentualReducaoBC() {
        return icms51percentualReducaoBC;
    }

    public void setIcms51percentualReducaoBC(String icms51percentualReducaoBC) {
        this.icms51percentualReducaoBC = icms51percentualReducaoBC;
    }

    public String getIcms51valorBCICMS() {
        return icms51valorBCICMS;
    }

    public void setIcms51valorBCICMS(String icms51valorBCICMS) {
        this.icms51valorBCICMS = icms51valorBCICMS;
    }

    public String getIcms51percentualICMS() {
        return icms51percentualICMS;
    }

    public void setIcms51percentualICMS(String icms51percentualICMS) {
        this.icms51percentualICMS = icms51percentualICMS;
    }

    public String getIcms51valorICMSOperacao() {
        return icms51valorICMSOperacao;
    }

    public void setIcms51valorICMSOperacao(String icms51valorICMSOperacao) {
        this.icms51valorICMSOperacao = icms51valorICMSOperacao;
    }

    public String getIcms51percentualDiferimento() {
        return icms51percentualDiferimento;
    }

    public void setIcms51percentualDiferimento(String icms51percentualDiferimento) {
        this.icms51percentualDiferimento = icms51percentualDiferimento;
    }

    public String getIcms51valorICMSDiferimento() {
        return icms51valorICMSDiferimento;
    }

    public void setIcms51valorICMSDiferimento(String icms51valorICMSDiferimento) {
        this.icms51valorICMSDiferimento = icms51valorICMSDiferimento;
    }

    public String getIcms51valorICMS() {
        return icms51valorICMS;
    }

    public void setIcms51valorICMS(String icms51valorICMS) {
        this.icms51valorICMS = icms51valorICMS;
    }

    public Integer getIcms60origem() {
        return icms60origem;
    }

    public void setIcms60origem(Integer icms60origem) {
        this.icms60origem = icms60origem;
    }

    public Integer getIcms60situacaoTributaria() {
        return icms60situacaoTributaria;
    }

    public void setIcms60situacaoTributaria(Integer icms60situacaoTributaria) {
        this.icms60situacaoTributaria = icms60situacaoTributaria;
    }

    public String getIcms60valorBCICMSSTRetido() {
        return icms60valorBCICMSSTRetido;
    }

    public void setIcms60valorBCICMSSTRetido(String icms60valorBCICMSSTRetido) {
        this.icms60valorBCICMSSTRetido = icms60valorBCICMSSTRetido;
    }

    public String getIcms60valorICMSSTRetido() {
        return icms60valorICMSSTRetido;
    }

    public void setIcms60valorICMSSTRetido(String icms60valorICMSSTRetido) {
        this.icms60valorICMSSTRetido = icms60valorICMSSTRetido;
    }

    public Integer getIcms70origem() {
        return icms70origem;
    }

    public void setIcms70origem(Integer icms70origem) {
        this.icms70origem = icms70origem;
    }

    public Integer getIcms70situacaoTributaria() {
        return icms70situacaoTributaria;
    }

    public void setIcms70situacaoTributaria(Integer icms70situacaoTributaria) {
        this.icms70situacaoTributaria = icms70situacaoTributaria;
    }

    public Integer getIcms70modalidadeBC() {
        return icms70modalidadeBC;
    }

    public void setIcms70modalidadeBC(Integer icms70modalidadeBC) {
        this.icms70modalidadeBC = icms70modalidadeBC;
    }

    public String getIcms70percentualReducaoBC() {
        return icms70percentualReducaoBC;
    }

    public void setIcms70percentualReducaoBC(String icms70percentualReducaoBC) {
        this.icms70percentualReducaoBC = icms70percentualReducaoBC;
    }

    public String getIcms70valorBC() {
        return icms70valorBC;
    }

    public void setIcms70valorBC(String icms70valorBC) {
        this.icms70valorBC = icms70valorBC;
    }

    public String getIcms70percentualAliquota() {
        return icms70percentualAliquota;
    }

    public void setIcms70percentualAliquota(String icms70percentualAliquota) {
        this.icms70percentualAliquota = icms70percentualAliquota;
    }

    public String getIcms70valorTributo() {
        return icms70valorTributo;
    }

    public void setIcms70valorTributo(String icms70valorTributo) {
        this.icms70valorTributo = icms70valorTributo;
    }

    public Integer getIcms70modalidadeDeterminacaoBCICMSST() {
        return icms70modalidadeDeterminacaoBCICMSST;
    }

    public void setIcms70modalidadeDeterminacaoBCICMSST(Integer icms70modalidadeDeterminacaoBCICMSST) {
        this.icms70modalidadeDeterminacaoBCICMSST = icms70modalidadeDeterminacaoBCICMSST;
    }

    public String getIcms70percentualMargemValorAdicionadoICMSST() {
        return icms70percentualMargemValorAdicionadoICMSST;
    }

    public void setIcms70percentualMargemValorAdicionadoICMSST(String icms70percentualMargemValorAdicionadoICMSST) {
        this.icms70percentualMargemValorAdicionadoICMSST = icms70percentualMargemValorAdicionadoICMSST;
    }

    public String getIcms70percentualReducaoBCICMSST() {
        return icms70percentualReducaoBCICMSST;
    }

    public void setIcms70percentualReducaoBCICMSST(String icms70percentualReducaoBCICMSST) {
        this.icms70percentualReducaoBCICMSST = icms70percentualReducaoBCICMSST;
    }

    public String getIcms70valorBCST() {
        return icms70valorBCST;
    }

    public void setIcms70valorBCST(String icms70valorBCST) {
        this.icms70valorBCST = icms70valorBCST;
    }

    public String getIcms70percentualAliquotaImpostoICMSST() {
        return icms70percentualAliquotaImpostoICMSST;
    }

    public void setIcms70percentualAliquotaImpostoICMSST(String icms70percentualAliquotaImpostoICMSST) {
        this.icms70percentualAliquotaImpostoICMSST = icms70percentualAliquotaImpostoICMSST;
    }

    public String getIcms70valorICMSST() {
        return icms70valorICMSST;
    }

    public void setIcms70valorICMSST(String icms70valorICMSST) {
        this.icms70valorICMSST = icms70valorICMSST;
    }

    public String getIcms70valorICMSDesoneracao() {
        return icms70valorICMSDesoneracao;
    }

    public void setIcms70valorICMSDesoneracao(String icms70valorICMSDesoneracao) {
        this.icms70valorICMSDesoneracao = icms70valorICMSDesoneracao;
    }

    public Integer getIcms70desoneracao() {
        return icms70desoneracao;
    }

    public void setIcms70desoneracao(Integer icms70desoneracao) {
        this.icms70desoneracao = icms70desoneracao;
    }

    public Integer getIcms90origem() {
        return icms90origem;
    }

    public void setIcms90origem(Integer icms90origem) {
        this.icms90origem = icms90origem;
    }

    public Integer getIcms90situacaoTributaria() {
        return icms90situacaoTributaria;
    }

    public void setIcms90situacaoTributaria(Integer icms90situacaoTributaria) {
        this.icms90situacaoTributaria = icms90situacaoTributaria;
    }

    public Integer getIcms90modalidadeBC() {
        return icms90modalidadeBC;
    }

    public void setIcms90modalidadeBC(Integer icms90modalidadeBC) {
        this.icms90modalidadeBC = icms90modalidadeBC;
    }

    public String getIcms90valorBC() {
        return icms90valorBC;
    }

    public void setIcms90valorBC(String icms90valorBC) {
        this.icms90valorBC = icms90valorBC;
    }

    public String getIcms90percentualReducaoBC() {
        return icms90percentualReducaoBC;
    }

    public void setIcms90percentualReducaoBC(String icms90percentualReducaoBC) {
        this.icms90percentualReducaoBC = icms90percentualReducaoBC;
    }

    public String getIcms90percentualAliquota() {
        return icms90percentualAliquota;
    }

    public void setIcms90percentualAliquota(String icms90percentualAliquota) {
        this.icms90percentualAliquota = icms90percentualAliquota;
    }

    public String getIcms90valorTributo() {
        return icms90valorTributo;
    }

    public void setIcms90valorTributo(String icms90valorTributo) {
        this.icms90valorTributo = icms90valorTributo;
    }

    public Integer getIcms90modalidadeDeterminacaoBCICMSST() {
        return icms90modalidadeDeterminacaoBCICMSST;
    }

    public void setIcms90modalidadeDeterminacaoBCICMSST(Integer icms90modalidadeDeterminacaoBCICMSST) {
        this.icms90modalidadeDeterminacaoBCICMSST = icms90modalidadeDeterminacaoBCICMSST;
    }

    public String getIcms90percentualMargemValorAdicionadoICMSST() {
        return icms90percentualMargemValorAdicionadoICMSST;
    }

    public void setIcms90percentualMargemValorAdicionadoICMSST(String icms90percentualMargemValorAdicionadoICMSST) {
        this.icms90percentualMargemValorAdicionadoICMSST = icms90percentualMargemValorAdicionadoICMSST;
    }

    public String getIcms90percentualReducaoBCICMSST() {
        return icms90percentualReducaoBCICMSST;
    }

    public void setIcms90percentualReducaoBCICMSST(String icms90percentualReducaoBCICMSST) {
        this.icms90percentualReducaoBCICMSST = icms90percentualReducaoBCICMSST;
    }

    public String getIcms90valorBCST() {
        return icms90valorBCST;
    }

    public void setIcms90valorBCST(String icms90valorBCST) {
        this.icms90valorBCST = icms90valorBCST;
    }

    public String getIcms90percentualAliquotaImpostoICMSST() {
        return icms90percentualAliquotaImpostoICMSST;
    }

    public void setIcms90percentualAliquotaImpostoICMSST(String icms90percentualAliquotaImpostoICMSST) {
        this.icms90percentualAliquotaImpostoICMSST = icms90percentualAliquotaImpostoICMSST;
    }

    public String getIcms90valorICMSST() {
        return icms90valorICMSST;
    }

    public void setIcms90valorICMSST(String icms90valorICMSST) {
        this.icms90valorICMSST = icms90valorICMSST;
    }

    public String getIcms90valorICMSDesoneracao() {
        return icms90valorICMSDesoneracao;
    }

    public void setIcms90valorICMSDesoneracao(String icms90valorICMSDesoneracao) {
        this.icms90valorICMSDesoneracao = icms90valorICMSDesoneracao;
    }

    public Integer getIcms90desoneracao() {
        return icms90desoneracao;
    }

    public void setIcms90desoneracao(Integer icms90desoneracao) {
        this.icms90desoneracao = icms90desoneracao;
    }

    public Integer getIcmsPartilhadoorigem() {
        return icmsPartilhadoorigem;
    }

    public void setIcmsPartilhadoorigem(Integer icmsPartilhadoorigem) {
        this.icmsPartilhadoorigem = icmsPartilhadoorigem;
    }

    public Integer getIcmsPartilhadosituacaoTributaria() {
        return icmsPartilhadosituacaoTributaria;
    }

    public void setIcmsPartilhadosituacaoTributaria(Integer icmsPartilhadosituacaoTributaria) {
        this.icmsPartilhadosituacaoTributaria = icmsPartilhadosituacaoTributaria;
    }

    public Integer getIcmsPartilhadomodalidadeDeterminacaoBCICMS() {
        return icmsPartilhadomodalidadeDeterminacaoBCICMS;
    }

    public void setIcmsPartilhadomodalidadeDeterminacaoBCICMS(Integer icmsPartilhadomodalidadeDeterminacaoBCICMS) {
        this.icmsPartilhadomodalidadeDeterminacaoBCICMS = icmsPartilhadomodalidadeDeterminacaoBCICMS;
    }

    public String getIcmsPartilhadovalorBCICMS() {
        return icmsPartilhadovalorBCICMS;
    }

    public void setIcmsPartilhadovalorBCICMS(String icmsPartilhadovalorBCICMS) {
        this.icmsPartilhadovalorBCICMS = icmsPartilhadovalorBCICMS;
    }

    public String getIcmsPartilhadopercentualReducaoBC() {
        return icmsPartilhadopercentualReducaoBC;
    }

    public void setIcmsPartilhadopercentualReducaoBC(String icmsPartilhadopercentualReducaoBC) {
        this.icmsPartilhadopercentualReducaoBC = icmsPartilhadopercentualReducaoBC;
    }

    public String getIcmsPartilhadopercentualAliquotaImposto() {
        return icmsPartilhadopercentualAliquotaImposto;
    }

    public void setIcmsPartilhadopercentualAliquotaImposto(String icmsPartilhadopercentualAliquotaImposto) {
        this.icmsPartilhadopercentualAliquotaImposto = icmsPartilhadopercentualAliquotaImposto;
    }

    public String getIcmsPartilhadovalorICMS() {
        return icmsPartilhadovalorICMS;
    }

    public void setIcmsPartilhadovalorICMS(String icmsPartilhadovalorICMS) {
        this.icmsPartilhadovalorICMS = icmsPartilhadovalorICMS;
    }

    public Integer getIcmsPartilhadomodalidadeBCICMSST() {
        return icmsPartilhadomodalidadeBCICMSST;
    }

    public void setIcmsPartilhadomodalidadeBCICMSST(Integer icmsPartilhadomodalidadeBCICMSST) {
        this.icmsPartilhadomodalidadeBCICMSST = icmsPartilhadomodalidadeBCICMSST;
    }

    public String getIcmsPartilhadopercentualMargemValorAdicionadoICMSST() {
        return icmsPartilhadopercentualMargemValorAdicionadoICMSST;
    }

    public void setIcmsPartilhadopercentualMargemValorAdicionadoICMSST(String icmsPartilhadopercentualMargemValorAdicionadoICMSST) {
        this.icmsPartilhadopercentualMargemValorAdicionadoICMSST = icmsPartilhadopercentualMargemValorAdicionadoICMSST;
    }

    public String getIcmsPartilhadopercentualReducaoBCICMSST() {
        return icmsPartilhadopercentualReducaoBCICMSST;
    }

    public void setIcmsPartilhadopercentualReducaoBCICMSST(String icmsPartilhadopercentualReducaoBCICMSST) {
        this.icmsPartilhadopercentualReducaoBCICMSST = icmsPartilhadopercentualReducaoBCICMSST;
    }

    public String getIcmsPartilhadovalorBCICMSST() {
        return icmsPartilhadovalorBCICMSST;
    }

    public void setIcmsPartilhadovalorBCICMSST(String icmsPartilhadovalorBCICMSST) {
        this.icmsPartilhadovalorBCICMSST = icmsPartilhadovalorBCICMSST;
    }

    public String getIcmsPartilhadopercentualAliquotaImpostoICMSST() {
        return icmsPartilhadopercentualAliquotaImpostoICMSST;
    }

    public void setIcmsPartilhadopercentualAliquotaImpostoICMSST(String icmsPartilhadopercentualAliquotaImpostoICMSST) {
        this.icmsPartilhadopercentualAliquotaImpostoICMSST = icmsPartilhadopercentualAliquotaImpostoICMSST;
    }

    public String getIcmsPartilhadovalorICMSST() {
        return icmsPartilhadovalorICMSST;
    }

    public void setIcmsPartilhadovalorICMSST(String icmsPartilhadovalorICMSST) {
        this.icmsPartilhadovalorICMSST = icmsPartilhadovalorICMSST;
    }

    public String getIcmsPartilhadopercentualBCOperacaoPropria() {
        return icmsPartilhadopercentualBCOperacaoPropria;
    }

    public void setIcmsPartilhadopercentualBCOperacaoPropria(String icmsPartilhadopercentualBCOperacaoPropria) {
        this.icmsPartilhadopercentualBCOperacaoPropria = icmsPartilhadopercentualBCOperacaoPropria;
    }

    public String getIcmsPartilhadoufICMSST() {
        return icmsPartilhadoufICMSST;
    }

    public void setIcmsPartilhadoufICMSST(String icmsPartilhadoufICMSST) {
        this.icmsPartilhadoufICMSST = icmsPartilhadoufICMSST;
    }

    public Integer getIcmsstorigem() {
        return icmsstorigem;
    }

    public void setIcmsstorigem(Integer icmsstorigem) {
        this.icmsstorigem = icmsstorigem;
    }

    public Integer getIcmsstsituacaoTributaria() {
        return icmsstsituacaoTributaria;
    }

    public void setIcmsstsituacaoTributaria(Integer icmsstsituacaoTributaria) {
        this.icmsstsituacaoTributaria = icmsstsituacaoTributaria;
    }

    public String getIcmsstvalorBCICMSSTRetidoUFRemetente() {
        return icmsstvalorBCICMSSTRetidoUFRemetente;
    }

    public void setIcmsstvalorBCICMSSTRetidoUFRemetente(String icmsstvalorBCICMSSTRetidoUFRemetente) {
        this.icmsstvalorBCICMSSTRetidoUFRemetente = icmsstvalorBCICMSSTRetidoUFRemetente;
    }

    public String getIcmsstvalorICMSSTRetidoUFRemetente() {
        return icmsstvalorICMSSTRetidoUFRemetente;
    }

    public void setIcmsstvalorICMSSTRetidoUFRemetente(String icmsstvalorICMSSTRetidoUFRemetente) {
        this.icmsstvalorICMSSTRetidoUFRemetente = icmsstvalorICMSSTRetidoUFRemetente;
    }

    public String getIcmsstvalorBCICMSSTUFDestino() {
        return icmsstvalorBCICMSSTUFDestino;
    }

    public void setIcmsstvalorBCICMSSTUFDestino(String icmsstvalorBCICMSSTUFDestino) {
        this.icmsstvalorBCICMSSTUFDestino = icmsstvalorBCICMSSTUFDestino;
    }

    public String getIcmsstvalorICMSSTUFDestino() {
        return icmsstvalorICMSSTUFDestino;
    }

    public void setIcmsstvalorICMSSTUFDestino(String icmsstvalorICMSSTUFDestino) {
        this.icmsstvalorICMSSTUFDestino = icmsstvalorICMSSTUFDestino;
    }

    public Integer getIcmssn101origem() {
        return icmssn101origem;
    }

    public void setIcmssn101origem(Integer icmssn101origem) {
        this.icmssn101origem = icmssn101origem;
    }

    public Integer getIcmssn101situacaoOperacaoSN() {
        return icmssn101situacaoOperacaoSN;
    }

    public void setIcmssn101situacaoOperacaoSN(Integer icmssn101situacaoOperacaoSN) {
        this.icmssn101situacaoOperacaoSN = icmssn101situacaoOperacaoSN;
    }

    public String getIcmssn101percentualAliquotaAplicavelCalculoCreditoSN() {
        return icmssn101percentualAliquotaAplicavelCalculoCreditoSN;
    }

    public void setIcmssn101percentualAliquotaAplicavelCalculoCreditoSN(String icmssn101percentualAliquotaAplicavelCalculoCreditoSN) {
        this.icmssn101percentualAliquotaAplicavelCalculoCreditoSN = icmssn101percentualAliquotaAplicavelCalculoCreditoSN;
    }

    public String getIcmssn101valorCreditoICMSSN() {
        return icmssn101valorCreditoICMSSN;
    }

    public void setIcmssn101valorCreditoICMSSN(String icmssn101valorCreditoICMSSN) {
        this.icmssn101valorCreditoICMSSN = icmssn101valorCreditoICMSSN;
    }

    public Integer getIcmssn102origem() {
        return icmssn102origem;
    }

    public void setIcmssn102origem(Integer icmssn102origem) {
        this.icmssn102origem = icmssn102origem;
    }

    public Integer getIcmssn102situacaoOperacaoSN() {
        return icmssn102situacaoOperacaoSN;
    }

    public void setIcmssn102situacaoOperacaoSN(Integer icmssn102situacaoOperacaoSN) {
        this.icmssn102situacaoOperacaoSN = icmssn102situacaoOperacaoSN;
    }

    public Integer getIcmssn201origem() {
        return icmssn201origem;
    }

    public void setIcmssn201origem(Integer icmssn201origem) {
        this.icmssn201origem = icmssn201origem;
    }

    public Integer getIcmssn201situacaoOperacaoSN() {
        return icmssn201situacaoOperacaoSN;
    }

    public void setIcmssn201situacaoOperacaoSN(Integer icmssn201situacaoOperacaoSN) {
        this.icmssn201situacaoOperacaoSN = icmssn201situacaoOperacaoSN;
    }

    public Integer getIcmssn201modalidadeDeterminacaoBCICMSST() {
        return icmssn201modalidadeDeterminacaoBCICMSST;
    }

    public void setIcmssn201modalidadeDeterminacaoBCICMSST(Integer icmssn201modalidadeDeterminacaoBCICMSST) {
        this.icmssn201modalidadeDeterminacaoBCICMSST = icmssn201modalidadeDeterminacaoBCICMSST;
    }

    public String getIcmssn201percentualMargemValorAdicionadoICMSST() {
        return icmssn201percentualMargemValorAdicionadoICMSST;
    }

    public void setIcmssn201percentualMargemValorAdicionadoICMSST(String icmssn201percentualMargemValorAdicionadoICMSST) {
        this.icmssn201percentualMargemValorAdicionadoICMSST = icmssn201percentualMargemValorAdicionadoICMSST;
    }

    public String getIcmssn201percentualReducaoBCICMSST() {
        return icmssn201percentualReducaoBCICMSST;
    }

    public void setIcmssn201percentualReducaoBCICMSST(String icmssn201percentualReducaoBCICMSST) {
        this.icmssn201percentualReducaoBCICMSST = icmssn201percentualReducaoBCICMSST;
    }

    public String getIcmssn201valorBCICMSST() {
        return icmssn201valorBCICMSST;
    }

    public void setIcmssn201valorBCICMSST(String icmssn201valorBCICMSST) {
        this.icmssn201valorBCICMSST = icmssn201valorBCICMSST;
    }

    public String getIcmssn201percentualAliquotaImpostoICMSST() {
        return icmssn201percentualAliquotaImpostoICMSST;
    }

    public void setIcmssn201percentualAliquotaImpostoICMSST(String icmssn201percentualAliquotaImpostoICMSST) {
        this.icmssn201percentualAliquotaImpostoICMSST = icmssn201percentualAliquotaImpostoICMSST;
    }

    public String getIcmssn201valorICMSST() {
        return icmssn201valorICMSST;
    }

    public void setIcmssn201valorICMSST(String icmssn201valorICMSST) {
        this.icmssn201valorICMSST = icmssn201valorICMSST;
    }

    public String getIcmssn201percentualAliquotaAplicavelCalculoCreditoSN() {
        return icmssn201percentualAliquotaAplicavelCalculoCreditoSN;
    }

    public void setIcmssn201percentualAliquotaAplicavelCalculoCreditoSN(String icmssn201percentualAliquotaAplicavelCalculoCreditoSN) {
        this.icmssn201percentualAliquotaAplicavelCalculoCreditoSN = icmssn201percentualAliquotaAplicavelCalculoCreditoSN;
    }

    public String getIcmssn201valorCreditoICMSSN() {
        return icmssn201valorCreditoICMSSN;
    }

    public void setIcmssn201valorCreditoICMSSN(String icmssn201valorCreditoICMSSN) {
        this.icmssn201valorCreditoICMSSN = icmssn201valorCreditoICMSSN;
    }

    public Integer getIcmssn202origem() {
        return icmssn202origem;
    }

    public void setIcmssn202origem(Integer icmssn202origem) {
        this.icmssn202origem = icmssn202origem;
    }

    public Integer getIcmssn202situacaoOperacaoSN() {
        return icmssn202situacaoOperacaoSN;
    }

    public void setIcmssn202situacaoOperacaoSN(Integer icmssn202situacaoOperacaoSN) {
        this.icmssn202situacaoOperacaoSN = icmssn202situacaoOperacaoSN;
    }

    public Integer getIcmssn202modalidadeDeterminacaoBCICMSST() {
        return icmssn202modalidadeDeterminacaoBCICMSST;
    }

    public void setIcmssn202modalidadeDeterminacaoBCICMSST(Integer icmssn202modalidadeDeterminacaoBCICMSST) {
        this.icmssn202modalidadeDeterminacaoBCICMSST = icmssn202modalidadeDeterminacaoBCICMSST;
    }

    public String getIcmssn202percentualMargemValorAdicionadoICMSST() {
        return icmssn202percentualMargemValorAdicionadoICMSST;
    }

    public void setIcmssn202percentualMargemValorAdicionadoICMSST(String icmssn202percentualMargemValorAdicionadoICMSST) {
        this.icmssn202percentualMargemValorAdicionadoICMSST = icmssn202percentualMargemValorAdicionadoICMSST;
    }

    public String getIcmssn202percentualReducaoBCICMSST() {
        return icmssn202percentualReducaoBCICMSST;
    }

    public void setIcmssn202percentualReducaoBCICMSST(String icmssn202percentualReducaoBCICMSST) {
        this.icmssn202percentualReducaoBCICMSST = icmssn202percentualReducaoBCICMSST;
    }

    public String getIcmssn202valorBCICMSST() {
        return icmssn202valorBCICMSST;
    }

    public void setIcmssn202valorBCICMSST(String icmssn202valorBCICMSST) {
        this.icmssn202valorBCICMSST = icmssn202valorBCICMSST;
    }

    public String getIcmssn202percentualAliquotaImpostoICMSST() {
        return icmssn202percentualAliquotaImpostoICMSST;
    }

    public void setIcmssn202percentualAliquotaImpostoICMSST(String icmssn202percentualAliquotaImpostoICMSST) {
        this.icmssn202percentualAliquotaImpostoICMSST = icmssn202percentualAliquotaImpostoICMSST;
    }

    public String getIcmssn202valorICMSST() {
        return icmssn202valorICMSST;
    }

    public void setIcmssn202valorICMSST(String icmssn202valorICMSST) {
        this.icmssn202valorICMSST = icmssn202valorICMSST;
    }

    public Integer getIcmssn500origem() {
        return icmssn500origem;
    }

    public void setIcmssn500origem(Integer icmssn500origem) {
        this.icmssn500origem = icmssn500origem;
    }

    public Integer getIcmssn500situacaoOperacaoSN() {
        return icmssn500situacaoOperacaoSN;
    }

    public void setIcmssn500situacaoOperacaoSN(Integer icmssn500situacaoOperacaoSN) {
        this.icmssn500situacaoOperacaoSN = icmssn500situacaoOperacaoSN;
    }

    public String getIcmssn500valorBCICMSSTRetido() {
        return icmssn500valorBCICMSSTRetido;
    }

    public void setIcmssn500valorBCICMSSTRetido(String icmssn500valorBCICMSSTRetido) {
        this.icmssn500valorBCICMSSTRetido = icmssn500valorBCICMSSTRetido;
    }

    public String getIcmssn500valorICMSSTRetido() {
        return icmssn500valorICMSSTRetido;
    }

    public void setIcmssn500valorICMSSTRetido(String icmssn500valorICMSSTRetido) {
        this.icmssn500valorICMSSTRetido = icmssn500valorICMSSTRetido;
    }

    public Integer getIcmssn900origem() {
        return icmssn900origem;
    }

    public void setIcmssn900origem(Integer icmssn900origem) {
        this.icmssn900origem = icmssn900origem;
    }

    public Integer getIcmssn900situacaoOperacaoSN() {
        return icmssn900situacaoOperacaoSN;
    }

    public void setIcmssn900situacaoOperacaoSN(Integer icmssn900situacaoOperacaoSN) {
        this.icmssn900situacaoOperacaoSN = icmssn900situacaoOperacaoSN;
    }

    public Integer getIcmssn900modalidadeDeterminacaoBCICMS() {
        return icmssn900modalidadeDeterminacaoBCICMS;
    }

    public void setIcmssn900modalidadeDeterminacaoBCICMS(Integer icmssn900modalidadeDeterminacaoBCICMS) {
        this.icmssn900modalidadeDeterminacaoBCICMS = icmssn900modalidadeDeterminacaoBCICMS;
    }

    public String getIcmssn900valorBCICMS() {
        return icmssn900valorBCICMS;
    }

    public void setIcmssn900valorBCICMS(String icmssn900valorBCICMS) {
        this.icmssn900valorBCICMS = icmssn900valorBCICMS;
    }

    public String getIcmssn900percentualReducaoBC() {
        return icmssn900percentualReducaoBC;
    }

    public void setIcmssn900percentualReducaoBC(String icmssn900percentualReducaoBC) {
        this.icmssn900percentualReducaoBC = icmssn900percentualReducaoBC;
    }

    public String getIcmssn900percentualAliquotaImposto() {
        return icmssn900percentualAliquotaImposto;
    }

    public void setIcmssn900percentualAliquotaImposto(String icmssn900percentualAliquotaImposto) {
        this.icmssn900percentualAliquotaImposto = icmssn900percentualAliquotaImposto;
    }

    public String getIcmssn900valorICMS() {
        return icmssn900valorICMS;
    }

    public void setIcmssn900valorICMS(String icmssn900valorICMS) {
        this.icmssn900valorICMS = icmssn900valorICMS;
    }

    public Integer getIcmssn900modalidadeBCICMSST() {
        return icmssn900modalidadeBCICMSST;
    }

    public void setIcmssn900modalidadeBCICMSST(Integer icmssn900modalidadeBCICMSST) {
        this.icmssn900modalidadeBCICMSST = icmssn900modalidadeBCICMSST;
    }

    public String getIcmssn900percentualMargemValorAdicionadoICMSST() {
        return icmssn900percentualMargemValorAdicionadoICMSST;
    }

    public void setIcmssn900percentualMargemValorAdicionadoICMSST(String icmssn900percentualMargemValorAdicionadoICMSST) {
        this.icmssn900percentualMargemValorAdicionadoICMSST = icmssn900percentualMargemValorAdicionadoICMSST;
    }

    public String getIcmssn900percentualReducaoBCICMSST() {
        return icmssn900percentualReducaoBCICMSST;
    }

    public void setIcmssn900percentualReducaoBCICMSST(String icmssn900percentualReducaoBCICMSST) {
        this.icmssn900percentualReducaoBCICMSST = icmssn900percentualReducaoBCICMSST;
    }

    public String getIcmssn900valorBCICMSST() {
        return icmssn900valorBCICMSST;
    }

    public void setIcmssn900valorBCICMSST(String icmssn900valorBCICMSST) {
        this.icmssn900valorBCICMSST = icmssn900valorBCICMSST;
    }

    public String getIcmssn900percentualAliquotaImpostoICMSST() {
        return icmssn900percentualAliquotaImpostoICMSST;
    }

    public void setIcmssn900percentualAliquotaImpostoICMSST(String icmssn900percentualAliquotaImpostoICMSST) {
        this.icmssn900percentualAliquotaImpostoICMSST = icmssn900percentualAliquotaImpostoICMSST;
    }

    public String getIcmssn900valorICMSST() {
        return icmssn900valorICMSST;
    }

    public void setIcmssn900valorICMSST(String icmssn900valorICMSST) {
        this.icmssn900valorICMSST = icmssn900valorICMSST;
    }

    public String getIcmssn900aliquotaAplicavelCalculoCreditoSN() {
        return icmssn900aliquotaAplicavelCalculoCreditoSN;
    }

    public void setIcmssn900aliquotaAplicavelCalculoCreditoSN(String icmssn900aliquotaAplicavelCalculoCreditoSN) {
        this.icmssn900aliquotaAplicavelCalculoCreditoSN = icmssn900aliquotaAplicavelCalculoCreditoSN;
    }

    public String getIcmssn900valorCreditoICMSSN() {
        return icmssn900valorCreditoICMSSN;
    }

    public void setIcmssn900valorCreditoICMSSN(String icmssn900valorCreditoICMSSN) {
        this.icmssn900valorCreditoICMSSN = icmssn900valorCreditoICMSSN;
    }

    public String getIpiclasseEnquadramento() {
        return ipiclasseEnquadramento;
    }

    public void setIpiclasseEnquadramento(String ipiclasseEnquadramento) {
        this.ipiclasseEnquadramento = ipiclasseEnquadramento;
    }

    public String getIpicnpjProdutor() {
        return ipicnpjProdutor;
    }

    public void setIpicnpjProdutor(String ipicnpjProdutor) {
        this.ipicnpjProdutor = ipicnpjProdutor;
    }

    public String getIpicodigoSelo() {
        return ipicodigoSelo;
    }

    public void setIpicodigoSelo(String ipicodigoSelo) {
        this.ipicodigoSelo = ipicodigoSelo;
    }

    public BigInteger getIpiquantidadeSelo() {
        return ipiquantidadeSelo;
    }

    public void setIpiquantidadeSelo(BigInteger ipiquantidadeSelo) {
        this.ipiquantidadeSelo = ipiquantidadeSelo;
    }

    public String getIpicodigoEnquadramento() {
        return ipicodigoEnquadramento;
    }

    public void setIpicodigoEnquadramento(String ipicodigoEnquadramento) {
        this.ipicodigoEnquadramento = ipicodigoEnquadramento;
    }

    public Integer getIpitributadosituacaoTributaria() {
        return ipitributadosituacaoTributaria;
    }

    public void setIpitributadosituacaoTributaria(Integer ipitributadosituacaoTributaria) {
        this.ipitributadosituacaoTributaria = ipitributadosituacaoTributaria;
    }

    public String getIpitributadovalorBaseCalculo() {
        return ipitributadovalorBaseCalculo;
    }

    public void setIpitributadovalorBaseCalculo(String ipitributadovalorBaseCalculo) {
        this.ipitributadovalorBaseCalculo = ipitributadovalorBaseCalculo;
    }

    public String getIpitributadopercentualAliquota() {
        return ipitributadopercentualAliquota;
    }

    public void setIpitributadopercentualAliquota(String ipitributadopercentualAliquota) {
        this.ipitributadopercentualAliquota = ipitributadopercentualAliquota;
    }

    public String getIpitributadoquantidade() {
        return ipitributadoquantidade;
    }

    public void setIpitributadoquantidade(String ipitributadoquantidade) {
        this.ipitributadoquantidade = ipitributadoquantidade;
    }

    public String getIpitributadovalorUnidadeTributavel() {
        return ipitributadovalorUnidadeTributavel;
    }

    public void setIpitributadovalorUnidadeTributavel(String ipitributadovalorUnidadeTributavel) {
        this.ipitributadovalorUnidadeTributavel = ipitributadovalorUnidadeTributavel;
    }

    public String getIpitributadovalorTributo() {
        return ipitributadovalorTributo;
    }

    public void setIpitributadovalorTributo(String ipitributadovalorTributo) {
        this.ipitributadovalorTributo = ipitributadovalorTributo;
    }

    public Integer getIpinaoTributadoSituacaoTributaria() {
        return ipinaoTributadoSituacaoTributaria;
    }

    public void setIpinaoTributadoSituacaoTributaria(Integer ipinaoTributadoSituacaoTributaria) {
        this.ipinaoTributadoSituacaoTributaria = ipinaoTributadoSituacaoTributaria;
    }

    public String getImportacaovalorBaseCalculo() {
        return ImportacaovalorBaseCalculo;
    }

    public void setImportacaovalorBaseCalculo(String ImportacaovalorBaseCalculo) {
        this.ImportacaovalorBaseCalculo = ImportacaovalorBaseCalculo;
    }

    public String getImportacaovalorDespesaAduaneira() {
        return ImportacaovalorDespesaAduaneira;
    }

    public void setImportacaovalorDespesaAduaneira(String ImportacaovalorDespesaAduaneira) {
        this.ImportacaovalorDespesaAduaneira = ImportacaovalorDespesaAduaneira;
    }

    public String getImportacaovalorImpostoImportacao() {
        return ImportacaovalorImpostoImportacao;
    }

    public void setImportacaovalorImpostoImportacao(String ImportacaovalorImpostoImportacao) {
        this.ImportacaovalorImpostoImportacao = ImportacaovalorImpostoImportacao;
    }

    public String getImportacaovalorIOF() {
        return ImportacaovalorIOF;
    }

    public void setImportacaovalorIOF(String ImportacaovalorIOF) {
        this.ImportacaovalorIOF = ImportacaovalorIOF;
    }

    public String getIssqnvalorBaseCalculo() {
        return issqnvalorBaseCalculo;
    }

    public void setIssqnvalorBaseCalculo(String issqnvalorBaseCalculo) {
        this.issqnvalorBaseCalculo = issqnvalorBaseCalculo;
    }

    public String getIssqnvalorAliquota() {
        return issqnvalorAliquota;
    }

    public void setIssqnvalorAliquota(String issqnvalorAliquota) {
        this.issqnvalorAliquota = issqnvalorAliquota;
    }

    public String getIssqnvalor() {
        return issqnvalor;
    }

    public void setIssqnvalor(String issqnvalor) {
        this.issqnvalor = issqnvalor;
    }

    public Integer getIssqncodigoMunicipio() {
        return issqncodigoMunicipio;
    }

    public void setIssqncodigoMunicipio(Integer issqncodigoMunicipio) {
        this.issqncodigoMunicipio = issqncodigoMunicipio;
    }

    public String getIssqnitemListaServicos() {
        return issqnitemListaServicos;
    }

    public void setIssqnitemListaServicos(String issqnitemListaServicos) {
        this.issqnitemListaServicos = issqnitemListaServicos;
    }

    public String getIssqnvalorDeducao() {
        return issqnvalorDeducao;
    }

    public void setIssqnvalorDeducao(String issqnvalorDeducao) {
        this.issqnvalorDeducao = issqnvalorDeducao;
    }

    public String getIssqnvalorOutro() {
        return issqnvalorOutro;
    }

    public void setIssqnvalorOutro(String issqnvalorOutro) {
        this.issqnvalorOutro = issqnvalorOutro;
    }

    public String getIssqnvalorDescontoIncondicionado() {
        return issqnvalorDescontoIncondicionado;
    }

    public void setIssqnvalorDescontoIncondicionado(String issqnvalorDescontoIncondicionado) {
        this.issqnvalorDescontoIncondicionado = issqnvalorDescontoIncondicionado;
    }

    public String getIssqnvalorDescontoCondicionado() {
        return issqnvalorDescontoCondicionado;
    }

    public void setIssqnvalorDescontoCondicionado(String issqnvalorDescontoCondicionado) {
        this.issqnvalorDescontoCondicionado = issqnvalorDescontoCondicionado;
    }

    public String getIssqnvalorRetencaoISS() {
        return issqnvalorRetencaoISS;
    }

    public void setIssqnvalorRetencaoISS(String issqnvalorRetencaoISS) {
        this.issqnvalorRetencaoISS = issqnvalorRetencaoISS;
    }

    public Integer getIssqnindicadorExigibilidadeISS() {
        return issqnindicadorExigibilidadeISS;
    }

    public void setIssqnindicadorExigibilidadeISS(Integer issqnindicadorExigibilidadeISS) {
        this.issqnindicadorExigibilidadeISS = issqnindicadorExigibilidadeISS;
    }

    public String getIssqncodigoServico() {
        return issqncodigoServico;
    }

    public void setIssqncodigoServico(String issqncodigoServico) {
        this.issqncodigoServico = issqncodigoServico;
    }

    public String getIssqncodigoMunicipioIncidenciaImposto() {
        return issqncodigoMunicipioIncidenciaImposto;
    }

    public void setIssqncodigoMunicipioIncidenciaImposto(String issqncodigoMunicipioIncidenciaImposto) {
        this.issqncodigoMunicipioIncidenciaImposto = issqncodigoMunicipioIncidenciaImposto;
    }

    public String getIssqncodigoPais() {
        return issqncodigoPais;
    }

    public void setIssqncodigoPais(String issqncodigoPais) {
        this.issqncodigoPais = issqncodigoPais;
    }

    public String getIssqnnumeroProcesso() {
        return issqnnumeroProcesso;
    }

    public void setIssqnnumeroProcesso(String issqnnumeroProcesso) {
        this.issqnnumeroProcesso = issqnnumeroProcesso;
    }

    public Integer getIssqnindicadorIncentivoFiscal() {
        return issqnindicadorIncentivoFiscal;
    }

    public void setIssqnindicadorIncentivoFiscal(Integer issqnindicadorIncentivoFiscal) {
        this.issqnindicadorIncentivoFiscal = issqnindicadorIncentivoFiscal;
    }

    public Integer getPisAliqsituacaoTributaria() {
        return pisAliqsituacaoTributaria;
    }

    public void setPisAliqsituacaoTributaria(Integer pisAliqsituacaoTributaria) {
        this.pisAliqsituacaoTributaria = pisAliqsituacaoTributaria;
    }

    public String getPisAliqvalorBaseCalculo() {
        return pisAliqvalorBaseCalculo;
    }

    public void setPisAliqvalorBaseCalculo(String pisAliqvalorBaseCalculo) {
        this.pisAliqvalorBaseCalculo = pisAliqvalorBaseCalculo;
    }

    public String getPisAliqpercentualAliquota() {
        return pisAliqpercentualAliquota;
    }

    public void setPisAliqpercentualAliquota(String pisAliqpercentualAliquota) {
        this.pisAliqpercentualAliquota = pisAliqpercentualAliquota;
    }

    public String getPisAliqvalorTributo() {
        return pisAliqvalorTributo;
    }

    public void setPisAliqvalorTributo(String pisAliqvalorTributo) {
        this.pisAliqvalorTributo = pisAliqvalorTributo;
    }

    public Integer getPisQtdsituacaoTributaria() {
        return pisQtdsituacaoTributaria;
    }

    public void setPisQtdsituacaoTributaria(Integer pisQtdsituacaoTributaria) {
        this.pisQtdsituacaoTributaria = pisQtdsituacaoTributaria;
    }

    public String getPisQtdquantidadeVendida() {
        return pisQtdquantidadeVendida;
    }

    public void setPisQtdquantidadeVendida(String pisQtdquantidadeVendida) {
        this.pisQtdquantidadeVendida = pisQtdquantidadeVendida;
    }

    public String getPisQtdvalorAliquota() {
        return pisQtdvalorAliquota;
    }

    public void setPisQtdvalorAliquota(String pisQtdvalorAliquota) {
        this.pisQtdvalorAliquota = pisQtdvalorAliquota;
    }

    public String getPisQtdvalorTributo() {
        return pisQtdvalorTributo;
    }

    public void setPisQtdvalorTributo(String pisQtdvalorTributo) {
        this.pisQtdvalorTributo = pisQtdvalorTributo;
    }

    public Integer getPisNTribsituacaoTributaria() {
        return pisNTribsituacaoTributaria;
    }

    public void setPisNTribsituacaoTributaria(Integer pisNTribsituacaoTributaria) {
        this.pisNTribsituacaoTributaria = pisNTribsituacaoTributaria;
    }

    public Integer getPisOutrossituacaoTributaria() {
        return pisOutrossituacaoTributaria;
    }

    public void setPisOutrossituacaoTributaria(Integer pisOutrossituacaoTributaria) {
        this.pisOutrossituacaoTributaria = pisOutrossituacaoTributaria;
    }

    public String getPisOutrosvalorBaseCalculo() {
        return pisOutrosvalorBaseCalculo;
    }

    public void setPisOutrosvalorBaseCalculo(String pisOutrosvalorBaseCalculo) {
        this.pisOutrosvalorBaseCalculo = pisOutrosvalorBaseCalculo;
    }

    public String getPisOutrospercentualAliquota() {
        return pisOutrospercentualAliquota;
    }

    public void setPisOutrospercentualAliquota(String pisOutrospercentualAliquota) {
        this.pisOutrospercentualAliquota = pisOutrospercentualAliquota;
    }

    public String getPisOutrosquantidadeVendida() {
        return pisOutrosquantidadeVendida;
    }

    public void setPisOutrosquantidadeVendida(String pisOutrosquantidadeVendida) {
        this.pisOutrosquantidadeVendida = pisOutrosquantidadeVendida;
    }

    public String getPisOutrosvalorAliquota() {
        return pisOutrosvalorAliquota;
    }

    public void setPisOutrosvalorAliquota(String pisOutrosvalorAliquota) {
        this.pisOutrosvalorAliquota = pisOutrosvalorAliquota;
    }

    public String getPisOutrosvalorTributo() {
        return pisOutrosvalorTributo;
    }

    public void setPisOutrosvalorTributo(String pisOutrosvalorTributo) {
        this.pisOutrosvalorTributo = pisOutrosvalorTributo;
    }

    public String getPisstvalorBaseCalculo() {
        return pisstvalorBaseCalculo;
    }

    public void setPisstvalorBaseCalculo(String pisstvalorBaseCalculo) {
        this.pisstvalorBaseCalculo = pisstvalorBaseCalculo;
    }

    public String getPisstpercentualAliquota() {
        return pisstpercentualAliquota;
    }

    public void setPisstpercentualAliquota(String pisstpercentualAliquota) {
        this.pisstpercentualAliquota = pisstpercentualAliquota;
    }

    public String getPisstquantidadeVendida() {
        return pisstquantidadeVendida;
    }

    public void setPisstquantidadeVendida(String pisstquantidadeVendida) {
        this.pisstquantidadeVendida = pisstquantidadeVendida;
    }

    public String getPisstvalorAliquota() {
        return pisstvalorAliquota;
    }

    public void setPisstvalorAliquota(String pisstvalorAliquota) {
        this.pisstvalorAliquota = pisstvalorAliquota;
    }

    public String getPisstvalorTributo() {
        return pisstvalorTributo;
    }

    public void setPisstvalorTributo(String pisstvalorTributo) {
        this.pisstvalorTributo = pisstvalorTributo;
    }

    public Integer getConfinsAliqsituacaoTributaria() {
        return ConfinsAliqsituacaoTributaria;
    }

    public void setConfinsAliqsituacaoTributaria(Integer ConfinsAliqsituacaoTributaria) {
        this.ConfinsAliqsituacaoTributaria = ConfinsAliqsituacaoTributaria;
    }

    public String getConfinsAliqvalorBaseCalulo() {
        return ConfinsAliqvalorBaseCalulo;
    }

    public void setConfinsAliqvalorBaseCalulo(String ConfinsAliqvalorBaseCalulo) {
        this.ConfinsAliqvalorBaseCalulo = ConfinsAliqvalorBaseCalulo;
    }

    public String getConfinsAliqpercentualAliquota() {
        return ConfinsAliqpercentualAliquota;
    }

    public void setConfinsAliqpercentualAliquota(String ConfinsAliqpercentualAliquota) {
        this.ConfinsAliqpercentualAliquota = ConfinsAliqpercentualAliquota;
    }

    public String getConfinsAliqvalor() {
        return ConfinsAliqvalor;
    }

    public void setConfinsAliqvalor(String ConfinsAliqvalor) {
        this.ConfinsAliqvalor = ConfinsAliqvalor;
    }

    public Integer getCofinsQtdsituacaoTributaria() {
        return CofinsQtdsituacaoTributaria;
    }

    public void setCofinsQtdsituacaoTributaria(Integer CofinsQtdsituacaoTributaria) {
        this.CofinsQtdsituacaoTributaria = CofinsQtdsituacaoTributaria;
    }

    public String getCofinsQtdquantidadeVendida() {
        return CofinsQtdquantidadeVendida;
    }

    public void setCofinsQtdquantidadeVendida(String CofinsQtdquantidadeVendida) {
        this.CofinsQtdquantidadeVendida = CofinsQtdquantidadeVendida;
    }

    public String getCofinsQtdvalorAliquota() {
        return CofinsQtdvalorAliquota;
    }

    public void setCofinsQtdvalorAliquota(String CofinsQtdvalorAliquota) {
        this.CofinsQtdvalorAliquota = CofinsQtdvalorAliquota;
    }

    public Integer getCofninsNTributsituacaoTributaria() {
        return CofninsNTributsituacaoTributaria;
    }

    public void setCofninsNTributsituacaoTributaria(Integer CofninsNTributsituacaoTributaria) {
        this.CofninsNTributsituacaoTributaria = CofninsNTributsituacaoTributaria;
    }

    public Integer getConfinsOutrossituacaoTributaria() {
        return ConfinsOutrossituacaoTributaria;
    }

    public void setConfinsOutrossituacaoTributaria(Integer ConfinsOutrossituacaoTributaria) {
        this.ConfinsOutrossituacaoTributaria = ConfinsOutrossituacaoTributaria;
    }

    public String getConfinsOutrosvalorBaseCalculo() {
        return ConfinsOutrosvalorBaseCalculo;
    }

    public void setConfinsOutrosvalorBaseCalculo(String ConfinsOutrosvalorBaseCalculo) {
        this.ConfinsOutrosvalorBaseCalculo = ConfinsOutrosvalorBaseCalculo;
    }

    public String getConfinsOutrospercentualCOFINS() {
        return ConfinsOutrospercentualCOFINS;
    }

    public void setConfinsOutrospercentualCOFINS(String ConfinsOutrospercentualCOFINS) {
        this.ConfinsOutrospercentualCOFINS = ConfinsOutrospercentualCOFINS;
    }

    public String getConfinsOutrosquantidadeVendida() {
        return ConfinsOutrosquantidadeVendida;
    }

    public void setConfinsOutrosquantidadeVendida(String ConfinsOutrosquantidadeVendida) {
        this.ConfinsOutrosquantidadeVendida = ConfinsOutrosquantidadeVendida;
    }

    public String getConfinsOutrosvalorAliquota() {
        return ConfinsOutrosvalorAliquota;
    }

    public void setConfinsOutrosvalorAliquota(String ConfinsOutrosvalorAliquota) {
        this.ConfinsOutrosvalorAliquota = ConfinsOutrosvalorAliquota;
    }

    public String getConfinsOutrosvalorCOFINS() {
        return ConfinsOutrosvalorCOFINS;
    }

    public void setConfinsOutrosvalorCOFINS(String ConfinsOutrosvalorCOFINS) {
        this.ConfinsOutrosvalorCOFINS = ConfinsOutrosvalorCOFINS;
    }

    public String getCofinsstvalorBaseCalculo() {
        return cofinsstvalorBaseCalculo;
    }

    public void setCofinsstvalorBaseCalculo(String cofinsstvalorBaseCalculo) {
        this.cofinsstvalorBaseCalculo = cofinsstvalorBaseCalculo;
    }

    public String getCofinsstpercentualAliquota() {
        return cofinsstpercentualAliquota;
    }

    public void setCofinsstpercentualAliquota(String cofinsstpercentualAliquota) {
        this.cofinsstpercentualAliquota = cofinsstpercentualAliquota;
    }

    public String getCofinsstquantidadeVendida() {
        return cofinsstquantidadeVendida;
    }

    public void setCofinsstquantidadeVendida(String cofinsstquantidadeVendida) {
        this.cofinsstquantidadeVendida = cofinsstquantidadeVendida;
    }

    public String getCofinsstvalorAliquotaCOFINS() {
        return cofinsstvalorAliquotaCOFINS;
    }

    public void setCofinsstvalorAliquotaCOFINS(String cofinsstvalorAliquotaCOFINS) {
        this.cofinsstvalorAliquotaCOFINS = cofinsstvalorAliquotaCOFINS;
    }

    public String getCofinsstvalorCOFINS() {
        return cofinsstvalorCOFINS;
    }

    public void setCofinsstvalorCOFINS(String cofinsstvalorCOFINS) {
        this.cofinsstvalorCOFINS = cofinsstvalorCOFINS;
    }

    public String getPercentualDevolucao() {
        return percentualDevolucao;
    }

    public void setPercentualDevolucao(String percentualDevolucao) {
        this.percentualDevolucao = percentualDevolucao;
    }

    public String getValorIPIDevolvido() {
        return valorIPIDevolvido;
    }

    public void setValorIPIDevolvido(String valorIPIDevolvido) {
        this.valorIPIDevolvido = valorIPIDevolvido;
    }

    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

}
