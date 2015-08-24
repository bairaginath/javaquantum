package com.quantum.javacore.concurrent;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;


public class LinkedBlockingDequeExample {
	    //LinkedBlockingDeque object created with size 1
	    private static BlockingDeque<Integer> lbd = new LinkedBlockingDeque<Integer>(1);
		
	    //Producer class that will item in LinkedBlockingQueue object
	    class Producer implements Runnable {
	       
	    
	        public void run() {
	            try {
	                int i=1;
	                while(i<=5){
	                    //add item First
	                	System.out.println(i+" Adding Element on First");
	                  lbd.addFirst(i);
	                  
	                  i++;
	                  Thread.sleep(1000);
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	 
	    //Consumer class that will consume or remove item from LinkedBlockingQueue object
	    class Consumer implements Runnable {
	        
	        public void run() {
	            try {
	                int i=1;
	                while(i<=5){
	                    //removes the item last
	                    int s=lbd.takeLast();
	                    System.out.println(s+" removed at last");
	                    i++;
	                    Thread.sleep(1000);
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    //main method to start thread
	    public static void main(String... args) {
	        new Thread(new LinkedBlockingDequeExample().new Producer()).start();
	        new Thread(new LinkedBlockingDequeExample().new Consumer()).start();
	    }
	}



