package com.quantum.javacore.thread;

public class Reserve extends Thread
{
    static int avl=1;
    int wanted;
    Reserve(int wanted)
    {
        
        this.wanted=wanted;
    }
    public void run()
    {
        synchronized(this){
        if(avl>=wanted)
        {
            System.out.println("avalible  "+ avl);
            String name=Thread.currentThread().getName();
            System.out.println(name +" booked "+name);
            avl=avl-wanted;
            try{
                Thread.sleep(2000);
            }catch(Exception e)
            { System.out.println(e);}
        }
        else { System.out.println("Ticket is not avivalibe");}
        
        }
    }
    
    public static void main(String[] args) {
   
        Reserve ob=new Reserve(1);
        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob);
        t1.setName("first");
        t2.setName("second");
        t1.start();      
        t2.start();
}
}