package com.quantum.javacore.java8;

interface Calculate{
	int getResult(int a,int b);
}
interface Increment{
	int startValue(int value);
}
interface PrintMessage {	
	void print(String message);	
}

public class SimpleLambdaExpression {
	
	public static Increment initalValue(final int start){
		Increment increment=(int value)->{ return value+start;};
		return increment;
	}
	
	public static Calculate addition(){
		return (int a,int b)->{ return a+b; };
	}
	
	public static Calculate substraction(){
		return (int a,int b)->{ return a-b; };
	}
	
	public static Calculate multiplication(){
		return (int a,int b)->{ return a*b; };
	}
	
	public static Calculate division(){
		return (int a,int b)->{ return a/b; };
	}
	

	public static void main(String[] args) {
		Increment increment=initalValue(50);
		System.out.println(increment.startValue(5));
		System.out.println(increment.startValue(55));
		System.out.println(addition().getResult(6,7));
		System.out.println(substraction().getResult(6,7));
		System.out.println(multiplication().getResult(6,7));
		System.out.println(division().getResult(60,7));
		PrintMessage printMessage = message -> System.out.println(message);
		printMessage.print("world is not enough");
		Increment incrementSimpleLine=value->100+value;
		System.out.println(incrementSimpleLine.startValue(67));
		
	}
	
	

}
