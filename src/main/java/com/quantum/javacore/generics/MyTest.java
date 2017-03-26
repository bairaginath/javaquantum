package com.quantum.javacore.generics;

import java.util.ArrayList;
import java.util.List;



public class MyTest {
	
	static class ABC<T extends Number>{
	   
		T t;
		List< ? extends Number> number;
		 ABC(T t){
			this.t=t;
		}
		 
		 T getValue(){
			 return this.t;
		 }
		
	   <E> E setValue(E e){
		   return e;
	   }
	}
	
   public static void main(String[] args) {
	ABC<Integer> abc=new ABC<>(5);
	System.out.println(abc.getValue());
	System.out.println(abc.setValue("bairagi"));
}	

}
