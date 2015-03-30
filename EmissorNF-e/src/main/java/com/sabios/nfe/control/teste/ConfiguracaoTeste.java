package com.sabios.nfe.control.teste;

import com.emissor.nfe310.classes.NFTipo;
import com.emissor.nfe310.classes.NFUnidadeFederativa;
import com.emissor.nfe310.classes.lote.envio.NFLoteEnvio;

/**
 *
 * @author Rodrigo Monteiro
 */
public class ConfiguracaoTeste {

    //Configurações

    //emissao
    static String sq = "50";
    public static String nNf = sq;
    public static String cNf = sq;
    public static String cdLoteEnv = sq;
    public static String chave = "41150377567899000404550010000000351000000357";
    public static String protocolo = "141150000203007";
    public static String data = "1503";
    public static String data1 = "2015-03-12T22:48:10-02:00";
    public static String AA = "15";
    public static String cnpj = "77567899000404";
    public static String ie = "9046380212";
    public static String mod = "55";
    public static String serie = "1";
    public static NFUnidadeFederativa cdUF = NFUnidadeFederativa.PR;
    public static NFTipo tp_nf = NFTipo.SAIDA;

    //consulta Status 
    public static NFUnidadeFederativa ufStatus = NFUnidadeFederativa.PR;

    //consulta cadastro 
    public static NFUnidadeFederativa ufConsultaCadastro = NFUnidadeFederativa.PR;
    public static String cnpjConsultaCadastro = "77567899000404";

    //inutilizacao
    public static Integer anoInutilizacaoNumeracao = 15;
    public static String cnpjEmitenteInutilizacao = "77567899000404";
    public static String serieInutilizacao = "1";
    public static String numeroInicial = "40";
    public static String numeroFinal = "40";
    public static String justificativa = "NUMEROS INUTILIZADOS";

    //envio Lote
    public static NFLoteEnvio lote ;

    //cancela nota
    public static String chaveAcessoCancela = "";
    public static String numeroProtocoloCancela = "";
    public static String motivoCancela = "";

    //consulta Lote
    public static String numeroReciboConsultaLote = "";

    //consulta Nota
    public static String chavenfConsultaNota = "";

    //corrige nota
    public static String chaveDeAcessoCorrecao = "";
    public static String textoCorrecao = "";

}
