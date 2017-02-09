package com.quantum.javacore.concurrent;

import java.util.Stack;


public class MyTest {
	
	static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }


	
	public static void main(String[] args) {
  
	  System.out.println(hash(new MyTest()));
	  System.out.println(hash(new MyTest()));
	  MyTest m1=new MyTest();
	  int hash=m1.hashCode();
	  System.out.println(hash);
	  MyTest m2=new MyTest();
	  System.out.println(m2.hashCode());
	  System.out.println( m2.hashCode() & (64 - 1));
	  throw new java.lang.OutOfMemoryError();
 }
}
