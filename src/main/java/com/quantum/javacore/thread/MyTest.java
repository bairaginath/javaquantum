package com.quantum.javacore.thread;

public class MyTest extends Thread {
   public MyTest() {
	   start();
	   synchronized (this) {
		   try{
		   wait();
		   System.out.println("In Side wait block");
		   }catch(InterruptedException ie){}
	}
	   
   }
	
	
	public void run(){
		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			for(int i=0;i<10;i++){
				try{
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+"  "+i);
				}catch(InterruptedException ie){}
				notify();
			}
		}
	}
	
	public static void main(String[] args) {
		MyTest test=new MyTest();
		
	}

}
