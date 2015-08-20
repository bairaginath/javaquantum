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
public class Withdraw extends Thread {
    
    Deposite depo;
    Boolean flag=true;
    Scanner sc=new Scanner(System.in);
    Boolean firsttime=true;
    
    Withdraw(Deposite depo){
        this.depo=depo;
    }
    
    void withdraw(){
        synchronized (depo){
            System.out.println("enter the amount to withdraw");
            int draw=sc.nextInt();
            if((depo.Balance-draw)<0){                
                try{
                    if(firsttime){
                       depo.wait(); 
                    } else{  flag=false;return; }                
                }catch(InterruptedException ie){}
            }
            depo.Balance=depo.Balance-draw;
            firsttime=false;
            System.out.println(draw+" rs Amount withdraw successfully ");
            System.out.println("current balance "+depo.Balance);            
            System.out.println("do you wants more withdraw y/n");
            String s=sc.next();
            if("n".equals(s))
                flag=false;
            
            
        }
    }
    
    public void run(){
       while(flag){
           withdraw();
       }
       Deposite d=new Deposite(80);
        Withdraw w=new Withdraw(d);
        d.start();
        w.start();
    }
    
}
