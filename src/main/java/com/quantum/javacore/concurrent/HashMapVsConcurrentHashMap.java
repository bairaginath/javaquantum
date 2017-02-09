package com.quantum.javacore.concurrent;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapVsConcurrentHashMap {
//	static Map<Integer,String> concurrentHM=new ConcurrentHashMap<Integer,String>();
	static Map<Integer,String> concurrentHM=new HashMap<Integer,String>();
//	static Map<Integer,String> concurrentHM=new Hashtable<Integer,String>();
	
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
		map.put(2,"Khumpa");
		map.put(3,"rajib");
		for(Map.Entry<Integer,String>entry:map.entrySet()){
			System.out.println("Key  "+entry.getKey()+" Value "+entry.getValue());
			map.put(34,"bairagi");
		}
		
	}
	
	
	public static void main(String[] args) {
		Map<Integer,String> hashmap=new HashMap<Integer,String>();
		Map<Integer,String> hashTable=new Hashtable<Integer,String>();
		Map<Integer,String> concurrenthashmap=new ConcurrentHashMap<Integer,String>();
		try{
		checkInMap(hashmap);
		}catch(Exception e){
			e.printStackTrace();
		} 
		try{
			checkInMap(hashTable);
			}catch(Exception e){
				e.printStackTrace();
			}
		
		checkInMap(concurrenthashmap);
		
		Thread t1=new Thread(new PutMap());
		Thread t2=new Thread(new GetMap());
		t1.start();
		t2.start();
		
	}
	

}
