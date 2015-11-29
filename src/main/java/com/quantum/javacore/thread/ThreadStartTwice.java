package com.quantum.javacore.thread;


import  java.lang.System;
public class ThreadStartTwice extends Thread
{
    public void run()
    {
        System.out.println("bairagi");  
    }
  public static void main(String[] args) {
      
      ThreadStartTwice o=new ThreadStartTwice();
      Thread t=new Thread(o);
      Thread t1=new Thread(o);
      t.start();
      t.start();
      String l;
      l=(1==1)?"":"bairagi";
     
   
}
  
    
}