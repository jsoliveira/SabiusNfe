package com.nfe.tools;

/**
 *
 * @author Rodrigo
 */
public class subString {

    public String getSubString(String x, String y, String frase) {

        int inicial = frase.indexOf(x);
        int finals = frase.lastIndexOf(y);

        frase = frase.substring(inicial, finals);
        frase = frase.substring(x.length(), frase.length());

        System.out.println(frase);

        return frase;
    }
}
