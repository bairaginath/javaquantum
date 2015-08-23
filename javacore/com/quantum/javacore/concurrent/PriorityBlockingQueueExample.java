package com.quantum.javacore.concurrent;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {
	
	public static void main(String[] args) {
		final BlockingQueue bq=new PriorityBlockingQueue();
		
		new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<10;i++){
					bq.add((int)(Math.random()*100));
					try{
						Thread.sleep(500);
					}catch(InterruptedException ie){} 
					
				}
			}
			
		},"producer").start();
		
		new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println(bq);
					System.out.println(bq.remove());
					try{
						Thread.sleep(500);
					}catch(InterruptedException ie){}
					
				}
				
				
				
			}
			
		},"consumer").start();
		
	}

}
