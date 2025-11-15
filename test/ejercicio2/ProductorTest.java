/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicio2;

import ejercicio1.Queque;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eduar
 */
public class ProductorTest {
    
    public ProductorTest() {
    }

    @Test
    public void testRun() throws Exception {
        System.out.println("run");
        Queque<String> q = new Queque<>();
        List<String> items = Arrays.asList("800-TEST", "800-E", "800-UV");
        String poison = "__POISON__";
        Productor prod = new Productor(q, items, poison);
        prod.run();
        assertEquals("La cola debe contener items + poison", items.size() + 1, q.size());
        assertEquals("800-TEST", q.dequeque());
        assertEquals("800-E", q.dequeque());
        assertEquals("800-UV", q.dequeque());
        assertEquals(poison, q.dequeque());
        assertTrue(q.isEmpty());

    }
    
}
