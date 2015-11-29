package com.quantum.javacore.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapVsConcurrentHashMap {
//	Map<Integer,String> concurrentHM=new ConcurrentHashMap<Integer,String>();
	static Map<Integer,String> concurrentHM=new HashMap<Integer,String>();
	
	static class GetMap extends Thread
	{
		public void run(){
			for(int i=0;i<10;i++){
				try{
					Thread.sleep(1000);
				}catch(InterruptedException ie){}
				
				String name=concurrentHM.get(i);
				System.out.println("Inside Get Method "+name);
			}
			
		}
	}
	
	static class PutMap extends Thread
	{
		public void run(){
			for(int i=0;i<10;i++){
				try{
					Thread.sleep(1000);
				}catch(InterruptedException ie){}
				
				concurrentHM.put(i,"bairagi");
				System.out.println("Inside Put Method "+i);
			}
			
		}
	}
	

	
	
	
	//first difference 
	public static void checkInMap(Map<Integer,String> map){

		for(Map.Entry<Integer,String>entry:map.entrySet()){
			System.out.println("Key  "+entry.getKey()+" Value "+entry.getValue());
			map.put(34,"bairagi");
		}
		
	}
	
	
	public static void main(String[] args) {
		Map<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(2,"Khumpa");
		hashmap.put(3,"rajib");
		Map<Integer,String> concurrenthashmap=new ConcurrentHashMap<Integer,String>();
		concurrenthashmap.put(2,"Khumpa");
		concurrenthashmap.put(3,"rajib");
//		checkInMap(hashmap);
		checkInMap(concurrenthashmap);
		
		Thread t1=new Thread(new PutMap());
		Thread t2=new Thread(new GetMap());
		t1.start();
		t2.start();
		
	}
	

}
