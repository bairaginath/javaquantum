package com.quantum.javacore.exceptions;

public class SystemExitExample {

	public static void main(String[] args) {
		try{
		  System.out.println("in side try block");
		  System.exit(0);	
		}catch(Exception e){System.out.println("In side catch block");}
		finally {
			System.out.println("In side Finally Block");
		}
	}
	
	
}
