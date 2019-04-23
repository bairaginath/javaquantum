/**
 * 
 */
package com.quantum.javacore.oops;

/**
 * @author bairagi 19-Apr-2019 12:32:57 AM RetunTypeOverriding.java
 *
 */
public class RetunTypeOverriding {
	
	class Parent {
		 public int getResult(){ return 5;}
	}
	
	class Child extends Parent {
		
		@Override
		 public int getResult(){ return 5;}
	}

}
