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
class MyStaticBlock
{
     public static void display(){
        synchronized(MyStaticBlock.class){
            for(int i=0;i<10;i++){
                try{
                    Thread.sleep(1000);
                    
                }catch(InterruptedException ie){}
                System.out.println("In display "+Thread.currentThread().getName()+"  "+i);
            }
        }
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
    


public class SyncOnStaticBlock extends Thread{
    
   
    
  
    
    public void run(){
    	MyStaticBlock.display();
    } 
    
    public static void main(String[] args) {
        SyncOnStaticBlock t1=new SyncOnStaticBlock();
        SyncOnStaticBlock t2=new SyncOnStaticBlock();
        SyncOnStaticBlock t3=new SyncOnStaticBlock();
        t1.setName("FirstThread");
        t2.setName("SecondThread");
        t1.start();
        t2.start();
        new MyStaticBlock().show();
        
        
    }
    
}
