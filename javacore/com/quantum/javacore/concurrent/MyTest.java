package com.quantum.javacore.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;




public class MyTest {
	
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++){
		Future future=es.submit(new Callable(){
			
			
			public String call(){
				System.out.println(Thread.currentThread().getName());
			   return "bairagi";	
			}
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		});
		try{
		System.out.println(future.get());
		}catch(ExecutionException ee){}
		 catch(InterruptedException ie){};
		
	   }
		es.shutdown();
	}

}
