package com.quantum.javacore.assignments;

public class InitializationBlocks {
	
	public InitializationBlocks() {
		// TODO Auto-generated constructor stub
		
		System.out.println("In side Constructor"); //4
	}
	
	
	{
		System.out.println("In Side Simple Block"); //3
	}
	static //1
	{
		System.out.println("In side static Block");
	}
	public static void main(String[] args) {
		System.out.println("In Side main Method"); //2
		InitializationBlocks ib=new InitializationBlocks();
	}

}
