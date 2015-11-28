package com.quantum.javacore.innerclass;

import com.quantum.javacore.innerclass.InnerClassAccessExample.MyInner;

public class StaticInnerExample {
	
	private int privateInt=9;
	protected int protectedInt=7;
	public int publicInt=6;
	int defaultInt=5;
	
	private static int privateStaticInt=10;
	protected static int protectedStaticInt=10;
	public static int  publicStaticInt=10;
	static int defaultStaticInt=10;
	
	
	public static class MyInner {
		private void privateMethod(){
			System.out.println("In Side Private Method");
		}
		protected void protectedMethod(){
			System.out.println("In Side Protected Method");
		}
		public void publicMethod(){
			System.out.println("In Side Public Method");
		}
		void defaultMethod(){
			System.out.println("In Side Default Method");
		}
		private static void privateStaticMethod(){
			System.out.println("In Side Private Static Method");
		}
		protected static void protectedStaticMethod(){
			System.out.println("In Side Protected Static Method");
		}
		public static void publicStaticMethod(){
			System.out.println("In Side Public Static Method");
		}
		static void defaultStaticMethod(){
			System.out.println("In Side Default Static Method");
		}
		
		
		private int privateInt;
		protected int protectedInt;
		public int publicInt;
		int defaultInt;
		public MyInner(){
			System.out.println("In Side Inner Class "+privateInt+"  "+protectedInt+"  "+publicInt+" "+defaultInt);
			//the nested class instance does not get an outer this reference
			//System.out.println("In Side Inner Class "+StaticInnerExample.this.privateInt+"  "+StaticInnerExample.this.protectedInt+"  "+StaticInnerExample.this.publicInt+" "+StaticInnerExample.this.defaultInt);
			System.out.println("In Side Inner Class Static Variable "+privateStaticInt+"  "+protectedStaticInt+"  "+publicStaticInt+" "+defaultStaticInt);
		}		
	}
	
	public void display(){
		
	     MyInner myInner=new MyInner();
	     myInner.privateMethod();
	     myInner.protectedMethod();
	     myInner.publicMethod();
	     myInner.defaultMethod();
	     MyInner.privateStaticMethod();
	     MyInner.protectedStaticMethod();
	     MyInner.publicStaticMethod();
	     MyInner.defaultStaticMethod();
	     
	}
  
	public static void main(String[] args) {
		StaticInnerExample sie=new StaticInnerExample();
	  MyInner myInner=new StaticInnerExample.MyInner();
	  sie.display();
	}

}
