package com.quantum.javacore.concurrent;


import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ReadWriteLockExample {
	
	public class Writer extends Thread{
		   private boolean runForestRun = true;
		   private ReadWriteLockHashMap readWriteLockHashMap = null;
		   
		   public Writer(ReadWriteLockHashMap readWriteLockHashMap, String threadName) {
		     this.readWriteLockHashMap = readWriteLockHashMap;
		     this.setName(threadName);
		   }
		  
		   public void run() {
		     while (this.runForestRun) { 
		       
		       for (Object key : readWriteLockHashMap.keySet()) {
		         Object newValue = getNewValueFromDatastore(key);
		         //updating dictionary with WRITE LOCK
		         readWriteLockHashMap.put(key, newValue);
		         System.out.println(Thread.currentThread().getName()+"   "+key + " : " + newValue);
		       }
		       
		       //update every seconds
		       try {
		         Thread.sleep(1000);
		       } catch (InterruptedException e) {
		         e.printStackTrace();
		       }
		     }
		   }
		   public void stopWriter(){
		     this.runForestRun = false;
		     this.interrupt();
		   }
		   public Object getNewValueFromDatastore(Object key){
		     //This part is not implemented. Out of scope of this artile
		     return "newValue";
		   }
		 }
	
	public class Reader extends Thread{
		   
		   private ReadWriteLockHashMap readWriteLockHashMap = null;
		   public Reader(ReadWriteLockHashMap readWriteLockHashMap, String threadName) {
		     this.readWriteLockHashMap = readWriteLockHashMap;
		     this.setName(threadName);
		   }
		   
		   private boolean runForestRun = true;
		  
		   public void run() {
		     while (runForestRun) {
		      
		       for (Object key : readWriteLockHashMap.keySet()) {
		         //reading from dictionary with READ LOCK
		         Object value = readWriteLockHashMap.get(key);
		         
		         //make what ever you want with the value.
		         System.out.println(Thread.currentThread().getName()+"   "+key + " : " + value);
		       }
		       
		       //update every seconds
		       try {
		         Thread.sleep(1000);
		       } catch (InterruptedException e) {
		         e.printStackTrace();
		       }
		     }
		   }
		   
		   public void stopReader(){
		     this.runForestRun = false;
		     this.interrupt();
		   }
		 }

	
	public class ReadWriteLockHashMap<K,V> extends HashMap<K,V> {
		   
		   private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		 
		   private final Lock read  = readWriteLock.readLock();
		   
		   private final Lock write = readWriteLock.writeLock();
		   
		   private HashMap<String, String> dictionary = new HashMap<String, String>();
		   
		   public V put(K key, V value) {
		     write.lock();
		     try {
		    	 
		      return super.put(key, value);
		     } finally {
		       write.unlock();
		     }
		   }
		   
		   public V get(Object key) {
		     read.lock();
		     try{
		       return super.get(key);
		     } finally {
		       read.unlock();
		     }
		   }
		 
		   public Set<K> keySet(){
		     read.lock();
		     try{		       
		       return super.keySet();
		     } finally {
		       read.unlock();
		     }
		   }
		   
	}
	
	public static void main(String[] args) {
		ReadWriteLockExample readWriteLockExample=new ReadWriteLockExample();
		 ReadWriteLockHashMap<String,String> readWriteLockHashMap = readWriteLockExample.new ReadWriteLockHashMap<String,String>();
		 readWriteLockHashMap.put("java",  "object oriented");
		 readWriteLockHashMap.put("linux", "rulez");
         Writer writer  = readWriteLockExample.new Writer(readWriteLockHashMap, "Mr. Writer");
	     Reader reader1 = readWriteLockExample.new Reader(readWriteLockHashMap ,"Mrs Reader 1");
         Reader reader2 = readWriteLockExample.new Reader(readWriteLockHashMap ,"Mrs Reader 2");
         Reader reader3 = readWriteLockExample.new Reader(readWriteLockHashMap ,"Mrs Reader 3");
         Reader reader4 = readWriteLockExample.new Reader(readWriteLockHashMap ,"Mrs Reader 4");
 	     Reader reader5 = readWriteLockExample.new Reader(readWriteLockHashMap ,"Mrs Reader 5");
	     writer.start();
	     reader1.start();
	     reader2.start();
	     reader3.start();
	     reader4.start();
	     reader5.start();
	    
	}

	

}
