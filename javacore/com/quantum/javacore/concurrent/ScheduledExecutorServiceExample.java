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
		
		/*ScheduledFuture scheduledFuture =
			    scheduledExecutorService.schedule(new Callable() {
			        public Object call() throws Exception {
			            System.out.println("Executed!");
			            return "Called!";
			        }
			    },
			    5,
			    TimeUnit.SECONDS);
		try {
		System.out.println(scheduledFuture.get());
		}catch(Exception e){}*/
		
		scheduledExecutorService.scheduleAtFixedRate(new Runnable(){
				public void run(){
					
					System.out.println("In Side schedule At Fixed Rate");
					
				}
				
				},5,20,TimeUnit.SECONDS);
		
		
		
		
		scheduledExecutorService.shutdown();
	}

}
