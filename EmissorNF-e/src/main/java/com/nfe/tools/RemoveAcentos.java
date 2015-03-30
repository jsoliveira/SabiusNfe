/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nfe.tools;

import java.text.Normalizer;

/**
 *
 * @author Rodrigo Monteiro
 */
public class RemoveAcentos {

    public static String removeAcentos(String str) {
        CharSequence cs = new StringBuilder(str == null ? "" : str);
        return Normalizer.normalize(cs, Normalizer.Form.NFKD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

}
