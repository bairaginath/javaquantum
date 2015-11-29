package com.quantum.javacore.generics;

import java.util.ArrayList;
import java.util.List;

public class DifferentBetweenArrayAndGeneric {
	
	public static void animalPlanet(Animal[ ] animal){        
		animal[0]=new Dog(); //no error
	   // animal[0]=new Cat(); //ArrayStoreException Runtime Exception
	}
	
	
	public static void animalPlanet(List<Animal> animal){        
		animal.add(0,new Dog());//no error
	     animal.add(1,new Cat()); //no error
	}
	public static void main(String[] args) {
		
		Dog dogArray[]=new Dog[5];
		animalPlanet(dogArray);
		List<Dog> dogList=new ArrayList<Dog>();
		// animalPlanet(dogList); //No allow
		List<Animal> animalList=new ArrayList<Animal>();
		animalList.addAll(animalList);
		animalPlanet(animalList);
		
		
	}


}
