/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.javacore.thread;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author canvera
 */
public class ThreadSafeCollection extends Thread {
   static final List names=new LinkedList();
    public void run(){
        synchronized(names){
        for(int i=0;i<10;i++){
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){}
            String name= Thread.currentThread().getName();
            System.out.println(name+" "+i);
            names.add(name+""+i);
        }
        names.notify();
        }
    }
    
    public static void main(String[] args) {
        ThreadSafeCollection t0=new ThreadSafeCollection();
        ThreadSafeCollection t1=new ThreadSafeCollection();
        t0.setName("first");
        t1.setName("second");
        t0.start();
        t1.start();
//        synchronized(names){
//        try{
//            names.wait();
//        }catch(InterruptedException ie){}
//        for(Object name:names){
//            System.out.println(name); 
//        }
//        }        
        Thread t3=new Thread(new Runnable(){
        	public void run(){
              synchronized(names){
              try{
                  names.wait();
              }catch(InterruptedException ie){}
              for(Object name:names){
                  System.out.println(name); 
              }
              } 
        		
        	}
        	
        },"third");
        
        t3.start();
        
        
    }
}
