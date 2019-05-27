package com.quantum.javacore.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferentBetweenArrayAndGeneric {
	
	public static void animalWithAnyChild(Animal[ ] animal){        
		animal[0]=new Dog(); //no error
		animal[1]=new Cat();
	   // animal[0]=new Cat(); //ArrayStoreException Runtime Exception
	}
	
	public static void animalPlanet(Animal[ ] animal){        
		animal[0]=new Dog(); //no error
	   // animal[0]=new Cat(); //ArrayStoreException Runtime Exception
	}
	
	
	public static void animalPlanet(List<Animal> animal){        
		animal.add(0,new Dog());//no error
	     animal.add(1,new Cat()); //no error
	}
	public static void main(String[] args) {
		
		Animal animal[]= new Animal[5];
		animalWithAnyChild(animal);
		System.out.println(Arrays.toString(animal));
		List<Dog> dogList=new ArrayList<Dog>();
		Dog dogArray[]=new Dog[5];
		animalPlanet(dogArray);
		// animalPlanet(dogList); //No allow
		List<Animal> animalList=new ArrayList<Animal>();
		animalList.addAll(animalList);
		animalPlanet(animalList);
		
		
	}


}
