/**
 * 
 */
package com.quantum.javacore.basics;

/**
 * @author bairagi 27-Apr-2019 9:20:59 PM StackOverFlowExample.java
 *
 */
public class StackOverFlowExample {
	   
	public StackOverFlowExample(){
		     new StackOverFlowExample();
	}
	
	public static void main(String[] args) {
		StackOverFlowExample sofe=new StackOverFlowExample();
	}

}
