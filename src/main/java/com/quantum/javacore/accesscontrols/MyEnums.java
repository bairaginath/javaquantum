package com.quantum.javacore.accesscontrols;

public enum MyEnums {
	
	// 8, 10 & 16 are passed to the constructor
	BIG(8), HUGE(10), OVERWHELMING(16);
	MyEnums(int ounces) { // constructor
	this.ounces = ounces;
	}
	private int ounces; // an instance variable
	public int getOunces() {
		return ounces;
	}
	

}
