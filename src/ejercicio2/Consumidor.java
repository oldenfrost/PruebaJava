/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import ejercicio1.Queque;
import java.util.List;

/**
 *
 * @author eduar
 */
public class Consumidor implements Runnable {
        private final Queque<String> queue;
        private final String poisonPill;
        
    
public Consumidor (Queque<String> queue, String poisonPilll){
        this.queue = queue;
        this.poisonPill = poisonPilll;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String item = queue.dequeque();
                if (poisonPill.equals(item)) {
                    System.out.print("el consumidor recibio el comando para salir");
                    break;
                }
                String eleven = ConvertPhone.convertTo11Digits(item);
                String formatted = ConvertPhone.formatWithScripts(eleven);
                System.out.println("consumidor: " + item + " -> " + formatted);

            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    
}
