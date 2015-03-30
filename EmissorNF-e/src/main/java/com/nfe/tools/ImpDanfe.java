/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nfe.tools;

/**
 *
 * @author Rodrigo
 */
import com.lowagie.text.DocumentException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperExportManager;
//
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.data.JRXmlDataSource;
//import net.sf.jasperreports.view.JasperViewer;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class ImpDanfe {

    /**
     * @param args the command line arguments
     */
    public Document documentFactory(String xml) throws SAXException,
            IOException, ParserConfigurationException, DocumentException, TransformerException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);

        int inicial = xml.indexOf("<infNFe");
        int finals = xml.lastIndexOf("<Signature xmlns");

        xml = xml.substring(inicial, finals);
        System.out.println(xml);
        Document document = factory.newDocumentBuilder().parse(
                new ByteArrayInputStream(xml.getBytes()));

        return document;
    }

//    public void ImprimirDanfe(Document doc) throws ParserConfigurationException, SAXException, IOException, JRException {
//
//
//        FacesContext facesContext = FacesContext.getCurrentInstance();
//
//        HttpServletRequest request = (HttpServletRequest) facesContext.getExternalContext().getRequest();
//        HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
//        //OutputStream os = null;
//        ServletOutputStream os = null;
//
//
//        //O arquivo .jasper do danfe -- Observação aqui neste diretorio onde se encontra o danfe1.jasper deve conter o danfe1_fatura.jasper também  
//
//
//        try {
//            ///String reportUrlReal = request.getSession().getServletContext().getRealPath("relatorio" + File.separator + reportUrl);
//
//            //String recordPath = "infNFe/det";
//            String recordPath = "infNFe/det";
//            String arquivoJasper = "br/com/nfe/danfe/danfe1.jasper";
//            //String reportUrlReal = request.getSession().getServletContext().getRealPath("relatorio" + File.separator + arquivoJasper);
//
//            JRXmlDataSource xmlDataSource = new JRXmlDataSource(doc, recordPath);
//
//            JasperPrint jasperPrint = JasperFillManager.fillReport(arquivoJasper, new HashMap(), xmlDataSource);
//            facesContext.getApplication().getStateManager().saveView(facesContext);
//
//            byte[] pdf = JasperExportManager.exportReportToPdf(jasperPrint);
/////            JasperExportManager.exportReportToPdfStream(jasperPrint,os);
//
//
//            os = response.getOutputStream();
//            response.setContentType("application/pdf");
//            response.setHeader("Content-disposition", "inline; filename=\"danfe.pdf\"");
//            response.setContentLength(pdf.length);
//
//            os.write(pdf);
//            os.flush();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (os != null) {
//                    os.close();
//                }
//                facesContext.responseComplete();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//    }
//
//    // http://www.javac.com.br/jc/posts/list/1560-imprimir-danfe-atraves-dos-xml-com-ireports.page
//    public void ImprimirDanfe() throws ParserConfigurationException, SAXException, IOException, JRException {
//        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        DocumentBuilder db = dbf.newDocumentBuilder();
//
//        //Aqui vai o arquivo XML que será impresso  
//        Document doc = db.parse("br/com/nfe/danfe/danfe1.jasper");
//        //Aqui a estrutura do XML   
//        String recordPath = "infNFe/det";
//        //O arquivo .jasper do danfe -- Observação aqui neste diretorio onde se encontra o danfe1.jasper deve conter o danfe1_fatura.jasper também  
//        String arquivoJasper = "C:\\Users\\Rodrigo Monteiro\\Downloads\\DFE35150272381189000625550010050538441288380230.xml";
//        JRXmlDataSource xmlDataSource = new JRXmlDataSource(doc, recordPath);
//        JasperPrint rel = JasperFillManager.fillReport(arquivoJasper, new HashMap(), xmlDataSource);
//        JasperViewer.viewReport(rel, false);
//    }
//
//    //o Xml deve ser sem assinar !
//    public static void imprimir(JRXmlDataSource xml, String reportUrl, Map<String, Object> parametros) {
//        FacesContext facesContext = FacesContext.getCurrentInstance();
//
//        HttpServletRequest request = (HttpServletRequest) facesContext.getExternalContext().getRequest();
//        HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
//        OutputStream os = null;
//
//        try {
//            String reportUrlReal = request.getSession().getServletContext().getRealPath("relatorio" + File.separator + reportUrl);
//
//            JasperPrint jasperPrint = JasperFillManager.fillReport(reportUrlReal, parametros, xml);
//            byte[] pdf = JasperExportManager.exportReportToPdf(jasperPrint);
//            facesContext.getApplication().getStateManager().saveView(facesContext);
//
//            os = response.getOutputStream();
//            response.setContentType("application/pdf");
//            response.setContentLength(pdf.length);
//            response.setHeader("Content-disposition", "attachment; filename=\"" + reportUrl.substring(0, reportUrl.length() - 7) + ".pdf\"");
//            os.write(pdf);
//            os.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (os != null) {
//                    os.close();
//                }
//                facesContext.responseComplete();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//        ImpDanfe danfe = new ImpDanfe();
//
//        try {
//            try {
//                danfe.ImprimirDanfe(danfe.documentFactory("<?xml version=\"1.0\" encoding=\"UTF-8\"?><enviNFe xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"2.00\"><idLote>0000188</idLote><NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\"><infNFe Id=\"NFe41131177567899000668550010000006241000000944\" versao=\"2.00\"><ide><cUF>41</cUF><cNF>00000094</cNF><natOp>5102</natOp><indPag>0</indPag><mod>55</mod><serie>1</serie><nNF>624</nNF><dEmi>2013-11-13</dEmi><tpNF>1</tpNF><cMunFG>4104303</cMunFG><tpImp>2</tpImp><tpEmis>1</tpEmis><cDV>4</cDV><tpAmb>2</tpAmb><finNFe>1</finNFe><procEmi>0</procEmi><verProc>3.0</verProc></ide><emit><CNPJ>77567899000668</CNPJ><xNome>Klabim ltda</xNome><xFant>Klabim</xFant><enderEmit><xLgr>Avenida Manoel Mendes Camargo</xLgr><nro>1058</nro><xCpl>Escritorio</xCpl><xBairro>Centro</xBairro><cMun>4104303</cMun><xMun>Campo Mourao</xMun><UF>PR</UF><CEP>87302070</CEP><cPais>1058</cPais><xPais>BRASIL</xPais><fone>4435241464</fone></enderEmit><IE>9046380565</IE><CRT>1</CRT></emit><dest><CPF>07906171969</CPF><xNome>NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL</xNome><enderDest><xLgr>endereco homologacao</xLgr><nro>1456</nro><xCpl>Centro</xCpl><xBairro>Centro</xBairro><cMun>4128104</cMun><xMun>Umuarama</xMun><UF>PR</UF><CEP>87302070</CEP><cPais>1058</cPais><xPais>BRASIL</xPais><fone>99104500</fone></enderDest><IE>ISENTO</IE><email>rodrigo.monteiro.nascimento@gmail.com</email></dest><det nItem=\"1\"><prod><cProd>9999</cProd><cEAN/><xProd>Arroz</xProd><NCM>53052900</NCM><CFOP>5101</CFOP><uCom>UN</uCom><qCom>1</qCom><vUnCom>1.00</vUnCom><vProd>1.00</vProd><cEANTrib/><uTrib>UN</uTrib><qTrib>1</qTrib><vUnTrib>1.00</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMSSN500><orig>0</orig><CSOSN>500</CSOSN><vBCSTRet>0.00</vBCSTRet><vICMSSTRet>0.00</vICMSSTRet></ICMSSN500></ICMS><PIS><PISNT><CST>07</CST></PISNT></PIS><COFINS><COFINSNT><CST>07</CST></COFINSNT></COFINS></imposto><infAdProd>PRODUTO COMPRADO COMO TESTE DE HOMOLOGACAO</infAdProd></det><det nItem=\"2\"><prod><cProd>300</cProd><cEAN/><xProd>Vassoura de Palha</xProd><NCM>53052900</NCM><CFOP>5101</CFOP><uCom>UN</uCom><qCom>1</qCom><vUnCom>5.00</vUnCom><vProd>5.00</vProd><cEANTrib/><uTrib>UN</uTrib><qTrib>1</qTrib><vUnTrib>5.00</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMSSN500><orig>0</orig><CSOSN>500</CSOSN><vBCSTRet>0.00</vBCSTRet><vICMSSTRet>0.00</vICMSSTRet></ICMSSN500></ICMS><PIS><PISNT><CST>07</CST></PISNT></PIS><COFINS><COFINSNT><CST>07</CST></COFINSNT></COFINS></imposto><infAdProd>PRODUTO COMPRADO COMO TESTE DE HOMOLOGACAO</infAdProd></det><total><ICMSTot><vBC>0.00</vBC><vICMS>0.00</vICMS><vBCST>0.00</vBCST><vST>0.00</vST><vProd>6.00</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg><vDesc>0.00</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro><vNF>6.00</vNF></ICMSTot></total><transp><modFrete>1</modFrete><transporta><xNome>TRANSPORTES DOCES</xNome><IE>ISENTO</IE><xEnder>RUA VIA BOA</xEnder><xMun>Campo Mourao</xMun><UF>PR</UF></transporta><vol><qVol>1</qVol><nVol>99</nVol><pesoL>0.201</pesoL><pesoB>1.999</pesoB></vol></transp><infAdic><infCpl>NOTA FISCAL EMITIDA PARA AMBIENTE DE HOMOLOGACAO</infCpl></infAdic></infNFe><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe41131177567899000668550010000006241000000944\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>/3Bz401uCYoIdiW2zx8VeiCpRK0=</DigestValue></Reference></SignedInfo><SignatureValue>ZCF5LCY+9dq9XbNeXwoAZYSbZUvRdBdeOHVvOXQc+WRKjnFReJG2MeVlH+IDxc3wsN/kNwvRFZdK149UbFUMez0jaD/wcYYYMRNDdLqYHWzZGogk2Az4lx0IfapbY+KtGfN3dsB381RBv4BWh55mD1NZPw9LuXAxBH7u5vg3tlTSZiXAu7nl93sWqkI/lrB9NNxZnrFByi/qmKDVWPua+dZWcwo3oeaAg9sYwz753bWHJzwhvIKS9vpxxb+4bD26xqtPZgkKVL97pXhMs6Xif7RlNB12X9jldoee5UesSE2Bf6/gmNZZGSGcOdvzBmKO/Dt/DTvcTzPbBkElezrJhA==</SignatureValue><KeyInfo><X509Data><X509Certificate>MIIIOjCCBiKgAwIBAgIQW4+bJzjxMPxBIU31BPCbuTANBgkqhkiG9w0BAQsFADB0MQswCQYDVQQGEwJCUjETMBEGA1UEChMKSUNQLUJyYXNpbDEtMCsGA1UECxMkQ2VydGlzaWduIENlcnRpZmljYWRvcmEgRGlnaXRhbCBTLkEuMSEwHwYDVQQDExhBQyBDZXJ0aXNpZ24gTXVsdGlwbGEgRzUwHhcNMTMwODIwMDAwMDAwWhcNMTQwODE5MjM1OTU5WjCByTELMAkGA1UEBhMCQlIxEzARBgNVBAoUCklDUC1CcmFzaWwxIjAgBgNVBAsUGUF1dGVudGljYWRvIHBvciBBUiBDUkkgUFIxGzAZBgNVBAsUEkFzc2luYXR1cmEgVGlwbyBBMTEVMBMGA1UECxQMSUQgLSA1MDY0MTU2MR4wHAYDVQQDExVBR1JPUEVDVUFSSUEgSVBFIExUREExLTArBgkqhkiG9w0BCQEWHmFzbG9tcG9AYWdyb3BlY3VhcmlhaXBlLmNvbS5icjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAJG1+y4FuHrvezX2bfoLTwYN+1Fm0FWBQLPYGrtHKtMTC118/FEcdp+hqynTY4gfBcD5EO1SqpvyB9+gLMv5ghEhJ6Zn01lQm2Fus8c+w9uoB2CVVgHh3o8mbIQUGj33eIEVyJeE/QVYI6iFNJgXC6+jfB0J/1XvCcwD9vmdh/bGNq+IRQwmkxJcSWeQhGHL8TUdhTLDgEK2oY/JntjSN3tQNAsyQSHk9AVgpwHRw/xrhHPeSO3r0abwOqfdHfq3Js1t0otgrUeBax7rRSnC6KZCltV401wAZP3EGyt1XaF0je/gMzUtt/9kugsjJbefjX4OYGt07PGRSdXBIEu/20kCAwEAAaOCA3AwggNsMIG2BgNVHREEga4wgaugPQYFYEwBAwSgNAQyMjMwNTE5NTQyMDUwMzE3Mjk4NzAwMDAwMDAwMDAwMDAwMDAwMDAwODk1MTcwU1NQUFKgFgYFYEwBAwKgDQQLTU9OSUNBIEJBRVKgGQYFYEwBAwOgEAQONzc1Njc4OTkwMDAxNTOgFwYFYEwBAwegDgQMMDAwMDAwMDAwMDAwgR5hc2xvbXBvQGFncm9wZWN1YXJpYWlwZS5jb20uYnIwCQYDVR0TBAIwADAfBgNVHSMEGDAWgBSdUM+9/yTKr7Ez6xfiQnqOaSqOUzAOBgNVHQ8BAf8EBAMCBeAwgYkGA1UdIASBgTB/MH0GBmBMAQIBCzBzMHEGCCsGAQUFBwIBFmVodHRwOi8vaWNwLWJyYXNpbC5jZXJ0aXNpZ24uY29tLmJyL3JlcG9zaXRvcmlvL2RwYy9BQ19DZXJ0aXNpZ25fTXVsdGlwbGEvRFBDX0FDX0NlcnRpU2lnbk11bHRpcGxhLnBkZjCCASUGA1UdHwSCARwwggEYMFygWqBYhlZodHRwOi8vaWNwLWJyYXNpbC5jZXJ0aXNpZ24uY29tLmJyL3JlcG9zaXRvcmlvL2xjci9BQ0NlcnRpc2lnbk11bHRpcGxhRzUvTGF0ZXN0Q1JMLmNybDBboFmgV4ZVaHR0cDovL2ljcC1icmFzaWwub3V0cmFsY3IuY29tLmJyL3JlcG9zaXRvcmlvL2xjci9BQ0NlcnRpc2lnbk11bHRpcGxhRzUvTGF0ZXN0Q1JMLmNybDBboFmgV4ZVaHR0cDovL3JlcG9zaXRvcmlvLmljcGJyYXNpbC5nb3YuYnIvbGNyL0NlcnRpc2lnbi9BQ0NlcnRpc2lnbk11bHRpcGxhRzUvTGF0ZXN0Q1JMLmNybDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwQwgaAGCCsGAQUFBwEBBIGTMIGQMGQGCCsGAQUFBzAChlhodHRwOi8vaWNwLWJyYXNpbC5jZXJ0aXNpZ24uY29tLmJyL3JlcG9zaXRvcmlvL2NlcnRpZmljYWRvcy9BQ19DZXJ0aXNpZ25fTXVsdGlwbGFfRzUucDdjMCgGCCsGAQUFBzABhhxodHRwOi8vb2NzcC5jZXJ0aXNpZ24uY29tLmJyMA0GCSqGSIb3DQEBCwUAA4ICAQAWY25Bdu7UrZPrzagmAC5HDyAN7R1QAEI8sznDs64NRQGQQ4HtcwFxlCqx/mRFCsjoVHH5SNmfAn191R7E2YL0HQ5rrlDLCw9W0FPr4jLap93SG37tBGKyux2giIFzkPmzOeDpXPMKc7LfgtXlFkTGgydK3Pba+McLfGa7KGbNoay7kOtHmrrHilufWgMj0AuitQtfzUovc8o818vn8Dfy+tLz5RGFfiZSwcyhYunByXnMb2riWIxeMYvD8NXeFJruXTrDnlS+EMdySekaRkckaOAKlbF72Io/4xOWeOHZvzULn1A90blCESOMHAa/QGUFYyIe5vqHysYVsKMCkuoIKgVEDI/fwm+IyutXejcIbsH4WrFT2e9NCa7CP/xvCfTIMPNKCaTql5GQsi7CierPeCFKDXFx4TIWkVtCOSNGFP/t+H18uNipXS3i1MjKoCNE+hymei2udoq/F9Tzdf6P6M925nmtCyANy2SGddauAuRv/t5TkmQAnaQ5BEMEqP4/+VMq8jpL6NhFqWexV4prePPKiF8I1ZnG8zD3kBHXuNAEpG457upt9LfFgwTCuE9A3K5L7bG/kKhDrP9JcQe5io5bvrlbS97+37qC1D2WAoK0mdgKHmGoAsFXEncoDObufXpO6nt4S0qEm2hv7IItBs7BS7/3yPHaHEOTXoI58w==</X509Certificate></X509Data></KeyInfo></Signature></NFe></enviNFe>"));
//            } catch (DocumentException ex) {
//                Logger.getLogger(ImpDanfe.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (TransformerException ex) {
//                Logger.getLogger(ImpDanfe.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (ParserConfigurationException ex) {
//            Logger.getLogger(ImpDanfe.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SAXException ex) {
//            Logger.getLogger(ImpDanfe.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ImpDanfe.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (JRException ex) {
//            Logger.getLogger(ImpDanfe.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
