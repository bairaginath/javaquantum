package com.quantum.javacore.thread;

public class ThreadYield {
	
	
	public static void main(String args[]){
		
		Thread t1=new Thread(new Runnable(){
			public void run(){
				for(int i=1;i<10;i++)
				{
					try{
						Thread.sleep(1000);
					}catch(InterruptedException ie) { }
					
					if(i%5==0){
						System.out.println("in side yield condition");
//						It can only make a thread from Running State to Runnable State, not in wait or blocked state
						Thread.yield(); //It Causes the currently executing thread to temporarily pause and allow other threads to execute.
					}
					System.out.println(Thread.currentThread().getName()+"   "+i);
				}
				
			}
		},"FirstThread");
		
		Thread t2=new Thread(new Runnable(){
			public void run(){
				for(int i=1;i<10;i++)
				{
					try{
						Thread.sleep(1000);
					}catch(InterruptedException ie) { }
					System.out.println(Thread.currentThread().getName()+"   "+i);
				}
				
			}
		},"SecondThread");
	
		t1.start();
		t2.start();
	}
	
	
   
	
}
