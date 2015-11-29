package com.quantum.javacore.concurrent;



import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
 

//http://examples.javacodegeeks.com/core-java/util/concurrent/delayqueue/java-util-concurrent-delayqueue-example/
public class DelayQueueExample {
 
    public static void main(String[] args) {
        BlockingQueue<WheatBread> breadBox = new DelayQueue<WheatBread>(); // creation of array blocking queue
        BreadEaterRunnable breadEaterRunnable1 = new BreadEaterRunnable(
                breadBox);
        BreadEaterRunnable breadEaterRunnable2 = new BreadEaterRunnable(
                breadBox);
        BreadEaterRunnable breadEaterRunnable3 = new BreadEaterRunnable(
                breadBox);
 
        BreadProducerRunnable breaCreaterRunnable = new BreadProducerRunnable(
                breadBox);
 
        Thread breadEaterThread1 = new Thread(breadEaterRunnable1, "consumer1");
        Thread breadEaterThread2 = new Thread(breadEaterRunnable2, "consumer2");
        Thread breadEaterThread3 = new Thread(breadEaterRunnable3, "consumer3");
 
        Thread breadProducerThread = new Thread(breaCreaterRunnable);
 
        breadEaterThread1.start();
        breadEaterThread2.start();
        breadEaterThread3.start();
 
        breadProducerThread.start();
    }
}
 
class BreadEaterRunnable implements Runnable {
    BlockingQueue<WheatBread> breadQueue;
    Object breadBoxLock;
 
    public BreadEaterRunnable(BlockingQueue<WheatBread> breadBox) {
        this.breadQueue = breadBox;
    }
 
    
    public void run() {
        while (true) {
            try {
                System.out.println(Thread.currentThread().getName()
                        + " eating up bread ");
                WheatBread bread = breadQueue.take(); // blocks if queue is
                                                        // empty
                System.out.println(Thread.currentThread().getName()
                        + " consumed " + bread.label + "  " + " time elasped after expiration : "+  bread.getDelay(TimeUnit.MILLISECONDS) + "  " + bread.startTime);
                     
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 
class BreadProducerRunnable implements Runnable {
    BlockingQueue<WheatBread> breadBox;
 
    public BreadProducerRunnable(BlockingQueue<WheatBread> breadBox) {
        this.breadBox = breadBox;
    }
 
   
    public void run() {
        while (true) {
            System.out.println("adding bread");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                breadBox.put(new WheatBread( (long)new Random().nextInt(10000))); // blocks if queue is full
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" " + WheatBread.count);
        }
    }
}
 
class WheatBread implements Delayed {
    static int count;
    Long startTime;
    String label;
 
    WheatBread(Long startTime) {
        count++;
        this.label = Integer.valueOf(count).toString();
        this.startTime = startTime + System.currentTimeMillis();
    }
 
   
    public int compareTo(Delayed o) {
        int result = 0;
        if (this.getDelay(TimeUnit.MILLISECONDS) <= o.getDelay(TimeUnit.MILLISECONDS)) {
            result = -1;
        } else
            result = 1;
        return result;
 
    }
 
   
    public long getDelay(TimeUnit unit) {
        long delaytime = unit.convert((this.startTime - System.currentTimeMillis()), TimeUnit.MILLISECONDS );
        return delaytime;
    }
}
