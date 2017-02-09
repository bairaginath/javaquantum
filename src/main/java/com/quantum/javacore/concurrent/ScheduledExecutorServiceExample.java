package com.quantum.javacore.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
	
	public static void main(String[] args) {
		
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
		
		ScheduledFuture scheduledFutureCallable =
			    scheduledExecutorService.schedule(new Callable() {
			        public Object call() throws Exception {
			            System.out.println("Executed!");
			            return "Called!";
			        }
			    },
			    20,
			    TimeUnit.SECONDS);
		try {
		System.out.println(scheduledFutureCallable.get());
		}catch(Exception e){}
		
		
		
		
		ScheduledFuture scheduledFutureRunnable =
			    scheduledExecutorService.schedule(new Runnable() {
			        public void run()  {
			            System.out.println("Executed!");			           
			        }
			    },
			    20,
			    TimeUnit.SECONDS);
		try {
		System.out.println(scheduledFutureRunnable.get());
		}catch(Exception e){}
		
		
		/*
		scheduledExecutorService.scheduleAtFixedRate(new Runnable(){
			public void run(){
				
				System.out.println("In Side schedule At Fixed Rate");
				
			}
			
			},20,10,TimeUnit.SECONDS);
		*/
		
		
		
	//This method works very much like scheduleAtFixedRate() except that the period is interpreted differently	
	/*	
		scheduledExecutorService.scheduleWithFixedDelay(new Runnable(){
				public void run(){
					
					System.out.println("In Side schedule At Fixed Rate");
					
				}
				
				},20,10,TimeUnit.SECONDS);
		*/
		
		
		
//		scheduledExecutorService.shutdown();
	}

}
