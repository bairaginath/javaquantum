package com.quantum.javacore.generics;

import java.util.ArrayList;
import java.util.List;

class Car {

}

class TestGenerics < T > { // as the class type
	T anInstance; // as an instance variable type
	T[] anArrayOfTs; // as an array type
	TestGenerics(T anInstance) { // as an argument type
		this.anInstance = anInstance;
	}
	T getT() { // as a return type
		return anInstance;
	}
}

class UseTwo < T, X > {
	T one;
	X two;
	UseTwo(T one, X two) {
		this.one = one;
		this.two = two;
	}
	T getT() {
		return one;
	}
	X getX() {
		return two;
	}
	// test it by creating it with <String, Integer>
	public static void main(String[] args) {
		UseTwo < String, Integer > twos = new UseTwo < String, Integer > ("foo", 42);
		String theT = twos.getT(); // returns a String
		int theX = twos.getX(); // returns Integer, unboxes to int
	}
}

class AnimalHolder < T extends Animal > { // use "T" instead  of "?"
	T animal;

}
//While the question mark works when declaring a reference for a variable,it does NOT work for generic class and method declarations.

//class NumberHolder <? extends Number>{}
//public < ? extends Number > void makeArrayList1(T t) { }

class X { public <X> X(X x) { } }

class NumberHolder1 <T extends Number>{}


class CreateAnArrayList {
	public < T > void makeArrayList(T t) { // take an object of an  unknown type and use a  "T" to represent the type
		List < T > list = new ArrayList < T > (); // now we can create the  list using "T"
		list.add(t);
	}

	public < T extends Number > void makeArrayList(T t) { 	}
	//While the question mark works when declaring a reference for a variable,	it does NOT work for generic class and method declarations
	//public < ? extends Number > void makeArrayList1(T t) { 	}
	public <T extends Number> void methodDeclarationWithQuestionMark(T t,List< ? extends Number> number){
		
	}

}

class Amount<T extends Number>{}
//class AmountWildCard<? extends Number>{} //question mark does NOT work for generic class declarations

class Abc {
	<T extends Number> void setValue(T t){}
	//<? extends Number> void setValue1(T t){} //question mark does NOT work for generic method declarations
    List<? extends Number> amount; //question mark valid for referance declarations
}

public class GenericDeclare < T > { // "T" is for the type	

	// parameter
	private List < T > rentalPool; // Use the class type for the  List type
	private int maxNum;
	public GenericDeclare(int maxNum, List < T > rentalPool) { // constructor takes a  List of the class type
		this.maxNum = maxNum;
		this.rentalPool = rentalPool;
	}

	public T getRental() { // we rent out a T  blocks until there's something available
		return rentalPool.get(0);
	}
	public void returnRental(T returnedThing) { // and the renter  returns a T
		rentalPool.add(returnedThing);
	}

	public static void main(String[] args) {
		//make some Cars for the pool
		Car c1 = new Car();
		Car c2 = new Car();
		List < Car > carList = new ArrayList < Car > ();
		carList.add(c1);
		carList.add(c2);
		GenericDeclare < Car > carRental = new GenericDeclare < Car > (2, carList);
		// now get a car out, and it won't need a cast
		Car carToRent = carRental.getRental();
		carRental.returnRental(carToRent);
		// can we stick something else in the original carList?
		//carList.add(new Cat("Fluffy"));

		AnimalHolder < Dog > dogHolder = new AnimalHolder < Dog > (); // OK
		//	AnimalHolder<Integer> x = new AnimalHolder<Integer>(); // NO!

	}


}