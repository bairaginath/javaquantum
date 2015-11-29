/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.thread;

import java.util.Enumeration;

/**
 *
 * @author BAIRAGI
 */
public class StaticVariableSynchronize implements Runnable {
   
   private static Integer balance=100;
   private int withdraw;
   StaticVariableSynchronize(int withdraw){
       this.withdraw=withdraw;
   }

    
    
    
   void withdrawMoney(){
       System.out.println("balance is   "+balance);
       if(balance-withdraw>=0){
           try{
         Thread.sleep(1000);
     }catch(Exception e){}
           balance=balance-withdraw;
           System.out.println(withdraw+"  withdraw by   "+Thread.currentThread().getName());
       }
       else
           System.out.println("fund is not suffient for   :"+Thread.currentThread().getName());
   }
   public void run(){         
    synchronized(balance){ 
     withdrawMoney();
    }
   }
   
    public static void main(String[] args) {
        
        StaticVariableSynchronize t=new StaticVariableSynchronize(60);
        StaticVariableSynchronize t1=new StaticVariableSynchronize(50);
        Thread tt=new Thread(t,"first");
        Thread ttt=new Thread(t,"second");
        Thread t4=new Thread(t1,"other");
        tt.start();
        ttt.start();
        t4.start();
    }
    
  
    
 
}


