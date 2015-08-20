/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.thread;

/**
 *
 * @author BAIRAGI
 */
class Calculator extends Thread{
    int total;  

    public void run(){
        synchronized(this){
            for(int i=1;i<=10;i++){            	
                total+=i;
                /*try{
                Thread.sleep(1000);
                }catch(InterruptedException ie){}*/
            }
            //on predicate result due to race condition ,if priority is set on threads then run according to priority 
            notifyAll();
            //According to Thread Queue 
           // notify();
        }
    
}
}
public class NotifyAndNotifyAll extends Thread {
    
    Calculator c;
    public NotifyAndNotifyAll(Calculator c,String threadName,int newPriority){
        this.c=c;
        super.setName(threadName);
        super.setPriority(newPriority);
    }
    
   public void run(){
       synchronized(c){
           try{
               System.out.println("Waiting for Calculation.........");
               c.wait();
           }catch(InterruptedException e){}
           System.out.println(Thread.currentThread().getName()+"  Total is : "+c.total);
           c.total=0;
       }
   }
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        new NotifyAndNotifyAll(calculator,"First",1).start();
        new NotifyAndNotifyAll(calculator,"Second",2).start();
        new NotifyAndNotifyAll(calculator,"Third",3).start();
        calculator.start();
    }
   }
    

