package com.quantum.javacore.basics;

public class CallByValue {
	
	public void changeValue(int a){
		a=77;
	}
	public void changeValue(Integer a){
		a=77;
	}
	
	public void changeValue(String S){
		S="string";
	}
	
	public void changeValue(StringBuffer S){
		S=new StringBuffer("StringBuffer");
	}
	
	
	public void changeValue(int a[]){
		a[0]=6;
	}
	
	public static void main(String[] args) {
		CallByValue callByValue=new CallByValue();
		int a[]={1,2,3};
		callByValue.changeValue(a);
		System.out.println(a[0]);
		int number=5;
		callByValue.changeValue(number);
		System.out.println(number);
		Integer integerNumber=new Integer(5);
		callByValue.changeValue(integerNumber);
		System.out.println(integerNumber);
		String name="James";
		callByValue.changeValue(name);
		System.out.println(name);
		StringBuffer lastName=new StringBuffer("Bairagi");
		callByValue.changeValue(lastName);
		System.out.println(lastName);
	}

}
