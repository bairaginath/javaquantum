package com.quantum.javacore.innerclass;


interface Inner
{ 
    int id=5;
    void display();
   
}

abstract class AbstractInner {
	String name;
	public AbstractInner(String name){
		this.name=name;
	}
	abstract public void show();
}



public class InnerClassExample
{
  static  Inner o= new Inner() {

        
         public void display() {
             System.out.println("bairagi");
         }
        
     };
    // Inner ob=(Inner)this.o;
     //ob.display();
    
   
   
    public static void main(String[] args) throws Exception {
         //InnerClass_Example ob=new InnerClass_Example();
    	 //same concept as System.out.println();
         InnerClassExample.o.display();
         
         new AbstractInner("bairaginath"){
        	 public void show(){
        		 System.out.println(this.name);
        	 }
         }.show();
         
         
    }

}
   


    


