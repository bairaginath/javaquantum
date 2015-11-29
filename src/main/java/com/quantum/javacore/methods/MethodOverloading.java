package com.quantum.javacore.methods;

public class MethodOverloading {
	
	public void display(int number,String name){
		System.out.println("In Side of Display Method");
	}
	
	public static void display(int number,String ...args){
		System.out.println("In Side of Static Display Method ");
	}
	
	public static void main(String[] args) {
		MethodOverloading mol=new MethodOverloading();
		mol.display(5);
		mol.display(5,"bairagi");
		mol.display(5,"Bairagi","Nath");
	}

}
