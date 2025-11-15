/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author eduar
 */
public class QuequeTest {
    
    private Queque<String> q;
      
    @Before
   public void setUp() {
        q = new Queque<>();
    }


    @Test
    public void testDequeque_GenericType() throws Exception {
        q.dequeque("a");
        q.dequeque("b");
        assertEquals("a", q.dequeque());
        assertEquals("b", q.dequeque());
        assertTrue(q.isEmpty());
        assertEquals(0, q.size());
    }
    
    @Test(expected = NullPointerException.class)
    public void enqueueNullThrows() throws Exception {
        q.dequeque(null);
    }

    @Test
    public void testDequeque_0args() throws Exception {
        System.out.println("dequeque");
        Queque instance = new Queque();
        Object expResult = null;
        Object result = instance.dequeque();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPeak() throws Exception {
      q.dequeque("uno");
      q.dequeque("dos");
      assertEquals("uno", q.peak()); 
      assertEquals(2, q.size());
    }

    @Test
    public void testSize() throws Exception  {
      for (int i = 0; i < 10; i++) q.dequeque("v" + i);
        assertTrue(q.isFull());
        assertEquals(10, q.size());
    }

    @Test

    public void testIsNull() throws Exception  {
        q.dequeque(null);
    }
    
}
