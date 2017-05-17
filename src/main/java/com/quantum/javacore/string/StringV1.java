package com.quantum.javacore.string;

import java.util.Arrays;
import java.lang.OutOfMemoryError;

public class StringV1 {
	
	private int hash=0;
	private final char value[];
	    
	public StringV1(){
		this.value =new char[]{};
	}
	
	public StringV1(String original) {
        this.value = original.toCharArray();
    }
	
	 public int hashCode() {
	        int h = hash;
	        if (h == 0 && value.length > 0) {
	            char val[] = value;

	            for (int i = 0; i < value.length; i++) {
	                h = 31 * h + val[i];
	            }
	            hash = h;
	        }
	        return h;
	    }
  public static void main(String[] args) {
	String str="bairagi";
	StringV1 strV1=new StringV1("bairagi");
	System.out.println(str.hashCode());
	System.out.println(strV1.hashCode());
	System.out.println(strV1.toString());
	
}
}
