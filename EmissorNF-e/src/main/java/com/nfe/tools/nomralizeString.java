/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nfe.tools;

import java.text.Normalizer;

/**
 *
 * @author Rodrigo
 */
public class nomralizeString {
    
    public static String getNormaliza(String string){
        return Normalizer.normalize(string, Normalizer.Form.NFC);
    }
    
}
