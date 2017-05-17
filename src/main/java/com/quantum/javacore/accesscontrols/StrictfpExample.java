package com.quantum.javacore.accesscontrols;

public class StrictfpExample {
	
	
//	Java strictfp keyword ensures that you will get the same result on every platform 
	//if you perform operations in the floating-point variable. The precision may differ from 
	//platform to platform that is why java programming language have provided the strictfp keyword,
	//so that you get same result on every platform. So, now you have better control over the 
	//floating-point arithmetic.
	
	//The strictfp keyword can be applied on methods, classes and interfaces.
	
	strictfp class A{}//strictfp applied on class  
	
	strictfp void m(){}//strictfp applied on method  
	
	strictfp interface M{}
	
	//strictfp abstract void m();//Illegal combination of modifiers  
	
	//strictfp int data=10;//modifier strictfp not allowed here
	
	public static void main(String[] args) {
		
	}

}
