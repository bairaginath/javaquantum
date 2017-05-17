package com.quantum.javacore.collections;

import java.util.HashMap;
import java.util.HashSet;

public class MyHashSet<E> {
	
	private transient HashMap<E,Object> map;
	
	private static final Object PRESENT = new Object();
	
	
	public MyHashSet(){
		map=new HashMap<>();
	}
	
	public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }

}
