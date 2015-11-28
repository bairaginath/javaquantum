package com.quantum.javacore.concurrent;

import java.util.concurrent.*;

//it is a synchronisation aid that allows a set of threads to wait for each other to reach a common barrier point.
//The barrier is called cyclic because it can be re-used after the waiting threads are 
//released and that is where it is different than CountdownLatch. We can reuse CyclicBarrier 
//by calling reset() method which resets the barrier to its initial state.
public class CyclicBarrierDemo
{
    public static void main(String args[])
    {
        // No.of threads to wait
        // In general terms, no.of queues to wait
        // here 2
        CyclicBarrier cb=new CyclicBarrier(2,new GoVIP());
            
        // Create two threads,
        // a 50/- line and a 100/- line
        new FiftyClass(cb);
        new HundredClass(cb);
    }
}
class FiftyClass extends Thread
{
CyclicBarrier cb;
    public FiftyClass(CyclicBarrier cb)
    {
        // Know that FiftyCLass has to wait, so is the cyclic barrier
        // This object is used to call the await()
        this.cb=cb;
        
        // Start the thread
        // In general terms, let the 50/- queue move
        start();
    }
    
    public void run()
    {
        // They are just 2.5 km away from the
        // god
        System.out.println("2.5 Km to go");
        
        // An InterruptedException is raised.
        // In general, sometimes the situation goes
        // uncontrollable due to heavy rush
        try
        {
            cb.await();
        }catch(Exception e){
            // Then, say, we can't wait
            System.out.println("We can't wait ");
        }
        
        // They completed their task!!
        System.out.println("Hurray! We saw our GOD! +50");
    }
}
class HundredClass extends Thread
{
CyclicBarrier cb;

    public HundredClass(CyclicBarrier cb)
    {
        // Take the CyclicBarrier object
        this.cb=cb;
        
        // Let the 100/- queue move
        start();
    }
    
    public void run()
    {
        // They are just 2 km to go, because
        // they paid a double amount!
        System.out.println("2 Km to go");
        try
        {
        	//When the reset() method is called, a BrokenBarrierException is raised in the 
        	// FiftyClass' run(). So, FiftyClass comes out of waiting state.
        	//cb.reset();
            // Slow down, guys! Let the VIP go!
            cb.await();
        }catch(Exception e){
            System.out.println("We can't wait");
        }
        
        // Great, you got it for 100!
        System.out.println("Hurray! We saw our GOD! +100");
    }
    
}
class GoVIP implements Runnable
{
    public void run()
    {
        // See
        System.out.println("Seeing");
        
        // Don't forget to say thanks to those
        // 50/- and 100/- queue people!! :)
        System.out.println("Thank you all");
    }
}
