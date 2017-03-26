package com.quantum.javacore.assignments;

public class GarbageCollection {
	
	
	protected void finalize() throws Throwable
	{
		System.out.println("in side finalize method of == "+this.hashCode());
	}
	
	public static void main(String[] args) {
		System.out.println("in side main method");
		GarbageCollection gc1=new GarbageCollection();
		GarbageCollection gc2=new GarbageCollection();
		System.out.println("gc1 "+gc1.hashCode());
		gc1=gc2;
		System.gc();
	}

}
