package com.quantum.javacore.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
	
	class WithoutLatch implements Runnable{
		public void run(){
			 System.out.println("In side WithoutLatch");
		} 	
	}
	public void runWithoutLatch(int n)
	{
		for(int i=0;i<n;i++){
			new Thread(new WithoutLatch()).start();
		}
		System.out.println("In side Main runWithoutLatch");
	}
	
	class WithLatch implements Runnable{
		CountDownLatch latch=null;
		public WithLatch(CountDownLatch latch){
			this.latch=latch;
			
		}
		public void run(){
			 System.out.println("In side WithLatch");
			 latch.countDown();
		} 	
	}
	
	public void runWithLatch(int n)
	{
		CountDownLatch latch=new CountDownLatch(n);
		for(int i=0;i<n;i++){
			new Thread(new WithLatch(latch)).start();
			
		}
		try {
		latch.await();
		System.out.println("In side Main runWithLatch");
		}catch(InterruptedException ie){}
		
	}
	
	public static void main(String[] args) {
		CountDownLatchExample cdle=new CountDownLatchExample();
		cdle.runWithoutLatch(5);
		cdle.runWithLatch(5);
	}
}
