package com.quantum.javacore.assignments;

public class InitializationBlocks {
	
	public InitializationBlocks() {
		// TODO Auto-generated constructor stub
		
		System.out.println("In side Constructor"); //5
	}
	
	
	{
		System.out.println("In Side Simple Block 1"); //3
	}
	
	{
		System.out.println("In Side Simple Block 2"); //4
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
