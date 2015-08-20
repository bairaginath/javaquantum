/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.thread;

/**
 *
 * @author BAIRAGI
 */

public class InterruptThread extends Thread{
    
    public void run(){
        try{
       for(int i=1;i<=10;i++){ 
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+"   "+i);
       }
        }catch(Exception e){
            
        }
    }
    
    public static void main(String[] args) {
        
        InterruptThread t=new InterruptThread();
        Thread tt=new Thread(t,"first");
        Thread ttt=new Thread(t,"second");
        tt.start();
        ttt.start();
        try{
            Thread.sleep(5000);
        }catch(Exception e){}
        tt.interrupt();
        
    }
    
}
