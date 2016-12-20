package com.quantum.javacore.oops;




public class ReferenceVariableCasting {
	
	static class Animal{
		
		public static Animal getAnimal(String animalName){
			if(animalName.equalsIgnoreCase("Dog")){
				return new Dog();
			}
			else {
				return new Cat();
			}
		}
		
	}

	static class Dog extends Animal
	{
		
	}
	
	static class Cat extends Animal
	{
		
	}
	
	
	public static void main(String[] args) {		
	
	//Upcasting
	Animal animal=new Dog();
	//Downcasting
	
	try{
	Dog dog1=(Dog)new Animal(); //it throws java.lang.ClassCastException
	}catch(ClassCastException cce){cce.printStackTrace();}
	
	try{
	Dog dog=(Dog)Animal.getAnimal("Cat"); //it throws ClassCastException
	}catch(ClassCastException ccs){ccs.printStackTrace();}
	
	Dog dog=(Dog)Animal.getAnimal("Dog"); 
	
	
	

	}

}
