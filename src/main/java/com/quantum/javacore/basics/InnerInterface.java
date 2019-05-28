/**
 * 
 */
package com.quantum.javacore.basics;

/**
 * @author bairagi 25-Apr-2019 12:15:16 AM InnerInterface.java
 *
 */

interface Outer {
	
	void printResult();
	
	interface Inner {
		
	}
	
}

public class InnerInterface implements Outer {

	 
	
	public void printResult() {
		
	}

}
