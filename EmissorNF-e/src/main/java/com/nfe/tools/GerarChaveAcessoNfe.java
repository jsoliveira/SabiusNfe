package com.nfe.tools;

import com.sabios.nfe.control.teste.ConfiguracaoTeste;
import java.text.SimpleDateFormat;

/**
 *
 * @author Rodrigo-jsoliveira
 */
//http://www.javac.com.br/jc/posts/list/134-nfe-exemplo-de-geracao-da-chave-de-acesso-nfe-20.page
public class GerarChaveAcessoNfe {

    private SimpleDateFormat sdf = new SimpleDateFormat("YYMM");

    public String gerarChave(String cUF, String dataAAMM, String cnpjCpf, String mod, String serie, String tpEmis, String nNF, String cNF) {
        try {

            StringBuilder chave = new StringBuilder();
            chave.append(lpadTo(cUF, 2, '0'));
            chave.append(lpadTo(dataAAMM, 4, '0'));
            chave.append(lpadTo(cnpjCpf.replaceAll("\\D", ""), 14, '0'));
            chave.append(lpadTo(mod, 2, '0'));
            chave.append(lpadTo(serie, 3, '0'));
            chave.append(lpadTo(String.valueOf(nNF), 9, '0'));
            chave.append(lpadTo(tpEmis, 1, '0'));
            chave.append(lpadTo(cNF, 8, '0'));
            chave.append(modulo11(chave.toString()));

            ConfiguracaoTeste.chave = chave.toString();

            // chave.insert(0, "NFe");
            info("Chave NF-e: " + chave.toString());

            return chave.toString();

        } catch (Exception e) {
            error(e.toString());

            return e.toString();
        }
    }

    public String gerarChaveInutilizacao(String cUF, String AA, String cnpjCpf, String mod, String serie, String nInicial, String nFinal) {
        try {

            StringBuilder chave = new StringBuilder();
            chave.append(lpadTo(cUF, 2, '0'));
            chave.append(lpadTo(AA, 2, '0'));
            chave.append(lpadTo(cnpjCpf.replaceAll("\\D", ""), 14, '0'));
            chave.append(lpadTo(mod, 2, '0'));
            chave.append(lpadTo(serie, 3, '0'));
            chave.append(lpadTo(nInicial, 9, '0'));
            chave.append(lpadTo(nFinal, 9, '0'));

            chave.insert(0, "ID");

            info("Chave NF-e: " + chave.toString());

            return chave.toString();

        } catch (Exception e) {
            error(e.toString());

            return e.toString();
        }
    }

    public String gerarChaveCartaCorrecao(String tp_evento, String chavenfe, String nseqEvento) {
        try {

            StringBuilder chave = new StringBuilder();
            chave.append(lpadTo(tp_evento, 2, '0'));
            chave.append(lpadTo(chavenfe, 2, '0'));
            chave.append(lpadTo(nseqEvento, 2, '0'));

            chave.insert(0, "ID");

            info("Chave NF-e: " + chave.toString());

            return chave.toString();

        } catch (Exception e) {
            error(e.toString());

            return e.toString();
        }
    }

    public int getDigitoVerificador(String cUF, String dataAAMM, String cnpjCpf, String mod, String serie, String tpEmis, String nNF, String cNF) {
        StringBuilder chave = new StringBuilder();
        chave.append(lpadTo(cUF, 2, '0'));
        chave.append(lpadTo(dataAAMM, 4, '0'));
        chave.append(lpadTo(cnpjCpf.replaceAll("\\D", ""), 14, '0'));
        chave.append(lpadTo(mod, 2, '0'));
        chave.append(lpadTo(serie, 3, '0'));
        chave.append(lpadTo(String.valueOf(nNF), 9, '0'));
        chave.append(lpadTo(tpEmis, 1, '0'));
        chave.append(lpadTo(cNF, 8, '0'));
        return modulo11(chave.toString());
    }

    public int getModulo11(String cUF, String dataAAMM, String cnpjCpf, String mod, String serie, String tpEmis, String nNF, String cNF) {
        StringBuilder chave = new StringBuilder();
        chave.append(lpadTo(cUF, 2, '0'));
        chave.append(lpadTo(dataAAMM, 4, '0'));
        chave.append(lpadTo(cnpjCpf.replaceAll("\\D", ""), 14, '0'));
        chave.append(lpadTo(mod, 2, '0'));
        chave.append(lpadTo(serie, 3, '0'));
        chave.append(lpadTo(String.valueOf(nNF), 9, '0'));
        chave.append(lpadTo(tpEmis, 1, '0'));
        chave.append(lpadTo(cNF, 8, '0'));
        return modulo11(chave.toString());
    }

    private int modulo11(String chave) {
        int total = 0;
        int peso = 2;

        for (int i = 0; i < chave.length(); i++) {
            total += (chave.charAt((chave.length() - 1) - i) - '0') * peso;
            peso++;
            if (peso == 10) {
                peso = 2;
            }
        }
        int resto = total % 11;
        return (resto == 0 || resto == 1) ? 0 : (11 - resto);
    }

    public String lpadTo(String input, int width, char ch) {
        String strPad = "";

        StringBuffer sb = new StringBuffer(input.trim());
        while (sb.length() < width) {
            sb.insert(0, ch);
        }
        strPad = sb.toString();

        if (strPad.length() > width) {
            strPad = strPad.substring(0, width);
        }
        return strPad;
    }

    /**
     * Log ERROR.
     *
     * @param error
     */
    private static void error(String error) {
        System.out.println("| ERROR AO GERAR CHAVE: " + error);
    }

    /**
     * Log INFO.
     *
     * @param info
     */
    private static void info(String info) {
        System.out.println("| INFO: " + info);
    }

    public static void main(String[] args) {

        GerarChaveAcessoNfe gcan = new GerarChaveAcessoNfe();

        String chave = gcan.gerarChave("41", "1105", "85.785.244/0001-99", "55", "1", "2", "20", "5");

        System.out.println(chave);

    }
}
