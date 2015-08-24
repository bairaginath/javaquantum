package com.quantum.javacore.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapVsConcurrentHashMap {
	
	
	
	
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
		//checkInMap(hashmap);
		checkInMap(concurrenthashmap);
		
	}
	

}
