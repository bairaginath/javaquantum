/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.javacore.thread;

import java.util.Scanner;

/**
 *
 * @author canvera
 */
public class Deposite extends Thread {
    
    Integer Balance=0;
    boolean flag=true;
    Scanner sc=new Scanner(System.in);
    Deposite(){
        
    }
    Deposite(Integer Balance){
        this.Balance=this.Balance+Balance;
    }
    
    void deposite(){
        
        synchronized(this){
        System.out.println("Enter Amount to Deposite");
        this.Balance= this.Balance+sc.nextInt();
        flag=false;
        this.notify();
        }
        
    }
   
    
    
    public void run(){
        while(flag){           
               deposite();
               flag=false;
        }
    }
    
    
    
}
