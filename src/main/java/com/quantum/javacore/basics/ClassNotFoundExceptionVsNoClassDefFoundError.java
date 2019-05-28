/**
 * 
 */
package com.quantum.javacore.basics;

/**
 * @author bairagi 27-Apr-2019 8:51:45 PM ClassNotFoundExceptionVsNoClassDefFoundError.java
 *
 */
public class ClassNotFoundExceptionVsNoClassDefFoundError {
	
	class ExampleOfNoClassDefFoundError {
		   int x=5/0;
	}
	
	
	
	public static void main(String[] args) {
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(Exception e){System.out.println(e); }
			
		ClassNotFoundExceptionVsNoClassDefFoundError.ExampleOfNoClassDefFoundError ncde
		=new ClassNotFoundExceptionVsNoClassDefFoundError().new ExampleOfNoClassDefFoundError();
		
	}

}
