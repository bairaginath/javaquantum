package com.quantum.javacore.collections;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToListToArray {
	
	public static void main(String[] args) {
		String nameArray[]={"bairagi","ajit","tapan","kuna" };
		List<String> nameList=Arrays.asList(nameArray);
		String names[]=(String[])nameList.toArray();
		Iterator<String> it=nameList.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
	}

}
