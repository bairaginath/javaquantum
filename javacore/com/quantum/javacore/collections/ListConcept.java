package com.quantum.javacore.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListConcept {
	
	public static void main(String[] args) {
		List<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(0,5); //create new List with empty with that index
		System.out.println(arrayList.size());
		System.out.println(arrayList.remove(1));
		
		List<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(1,6);
		System.out.println(linkedList.size());
		List<Integer> vector=new Vector<Integer>();
		
	}

}
