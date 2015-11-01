package com.quantum.javacore.assignments;

public class Wrappers {
	
	public static void main(String[] args) {
		Integer i=new Integer(5);
		Integer x=Integer.valueOf("5"); //Takes a String, returns a wrapped object, throws NFE
		int xx=Integer.parseInt("27"); //Takes a String, returns a primitive, throws NFE
		
	}

}
