package com.quantum.javacore.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
	
	//While the question mark works when declaring a reference for a variable,it does NOT work for generic class and method declarations.
	Animal<? extends Number>  t;
	//class NumberHolder <? extends Number>{}
	//public < ? extends Number > void makeArrayList1(T t) { }
	//valid declarion as below
    public <T extends Number> void tWithExtendsAtMethod(T num) {}	
    
    public void tAsVariableAtMethod (Animal<? extends Number> animal) {}
	
	
	public void addAnimalExtends(List<? extends Animal> animals){
		
	    //animals.add(new Dog()); // NO! Can't add if we use <? extends Animal>
		
	}
	
	
	
	
	
	public void addAnimalSuper(List<? super Dog> animals){
		animals.add(new Dog());
	    //animals.add(new Cat()); //we can't add sibling or subtype of object in <? super Animal>
	   // animals.add(new Animal()); //only allow to add Dog type object
	}
	
	//List<? extends Object> and List<?> are absolutely identical!
	 public void fooAny(List<?> list) { }
	 
	 public void fooObject(List<Object> list) { }
	 
	 public static void main(String[] args) {
		
		 WildCard wc=new WildCard();
		 wc.addAnimalExtends(new ArrayList<Animal>());
		 wc.addAnimalExtends(new ArrayList<Dog>());
		 List<?> list=new ArrayList<Dog>();
		 List<? extends Animal> animals=new ArrayList<Dog>();
		 //List<Object> listObject=new ArrayList<Dog>();
		 
		 List<? super Dog> dogSuper=new ArrayList<Dog>();
		// List<? super Dog> catSuper=new ArrayList<Cat>();
		 List<? super Dog> animalSuper=new ArrayList<Animal>();
		 
		 
		 
		  //you cannot use wildcard notation in the object creation. So the new ArrayList<? extends Animal>() will not compile.
		   // List<?> foo = new ArrayList<? extends Animal>();
		 //You cannot assign an Integer list to a reference that takes only a Dog
		 // List<? extends Dog> cList = new ArrayList<Integer>();
		 
		 //but 
		 List<? extends Dog> sameTypelist=new ArrayList<Dog>();
		 List<? extends Dog> childTypelist=new ArrayList<PitbullDag>();
		 
		 List<? super Dog> bList = new ArrayList<Animal>();
		 //The Dog is too "low" in the class hierarchy
		// List<? super Animal> dList = new ArrayList<Dog>();
		 
		 
		 
		 
		 
	}





}
