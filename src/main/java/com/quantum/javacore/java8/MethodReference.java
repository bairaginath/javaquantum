/**
 * 
 */
package com.quantum.javacore.java8;

/**
 * @author bairagi 05-May-2019 8:58:28 PM MethodReference.java
 *
 *
 */

@FunctionalInterface
interface VoidFuction{
	  void apply();
}
public class MethodReference {
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		System.out.println("inside toString method");
		return super.toString();
	}
	  
	public  void noReturnNoParamenter(){
		System.out.println("in side  no return and no parameter");
	}
	
	
	public static void staticNoReturnNoParamenter(){
		System.out.println("in side static no return and no parameter");
	}
	
	public static void main(String[] args) {
		
		   VoidFuction mr=MethodReference::new;
		   mr.apply();
		   
		
		 VoidFuction vf=MethodReference::staticNoReturnNoParamenter;
		 vf.apply();
		 MethodReference mr1=new MethodReference();
		 VoidFuction ivf=mr1::noReturnNoParamenter;
		 ivf.apply();
		
	}

}
