package com.quantum.javacore.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
 
public class ArrayBlockingQueueExample {
    private static BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1);
 
    class PutThread implements Runnable {
 
        
        public void run() {
            try {
                int i = 0;
                while (true) {
                    bq.put("A" + i);
                    System.out.println("Producer has put: A" + i);
                    i++;
                    Thread.sleep(1000);
                }
            } catch (final Exception e) {
                e.printStackTrace();
            }
 
        }
    }
 
    class TakeThread implements Runnable {
 
        
        public void run() {
            try {
                while (true) {
                    final String data = bq.take();
                    System.out.println("Consumer has consumed.." + data);
                }
            } catch (final Exception e) {
                e.printStackTrace();
            }
        }
    }
 
    public static void main(final String... args) {
    	ArrayBlockingQueueExample abqe=new ArrayBlockingQueueExample();
        final Thread pt = new Thread(abqe.new PutThread());
         
        final Thread tt = new Thread(abqe.new TakeThread());
        tt.start();
        pt.start();
    }
} 