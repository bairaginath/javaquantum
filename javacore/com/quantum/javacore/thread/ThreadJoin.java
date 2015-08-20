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
public class ThreadJoin extends Thread{
    static int abc=0;
    
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(1000);                 
            }catch(InterruptedException ie){}
            abc++;
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    
    public static void main(String[] args) {
        
        ThreadJoin tj=new ThreadJoin();
        Thread A=new Thread(tj,"A-Thread");
        Thread B=new Thread(tj,"B-Thread");
        Thread C=new Thread(tj,"C-Thread");
        Thread D=new Thread(tj,"D-Thread");
        A.start();         
        try{
          A.join();
          }catch(InterruptedException ie){} 
        B.start();
      
        
        
        
    }
    
}
