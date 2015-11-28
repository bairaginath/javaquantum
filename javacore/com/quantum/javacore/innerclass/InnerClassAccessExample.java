package com.quantum.javacore.innerclass;

public class InnerClassAccessExample {
	
	private int privateInt=9;
	protected int protectedInt=7;
	public int publicInt=6;
	int defaultInt=5;
	
	
	public class MyInner {
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
		private int privateInt;
		protected int protectedInt;
		public int publicInt;
		int defaultInt;
		public MyInner(){
			System.out.println("In Side Inner Class "+privateInt+"  "+protectedInt+"  "+publicInt+" "+defaultInt);
			System.out.println("In Side Inner Class "+InnerClassAccessExample.this.privateInt+"  "+InnerClassAccessExample.this.protectedInt+"  "+InnerClassAccessExample.this.publicInt+" "+InnerClassAccessExample.this.defaultInt);
		}		
	}
	
	public void display(){
		
	     MyInner myInner=new MyInner();
	     myInner.privateMethod();
	     myInner.protectedMethod();
	     myInner.publicMethod();
	     myInner.defaultMethod();
	}
  
	public static void main(String[] args) {
	  InnerClassAccessExample icae=new InnerClassAccessExample();
	  MyInner myInner=icae.new MyInner();
	  icae.display();
	}
}
