package com.quantum.javacore.innerclass;


class Outer{
	int def=7;
	static int staticValue=6;
	private int pri=4;
	
	
	class Inner{
	   private int pri=Outer.this.pri;
	   protected int pro;
	   public int pub=staticValue;
	   int def=Outer.this.def;
//	   static int innerStaticValue=4; //can't declare static variable inside non-static inner class
	}
	
	static class StaticInner{ //A static nested class is not an inner class, it's a top-level nested class
//		   private int pri=Outer.this.pri; //A static nested class cannot access non-static members of the outer class
		   protected int pro=new Outer().pri;
		   public int pub;
		   int def;
		   static int innerStaticValue=staticValue;
		}
	
	abstract class AbstractInner{
		   private int pri;
		   protected int pro;
		   public int pub;
		   int def;
		  
		}
	
	
}

public class InnerExample {
	
	public static void main(String[] args) {
		Outer.Inner inner=new Outer().new Inner();
		Outer.StaticInner si=new Outer.StaticInner();
		System.out.println(Outer.StaticInner.innerStaticValue);
	}

}
