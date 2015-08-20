/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.javacore.thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author canvera
 */
public class Productor extends Thread {
    
    LinkedList<Integer> buffer=new LinkedList<Integer>();
    
    public void run(){
        synchronized(buffer){
          for(int i=0;i<10;i++){
            try{
                Thread.sleep(1000);                
            }catch(InterruptedException ie){  }
              System.out.println("at productor  "+i);
            buffer.offer(i);
          }
          buffer.notify();
        } 
      
    }    
 
}
