/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nfe.tools;

/**
 *
 * @author Rodrigo
 */
public class autoCompletar {

    public static String lpadTo(String input, int width, char ch) {
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
}
