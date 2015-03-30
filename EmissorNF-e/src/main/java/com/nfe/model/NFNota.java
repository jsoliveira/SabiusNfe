package com.nfe.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class NFNota {

    //chave primaria
    private Empresa empresa;
    //chave primaria
    private long nr_sequencia;

    List<Integer> retornoStatus;

    //notaInf
    private String Infidentificador;
    private String versao;

    //identificacao
    private String Identuf;
    private String IdentcodigoRandomico;
    private String IdentnaturezaOperacao;
    private Integer IdentformaPagamento;
    private String Identmodelo;
    private String Identserie;
    private String IdentnumeroNota;
    private LocalDateTime IdentdataHoraEmissao;
    private LocalDateTime IdentdataHoraSaidaOuEntrada;
    private Integer Identtipo;
    private Integer IdentidentificadorLocalDestinoOperacao;
    private String IdentcodigoMunicipio;
    private Integer IdenttipoImpressao;
    private Integer IdenttipoEmissao;
    private Integer IdentdigitoVerificador;
    private Integer Identambiente;
    private Integer Identfinalidade;
    private Integer IdentoperacaoConsumidorFinal;
    private Integer IdentindicadorPresencaComprador;
    private Integer IdentprogramaEmissor;
    private String IdentversaoEmissor;
    private LocalDateTime IdentdataHoraContigencia;
    private String IdentjustificativaEntradaContingencia;
    private List<NFInfoReferenciada> Identreferenciadas;

    //dados emitente
    private String Emicnpj;
    private String Emicpf;
    private String EmirazaoSocial;
    private String EminomeFantasia;
    private String Emilogradouro;
    private String Eminumero;
    private String Emicomplemento;
    private String Emibairro;
    private String EmicodigoMunicipio;
    private String EmidescricaoMunicipio;
    private String Emiuf;
    private String Emicep;
    private String EmicodigoPais;
    private String EmidescricaoPais;
    private String Emitelefone;
    private String EmiinscricaoEstadual;
    private String EmiinscricaoEstadualSubstituicaoTributaria;
    private String EmiinscricaoMunicipal;
    private String EmiclassificacaoNacionalAtividadesEconomicas;
    private Integer EmiregimeTributario;

    //Informacao Avulsa
    private String Avulsacnpj;
    private String AvulsaorgaoEmitente;
    private String AvulsamatriculaAgente;
    private String AvulsanomeAgente;
    private String Avulsafone;
    private String Avulsauf;
    private String AvulsanumeroDocumentoArrecadacaoReceita;
    private LocalDate AvulsadataEmissaoDocumentoArrecadacao;
    private String AvulsavalorTotalConstanteDocumentoArrecadacaoReceita;
    private String AvulsareparticaoFiscalEmitente;
    private LocalDate AvulsadataPagamentoDocumentoArrecadacao;

    //Informacao Destinatario
    private String Destcnpj;
    private String Destcpf;
    private String DestidEstrangeiro;
    private String DestrazaoSocial;
    private String Destlogradouro;
    private String Destnumero;
    private String Destcomplemento;
    private String Destbairro;
    private String DestcodigoMunicipio;
    private String DestdescricaoMunicipio;
    private String Destuf;
    private String Destcep;
    private String DestcodigoPais;
    private String DestdescricaoPais;
    private String Desttelefone;

    private Integer DestindicadorIEDestinatario;
    private String DestinscricaoEstadual;
    private String DestinscricaoSuframa;
    private String DestinscricaoMunicipal;
    private String Destemail;

    //Informacao Local Retirada
    private String LocalRetcnpj;
    private String LocalRetcpf;
    private String LocalRetlogradouro;
    private String LocalRetnumero;
    private String LocalRetcomplemento;
    private String LocalRetbairro;
    private String LocalRetcodigoMunicipio;
    private String LocalRetnomeMunicipio;
    private String LocalRetuf;

    //informacao local Entrega
    private String LocalEntcnpj;
    private String LocalEntcpf;
    private String LocalEntlogradouro;
    private String LocalEntnumero;
    private String LocalEntcomplemento;
    private String LocalEntbairro;
    private String LocalEntcodigoMunicipio;
    private String LocalEntnomeMunicipio;
    private String LocalEntuf;

    //Informacao Total 
    //-ICMS
    private String TotalicmsTotalbaseCalculoICMS;
    private String TotalicmsTotalvalorTotalICMS;
    private String TotalicmsTotalvalorICMSDesonerado;
    private String TotalicmsTotalvalor;
    private String TotalicmsTotalvalorTotalICMSST;
    private String TotalicmsTotalvalorTotalDosProdutosServicos;
    private String TotalicmsTotalvalorTotalFrete;
    private String TotalicmsTotalvalorTotalSeguro;
    private String TotalicmsTotalvalorTotalDesconto;
    private String TotalicmsTotalvalorTotalII;
    private String TotalicmsTotalvalorTotalIPI;
    private String TotalicmsTotalvalorPIS;
    private String TotalicmsTotalvalorCOFINS;
    private String TotalicmsTotaloutrasDespesasAcessorias;
    private String TotalicmsTotalvalorTotalNFe;
    private String TotalicmsTotalvalorTotalTributos;

    //-ISSQN
    private String TotalissqnTotalvalorTotalServicosSobNaoIncidenciaNaoTributadosICMS;
    private String TotalissqnTotalbaseCalculoISS;
    private String TotalissqnTotalvalorTotalISS;
    private String TotalissqnTotalvalorPISsobreServicos;
    private String TotalissqnTotalvalorCOFINSsobreServicos;
    private LocalDate TotalissqnTotaldataPrestacaoServico;
    private String TotalissqnTotalvalorDeducao;
    private String TotalissqnTotalvalorOutros;
    private String TotalissqnTotalvalorTotalDescontoIncondicionado;
    private String TotalissqnTotalvalorTotalDescontoCondicionado;
    private String TotalissqnTotalvalorTotalRetencaoISS;
    private Integer TotalissqnTotaltributacao;

    //-RETENCOES TRIBUTOS
    private String TotalretencoesTributosvalorRetidoPIS;
    private String TotalretencoesTributosvalorRetidoCOFINS;
    private String TotalretencoesTributosvalorRetidoCSLL;
    private String TotalretencoesTributosbaseCalculoIRRF;
    private String TotalretencoesTributosvalorRetidoIRRF;
    private String TotalretencoesTributosbaseCalculoRetencaoPrevidenciaSocial;
    private String TotalretencoesTributosvalorRetencaoPrevidenciaSocial;

    //informacao transporte
    private Integer modalidadeFrete;
    private String Transportadorcnpj;
    private String Transportadorcpf;
    private String TransportadorrazaoSocial;
    private String TransportadorinscricaoEstadual;
    private String TransportadorenderecoComplemento;
    private String TransportadornomeMunicipio;
    private String Transportadoruf;

    private String ReticmsTranspvalorServico;
    private String ReticmsTranspbcRetencaoICMS;
    private String ReticmsTranspaliquotaRetencao;
    private String ReticmsTranspvalorICMSRetido;
    private Integer ReticmsTranspcfop;
    private Integer ReticmsTranspcodigoMunicipioOcorrenciaFatoGeradorICMSTransporte;

    private String TranspVeiplacaVeiculo;
    private String TranspVeiuf;
    private String TranspVeiregistroNacionalTransportadorCarga;

    private List<NFNotaInfoReboque> reboques;
    private String vagao;
    private String balsa;
    private List<NFNotaInfoVolume> volumes;

    //Informacao Cobranca
    private String CobrFaturanumeroFatura;
    private String CobrFaturavalorOriginalFatura;
    private String CobrFaturavalorDesconto;
    private String CobrFaturavalorLiquidoFatura;
    private List<NFNotaInfoDuplicata> Cobrduplicatas;

    //informacoes Adicionais
    private String informacoesAdicionaisInteresseFisco;
    private String informacoesComplementaresInteresseContribuinte;
    private List<NFNotaInfoObservacao> InfAdicobservacoesContribuinte;
    private List<NFNotaInfoObservacao> InfAdicobservacoesFisco;
    private List<NFNotaInfoProcessoReferenciado> InfAdiprocessosRefenciado;

    //informacoes de Exportacao
    private String ExportacaoufEmbarqueProduto;
    private String ExportacaolocalEmbarqueProdutos;
    private String ExportacaolocalDespachoProdutos;

    //informacoes de Compra
    private String CompranotaDeEmpenho;
    private String Comprapedido;
    private String Compracontrato;

    //Informacoes De Cana
    private String Canasafra;
    private String Canareferencia;
    private List<NFNotaInfoCanaFornecimentoDiario> CanafornecimentosDiario;
    private List<NFNotaInfoCanaDeducao> Canadeducoes;
    private String CanaquantidadeTotalMes;
    private String CanaquantidadeTotalAnterior;
    private String CanaquantidadeTotalGeral;
    private String CanavalorFornecimento;
    private String CanavalorTotalDeducao;
    private String CanavalorLiquidoFornecimento;

    //permisao de dowlond NF-e
    private List<NFPessoaAutorizadaDownloadNFe> pessoasAutorizadasDownloadNFe;

    //Itens Nfe
    private List<NFNotaInfoItem> itens;

    //informacao de Pagamentos
    private List<NFNotaInfoPagamento> pagamentos;

    //
    private StringBuilder assinatura;

    //Processamento Nota Fiscal
    private String protocoloVersao;
    private String protocoloidentificador;
    private String protocoloambiente;
    private String protocoloversaoAplicacao;
    private String protocolochave;
    private String protocolodataRecebimento;
    private String protocolonumeroProtocolo;
    private String protocolovalidador;
    private String protocolostatus;
    private String protocolomotivo;

    public long getNr_sequencia() {
        return nr_sequencia;
    }

    public void setNr_sequencia(long nr_sequencia) {
        this.nr_sequencia = nr_sequencia;
    }

    public String getInfidentificador() {
        return Infidentificador;
    }

    public void setInfidentificador(String Infidentificador) {
        this.Infidentificador = Infidentificador;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getIdentuf() {
        return Identuf;
    }

    public void setIdentuf(String Identuf) {
        this.Identuf = Identuf;
    }

    public String getIdentcodigoRandomico() {
        return IdentcodigoRandomico;
    }

    public void setIdentcodigoRandomico(String IdentcodigoRandomico) {
        this.IdentcodigoRandomico = IdentcodigoRandomico;
    }

    public String getIdentnaturezaOperacao() {
        return IdentnaturezaOperacao;
    }

    public void setIdentnaturezaOperacao(String IdentnaturezaOperacao) {
        this.IdentnaturezaOperacao = IdentnaturezaOperacao;
    }

    public Integer getIdentformaPagamento() {
        return IdentformaPagamento;
    }

    public void setIdentformaPagamento(Integer IdentformaPagamento) {
        this.IdentformaPagamento = IdentformaPagamento;
    }

    public String getIdentmodelo() {
        return Identmodelo;
    }

    public void setIdentmodelo(String Identmodelo) {
        this.Identmodelo = Identmodelo;
    }

    public String getIdentserie() {
        return Identserie;
    }

    public void setIdentserie(String Identserie) {
        this.Identserie = Identserie;
    }

    public String getIdentnumeroNota() {
        return IdentnumeroNota;
    }

    public void setIdentnumeroNota(String IdentnumeroNota) {
        this.IdentnumeroNota = IdentnumeroNota;
    }

    public LocalDateTime getIdentdataHoraEmissao() {
        return IdentdataHoraEmissao;
    }

    public void setIdentdataHoraEmissao(LocalDateTime IdentdataHoraEmissao) {
        this.IdentdataHoraEmissao = IdentdataHoraEmissao;
    }

    public LocalDateTime getIdentdataHoraSaidaOuEntrada() {
        return IdentdataHoraSaidaOuEntrada;
    }

    public void setIdentdataHoraSaidaOuEntrada(LocalDateTime IdentdataHoraSaidaOuEntrada) {
        this.IdentdataHoraSaidaOuEntrada = IdentdataHoraSaidaOuEntrada;
    }

    public Integer getIdenttipo() {
        return Identtipo;
    }

    public void setIdenttipo(Integer Identtipo) {
        this.Identtipo = Identtipo;
    }

    public Integer getIdentidentificadorLocalDestinoOperacao() {
        return IdentidentificadorLocalDestinoOperacao;
    }

    public void setIdentidentificadorLocalDestinoOperacao(Integer IdentidentificadorLocalDestinoOperacao) {
        this.IdentidentificadorLocalDestinoOperacao = IdentidentificadorLocalDestinoOperacao;
    }

    public String getIdentcodigoMunicipio() {
        return IdentcodigoMunicipio;
    }

    public void setIdentcodigoMunicipio(String IdentcodigoMunicipio) {
        this.IdentcodigoMunicipio = IdentcodigoMunicipio;
    }

    public Integer getIdenttipoImpressao() {
        return IdenttipoImpressao;
    }

    public void setIdenttipoImpressao(Integer IdenttipoImpressao) {
        this.IdenttipoImpressao = IdenttipoImpressao;
    }

    public Integer getIdenttipoEmissao() {
        return IdenttipoEmissao;
    }

    public void setIdenttipoEmissao(Integer IdenttipoEmissao) {
        this.IdenttipoEmissao = IdenttipoEmissao;
    }

    public Integer getIdentdigitoVerificador() {
        return IdentdigitoVerificador;
    }

    public void setIdentdigitoVerificador(Integer IdentdigitoVerificador) {
        this.IdentdigitoVerificador = IdentdigitoVerificador;
    }

    public Integer getIdentambiente() {
        return Identambiente;
    }

    public void setIdentambiente(Integer Identambiente) {
        this.Identambiente = Identambiente;
    }

    public Integer getIdentfinalidade() {
        return Identfinalidade;
    }

    public void setIdentfinalidade(Integer Identfinalidade) {
        this.Identfinalidade = Identfinalidade;
    }

    public Integer getIdentoperacaoConsumidorFinal() {
        return IdentoperacaoConsumidorFinal;
    }

    public void setIdentoperacaoConsumidorFinal(Integer IdentoperacaoConsumidorFinal) {
        this.IdentoperacaoConsumidorFinal = IdentoperacaoConsumidorFinal;
    }

    public Integer getIdentindicadorPresencaComprador() {
        return IdentindicadorPresencaComprador;
    }

    public void setIdentindicadorPresencaComprador(Integer IdentindicadorPresencaComprador) {
        this.IdentindicadorPresencaComprador = IdentindicadorPresencaComprador;
    }

    public Integer getIdentprogramaEmissor() {
        return IdentprogramaEmissor;
    }

    public void setIdentprogramaEmissor(Integer IdentprogramaEmissor) {
        this.IdentprogramaEmissor = IdentprogramaEmissor;
    }

    public String getIdentversaoEmissor() {
        return IdentversaoEmissor;
    }

    public void setIdentversaoEmissor(String IdentversaoEmissor) {
        this.IdentversaoEmissor = IdentversaoEmissor;
    }

    public LocalDateTime getIdentdataHoraContigencia() {
        return IdentdataHoraContigencia;
    }

    public void setIdentdataHoraContigencia(LocalDateTime IdentdataHoraContigencia) {
        this.IdentdataHoraContigencia = IdentdataHoraContigencia;
    }

    public String getIdentjustificativaEntradaContingencia() {
        return IdentjustificativaEntradaContingencia;
    }

    public void setIdentjustificativaEntradaContingencia(String IdentjustificativaEntradaContingencia) {
        this.IdentjustificativaEntradaContingencia = IdentjustificativaEntradaContingencia;
    }

    public List<NFInfoReferenciada> getIdentreferenciadas() {
        return Identreferenciadas;
    }

    public void setIdentreferenciadas(List<NFInfoReferenciada> Identreferenciadas) {
        this.Identreferenciadas = Identreferenciadas;
    }

    public String getEmicnpj() {
        return Emicnpj;
    }

    public void setEmicnpj(String Emicnpj) {
        this.Emicnpj = Emicnpj;
    }

    public String getEmicpf() {
        return Emicpf;
    }

    public void setEmicpf(String Emicpf) {
        this.Emicpf = Emicpf;
    }

    public String getEmirazaoSocial() {
        return EmirazaoSocial;
    }

    public void setEmirazaoSocial(String EmirazaoSocial) {
        this.EmirazaoSocial = EmirazaoSocial;
    }

    public String getEminomeFantasia() {
        return EminomeFantasia;
    }

    public void setEminomeFantasia(String EminomeFantasia) {
        this.EminomeFantasia = EminomeFantasia;
    }

    public String getEmilogradouro() {
        return Emilogradouro;
    }

    public void setEmilogradouro(String Emilogradouro) {
        this.Emilogradouro = Emilogradouro;
    }

    public String getEminumero() {
        return Eminumero;
    }

    public void setEminumero(String Eminumero) {
        this.Eminumero = Eminumero;
    }

    public String getEmicomplemento() {
        return Emicomplemento;
    }

    public void setEmicomplemento(String Emicomplemento) {
        this.Emicomplemento = Emicomplemento;
    }

    public String getEmibairro() {
        return Emibairro;
    }

    public void setEmibairro(String Emibairro) {
        this.Emibairro = Emibairro;
    }

    public String getEmicodigoMunicipio() {
        return EmicodigoMunicipio;
    }

    public void setEmicodigoMunicipio(String EmicodigoMunicipio) {
        this.EmicodigoMunicipio = EmicodigoMunicipio;
    }

    public String getEmidescricaoMunicipio() {
        return EmidescricaoMunicipio;
    }

    public void setEmidescricaoMunicipio(String EmidescricaoMunicipio) {
        this.EmidescricaoMunicipio = EmidescricaoMunicipio;
    }

    public String getEmiuf() {
        return Emiuf;
    }

    public void setEmiuf(String Emiuf) {
        this.Emiuf = Emiuf;
    }

    public String getEmicep() {
        return Emicep;
    }

    public void setEmicep(String Emicep) {
        this.Emicep = Emicep;
    }

    public String getEmicodigoPais() {
        return EmicodigoPais;
    }

    public void setEmicodigoPais(String EmicodigoPais) {
        this.EmicodigoPais = EmicodigoPais;
    }

    public String getEmidescricaoPais() {
        return EmidescricaoPais;
    }

    public void setEmidescricaoPais(String EmidescricaoPais) {
        this.EmidescricaoPais = EmidescricaoPais;
    }

    public String getEmitelefone() {
        return Emitelefone;
    }

    public void setEmitelefone(String Emitelefone) {
        this.Emitelefone = Emitelefone;
    }

    public String getEmiinscricaoEstadual() {
        return EmiinscricaoEstadual;
    }

    public void setEmiinscricaoEstadual(String EmiinscricaoEstadual) {
        this.EmiinscricaoEstadual = EmiinscricaoEstadual;
    }

    public String getEmiinscricaoEstadualSubstituicaoTributaria() {
        return EmiinscricaoEstadualSubstituicaoTributaria;
    }

    public void setEmiinscricaoEstadualSubstituicaoTributaria(String EmiinscricaoEstadualSubstituicaoTributaria) {
        this.EmiinscricaoEstadualSubstituicaoTributaria = EmiinscricaoEstadualSubstituicaoTributaria;
    }

    public String getEmiinscricaoMunicipal() {
        return EmiinscricaoMunicipal;
    }

    public void setEmiinscricaoMunicipal(String EmiinscricaoMunicipal) {
        this.EmiinscricaoMunicipal = EmiinscricaoMunicipal;
    }

    public String getEmiclassificacaoNacionalAtividadesEconomicas() {
        return EmiclassificacaoNacionalAtividadesEconomicas;
    }

    public void setEmiclassificacaoNacionalAtividadesEconomicas(String EmiclassificacaoNacionalAtividadesEconomicas) {
        this.EmiclassificacaoNacionalAtividadesEconomicas = EmiclassificacaoNacionalAtividadesEconomicas;
    }

    public Integer getEmiregimeTributario() {
        return EmiregimeTributario;
    }

    public void setEmiregimeTributario(Integer EmiregimeTributario) {
        this.EmiregimeTributario = EmiregimeTributario;
    }

    public String getAvulsacnpj() {
        return Avulsacnpj;
    }

    public void setAvulsacnpj(String Avulsacnpj) {
        this.Avulsacnpj = Avulsacnpj;
    }

    public String getAvulsaorgaoEmitente() {
        return AvulsaorgaoEmitente;
    }

    public void setAvulsaorgaoEmitente(String AvulsaorgaoEmitente) {
        this.AvulsaorgaoEmitente = AvulsaorgaoEmitente;
    }

    public String getAvulsamatriculaAgente() {
        return AvulsamatriculaAgente;
    }

    public void setAvulsamatriculaAgente(String AvulsamatriculaAgente) {
        this.AvulsamatriculaAgente = AvulsamatriculaAgente;
    }

    public String getAvulsanomeAgente() {
        return AvulsanomeAgente;
    }

    public void setAvulsanomeAgente(String AvulsanomeAgente) {
        this.AvulsanomeAgente = AvulsanomeAgente;
    }

    public String getAvulsafone() {
        return Avulsafone;
    }

    public void setAvulsafone(String Avulsafone) {
        this.Avulsafone = Avulsafone;
    }

    public String getAvulsauf() {
        return Avulsauf;
    }

    public void setAvulsauf(String Avulsauf) {
        this.Avulsauf = Avulsauf;
    }

    public String getAvulsanumeroDocumentoArrecadacaoReceita() {
        return AvulsanumeroDocumentoArrecadacaoReceita;
    }

    public void setAvulsanumeroDocumentoArrecadacaoReceita(String AvulsanumeroDocumentoArrecadacaoReceita) {
        this.AvulsanumeroDocumentoArrecadacaoReceita = AvulsanumeroDocumentoArrecadacaoReceita;
    }

    public LocalDate getAvulsadataEmissaoDocumentoArrecadacao() {
        return AvulsadataEmissaoDocumentoArrecadacao;
    }

    public void setAvulsadataEmissaoDocumentoArrecadacao(LocalDate AvulsadataEmissaoDocumentoArrecadacao) {
        this.AvulsadataEmissaoDocumentoArrecadacao = AvulsadataEmissaoDocumentoArrecadacao;
    }

    public String getAvulsavalorTotalConstanteDocumentoArrecadacaoReceita() {
        return AvulsavalorTotalConstanteDocumentoArrecadacaoReceita;
    }

    public void setAvulsavalorTotalConstanteDocumentoArrecadacaoReceita(String AvulsavalorTotalConstanteDocumentoArrecadacaoReceita) {
        this.AvulsavalorTotalConstanteDocumentoArrecadacaoReceita = AvulsavalorTotalConstanteDocumentoArrecadacaoReceita;
    }

    public String getAvulsareparticaoFiscalEmitente() {
        return AvulsareparticaoFiscalEmitente;
    }

    public void setAvulsareparticaoFiscalEmitente(String AvulsareparticaoFiscalEmitente) {
        this.AvulsareparticaoFiscalEmitente = AvulsareparticaoFiscalEmitente;
    }

    public LocalDate getAvulsadataPagamentoDocumentoArrecadacao() {
        return AvulsadataPagamentoDocumentoArrecadacao;
    }

    public void setAvulsadataPagamentoDocumentoArrecadacao(LocalDate AvulsadataPagamentoDocumentoArrecadacao) {
        this.AvulsadataPagamentoDocumentoArrecadacao = AvulsadataPagamentoDocumentoArrecadacao;
    }

    public String getDestcnpj() {
        return Destcnpj;
    }

    public void setDestcnpj(String Destcnpj) {
        this.Destcnpj = Destcnpj;
    }

    public String getDestcpf() {
        return Destcpf;
    }

    public void setDestcpf(String Destcpf) {
        this.Destcpf = Destcpf;
    }

    public String getDestidEstrangeiro() {
        return DestidEstrangeiro;
    }

    public void setDestidEstrangeiro(String DestidEstrangeiro) {
        this.DestidEstrangeiro = DestidEstrangeiro;
    }

    public String getDestrazaoSocial() {
        return DestrazaoSocial;
    }

    public void setDestrazaoSocial(String DestrazaoSocial) {
        this.DestrazaoSocial = DestrazaoSocial;
    }

    public String getDestlogradouro() {
        return Destlogradouro;
    }

    public void setDestlogradouro(String Destlogradouro) {
        this.Destlogradouro = Destlogradouro;
    }

    public String getDestnumero() {
        return Destnumero;
    }

    public void setDestnumero(String Destnumero) {
        this.Destnumero = Destnumero;
    }

    public String getDestcomplemento() {
        return Destcomplemento;
    }

    public void setDestcomplemento(String Destcomplemento) {
        this.Destcomplemento = Destcomplemento;
    }

    public String getDestbairro() {
        return Destbairro;
    }

    public void setDestbairro(String Destbairro) {
        this.Destbairro = Destbairro;
    }

    public String getDestcodigoMunicipio() {
        return DestcodigoMunicipio;
    }

    public void setDestcodigoMunicipio(String DestcodigoMunicipio) {
        this.DestcodigoMunicipio = DestcodigoMunicipio;
    }

    public String getDestdescricaoMunicipio() {
        return DestdescricaoMunicipio;
    }

    public void setDestdescricaoMunicipio(String DestdescricaoMunicipio) {
        this.DestdescricaoMunicipio = DestdescricaoMunicipio;
    }

    public String getDestuf() {
        return Destuf;
    }

    public void setDestuf(String Destuf) {
        this.Destuf = Destuf;
    }

    public String getDestcep() {
        return Destcep;
    }

    public void setDestcep(String Destcep) {
        this.Destcep = Destcep;
    }

    public String getDestcodigoPais() {
        return DestcodigoPais;
    }

    public void setDestcodigoPais(String DestcodigoPais) {
        this.DestcodigoPais = DestcodigoPais;
    }

    public String getDestdescricaoPais() {
        return DestdescricaoPais;
    }

    public void setDestdescricaoPais(String DestdescricaoPais) {
        this.DestdescricaoPais = DestdescricaoPais;
    }

    public String getDesttelefone() {
        return Desttelefone;
    }

    public void setDesttelefone(String Desttelefone) {
        this.Desttelefone = Desttelefone;
    }

    public Integer getDestindicadorIEDestinatario() {
        return DestindicadorIEDestinatario;
    }

    public void setDestindicadorIEDestinatario(Integer DestindicadorIEDestinatario) {
        this.DestindicadorIEDestinatario = DestindicadorIEDestinatario;
    }

    public String getDestinscricaoEstadual() {
        return DestinscricaoEstadual;
    }

    public void setDestinscricaoEstadual(String DestinscricaoEstadual) {
        this.DestinscricaoEstadual = DestinscricaoEstadual;
    }

    public String getDestinscricaoSuframa() {
        return DestinscricaoSuframa;
    }

    public void setDestinscricaoSuframa(String DestinscricaoSuframa) {
        this.DestinscricaoSuframa = DestinscricaoSuframa;
    }

    public String getDestinscricaoMunicipal() {
        return DestinscricaoMunicipal;
    }

    public void setDestinscricaoMunicipal(String DestinscricaoMunicipal) {
        this.DestinscricaoMunicipal = DestinscricaoMunicipal;
    }

    public String getDestemail() {
        return Destemail;
    }

    public void setDestemail(String Destemail) {
        this.Destemail = Destemail;
    }

    public String getLocalRetcnpj() {
        return LocalRetcnpj;
    }

    public void setLocalRetcnpj(String LocalRetcnpj) {
        this.LocalRetcnpj = LocalRetcnpj;
    }

    public String getLocalRetcpf() {
        return LocalRetcpf;
    }

    public void setLocalRetcpf(String LocalRetcpf) {
        this.LocalRetcpf = LocalRetcpf;
    }

    public String getLocalRetlogradouro() {
        return LocalRetlogradouro;
    }

    public void setLocalRetlogradouro(String LocalRetlogradouro) {
        this.LocalRetlogradouro = LocalRetlogradouro;
    }

    public String getLocalRetnumero() {
        return LocalRetnumero;
    }

    public void setLocalRetnumero(String LocalRetnumero) {
        this.LocalRetnumero = LocalRetnumero;
    }

    public String getLocalRetcomplemento() {
        return LocalRetcomplemento;
    }

    public void setLocalRetcomplemento(String LocalRetcomplemento) {
        this.LocalRetcomplemento = LocalRetcomplemento;
    }

    public String getLocalRetbairro() {
        return LocalRetbairro;
    }

    public void setLocalRetbairro(String LocalRetbairro) {
        this.LocalRetbairro = LocalRetbairro;
    }

    public String getLocalRetcodigoMunicipio() {
        return LocalRetcodigoMunicipio;
    }

    public void setLocalRetcodigoMunicipio(String LocalRetcodigoMunicipio) {
        this.LocalRetcodigoMunicipio = LocalRetcodigoMunicipio;
    }

    public String getLocalRetnomeMunicipio() {
        return LocalRetnomeMunicipio;
    }

    public void setLocalRetnomeMunicipio(String LocalRetnomeMunicipio) {
        this.LocalRetnomeMunicipio = LocalRetnomeMunicipio;
    }

    public String getLocalRetuf() {
        return LocalRetuf;
    }

    public void setLocalRetuf(String LocalRetuf) {
        this.LocalRetuf = LocalRetuf;
    }

    public String getLocalEntcnpj() {
        return LocalEntcnpj;
    }

    public void setLocalEntcnpj(String LocalEntcnpj) {
        this.LocalEntcnpj = LocalEntcnpj;
    }

    public String getLocalEntcpf() {
        return LocalEntcpf;
    }

    public void setLocalEntcpf(String LocalEntcpf) {
        this.LocalEntcpf = LocalEntcpf;
    }

    public String getLocalEntlogradouro() {
        return LocalEntlogradouro;
    }

    public void setLocalEntlogradouro(String LocalEntlogradouro) {
        this.LocalEntlogradouro = LocalEntlogradouro;
    }

    public String getLocalEntnumero() {
        return LocalEntnumero;
    }

    public void setLocalEntnumero(String LocalEntnumero) {
        this.LocalEntnumero = LocalEntnumero;
    }

    public String getLocalEntcomplemento() {
        return LocalEntcomplemento;
    }

    public void setLocalEntcomplemento(String LocalEntcomplemento) {
        this.LocalEntcomplemento = LocalEntcomplemento;
    }

    public String getLocalEntbairro() {
        return LocalEntbairro;
    }

    public void setLocalEntbairro(String LocalEntbairro) {
        this.LocalEntbairro = LocalEntbairro;
    }

    public String getLocalEntcodigoMunicipio() {
        return LocalEntcodigoMunicipio;
    }

    public void setLocalEntcodigoMunicipio(String LocalEntcodigoMunicipio) {
        this.LocalEntcodigoMunicipio = LocalEntcodigoMunicipio;
    }

    public String getLocalEntnomeMunicipio() {
        return LocalEntnomeMunicipio;
    }

    public void setLocalEntnomeMunicipio(String LocalEntnomeMunicipio) {
        this.LocalEntnomeMunicipio = LocalEntnomeMunicipio;
    }

    public String getLocalEntuf() {
        return LocalEntuf;
    }

    public void setLocalEntuf(String LocalEntuf) {
        this.LocalEntuf = LocalEntuf;
    }

    public String getTotalicmsTotalbaseCalculoICMS() {
        return TotalicmsTotalbaseCalculoICMS;
    }

    public void setTotalicmsTotalbaseCalculoICMS(String TotalicmsTotalbaseCalculoICMS) {
        this.TotalicmsTotalbaseCalculoICMS = TotalicmsTotalbaseCalculoICMS;
    }

    public String getTotalicmsTotalvalorTotalICMS() {
        return TotalicmsTotalvalorTotalICMS;
    }

    public void setTotalicmsTotalvalorTotalICMS(String TotalicmsTotalvalorTotalICMS) {
        this.TotalicmsTotalvalorTotalICMS = TotalicmsTotalvalorTotalICMS;
    }

    public String getTotalicmsTotalvalorICMSDesonerado() {
        return TotalicmsTotalvalorICMSDesonerado;
    }

    public void setTotalicmsTotalvalorICMSDesonerado(String TotalicmsTotalvalorICMSDesonerado) {
        this.TotalicmsTotalvalorICMSDesonerado = TotalicmsTotalvalorICMSDesonerado;
    }

    public String getTotalicmsTotalvalor() {
        return TotalicmsTotalvalor;
    }

    public void setTotalicmsTotalvalor(String TotalicmsTotalvalor) {
        this.TotalicmsTotalvalor = TotalicmsTotalvalor;
    }

    public String getTotalicmsTotalvalorTotalICMSST() {
        return TotalicmsTotalvalorTotalICMSST;
    }

    public void setTotalicmsTotalvalorTotalICMSST(String TotalicmsTotalvalorTotalICMSST) {
        this.TotalicmsTotalvalorTotalICMSST = TotalicmsTotalvalorTotalICMSST;
    }

    public String getTotalicmsTotalvalorTotalDosProdutosServicos() {
        return TotalicmsTotalvalorTotalDosProdutosServicos;
    }

    public void setTotalicmsTotalvalorTotalDosProdutosServicos(String TotalicmsTotalvalorTotalDosProdutosServicos) {
        this.TotalicmsTotalvalorTotalDosProdutosServicos = TotalicmsTotalvalorTotalDosProdutosServicos;
    }

    public String getTotalicmsTotalvalorTotalFrete() {
        return TotalicmsTotalvalorTotalFrete;
    }

    public void setTotalicmsTotalvalorTotalFrete(String TotalicmsTotalvalorTotalFrete) {
        this.TotalicmsTotalvalorTotalFrete = TotalicmsTotalvalorTotalFrete;
    }

    public String getTotalicmsTotalvalorTotalSeguro() {
        return TotalicmsTotalvalorTotalSeguro;
    }

    public void setTotalicmsTotalvalorTotalSeguro(String TotalicmsTotalvalorTotalSeguro) {
        this.TotalicmsTotalvalorTotalSeguro = TotalicmsTotalvalorTotalSeguro;
    }

    public String getTotalicmsTotalvalorTotalDesconto() {
        return TotalicmsTotalvalorTotalDesconto;
    }

    public void setTotalicmsTotalvalorTotalDesconto(String TotalicmsTotalvalorTotalDesconto) {
        this.TotalicmsTotalvalorTotalDesconto = TotalicmsTotalvalorTotalDesconto;
    }

    public String getTotalicmsTotalvalorTotalII() {
        return TotalicmsTotalvalorTotalII;
    }

    public void setTotalicmsTotalvalorTotalII(String TotalicmsTotalvalorTotalII) {
        this.TotalicmsTotalvalorTotalII = TotalicmsTotalvalorTotalII;
    }

    public String getTotalicmsTotalvalorTotalIPI() {
        return TotalicmsTotalvalorTotalIPI;
    }

    public void setTotalicmsTotalvalorTotalIPI(String TotalicmsTotalvalorTotalIPI) {
        this.TotalicmsTotalvalorTotalIPI = TotalicmsTotalvalorTotalIPI;
    }

    public String getTotalicmsTotalvalorPIS() {
        return TotalicmsTotalvalorPIS;
    }

    public void setTotalicmsTotalvalorPIS(String TotalicmsTotalvalorPIS) {
        this.TotalicmsTotalvalorPIS = TotalicmsTotalvalorPIS;
    }

    public String getTotalicmsTotalvalorCOFINS() {
        return TotalicmsTotalvalorCOFINS;
    }

    public void setTotalicmsTotalvalorCOFINS(String TotalicmsTotalvalorCOFINS) {
        this.TotalicmsTotalvalorCOFINS = TotalicmsTotalvalorCOFINS;
    }

    public String getTotalicmsTotaloutrasDespesasAcessorias() {
        return TotalicmsTotaloutrasDespesasAcessorias;
    }

    public void setTotalicmsTotaloutrasDespesasAcessorias(String TotalicmsTotaloutrasDespesasAcessorias) {
        this.TotalicmsTotaloutrasDespesasAcessorias = TotalicmsTotaloutrasDespesasAcessorias;
    }

    public String getTotalicmsTotalvalorTotalNFe() {
        return TotalicmsTotalvalorTotalNFe;
    }

    public void setTotalicmsTotalvalorTotalNFe(String TotalicmsTotalvalorTotalNFe) {
        this.TotalicmsTotalvalorTotalNFe = TotalicmsTotalvalorTotalNFe;
    }

    public String getTotalicmsTotalvalorTotalTributos() {
        return TotalicmsTotalvalorTotalTributos;
    }

    public void setTotalicmsTotalvalorTotalTributos(String TotalicmsTotalvalorTotalTributos) {
        this.TotalicmsTotalvalorTotalTributos = TotalicmsTotalvalorTotalTributos;
    }

    public String getTotalissqnTotalvalorTotalServicosSobNaoIncidenciaNaoTributadosICMS() {
        return TotalissqnTotalvalorTotalServicosSobNaoIncidenciaNaoTributadosICMS;
    }

    public void setTotalissqnTotalvalorTotalServicosSobNaoIncidenciaNaoTributadosICMS(String TotalissqnTotalvalorTotalServicosSobNaoIncidenciaNaoTributadosICMS) {
        this.TotalissqnTotalvalorTotalServicosSobNaoIncidenciaNaoTributadosICMS = TotalissqnTotalvalorTotalServicosSobNaoIncidenciaNaoTributadosICMS;
    }

    public String getTotalissqnTotalbaseCalculoISS() {
        return TotalissqnTotalbaseCalculoISS;
    }

    public void setTotalissqnTotalbaseCalculoISS(String TotalissqnTotalbaseCalculoISS) {
        this.TotalissqnTotalbaseCalculoISS = TotalissqnTotalbaseCalculoISS;
    }

    public String getTotalissqnTotalvalorTotalISS() {
        return TotalissqnTotalvalorTotalISS;
    }

    public void setTotalissqnTotalvalorTotalISS(String TotalissqnTotalvalorTotalISS) {
        this.TotalissqnTotalvalorTotalISS = TotalissqnTotalvalorTotalISS;
    }

    public String getTotalissqnTotalvalorPISsobreServicos() {
        return TotalissqnTotalvalorPISsobreServicos;
    }

    public void setTotalissqnTotalvalorPISsobreServicos(String TotalissqnTotalvalorPISsobreServicos) {
        this.TotalissqnTotalvalorPISsobreServicos = TotalissqnTotalvalorPISsobreServicos;
    }

    public String getTotalissqnTotalvalorCOFINSsobreServicos() {
        return TotalissqnTotalvalorCOFINSsobreServicos;
    }

    public void setTotalissqnTotalvalorCOFINSsobreServicos(String TotalissqnTotalvalorCOFINSsobreServicos) {
        this.TotalissqnTotalvalorCOFINSsobreServicos = TotalissqnTotalvalorCOFINSsobreServicos;
    }

    public LocalDate getTotalissqnTotaldataPrestacaoServico() {
        return TotalissqnTotaldataPrestacaoServico;
    }

    public void setTotalissqnTotaldataPrestacaoServico(LocalDate TotalissqnTotaldataPrestacaoServico) {
        this.TotalissqnTotaldataPrestacaoServico = TotalissqnTotaldataPrestacaoServico;
    }

    public String getTotalissqnTotalvalorDeducao() {
        return TotalissqnTotalvalorDeducao;
    }

    public void setTotalissqnTotalvalorDeducao(String TotalissqnTotalvalorDeducao) {
        this.TotalissqnTotalvalorDeducao = TotalissqnTotalvalorDeducao;
    }

    public String getTotalissqnTotalvalorOutros() {
        return TotalissqnTotalvalorOutros;
    }

    public void setTotalissqnTotalvalorOutros(String TotalissqnTotalvalorOutros) {
        this.TotalissqnTotalvalorOutros = TotalissqnTotalvalorOutros;
    }

    public String getTotalissqnTotalvalorTotalDescontoIncondicionado() {
        return TotalissqnTotalvalorTotalDescontoIncondicionado;
    }

    public void setTotalissqnTotalvalorTotalDescontoIncondicionado(String TotalissqnTotalvalorTotalDescontoIncondicionado) {
        this.TotalissqnTotalvalorTotalDescontoIncondicionado = TotalissqnTotalvalorTotalDescontoIncondicionado;
    }

    public String getTotalissqnTotalvalorTotalDescontoCondicionado() {
        return TotalissqnTotalvalorTotalDescontoCondicionado;
    }

    public void setTotalissqnTotalvalorTotalDescontoCondicionado(String TotalissqnTotalvalorTotalDescontoCondicionado) {
        this.TotalissqnTotalvalorTotalDescontoCondicionado = TotalissqnTotalvalorTotalDescontoCondicionado;
    }

    public String getTotalissqnTotalvalorTotalRetencaoISS() {
        return TotalissqnTotalvalorTotalRetencaoISS;
    }

    public void setTotalissqnTotalvalorTotalRetencaoISS(String TotalissqnTotalvalorTotalRetencaoISS) {
        this.TotalissqnTotalvalorTotalRetencaoISS = TotalissqnTotalvalorTotalRetencaoISS;
    }

    public Integer getTotalissqnTotaltributacao() {
        return TotalissqnTotaltributacao;
    }

    public void setTotalissqnTotaltributacao(Integer TotalissqnTotaltributacao) {
        this.TotalissqnTotaltributacao = TotalissqnTotaltributacao;
    }

    public String getTotalretencoesTributosvalorRetidoPIS() {
        return TotalretencoesTributosvalorRetidoPIS;
    }

    public void setTotalretencoesTributosvalorRetidoPIS(String TotalretencoesTributosvalorRetidoPIS) {
        this.TotalretencoesTributosvalorRetidoPIS = TotalretencoesTributosvalorRetidoPIS;
    }

    public String getTotalretencoesTributosvalorRetidoCOFINS() {
        return TotalretencoesTributosvalorRetidoCOFINS;
    }

    public void setTotalretencoesTributosvalorRetidoCOFINS(String TotalretencoesTributosvalorRetidoCOFINS) {
        this.TotalretencoesTributosvalorRetidoCOFINS = TotalretencoesTributosvalorRetidoCOFINS;
    }

    public String getTotalretencoesTributosvalorRetidoCSLL() {
        return TotalretencoesTributosvalorRetidoCSLL;
    }

    public void setTotalretencoesTributosvalorRetidoCSLL(String TotalretencoesTributosvalorRetidoCSLL) {
        this.TotalretencoesTributosvalorRetidoCSLL = TotalretencoesTributosvalorRetidoCSLL;
    }

    public String getTotalretencoesTributosbaseCalculoIRRF() {
        return TotalretencoesTributosbaseCalculoIRRF;
    }

    public void setTotalretencoesTributosbaseCalculoIRRF(String TotalretencoesTributosbaseCalculoIRRF) {
        this.TotalretencoesTributosbaseCalculoIRRF = TotalretencoesTributosbaseCalculoIRRF;
    }

    public String getTotalretencoesTributosvalorRetidoIRRF() {
        return TotalretencoesTributosvalorRetidoIRRF;
    }

    public void setTotalretencoesTributosvalorRetidoIRRF(String TotalretencoesTributosvalorRetidoIRRF) {
        this.TotalretencoesTributosvalorRetidoIRRF = TotalretencoesTributosvalorRetidoIRRF;
    }

    public String getTotalretencoesTributosbaseCalculoRetencaoPrevidenciaSocial() {
        return TotalretencoesTributosbaseCalculoRetencaoPrevidenciaSocial;
    }

    public void setTotalretencoesTributosbaseCalculoRetencaoPrevidenciaSocial(String TotalretencoesTributosbaseCalculoRetencaoPrevidenciaSocial) {
        this.TotalretencoesTributosbaseCalculoRetencaoPrevidenciaSocial = TotalretencoesTributosbaseCalculoRetencaoPrevidenciaSocial;
    }

    public String getTotalretencoesTributosvalorRetencaoPrevidenciaSocial() {
        return TotalretencoesTributosvalorRetencaoPrevidenciaSocial;
    }

    public void setTotalretencoesTributosvalorRetencaoPrevidenciaSocial(String TotalretencoesTributosvalorRetencaoPrevidenciaSocial) {
        this.TotalretencoesTributosvalorRetencaoPrevidenciaSocial = TotalretencoesTributosvalorRetencaoPrevidenciaSocial;
    }

    public Integer getModalidadeFrete() {
        return modalidadeFrete;
    }

    public void setModalidadeFrete(Integer modalidadeFrete) {
        this.modalidadeFrete = modalidadeFrete;
    }

    public String getTransportadorcnpj() {
        return Transportadorcnpj;
    }

    public void setTransportadorcnpj(String Transportadorcnpj) {
        this.Transportadorcnpj = Transportadorcnpj;
    }

    public String getTransportadorcpf() {
        return Transportadorcpf;
    }

    public void setTransportadorcpf(String Transportadorcpf) {
        this.Transportadorcpf = Transportadorcpf;
    }

    public String getTransportadorrazaoSocial() {
        return TransportadorrazaoSocial;
    }

    public void setTransportadorrazaoSocial(String TransportadorrazaoSocial) {
        this.TransportadorrazaoSocial = TransportadorrazaoSocial;
    }

    public String getTransportadorinscricaoEstadual() {
        return TransportadorinscricaoEstadual;
    }

    public void setTransportadorinscricaoEstadual(String TransportadorinscricaoEstadual) {
        this.TransportadorinscricaoEstadual = TransportadorinscricaoEstadual;
    }

    public String getTransportadorenderecoComplemento() {
        return TransportadorenderecoComplemento;
    }

    public void setTransportadorenderecoComplemento(String TransportadorenderecoComplemento) {
        this.TransportadorenderecoComplemento = TransportadorenderecoComplemento;
    }

    public String getTransportadornomeMunicipio() {
        return TransportadornomeMunicipio;
    }

    public void setTransportadornomeMunicipio(String TransportadornomeMunicipio) {
        this.TransportadornomeMunicipio = TransportadornomeMunicipio;
    }

    public String getTransportadoruf() {
        return Transportadoruf;
    }

    public void setTransportadoruf(String Transportadoruf) {
        this.Transportadoruf = Transportadoruf;
    }

    public String getReticmsTranspvalorServico() {
        return ReticmsTranspvalorServico;
    }

    public void setReticmsTranspvalorServico(String ReticmsTranspvalorServico) {
        this.ReticmsTranspvalorServico = ReticmsTranspvalorServico;
    }

    public String getReticmsTranspbcRetencaoICMS() {
        return ReticmsTranspbcRetencaoICMS;
    }

    public void setReticmsTranspbcRetencaoICMS(String ReticmsTranspbcRetencaoICMS) {
        this.ReticmsTranspbcRetencaoICMS = ReticmsTranspbcRetencaoICMS;
    }

    public String getReticmsTranspaliquotaRetencao() {
        return ReticmsTranspaliquotaRetencao;
    }

    public void setReticmsTranspaliquotaRetencao(String ReticmsTranspaliquotaRetencao) {
        this.ReticmsTranspaliquotaRetencao = ReticmsTranspaliquotaRetencao;
    }

    public String getReticmsTranspvalorICMSRetido() {
        return ReticmsTranspvalorICMSRetido;
    }

    public void setReticmsTranspvalorICMSRetido(String ReticmsTranspvalorICMSRetido) {
        this.ReticmsTranspvalorICMSRetido = ReticmsTranspvalorICMSRetido;
    }

    public Integer getReticmsTranspcfop() {
        return ReticmsTranspcfop;
    }

    public void setReticmsTranspcfop(Integer ReticmsTranspcfop) {
        this.ReticmsTranspcfop = ReticmsTranspcfop;
    }

    public Integer getReticmsTranspcodigoMunicipioOcorrenciaFatoGeradorICMSTransporte() {
        return ReticmsTranspcodigoMunicipioOcorrenciaFatoGeradorICMSTransporte;
    }

    public void setReticmsTranspcodigoMunicipioOcorrenciaFatoGeradorICMSTransporte(Integer ReticmsTranspcodigoMunicipioOcorrenciaFatoGeradorICMSTransporte) {
        this.ReticmsTranspcodigoMunicipioOcorrenciaFatoGeradorICMSTransporte = ReticmsTranspcodigoMunicipioOcorrenciaFatoGeradorICMSTransporte;
    }

    public String getTranspVeiplacaVeiculo() {
        return TranspVeiplacaVeiculo;
    }

    public void setTranspVeiplacaVeiculo(String TranspVeiplacaVeiculo) {
        this.TranspVeiplacaVeiculo = TranspVeiplacaVeiculo;
    }

    public String getTranspVeiuf() {
        return TranspVeiuf;
    }

    public void setTranspVeiuf(String TranspVeiuf) {
        this.TranspVeiuf = TranspVeiuf;
    }

    public String getTranspVeiregistroNacionalTransportadorCarga() {
        return TranspVeiregistroNacionalTransportadorCarga;
    }

    public void setTranspVeiregistroNacionalTransportadorCarga(String TranspVeiregistroNacionalTransportadorCarga) {
        this.TranspVeiregistroNacionalTransportadorCarga = TranspVeiregistroNacionalTransportadorCarga;
    }

    public List<NFNotaInfoReboque> getReboques() {
        return reboques;
    }

    public void setReboques(List<NFNotaInfoReboque> reboques) {
        this.reboques = reboques;
    }

    public String getVagao() {
        return vagao;
    }

    public void setVagao(String vagao) {
        this.vagao = vagao;
    }

    public String getBalsa() {
        return balsa;
    }

    public void setBalsa(String balsa) {
        this.balsa = balsa;
    }

    public List<NFNotaInfoVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<NFNotaInfoVolume> volumes) {
        this.volumes = volumes;
    }

    public String getCobrFaturanumeroFatura() {
        return CobrFaturanumeroFatura;
    }

    public void setCobrFaturanumeroFatura(String CobrFaturanumeroFatura) {
        this.CobrFaturanumeroFatura = CobrFaturanumeroFatura;
    }

    public String getCobrFaturavalorOriginalFatura() {
        return CobrFaturavalorOriginalFatura;
    }

    public void setCobrFaturavalorOriginalFatura(String CobrFaturavalorOriginalFatura) {
        this.CobrFaturavalorOriginalFatura = CobrFaturavalorOriginalFatura;
    }

    public String getCobrFaturavalorDesconto() {
        return CobrFaturavalorDesconto;
    }

    public void setCobrFaturavalorDesconto(String CobrFaturavalorDesconto) {
        this.CobrFaturavalorDesconto = CobrFaturavalorDesconto;
    }

    public String getCobrFaturavalorLiquidoFatura() {
        return CobrFaturavalorLiquidoFatura;
    }

    public void setCobrFaturavalorLiquidoFatura(String CobrFaturavalorLiquidoFatura) {
        this.CobrFaturavalorLiquidoFatura = CobrFaturavalorLiquidoFatura;
    }

    public List<NFNotaInfoDuplicata> getCobrduplicatas() {
        return Cobrduplicatas;
    }

    public void setCobrduplicatas(List<NFNotaInfoDuplicata> Cobrduplicatas) {
        this.Cobrduplicatas = Cobrduplicatas;
    }

    public String getInformacoesAdicionaisInteresseFisco() {
        return informacoesAdicionaisInteresseFisco;
    }

    public void setInformacoesAdicionaisInteresseFisco(String informacoesAdicionaisInteresseFisco) {
        this.informacoesAdicionaisInteresseFisco = informacoesAdicionaisInteresseFisco;
    }

    public String getInformacoesComplementaresInteresseContribuinte() {
        return informacoesComplementaresInteresseContribuinte;
    }

    public void setInformacoesComplementaresInteresseContribuinte(String informacoesComplementaresInteresseContribuinte) {
        this.informacoesComplementaresInteresseContribuinte = informacoesComplementaresInteresseContribuinte;
    }

    public List<NFNotaInfoObservacao> getInfAdicobservacoesContribuinte() {
        return InfAdicobservacoesContribuinte;
    }

    public void setInfAdicobservacoesContribuinte(List<NFNotaInfoObservacao> InfAdicobservacoesContribuinte) {
        this.InfAdicobservacoesContribuinte = InfAdicobservacoesContribuinte;
    }

    public List<NFNotaInfoObservacao> getInfAdicobservacoesFisco() {
        return InfAdicobservacoesFisco;
    }

    public void setInfAdicobservacoesFisco(List<NFNotaInfoObservacao> InfAdicobservacoesFisco) {
        this.InfAdicobservacoesFisco = InfAdicobservacoesFisco;
    }

    public List<NFNotaInfoProcessoReferenciado> getInfAdiprocessosRefenciado() {
        return InfAdiprocessosRefenciado;
    }

    public void setInfAdiprocessosRefenciado(List<NFNotaInfoProcessoReferenciado> InfAdiprocessosRefenciado) {
        this.InfAdiprocessosRefenciado = InfAdiprocessosRefenciado;
    }

    public String getExportacaoufEmbarqueProduto() {
        return ExportacaoufEmbarqueProduto;
    }

    public void setExportacaoufEmbarqueProduto(String ExportacaoufEmbarqueProduto) {
        this.ExportacaoufEmbarqueProduto = ExportacaoufEmbarqueProduto;
    }

    public String getExportacaolocalEmbarqueProdutos() {
        return ExportacaolocalEmbarqueProdutos;
    }

    public void setExportacaolocalEmbarqueProdutos(String ExportacaolocalEmbarqueProdutos) {
        this.ExportacaolocalEmbarqueProdutos = ExportacaolocalEmbarqueProdutos;
    }

    public String getExportacaolocalDespachoProdutos() {
        return ExportacaolocalDespachoProdutos;
    }

    public void setExportacaolocalDespachoProdutos(String ExportacaolocalDespachoProdutos) {
        this.ExportacaolocalDespachoProdutos = ExportacaolocalDespachoProdutos;
    }

    public String getCompranotaDeEmpenho() {
        return CompranotaDeEmpenho;
    }

    public void setCompranotaDeEmpenho(String CompranotaDeEmpenho) {
        this.CompranotaDeEmpenho = CompranotaDeEmpenho;
    }

    public String getComprapedido() {
        return Comprapedido;
    }

    public void setComprapedido(String Comprapedido) {
        this.Comprapedido = Comprapedido;
    }

    public String getCompracontrato() {
        return Compracontrato;
    }

    public void setCompracontrato(String Compracontrato) {
        this.Compracontrato = Compracontrato;
    }

    public String getCanasafra() {
        return Canasafra;
    }

    public void setCanasafra(String Canasafra) {
        this.Canasafra = Canasafra;
    }

    public String getCanareferencia() {
        return Canareferencia;
    }

    public void setCanareferencia(String Canareferencia) {
        this.Canareferencia = Canareferencia;
    }

    public List<NFNotaInfoCanaFornecimentoDiario> getCanafornecimentosDiario() {
        return CanafornecimentosDiario;
    }

    public void setCanafornecimentosDiario(List<NFNotaInfoCanaFornecimentoDiario> CanafornecimentosDiario) {
        this.CanafornecimentosDiario = CanafornecimentosDiario;
    }

    public List<NFNotaInfoCanaDeducao> getCanadeducoes() {
        return Canadeducoes;
    }

    public void setCanadeducoes(List<NFNotaInfoCanaDeducao> Canadeducoes) {
        this.Canadeducoes = Canadeducoes;
    }

    public String getCanaquantidadeTotalMes() {
        return CanaquantidadeTotalMes;
    }

    public void setCanaquantidadeTotalMes(String CanaquantidadeTotalMes) {
        this.CanaquantidadeTotalMes = CanaquantidadeTotalMes;
    }

    public String getCanaquantidadeTotalAnterior() {
        return CanaquantidadeTotalAnterior;
    }

    public void setCanaquantidadeTotalAnterior(String CanaquantidadeTotalAnterior) {
        this.CanaquantidadeTotalAnterior = CanaquantidadeTotalAnterior;
    }

    public String getCanaquantidadeTotalGeral() {
        return CanaquantidadeTotalGeral;
    }

    public void setCanaquantidadeTotalGeral(String CanaquantidadeTotalGeral) {
        this.CanaquantidadeTotalGeral = CanaquantidadeTotalGeral;
    }

    public String getCanavalorFornecimento() {
        return CanavalorFornecimento;
    }

    public void setCanavalorFornecimento(String CanavalorFornecimento) {
        this.CanavalorFornecimento = CanavalorFornecimento;
    }

    public String getCanavalorTotalDeducao() {
        return CanavalorTotalDeducao;
    }

    public void setCanavalorTotalDeducao(String CanavalorTotalDeducao) {
        this.CanavalorTotalDeducao = CanavalorTotalDeducao;
    }

    public String getCanavalorLiquidoFornecimento() {
        return CanavalorLiquidoFornecimento;
    }

    public void setCanavalorLiquidoFornecimento(String CanavalorLiquidoFornecimento) {
        this.CanavalorLiquidoFornecimento = CanavalorLiquidoFornecimento;
    }

    public List<NFPessoaAutorizadaDownloadNFe> getPessoasAutorizadasDownloadNFe() {
        return pessoasAutorizadasDownloadNFe;
    }

    public void setPessoasAutorizadasDownloadNFe(List<NFPessoaAutorizadaDownloadNFe> pessoasAutorizadasDownloadNFe) {
        this.pessoasAutorizadasDownloadNFe = pessoasAutorizadasDownloadNFe;
    }

    public List<NFNotaInfoItem> getItens() {
        return itens;
    }

    public void setItens(List<NFNotaInfoItem> itens) {
        this.itens = itens;
    }

    public List<NFNotaInfoPagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<NFNotaInfoPagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public StringBuilder getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(StringBuilder assinatura) {
        this.assinatura = assinatura;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getProtocoloVersao() {
        return protocoloVersao;
    }

    public void setProtocoloVersao(String protocoloVersao) {
        this.protocoloVersao = protocoloVersao;
    }

    public String getProtocoloidentificador() {
        return protocoloidentificador;
    }

    public void setProtocoloidentificador(String protocoloidentificador) {
        this.protocoloidentificador = protocoloidentificador;
    }

    public String getProtocoloambiente() {
        return protocoloambiente;
    }

    public void setProtocoloambiente(String protocoloambiente) {
        this.protocoloambiente = protocoloambiente;
    }

    public String getProtocoloversaoAplicacao() {
        return protocoloversaoAplicacao;
    }

    public void setProtocoloversaoAplicacao(String protocoloversaoAplicacao) {
        this.protocoloversaoAplicacao = protocoloversaoAplicacao;
    }

    public String getProtocolochave() {
        return protocolochave;
    }

    public void setProtocolochave(String protocolochave) {
        this.protocolochave = protocolochave;
    }

    public String getProtocolodataRecebimento() {
        return protocolodataRecebimento;
    }

    public void setProtocolodataRecebimento(String protocolodataRecebimento) {
        this.protocolodataRecebimento = protocolodataRecebimento;
    }

    public String getProtocolonumeroProtocolo() {
        return protocolonumeroProtocolo;
    }

    public void setProtocolonumeroProtocolo(String protocolonumeroProtocolo) {
        this.protocolonumeroProtocolo = protocolonumeroProtocolo;
    }

    public String getProtocolovalidador() {
        return protocolovalidador;
    }

    public void setProtocolovalidador(String protocolovalidador) {
        this.protocolovalidador = protocolovalidador;
    }

    public String getProtocolostatus() {
        return protocolostatus;
    }

    public void setProtocolostatus(String protocolostatus) {
        this.protocolostatus = protocolostatus;
    }

    public String getProtocolomotivo() {
        return protocolomotivo;
    }

    public void setProtocolomotivo(String protocolomotivo) {
        this.protocolomotivo = protocolomotivo;
    }

    public List<Integer> getRetornoStatus() {
        return retornoStatus;
    }

    public void setRetornoStatus(List<Integer> retornoStatus) {
        this.retornoStatus = retornoStatus;
    }

}
