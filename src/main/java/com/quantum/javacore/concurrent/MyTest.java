package com.quantum.javacore.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Parents{
	private int value=5;
   public Parents(){
   
   System.out.println(this.value);	
   System.out.println(this instanceof Parents);
   	
   	System.out.println("parents hashcode = "+this.hashCode());
   }
   	
}

public class MyTest extends Parents
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Runnable runnable=new Runnable(){
			public void run(){
				for(int i=0;i<10;i++){
				    try {
				    	Thread.sleep(1000);
				    	System.out.println(Thread.currentThread().getName()+" "+i);
				    }catch(InterruptedException ie){}
					
				}
			}
		};
		executorService.execute(runnable);
		
		
		
		Future future=executorService.submit(runnable);	
		System.out.println(future.isDone());
		System.out.println(future.get());
		System.out.println(future.isDone());
		
	
		

	}
}