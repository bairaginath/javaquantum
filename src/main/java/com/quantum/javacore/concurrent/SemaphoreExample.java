package com.quantum.javacore.concurrent;

import java.util.Stack;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
	
	
	

	
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		Semaphore semaphore=new Semaphore(1);
		
		Runnable runnable=new Runnable(){
			public void run(){
			try{
			   semaphore.acquire();	
			   for(int i=0;i<10;i++)
			   {
				   stack.push(i);
				   System.out.println(i+" Thread Name :"+Thread.currentThread().getName());
				   Thread.sleep(1000);
			   }
			   semaphore.release();
			}catch(InterruptedException ie){
				
			}
				
			}		
		};
		
		new Thread(runnable,"product1").start();
		new Thread(runnable,"product2").start();
		new Thread(runnable,"product3").start();
		new Thread(runnable,"product4").start();
		
		
		
		
	}

}
