/**
 * 
 */
package com.quantum.javacore.oops;

/**
 * @author bairagi 19-Apr-2019 12:06:59 AM TypePromotion.java
 *
 */
public class TypePromotion {
	
	
	     void method( int a,int
	    		 b){
	    	   System.out.println("inside int int");
	     }
	     
	     void method( int a,long b){
	    	   System.out.println("inside int long");
	     }
	     
	     public static void main(String[] args) {
			TypePromotion tp= new TypePromotion();
			tp.method(5, 7);
		}

}
