package com.quantum.javacore.thread;

import java.util.Map;

// Do not synchronize on non final field on synchronized block in Java. because reference of non final field may change any time and then different thread might synchronizing on different objects i.e. no synchronization at all. Best is to use String class, which is already immutable and declared final.

class XYZ{
	int data=5;
}

public class ThreadQuestion extends Thread {
	
	Map<Integer,String> map=null; 
	final XYZ xyz=new XYZ();
	
	public void run(){
		//synchronized (map) {} //it throws nullpointer exception
	    xyz.data++;
		synchronized(xyz){
	    	try{
	    	Thread.sleep(10000);
	    	}catch(InterruptedException ie){}
	       System.out.println(xyz.data);
		}
		
	}

	
	
	public static void main(String[] args) {
		ThreadQuestion npe=new ThreadQuestion();
		Thread t1=new Thread(npe);
		Thread t2=new Thread(npe);
		t1.start();
		t2.start();
		
	}
	

}
