package com.quantum.javacore.accesscontrols;

public class FinalExample {
	
	public void getRecord(int fileNumber, final int recordNumber) 
	{
		//it can't be modified within the method
	}
	//final class cannot be subclassed
	
	//final method 	cannot be 	overridden by 	a subclass
	
	final int size = 42;
	void changeSize( ){
	//final variable cannot be assigned a new value, once the initial method is made (the initial assignment of a value must happen before 		the constructor completes).
	//size = 16;
	}

}
