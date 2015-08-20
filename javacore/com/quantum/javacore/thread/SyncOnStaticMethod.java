package com.quantum.javacore.thread;




import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author canvera
 */
class MyStaticMethod
{
     public synchronized static void display(){
      //  synchronized(MyStatic.class){
            for(int i=0;i<10;i++){
                try{
                    Thread.sleep(1000);
                    
                }catch(InterruptedException ie){}
                System.out.println("In display "+Thread.currentThread().getName()+"  "+i);
            }
      //  }
    }
    public void show(){
        
            for(int i=0;i<10;i++){
                try{
                    Thread.sleep(1000);
                    
                }catch(InterruptedException ie){}
                System.out.println("In show "+Thread.currentThread().getName()+"  "+i);
            }
        }
    }
    


public class SyncOnStaticMethod extends Thread{
    
   
    
  
    
    public void run(){
        MyStaticMethod.display();
    } 
    
    public static void main(String[] args) {
    	SyncOnStaticMethod t1=new SyncOnStaticMethod();
    	SyncOnStaticMethod t2=new SyncOnStaticMethod();
    	SyncOnStaticMethod t3=new SyncOnStaticMethod();
        t1.setName("FirstThread");
        t2.setName("SecondThread");
        t1.start();
        t2.start();
        new MyStaticMethod().show();
        
        
    }
    
}

