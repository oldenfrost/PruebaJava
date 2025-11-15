/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author eduar
 */
public class ConvertPhone {

    private static final Map<Character, String> MULTITAP = new HashMap<>();

    static {

        MULTITAP.put('A', "2");    MULTITAP.put('B', "22");   MULTITAP.put('C', "222");
        MULTITAP.put('D', "3");    MULTITAP.put('E', "33");   MULTITAP.put('F', "333");
        MULTITAP.put('G', "4");    MULTITAP.put('H', "44");   MULTITAP.put('I', "444");
        MULTITAP.put('J', "5");    MULTITAP.put('K', "55");   MULTITAP.put('L', "555");
        MULTITAP.put('M', "6");    MULTITAP.put('N', "66");   MULTITAP.put('O', "666");
        MULTITAP.put('P', "7");    MULTITAP.put('Q', "77");   MULTITAP.put('R', "777");  MULTITAP.put('S', "7777");
        MULTITAP.put('T', "8");    MULTITAP.put('U', "88");   MULTITAP.put('V', "888");
        MULTITAP.put('W', "9");    MULTITAP.put('X', "99");   MULTITAP.put('Y', "999");  MULTITAP.put('Z', "9999");
    }

    public static String convertTo11Digits(String input) {
        if (input == null) {
            throw new IllegalArgumentException(" el input es null");
        }
        
        String textPart = "";
        int guion = input.indexOf('-');
        if (guion >= 0) {
            textPart = input.substring(guion + 1);
        } else {

            textPart = input;
        }

        String mapper = ToMultiTap(textPart);
        int needed = 11 - 3; 
        StringBuilder suffix = new StringBuilder();

        if (mapper.length() >= needed) {
            suffix.append(mapper.substring(0, needed));
        } else {
            suffix.append(mapper);
            while (suffix.length() < needed) suffix.append('0');
        }

        return "800" + suffix.toString();

    }

    private static String ToMultiTap(String text) {
         if (text == null) return "";
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toUpperCase().toCharArray()) {
            if (Character.isDigit(ch)) {

                sb.append(ch);
            } else if (Character.isLetter(ch)) {
                String seq = MULTITAP.get(ch);
                if (seq != null) sb.append(seq);
            }
        }
        return sb.toString();
    }
   public static String formatWithScripts(String elevenDigits) {
        if (elevenDigits == null) return null;
        String s = elevenDigits;
        if (s.length() < 11) s = String.format("%1$" + 11 + "s", s).replace(' ', '0');
        if (s.length() != 11) return s;
        return s.substring(0,3) + "-" + s.substring(3,7) + "-" + s.substring(7);
    }
    

}