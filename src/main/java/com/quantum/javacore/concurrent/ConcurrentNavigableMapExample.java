package com.quantum.javacore.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentNavigableMapExample {
	
	
	  static void mapIterator(Map<Integer,String> map){
		  map.forEach((k,v)->System.out.println(k+"==="+v));
	  }
	
	public static void main(String[] args) {
		ConcurrentNavigableMap<Integer,String> cnm=new ConcurrentSkipListMap<>();
		cnm.put(1,"one");
		cnm.put(2,"two");
		cnm.put(3,"three");
		cnm.put(4,"four");
		cnm.put(5,"five");
		cnm.put(6,"six");
		cnm.put(7,"seven");
		System.out.println("headMap");
        ConcurrentNavigableMap<Integer,String> headMap = cnm.headMap(3);
		mapIterator(headMap);
		System.out.println("tailMap");
		ConcurrentNavigableMap<Integer,String> tailMap = cnm.tailMap(5);
		mapIterator(tailMap);
		System.out.println("subMap");
		ConcurrentNavigableMap<Integer,String> subMap = cnm.subMap(3,6);
		mapIterator(subMap);
		
	}

}
