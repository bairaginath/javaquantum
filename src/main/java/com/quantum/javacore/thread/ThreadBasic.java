package com.quantum.javacore.thread;

public class ThreadBasic extends Thread implements Runnable {
	public void run(){
		System.out.println("Inside Run Method");
	}
	
	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
		//output ["main"- thread name, 5- thread Pririty "main" - Thread belongs to which group ]
		System.out.println("CurrentThead   "+thread);
		System.out.println("Its Name "+thread.getName());
		
		//run Thread using creating Thread instance
		ThreadBasic tb=new ThreadBasic();
		Thread t=new Thread(tb);
		
		t.start();
	
		//run thread without using Thread instance
		tb.start();
		//call run method using Thread instance
		t.run(); //just call object reference of childs object
		//call run method with out thread instance
		tb.run(); // just call method call
		
		//use Anonomus Inner Runnable instance
		Thread runnable=new Thread(new Runnable(){
			public void run(){
				System.out.println("In side Anonmous Inner class Run method");
			}
			
		});
		runnable.start();
		
		Runnable myRunnable=new ThreadBasic();		
		myRunnable.run(); // it is not thread call it just call method call
		
		Thread myThread=new ThreadBasic();
		System.out.println("State    "+myThread.getState());
		myThread.start();
		System.out.println("State    "+myThread.getState());
		//check status of thread
		try{
		myThread.join();
		}catch(InterruptedException ie){}
		System.out.println("After Start Status   "+myThread.isAlive());
		System.out.println("State    "+myThread.getState());
		
		
		
		
	}
	

}
