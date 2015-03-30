
package com.nfe.tools;

import com.nfe.config.CarregaConfig310;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rodrigo Monteiro
 */
public class ControleLogs {

    private static Date dataCriacao = new Date();
    private static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat dataFormatadaCompleta = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
    static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    static File arquivo;
    static FileWriter fw;
    static BufferedWriter bw;

    public ControleLogs() throws Exception {
        criarArquivo();
    }

    public static void gravaLogTxt(String msg) throws Exception {

        if (!dataFormatada.format(dataCriacao).equals(sdf.format(new Date()))) {
            criarArquivo();
        }

        try {
            bw.newLine();
            bw.append(dataFormatada.format(new Date()) + "  " + horaFormatada.format(new Date()) + ": " + msg);
            //  bw.append(dataFormatada.format("\n"+new Date()) + "-" + horaFormatada.format(new Date())+ ": " + msg);
            bw.flush();
        } catch (IOException ex) {
            System.out.println("Erro ao Fechar arquivo de LOG");
            throw new UnsupportedOperationException("Erro ao Fechar arquivo de LOG " + ex);
        }
    }

    private static void criarArquivo() throws Exception {

        try {
            bw.close();

        } catch (Exception e) {

        }

        String txt = CarregaConfig310.config.getLogEmissao() + "\\EMISSORNFE_LOG" + sdf.format(new Date()) + ".txt";
        arquivo = new File(txt);

        dataCriacao = new Date();

        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();

//                try {
//                    Integer cd = new UltimaSequencia().UltimaSequencia("cd_arquivo", "cad_log_arquivo");
//                    String ins = "INSERT INTO cad_log_arquivo( cd_arquivo, ds_name, dt_criacao) VALUES (" + cd + ", '" + txt + "', '" + dataFormatadaCompleta.format(new Date()) + "');";
//                    conexaoPostgress.insertSQL(ins);
//                } catch (Exception e) {
//                    System.out.println("erro ao gravar log_arquivo" + e);
//                }
            } catch (IOException ex) {
                System.out.println("Erro ao criar TXT");
                throw new UnsupportedOperationException("Erro ao criar TXT" + ex);

            }
        }

        FileWriter fw;
        try {
            fw = new FileWriter(arquivo, true);
            bw = new BufferedWriter(fw);
        } catch (IOException ex) {
            System.out.println("Erro na leitura e escrita TXT");
            throw new UnsupportedOperationException("Erro na leitura e escrita TXT" + ex);
        }

    }

}
