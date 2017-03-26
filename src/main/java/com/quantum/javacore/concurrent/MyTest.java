package com.quantum.javacore.concurrent;

import java.util.Stack;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Parents{
	private int value=5;
   public Parents(){
   
   System.out.println(this.value);	
   System.out.println(this instanceof Parents);
   	
   	System.out.println("parents hashcode = "+this.hashCode());
   }
   	
}

public class MyTest extends Parents
{
	public MyTest(){
		System.out.println("child hashcode = "+this.hashCode());
		     
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Parents p=new Parents();
		MyTest id=new MyTest();
          
          boolean flag=p.equals(id);
          System.out.println("result ="+flag);

          
	}
}