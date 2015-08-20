package com.quantum.javacore.thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class Producter extends Thread
{
    Queue <Integer>l;
    Producter()
    {
        this.l=new LinkedList<Integer>();
    }
    public void run(){
        
         synchronized (l)
         {  
             System.out.println("enter into critical section producter");
             for(int i=1;i<=10;i++){
                 
                 try{
                     l.add(i);
                     Thread.sleep(100);                     
                 }catch(Exception e){ e.printStackTrace();}
               }
             System.out.println("exit form critical section at productor");
            l.notifyAll();  
          }
        
               
       }
}
    
class Consumer2 extends Thread
{
    Producter prod;
     Consumer2(Producter prod)
     {
         this.prod=prod;
     }
     public void run()
     {
         synchronized(prod.l){
             System.out.println("enter into critical section at Consumer");
         try{
          //prod.l.wait();
         }catch(Exception e){e.printStackTrace();}
             System.out.println("exit form critical section at Consumer");
         for(int xx:prod.l)
             System.out.println(xx);
     }
     }
      
    
}
public class Semaphore {
    
    public static void main(String[] args) {
        
        Producter prod=new Producter();
        Consumer2  con=new Consumer2(prod);
        Thread t1=new Thread(prod,"Productor");
        Thread t2=new Thread(con,"Consumer");
        t1.start();
        t2.start();
                
    }
    
}
