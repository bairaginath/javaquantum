package com.quantum.javacore.assignments;

public class Wrappers {
	
	public static void main(String[] args) {
		Integer i=new Integer(5);
		Integer x=Integer.valueOf("5"); //Takes a String, returns a wrapped object, throws NFE
		int xx=Integer.parseInt("27"); //Takes a String, returns a primitive, throws NFE
		
		Integer s=new Integer("6");
		System.out.println(s);
		System.out.println(s.intValue());
		Character myChar=new Character('3'); //which can only take a char
		
		int oct=Integer.parseInt("12",8);
		System.out.println(oct);
	    
		int hexa=Integer.parseInt("12",16);
		System.out.println(hexa);
		
		System.out.println(new Integer(1440)==1440);
	
	}

}
