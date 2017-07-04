package com.quantum.javacore.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapSortByValue {
	
	
	public static void main(String[] args) {
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(4,5);
		map.put(3, 4);
		map.put(1,7);
		map.put(2, 3);
		map.put(5,1);
		
		Map<Integer,Integer> sortedMap = 
			     map.entrySet().stream()
			    .sorted(Entry.comparingByValue())
			    .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
			                              (e1, e2) -> e1, LinkedHashMap::new));
		
		
		System.out.println(sortedMap);
		System.out.println(new ArrayList<Integer>(sortedMap.keySet()).indexOf(5));
	}

}
