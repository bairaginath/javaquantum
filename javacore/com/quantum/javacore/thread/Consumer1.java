/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.javacore.thread;

/**
 *
 * @author BAIRAGI
 */
public class Consumer1 extends Thread{
    
    Productor1 p;
   public Consumer1(Productor1 p){
        this.p=p;
    }
    
   public void run(){
       synchronized(p.l){
           try{
           p.l.wait();
           }catch(InterruptedException ie){ie.printStackTrace();}
       }
       for(Employee e:p.l)
       {
           System.out.println("Employee name   "+e.getName()+"   Employee Sal"+e.getSal());
       }
   } 
}
