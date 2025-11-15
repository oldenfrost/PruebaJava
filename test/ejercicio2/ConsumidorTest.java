/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicio2;

import ejercicio1.Queque;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eduar
 */
public class ConsumidorTest {
    
    public ConsumidorTest() {
    }

    @Test
    public void testRun() throws Exception {
        System.out.println("run");
        Queque<String> q = new Queque<>();
        String item = "800-TEST";
        String poison = "__POISON__";
        q.dequeque(item);
        q.dequeque(poison);
        Consumidor consumer = new Consumidor(q, poison);
        consumer.run();
        assertTrue("La cola debe quedar vacía después de procesar item y poison", q.isEmpty());
        assertEquals("El tamaño debe ser 0", 0, q.size());

    }
    
}
