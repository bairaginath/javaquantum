package com.quantum.javacore.thread;


import java.util.HashMap;
import java.util.Map;

class abc extends Thread
{
   public void run()
   {
      
       
     for(int i=1;i<=3;i++){
         System.out.println("abc  "+i);
      try{
        Thread.sleep(1000);
         Thread.yield();
        
      }catch(Exception e){}  
     }
   }
}
class xyz extends Thread
{
   public void run()
   {
      for(int i=1;i<=3;i++){
          System.out.println("xyz   "+i);
           try{
             Thread.sleep(1000);
              }catch(Exception e){}
      }
   } 
}

public class MultiThreading
{
    public static void main(String[] args) {
        abc ob1=new abc();
        xyz ob2=new xyz();
        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);
        t1.start();
        t2.start();
    }
}
