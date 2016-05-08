package com.quantum.javacore.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Person{
	String name;
    int age;
    Person(String name,int age){
    	this.name=name;
    	this.age=age;
    }
}

public class ComparatorWithLambdaExpression {
	
	
	    
	    public static void main(String[] args) {
			List<Person> personList=new ArrayList<>();
			personList.add(new Person("Tapan",27));
			personList.add(new Person("Bairagi",15));
			personList.add(new Person("Kuna",37));
			Collections.sort(personList,(object1,object2)->object1.name.compareTo(object2.name));
			for (Person person : personList) {
				System.out.println(person.name);	
			}
			
			
		}
	

}
