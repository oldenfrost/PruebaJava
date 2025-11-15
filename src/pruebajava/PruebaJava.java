/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebajava;

import ejercicio1.Queque;
import ejercicio2.Consumidor;
import ejercicio2.Productor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class PruebaJava {
        public static final String poisonPill = "__POISON__";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Queque<String> queque = new Queque<>();
        List<String> items = new ArrayList<>();
        items.add("800-TEST");
        items.add("800-HOLA");
        items.add("800-CLIP");
        items.add("800-JAVA");
        items.add("900-VUE");
        items.add("800-EDU");
        items.add("800-JOSE");
        items.add("800-ICE");
        items.add("800-CLARO");
        items.add("800-AGUA");
        items.add("800-FIGMA");
        items.add("800-UX");
        items.add("800-UI");
        items.add("800-UV");
        items.add("800-E");
        
        
        Thread producer = new Thread(new Productor(queque, items, poisonPill));
        Thread consumer = new Thread(new Consumidor(queque, poisonPill));
        consumer.start();
        producer.start();
        producer.join();
        consumer.join();
        System.out.println("finalizado.");

    }

}
