package com.emissor.nfe310.validadores.xsd;

import com.nfe.config.CarregaConfig310;
import java.io.StringReader;
import java.net.URL;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import com.nfe.tools.NFeValidacaoXML;

public class XMLValidador {

    private XMLValidador() {
    }

    private static boolean validaXml(final String xml, final String xsd) throws Exception {
        final URL xsdPath = XMLValidador.class.getResource(String.format("schemas/%s", xsd));
        final SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        final Schema schema = schemaFactory.newSchema(new StreamSource(xsdPath.toURI().toString()));
        schema.newValidator().validate(new StreamSource(new StringReader(xml)));
        return true;
    }

    public static void validaLote(String arquivoXML) throws Exception {
        //return XMLValidador.validaXml(arquivoXML, "enviNFe_v3.10.xsd");
        new NFeValidacaoXML().validaXmlEmissao(arquivoXML, CarregaConfig310.config.getArquivosXsd() + "/enviNFe_v3.10.xsd");
    }

    public static void validaNota(final String arquivoXML) throws Exception {
        new NFeValidacaoXML().validateXml(arquivoXML, CarregaConfig310.config.getArquivosXsd() + "/nfe_v3.10.xsd");

    }
}
