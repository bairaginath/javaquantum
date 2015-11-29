package com.quantum.javacore.basics;

class ImplementsA implements MyInterface
{

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("In side ImplementsA");
		
	}

	
}
class ImplementsB implements MyInterface
{
	public void display(){
	  System.out.println("In side ImplementsB");
	}
}

public class MyImplements {
	static MyInterface myInterface;
	public static void main(String[] args) {
		myInterface.display();
	}

}
