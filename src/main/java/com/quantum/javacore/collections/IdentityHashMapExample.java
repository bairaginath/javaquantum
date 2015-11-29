package com.quantum.javacore.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/*
1) Main difference between HashMap vs IdentityHashMap is that IdentityHashMap uses equality operator
  "==" for comparing keys and values inside Map while HashMap uses equals method for comparing keys 
  and values.

2) Unlike HashMap, who uses hashcode to find bucket location, IdentityHashMap also doesn't use 
hashCode() instead it uses System.identityHashCode(object).

3) Another key difference between IdentityHashMap and HashMap in Java is Speed. Since IdentityHashMap 
doesn't use equals() its comparatively faster than HashMap for object with expensive equals() and hashCode().

4) One more difference between HashMap and IdentityHashMap is Immutability of key. One of the basic requirement 
to safely store Objects in HashMap is keys needs to be immutable, IdentityHashMap doesn't require keys to be immutable as it is not relied on equals and hashCode.

*/



public class IdentityHashMapExample {
	
	
	public static void main(String[] args) {
		


		
		Map<String,String> hm=new HashMap<String,String>();
		hm.put("bairagi","nath");
		hm.put(new String("bairagi"), "world");
		System.out.println(hm.size());
		
		
		
		Map<String,String> ihm=new IdentityHashMap<String,String>();
		ihm.put("bairagi","nath");
		ihm.put(new String("bairagi"), "world");
		System.out.println(ihm.size());
	}

}
