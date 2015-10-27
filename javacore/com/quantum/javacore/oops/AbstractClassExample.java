package com.quantum.javacore.oops;

abstract class AbstractInitalize {
	
	public void show(){
		System.out.println("In Side Show Method");
	}
	abstract void display();
	
}

public class AbstractClassExample
{
	public static void main(String[] args) {
		
		// AbstractInitalize ai=new AbstractInitalize(); // Abstract class can't be initalize
		
		new AbstractInitalize(){
			public void display(){
				System.out.println("Anonomous Inner Class");
			}
		}.display();
	}
   
    
}

