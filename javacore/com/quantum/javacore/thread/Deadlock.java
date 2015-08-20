package com.quantum.javacore.thread;

class BookTicket extends Thread
{
    Object train,comp;
    
    BookTicket(Object train,Object comp)
    {
        this.train=train;
        this.comp=comp;
    }
    
    public void run()
    {
          synchronized(train)
          {
              System.out.println("BookTicket locked on train");
              try{
                  Thread.sleep(150);
              }catch(Exception e){ e.printStackTrace();}
              System.out.println("BookTicket now waiting to lock on compartment");
              
              synchronized(comp)
              {
                  System.out.println("BookTicket locked on compartment");
              }
              
          } 
    }
}
class CancelTicket extends Thread
{
    Object train,comp;
    
    CancelTicket(Object train,Object comp) 
    {
        this.train=train;
        this.comp=comp;
    }
    
    public void run()
    {
          synchronized(comp)
          {
              System.out.println("CancelTicket locked on compartment");
              try{
                  Thread.sleep(200);
              }catch(Exception e){ e.printStackTrace();}
              System.out.println("CancelTicket now waiting to lock on train");
              
              synchronized(train)
              {
                  System.out.println("CancelTicket locked on train");
              }
              
          } 
    }
}
public class Deadlock {
    
    public static void main(String[] args) {
        Object train=new Object();
        Object comp=new Object();
        BookTicket ob1=new BookTicket(train, comp);
        CancelTicket ob2=new CancelTicket(train, comp);
        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);
        t1.start();
        t2.start();
        
    }
    
}
