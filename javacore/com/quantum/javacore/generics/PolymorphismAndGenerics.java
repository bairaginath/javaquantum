
package com.quantum.javacore.generics;

import java.util.ArrayList;
import java.util.List;

class Parent<E>{
	
}
class Child<E> extends Parent<E> {
	
}

class Animal<E> {
	
}

class Dog<E> extends Animal<E> {
	
}
class Cat<E> extends Animal<E> {
	
}

public class PolymorphismAndGenerics {
	
public void checkAnimalsArray(Animal[] animals){
		
	}
	
	public void checkAnimalsList(List<Animal> animals){
		
	}
public void checkAnimalsArrayList(ArrayList<Animal> animals){
		
	}

  public void checkAnimalObject(Animal animal){
	  
  }
 public void checkAnimalObjectWithEntity(Animal<Integer> animal){
	  
  }
 public void checkAnimalSubObject(Dog<Integer> dog){
	 
 }
 
 public void passParentToChildArgs(Child child){
	 
 }
 
 public void passAnyObject(List<Object> list){
	 
 }

	public static void main(String[] args) {
		PolymorphismAndGenerics pog=new PolymorphismAndGenerics();
		Parent [] myArray=new Child[3]; //yes
		
		Parent<Integer> parentObject=new Child<Integer>();
		
		//the type of the variable 	declaration must match the type you pass to the actual object type
		// List<Parent> myList=new ArrayList<Child>(); //No	
		
		List<Dog> dogs=new ArrayList<Dog>();
	    // pog.checkAnimalsList(dogs); //No generic allows on exactly datatype have to pass not its Subtype object
		
	        
		pog.checkAnimalObject(new Dog());
		pog.checkAnimalObject(new Dog<Integer>());
		
		List<Animal> animals=new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Animal());
		
		pog.checkAnimalsList(animals);
		pog.checkAnimalsList(new ArrayList<Animal>());
		
		Parent parent=new Child();
		//pog.passParentToChildArgs(parent); // we can't pass Parent Reference to Chlid Args
		pog.passParentToChildArgs(new Child());
		
		Animal<Integer> dogObject=new Dog<Integer>();
		//pog.checkAnimalSubObject(dogObject); // we can't pass Animal Type to Dog Type Parameter
		pog.checkAnimalSubObject(new Dog<Integer>());
		List<Animal> animalsArrayListObject=new ArrayList<Animal>();
		//pog.checkAnimalsArrayList(animalsArrayListObject); //We can't pass List Type to ArrayList Type Parameter
		pog.checkAnimalsArrayList(new ArrayList<Animal>());
		
		//pog.passAnyObject(new ArrayList<Dog>()); //mismatch Type caste
		
		Dog dogArray[]=new Dog[3];
		pog.checkAnimalsArray(dogArray);
		
		
	}
	
	 
	

}
