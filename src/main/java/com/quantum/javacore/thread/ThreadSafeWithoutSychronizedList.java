package com.quantum.javacore.thread;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ThreadSafeWithoutSychronizedList {
	
	
	 //To make ThreadSafe, better use synchronized method instead of using Collections.synchronizedList
	  private List<String> names=new LinkedList<String>();
	  
	//private List<String> names=Collections.synchronizedList(new LinkedList<String>());
	
	public void add(String name){
		names.add(name);
		
	}
	public synchronized String removeFirst(){
		if(names.size()>0)
		{
			return names.remove(0);
		}
		else {
			return null;
		}
	}
    
	
	public static void main(String[] args) {
		final ThreadSafeWithoutSychronizedList tssf=new ThreadSafeWithoutSychronizedList();
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
