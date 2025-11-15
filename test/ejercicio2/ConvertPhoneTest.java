/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eduar
 */
public class ConvertPhoneTest {
    
    public ConvertPhoneTest() {
    }

    @Test
    public void testConvertTo11Digits() {
      System.out.println("convertTo11Digits");
        String input = "800-TEST";
        String expResult = "80083377778";           
        String result = ConvertPhone.convertTo11Digits(input);
        assertEquals(expResult, result);
    }

    @Test
    public void testFormatWithScripts() {
      System.out.println("formatWithScripts");
        String elevenDigits = "80083377778";
        String expResult = "800-8337-7778";       
        String result = ConvertPhone.formatWithScripts(elevenDigits);
        assertEquals(expResult, result);
    }
    
}
