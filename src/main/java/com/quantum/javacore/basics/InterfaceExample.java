package com.quantum.javacore.basics;

interface InterfaceDemo1
{
	//by default public,static and final
	int value=0;
	int getValue();
	static void getResult(){System.out.println("static method in side interface");}
    default int calcualteLength(String name){
    	        return name!=null?name.length():0;
    }
    default void checkForOverride(){
    	   System.out.println("inside  interface defaulat method");
    }
}

abstract class AbstractDemo implements InterfaceDemo1 {
	
}

public class InterfaceExample implements InterfaceDemo1 {
	
	public int getValue(){
		return value;
	}
	
	
	
	public static void main(String[] args) {
		InterfaceDemo1.getResult();
		System.out.println(new InterfaceDemo1() {
			
			
			public int getValue() {
				// TODO Auto-generated method stub
				return 0;
			}
		}.calcualteLength("bairagi"));
	}

}
