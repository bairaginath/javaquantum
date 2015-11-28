package com.quantum.javacore.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicIntegerAndLongExample {
	
	public class ProcessingThreadWithAtomicInteger implements Runnable {
	    private AtomicInteger count = new AtomicInteger();
	 
	 
	
	    public void run() {
	        for (int i = 1; i < 5; i++) {
	            processSomething(i);
	            count.incrementAndGet();
	        }
	    }
	 
	 
	    public int getCount() {
	        return this.count.get();
	    }
	 
	 
	    private void processSomething(int i) {
	        // processing some job
	        try {
	            Thread.sleep(i * 1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	 
	}
	
	public class ProcessingThreadWithAtomicLong implements Runnable {
	    private AtomicLong count = new AtomicLong(120);
	 
	 
	
	    public void run() {
	        for (int i = 1; i < 5; i++) {
	            processSomething(i);
	            count.incrementAndGet();
	        }
	    }
	 
	 
	    public long getCount() {
	        return this.count.get();
	    }
	 
	 
	    private void processSomething(int i) {
	        // processing some job
	        try {
	            Thread.sleep(i * 1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	 
	}
	
	public class ProcessingThreadWithoutAtomicInteger implements Runnable {
	    private int count=0;
	 
	 
	
	    public void run() {
	        for (int i = 1; i < 5; i++) {
	            processSomething(i);
	            count++;
	        }
	    }
	 
	 
	    public int getCount() {
	        return this.count;
	    }
	 
	 
	    private void processSomething(int i) {
	        // processing some job
	        try {
	            Thread.sleep(i * 1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	 
	}
	public static void main(String[] args) throws InterruptedException {
   	 
		ProcessingThreadWithAtomicInteger pt = new AtomicIntegerAndLongExample().new ProcessingThreadWithAtomicInteger();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
       t1.join();
        t2.join();
        System.out.println("Processing count=" + pt.getCount());
		
	/*	ProcessingThreadWithoutAtomicInteger pt = new AtomicIntegerAndLongExample().new ProcessingThreadWithoutAtomicInteger();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
       t1.join();
        t2.join();
        System.out.println("Processing count=" + pt.getCount());*/
        
        
    	ProcessingThreadWithAtomicLong ptl = new AtomicIntegerAndLongExample().new ProcessingThreadWithAtomicLong();
        Thread t1long = new Thread(ptl, "t1long");
        t1long.start();
        Thread t2long = new Thread(ptl, "t2long");
        t2long.start();
        t1long.join();
       t2long.join();
        System.out.println("Processing count=" + ptl.getCount());
    }
    

}
