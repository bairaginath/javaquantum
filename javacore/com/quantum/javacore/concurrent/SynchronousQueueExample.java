package com.quantum.javacore.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueExample {
	
	public static void main(String[] args) {
		
		
   final BlockingQueue<String> bq=new SynchronousQueue<String>();
   final  String event = "SYNCHRONOUS_EVENT";
   final String another_event ="ANOTHER_EVENT";

		
		new Thread(new Runnable(){
			public void run(){			
					
					try{
						bq.put(event);
						System.out.printf("[%s] published event : %s %n", Thread.currentThread().getName(), event);
						bq.put(another_event);					
						System.out.printf("[%s] published event : %s %n", Thread.currentThread().getName(), another_event);
					}catch(InterruptedException ie){} 					
				
			}
			
		},"producer").start();
		
		new Thread(new Runnable(){
			public void run(){					
				try {
					String event =(String)bq.take();
					String event1 =(String)bq.take();
					String event2=(String)bq.take();
					 // thread will block here
					System.out.printf("[%s] consumed event : %s %n", Thread.currentThread().getName(), event);
					System.out.printf("[%s] consumed event : %s %n", Thread.currentThread().getName(), event1);
					
					} catch (InterruptedException e) {
					
					            e.printStackTrace();
					
					        }

					
				}				
		},"consumer").start();
		
		
	}

}
