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

class ThreadStartAndRun extends Thread {
    
    public void run(){
        System.out.println("bairagi");
    }
    public void start(){
        System.out.println("prakash");
    }
    
    public static void main(String[] args) {
        ThreadStartAndRun tsr=new ThreadStartAndRun();
        tsr.start(); //prakash
        Thread t=new Thread(tsr);
        t.start(); // bairagi
        
        
    }
    
    
}
