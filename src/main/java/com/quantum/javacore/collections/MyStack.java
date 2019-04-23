package com.quantum.javacore.collections;

public class MyStack<E> {
	
	private Object[] elementArray={};
	int counter=-1;
	public MyStack(){
		     elementArray=new Object[10];
		
	}
	
	public boolean push(E e){
		elementArray[++counter]=e;
		return true;
	}
	
	public E pop(){
		return (E) elementArray[counter--];
	}
	
	public static void main(String[] args) {
		
		MyStack<Integer> mt=new MyStack<>();
		mt.push(1);
		mt.push(5);
		System.out.println(mt.pop());
		mt.push(27);
		System.out.println(mt.pop());
		
		
	}
	
	
	

}
