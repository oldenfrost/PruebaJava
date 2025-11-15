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
public class Productor implements Runnable{
        private  Queque<String> queque;
        private  List<String> items; 
        private  String poisonPill;   
        
        public Productor(Queque<String> queque, List<String> items, String poisonPill){
            this.queque = queque;
            this.items = items;
            this.poisonPill = poisonPill;
        }

    @Override
    public void run() {
         try {
             for (String s : items) {
                  queque.dequeque(s); 
                  System.out.println("Producer: " + s);
                  Thread.sleep(50); 
                  
             }
                queque.dequeque(poisonPill);
             
         }catch (InterruptedException e) {
              Thread.currentThread().interrupt();
         }

    }
        
}
