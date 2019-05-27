/**
 * 
 */
package com.quantum.javacore.oops;

/**
 * @author bairagi 18-Apr-2019 5:32:16 PM ProblemOnPolymorphism.java
 *
 */
public class ProblemOnPolymorphism {
	
	class Parent {
		    
		   public void calculate(){
			  
			   getResult(); //this method it goes to infiniteloop
	                            //This is problem on Polymorphism		   
		   }
		   public void getResult(){
			   System.out.println("inside parent getResult method");
			   
		   }
		   
	}
	
	class Child extends Parent {
		@Override
		public void getResult(){
			System.out.println("inside child getResult method");
			calculate();
			
		}
	}
	
	class Child2 {
		
		Parent parent;
		public Child2(Parent parent){
			this.parent=parent;
		}
		public void getResult(){
			System.out.println("inside child getResult method");
			parent.calculate();
			
		}
		
		
	}
	
	
	
	void problemOnPolymorphism(){
		Parent p=new Child();
		p.getResult();
		
	}
	
	void problemOnPolymorphismResloveByComposition(){
		Child2 p=new Child2(new Parent());
		p.getResult();
		
	}
	
	public static void main(String[] args) {
		
		 ProblemOnPolymorphism pp=new ProblemOnPolymorphism();
		 //pp.problemOnPolymorphism(); //this call goes to infite loop which this big problem on Polymorphsim
		 pp.problemOnPolymorphismResloveByComposition();
		 
		
		
	}

}
