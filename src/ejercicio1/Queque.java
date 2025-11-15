/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author eduar
 */
public class Queque<T> {
    private Object[] buffer;
    private int capacity =10;
    private int start = 0;
    private int end = 0;
    private int count = 0;
    
    public Queque(){
        this.buffer = new Object[capacity];
    }
    
    public synchronized void  dequeque(T item) throws InterruptedException{
        if(item == null){
            throw new NullPointerException("no se puede insertar en la cola un valor nulo");
        }
        while (count == capacity){
            wait();
        }
        buffer[end]=item;
        end = (end +1)% capacity;
        count++; 
        notifyAll();
    }
    
   public synchronized T  dequeque() throws InterruptedException
   {
       while (count == 0){
           wait();
       }
       T item = (T) buffer[start];
       buffer[start] = null;
       start = (start + 1) % capacity;
       count--; 
       notifyAll();
       return item;
   }
   
   public synchronized T peak(){
       if(count ==0)
       {
           return null;
       }
       return (T) buffer[start];
   }
   public synchronized int size(){
       return count;
   }
   public synchronized boolean isEmpty() {
    return count == 0;
}
   public synchronized boolean isFull(){
       
       if(count == capacity){
           return true;
       }
       return false;
   }
    
    
}
