package com.quantum.javacore.thread;

class Increment extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++){
            System.out.println("Increment   "+i);
        try{
            Thread.sleep(1000);
        }catch(Exception e){}}
        
                    
    }
    
}

class Decrement extends Thread
{
    public void run()
    {
        for(int i=10;i>=1;i--){
            System.out.println( "Decrement  "+i);
             try{
           Thread.sleep(1000);
        }catch(Exception e){} }
    }
}

public class Increment_Decrement
{
    public static void main(String[] args) {
        
        Increment ob1=new Increment();
        Decrement ob2=new Decrement();
        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);
        t1.start();
        t2.start();
    }
}