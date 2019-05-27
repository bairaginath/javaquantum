package com.quantum.javacore.io;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;


@FunctionalInterface
interface ConstructorRef {
  DoubleColonExample apply();	
}
public class DoubleColonExample {
	String name="james";
	static String  staticVar="world";
	
	public static String getStaticMethod(){
		return staticVar;
	}
    public String getName(){
     return this.name;
     }
    
    public void printResultNoArgs(){
    	System.out.println("print ");
    }
    
    //for with argument we have to define method as static
    public static void printResultWihArgs(DoubleColonExample dce){
    	System.out.println(dce.getName());
    }
      
    public DoubleColonExample() { }
    public DoubleColonExample(String name){
    	this.name=name;
    }
    
    
     public static void main(String args[]){
         DoubleColonExample le=new DoubleColonExample();
         Function<DoubleColonExample,String> function1=DoubleColonExample::getName;         
         System.out.println(function1.apply(le));
         
         
         //Constructor Referance
         ConstructorRef cr=DoubleColonExample::new;
         DoubleColonExample dce=cr.apply();
         
         List<DoubleColonExample> list=new ArrayList<>();
         list.add(new DoubleColonExample("bairagi"));
         list.add(new DoubleColonExample());
         list.add(new DoubleColonExample("nath"));
         list.add(new DoubleColonExample("behera"));
         list.forEach(DoubleColonExample::printResultNoArgs);
         list.forEach(DoubleColonExample::printResultWihArgs);
         
         
         Function <Integer, DoubleColonExample[]> creator = DoubleColonExample[]::new;
         DoubleColonExample[] array = creator.apply(5);
         System.out.println(array.length);
         
        
        
        
         
         }

	   

}
