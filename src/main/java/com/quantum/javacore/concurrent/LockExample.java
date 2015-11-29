package com.quantum.javacore.concurrent;


/*The main differences between a Lock and a synchronized block are:

A synchronized block makes no guarantees about the sequence in which threads waiting to entering it are granted access.
You cannot pass any parameters to the entry of a synchronized block. Thus, having a timeout trying to get access to a synchronized block is not possible.
The synchronized block must be fully contained within a single method. A Lock can have it's calls to lock() and unlock() in separate methods.
*/
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample extends Thread {
	
	Lock lock = new ReentrantLock();
	
	/*public void run(){
		synchronized (this) {
			
			for(int i=0;i<10;i++){
				try{
					Thread.sleep(1000);
				    System.out.println(Thread.currentThread().getName()+"  "+i);
				}catch(Exception ie){}
			}
		}
		}*/
	
	public void run(){
		//lock.lock();
		/*try{
		  lock.lockInterruptibly();
		}catch(InterruptedException ie){}*/
		
		 // lock.tryLock();
		try{
		  lock.tryLock(5000, TimeUnit.MILLISECONDS);
		}catch(InterruptedException ie){}
		
		
			for(int i=0;i<10;i++){
				try{
					Thread.sleep(1000);
				    System.out.println(Thread.currentThread().getName()+"  "+i);
				}catch(Exception ie){}
			}
			lock.unlock();	//it throws IllegalMonitorStateException,if two threads are release lock at same time		
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
