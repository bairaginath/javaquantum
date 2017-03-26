package com.quantum.javacore.assignments;

import java.util.Arrays;

class Animal {
	
}
class Dog extends Animal {
	
}

public class ArrayExample {
	
	public static void main(String[] args) {
		int A[]=new int[5];
		A[0]=25;
		System.out.println(A.length); //length give array declared length
		System.out.println(A[1]); //default value of int
		
//		An array of objects can hold any object that passes the IS-A (or instanceof)
//		test for the declared type of the array. For example, if Horse extends Animal,
//		then a Horse object can go into an Animal array.
		
		
//		You can assign an array of one type to a previously declared array reference of
//		one of its supertypes. For example, a Honda array can be assigned to an array
//		declared as type Car (assuming Honda extends Car).
		
//		If you assign an array to a previously declared array reference, the array you're
//		assigning must be the same dimension as the reference you're assigning it to.
		byte x='a';
		System.out.println(x);
		byte myByte[]="bairagi".getBytes();
		System.out.println(Arrays.toString(myByte));
		
		int myInt[]=new int[5];
		myInt[0]=x;
		Integer myInteger[]=new Integer[7];
		Byte bigByte[]=new Byte[9];
		//myInt=myByte;
		//myInteger=myByte;
		//myInteger=bigByte;		
		Animal animal[]=new Animal[4];
		Dog dog[]=new Dog[3];
		animal=dog;
		System.out.println(animal.length);
		

		
	}

}
