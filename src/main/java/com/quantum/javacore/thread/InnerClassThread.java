/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.thread;

/**
 *
 * @author BAIRAGI
 */
public class InnerClassThread {
   static Thread t1,t2;
    public static void main(String[] args) {
        t1=new Thread(){
            public void run(){               
                    for(int i=1;i<=10;i++)
                    {
                        System.out.println(i);
                        try{
                        Thread.sleep(1000);
                        }catch(Exception e){}
                    }
            }            
        };
        
        t2=new Thread(){
            public void run(){               
                    for(int i=10;i>=1;i--)
                    {
                        System.out.println(i);
                        try{
                        Thread.sleep(1000);
                        }catch(Exception e){}
                    }
            }            
        };
        t1.start();
        t2.start();
    }
    
    
    
}
