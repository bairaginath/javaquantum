package com.quantum.javacore.declarations_and_access_controls;

import com.quantum.javacore.private_protected.PrivateAndProtected;

public class PrivateAndProtectedExample extends PrivateAndProtected {
	
	 PrivateAndProtectedExample(){
		 
		    //new PrivateAndProtected(4,5); //default constructor
			new PrivateAndProtected(); //public constructor
			//new PrivateAndProtected("bairagi"); //Protected Constructor is not visible
			//new PrivateAndProtected(3.14); //private Constructor			
			
		 
	 }
	 
	 void display(){
		  
		   //System.out.println(a); //default value
			System.out.println(x); //public value
			System.out.println(y); //protected value
			//System.out.println(z); //private value	
		 
			//defaultMethod(); //default method
		      publicMethod(); //public method
		      protectedMethod(); //protected method
		     // privateMethod(); //private method
	 }
	 
	
	

	
	public static void main(String[] args) {
		
		PrivateAndProtectedExample ppe=new PrivateAndProtectedExample();
		ppe.display();
		
		
	}
	
	
	

}
