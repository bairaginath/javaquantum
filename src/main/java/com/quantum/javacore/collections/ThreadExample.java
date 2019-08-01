package com.quantum.javacore.collections;

import java.util.concurrent.atomic.AtomicInteger;

class Task {
	 static AtomicInteger counter=new AtomicInteger();
	
	 public synchronized void method1(){
		   
		   for(int i=0;i<10;i++)
		   {
			    System.out.println((counter.incrementAndGet())+" method1 "+Thread.currentThread().getName());
			  try { Thread.sleep(1000); } catch (Exception e) {}
		   }
	   }
	   
 public synchronized void method2(){
		   
		   for(int i=0;i<10;i++)
		   {
			   System.out.println(counter.incrementAndGet()+" method2 "+Thread.currentThread().getName());
			  try { Thread.sleep(1000); } catch (Exception e) {}
		   }
	   }
}

class Worker1 implements Runnable {
	
	Task task;

	@Override
	public void run() {
		if(task==null)
		     new Task().method1();
		else
		task.method1();
	}
	
	Worker1(){}
	Worker1(Task task){
		this.task=task;
	}
	      
	
}

class Worker2 implements Runnable {
  
	Task task;
	@Override
	public void run() {
		if(task==null)
		   new Task().method2();
		else
		task.method2();
	}
	
	Worker2(){}
	Worker2(Task task){
		this.task=task;
	}
	      
	
}

public class ThreadExample {
	
	   public static void main(String[] args) {
		   Task task=new Task();
		  // Thread t1=new Thread(new Worker1(task),"Worker 1");
		//	Thread t2=new Thread(new Worker2(task),"Worker 2");
		   Thread t1=new Thread(new Worker1(),"Worker 1");
			Thread t2=new Thread(new Worker2(),"Worker 2");
			 t1.start();
			t2.start();
	}
	
	  


}
