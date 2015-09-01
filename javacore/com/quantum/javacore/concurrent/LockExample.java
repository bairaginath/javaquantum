package com.quantum.javacore.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample extends Thread {
	
	Lock lock = new ReentrantLock();
	
	/*public void run(){
		synchronized (this) {
			
			for(int i=0;i<10;i++){
				try{
				    System.out.println(Thread.currentThread().getName()+"  "+i);
				}catch(Exception ie){}
			}
		}
		}*/
	
	public void run(){
		lock.lock();			
			for(int i=0;i<10;i++){
				try{
				    System.out.println(Thread.currentThread().getName()+"  "+i);
				}catch(Exception ie){}
			}
			lock.unlock();
			
		
		
	}
	
	public static void main(String[] args) {
		
//		new LockExample().start();
//		new LockExample().start();
		LockExample le=new LockExample();
		Thread t1=new Thread(le,"First");
		Thread t2=new Thread(le,"Second");
		t1.start();
		t2.start();
	}

}
