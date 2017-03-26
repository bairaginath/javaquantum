package com.quantum.javacore.oops;

class Parent {
	int value;
	Parent(int value){
		
		this.value=value;
	}
}
 
public class ConstructorsAndInstantiation extends Parent {
	
	public ConstructorsAndInstantiation(){
		
		super(4);
		//this();
	}
	
	public ConstructorsAndInstantiation(int value){
		//super(value);
		this();
	}
	
	public static void main(String[] args) {
		ConstructorsAndInstantiation cai=new ConstructorsAndInstantiation();
	}

}
