package com.quantum.javacore.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
	
	
	public static void checkForInsertOrder(List<Integer> list){
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		

		
	}
	 
	 public static void main(String[] args) {
	  Integer A[]={0,1,2,3,4,5,6,7,8,9};
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.addAll(Arrays.asList(A));
		System.out.println("Check For ArrayList Insertion Order");
		checkForInsertOrder(ar); //ArrayList maintains Insertion order 
		System.out.println("Check For LinkedList Insertion Order");
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(0);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		checkForInsertOrder(ll); //LinkedList may or may not maintaining Insertion Order
		
	}

}
