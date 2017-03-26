package com.quantum.javacore.accesscontrols;

import sun.applet.Main;

class Parents{
	private int value=5;
   public Parents(){
   
   System.out.println(this.value);	
   System.out.println(this instanceof Parents);
   System.out.println(this instanceof Child);
   	
   	System.out.println("parents hashcode = "+this.hashCode());
   }
   	
}

class Child extends Parents {
	
	public Child(){
		  System.out.println(this instanceof Parents);
		   System.out.println(this instanceof Child);
		System.out.println("child hashcode = "+this.hashCode());
	}
	
}

public class ParentChildHashCode {
	
	public static void main(String[] args) {
		Child child=new Child();
	}

}
