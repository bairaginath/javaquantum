/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.javacore.thread;


/**
 *
 * @author canvera
 */
public class Consumer extends Thread {
    
    Productor prod;

    public Consumer(Productor prod) {
        this.prod=prod;   
        
    }
    public void run(){
        synchronized(prod.buffer){
                try{
                   prod.buffer.wait();
                   }catch(InterruptedException ie){ }
                for(int i=0;i<10;i++){
                    try{
                    Thread.sleep(1000);
                    }catch(InterruptedException ie){}
                    System.out.println("at Consumer  "+prod.buffer.get(i));
                    
                }
    }
  }
}

    
    

    

