package com.quantum.javacore.string;

public class StringBufferMethods {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		StringBuilder sbu=new StringBuilder();
		int length=Integer.MAX_VALUE;
		StringBuilder sb1=new StringBuilder(length); //"main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
	    System.out.println(sb1.append("bairagi"));
	}

}
