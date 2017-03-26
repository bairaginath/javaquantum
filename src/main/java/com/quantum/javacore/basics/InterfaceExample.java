package com.quantum.javacore.basics;

interface InterfaceDemo1
{
	//by default public,static and final
	int value=0;
	int getValue();
}

abstract class AbstractDemo implements InterfaceDemo1 {
	
}

public class InterfaceExample implements InterfaceDemo1 {
	
	public int getValue(){
		return value;
	}

}
