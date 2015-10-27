package com.quantum.javacore.declarations_and_access_controls;

// conceptual example of how you can think  about enums
class Dept {
	public Dept(String enumName, int index) { }	

public static final Dept CSE =	new Dept("CSE", 0);
public static final Dept ECE =	new Dept("ECE", 1);
public static final Dept EEE =	new Dept("EEE", 2);
public static final Dept MEE =	new Dept("MEE", 3);



}

public class EnumsExample {
	
	//each of the enumerated values, BIG, HUGE, and OVERWHELMING,
	//are instances of type CoffeeSize. They're represented as static and final,
	enum CoffeeSize { BIG, HUGE, OVERWHELMING };
	

	
	
	public static void main(String[] args) {
		CoffeeSize x=CoffeeSize.BIG;
		System.out.println(CoffeeSize.BIG);
		System.out.println(x);
		System.out.println(Dept.CSE);
		
		//enum CoffeeSize1 { BIG, HUGE, OVERWHELMING } // WRONG! Cannot declare enums  in methods
	    System.out.println(MyEnums.BIG);
	    System.out.println(MyEnums.BIG.getOunces());
	    
	    //Every enum has a static method, values(), that returns an array of the enum's values in the order they're declared.
	    for(MyEnums cs: MyEnums.values())
	    	System.out.println(cs + " " + cs.getOunces());
	    	}
	

}
