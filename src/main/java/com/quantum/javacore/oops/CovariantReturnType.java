package com.quantum.javacore.oops;


//Both methods have different return type but it is method overriding. This is known as covariant return type. 
class Food{
	
}

class DogFood extends Food {
	
}

class Animal{
	
	Food seekFood() throws RuntimeException {
		System.out.println("In side Animal seek Food");
		return new Food();
	}
}

class Dog extends Animal {
	DogFood seekFood(){
		System.out.println("In side Dog seek Food");
		return new DogFood();
	}
}

public class CovariantReturnType {
	
	public static void main(String[] args) {
		Animal animal=new Dog();
		animal.seekFood();
	}
	
	
	

}
