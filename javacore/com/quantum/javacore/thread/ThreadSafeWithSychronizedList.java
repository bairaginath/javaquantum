package com.quantum.javacore.thread;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ThreadSafeWithSychronizedList {
	
	
	 //it is not ThreadSafe,sometime it Throws IndexOutOfBoundsException due to Race Condition
	  //private List<String> names=new LinkedList<String>();
	
	//it is ThreadSafe class, all the method of this class are synchronized
	// but sometime it Throws IndexOutOfBoundsException due to Race Condition
	//because at the same time two threads are call the synchronized remove method
	private List<String> names=Collections.synchronizedList(new LinkedList<String>());
	
	public void add(String name){
		names.add(name);
		
	}
	public  String  removeFirst(){
		if(names.size()>0)
		{
			return names.remove(0);
		}
		else {
			return null;
		}
	}
    
	
	public static void main(String[] args) {
		final ThreadSafeWithSychronizedList tssf=new ThreadSafeWithSychronizedList();
		//tssf.add("ThreadSafe");
		class NameDropper extends Thread {
	    	public void run(){
	    		String name=tssf.removeFirst();
	    		System.out.println(Thread.currentThread().getName()+"   " +name);
	    	}  
	    
	    }
		for(int i=0;i<100;i++){
			tssf.add("ThreadSafe");
		   Thread t1=new NameDropper();
	       Thread t2=new NameDropper();
	       t1.setName("First");
	       t2.setName("Second");
	       t1.start();
	       t2.start();
		}
		
	}
}
