package com.quantum.javacore.declarations_and_access_controls;

public class ArrayExample {
	
	//In Java, arrays are objects that store multiple variables of the same type, or variables
	// that are all subclasses of the same type. Arrays can hold either primitives or object
	//references, but the array itself will always be an object on the heap
	
	public void changeArray(int Array[]){
		Array[0]=100;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] key; // Square brackets before name (recommended)
		int key1 []; // Square brackets after name (legal but less readable)
		//Declaring an Array of Object References
		Thread[] threads; // Recommended
		Thread threads1 []; // Legal but less readable
		//multidimension array
		String[][][] occupantName;
		String[] managerName [];
		
		//Remember, the JVM doesn’t allocate space until you actually instantiate the array object. That’s when size matters.
		//int[5] scores;
		//int scores[5];
		
		ArrayExample ae=new ArrayExample();
		int Array[]={1,2,3,4,5};
		ae.changeArray(Array);
		System.out.println(Array[0]);
		
	}

}
