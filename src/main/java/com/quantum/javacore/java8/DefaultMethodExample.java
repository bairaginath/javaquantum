package com.quantum.javacore.java8;

interface Parents {
	
	  default void display(){
		  System.out.println("Inside parents display method");
	  }
}

interface Relatives {
	
	  default void display(){
		  System.out.println("Inside reletives display method");
	  }
}

public class DefaultMethodExample  implements Parents,Relatives{
    //In case multiple inheritance, if both parents are samd default method , then have to override default method
	@Override
	public void display(){
		System.out.println("Inside child display method");
		Parents.super.display();
		Relatives.super.display();
	}
	
	
	public static void main(String[] args) {
		DefaultMethodExample dme=new DefaultMethodExample();
		dme.display();
		
	}

}
