package com.quantum.javacore.thread;

import java.util.ArrayList;
import java.util.List;

class DemoThread extends Thread
{
	public void run(){
		for(int i=0;i<10;i++){
		System.out.println("Inside Run Method  "+Thread.currentThread().getName());
		}
		
	}
	
}

public class ThreadPools {
	List<DemoThread> threadPools;
	public ThreadPools(int count){
		this.threadPools=new ArrayList <DemoThread>(count);
		for(int i=0;i<count;i++){
			threadPools.add(new DemoThread());
		}
		
	}
    public void start(){
    	for(DemoThread demoThread:this.threadPools){
    		demoThread.start();
    		/*try{
    		demoThread.join();
    		}
    		catch(InterruptedException ie) {}*/
    		
    	}
//    	for(DemoThread demoThread:this.threadPools){
//    		try{
//    		demoThread.join();
//    		}
//    		catch(InterruptedException ie) {}
//    	}
    }
    public static void main(String[] args) {
		ThreadPools threadObject=new ThreadPools(10);
		threadObject.start();
		
	}

}
