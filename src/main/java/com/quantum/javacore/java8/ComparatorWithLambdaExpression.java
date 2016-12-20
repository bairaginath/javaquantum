package com.quantum.javacore.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Person{
	String name;
    int age;
    Person(String name,int age){
    	this.name=name;
    	this.age=age;
    }
    
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public int getAge() {
		return age;
	}
    public void setAge(int age) {
		this.age = age;
	}
    public String toString(){
    	return this.name;
    }
}

public class ComparatorWithLambdaExpression {
	
	
	    
	    public static void main(String[] args) {
			List<Person> personList=new ArrayList<>();
			personList.add(new Person("Tapan",27));
			personList.add(new Person("Bairagi",15));
			personList.add(new Person("Kuna",37));
			Collections.sort(personList,(Person person1,Person person2)->person1.getName().compareTo(person2.getName()));
			personList.forEach(System.out::println);
			Collections.sort(personList,(person1,person2)->person1.getName().compareTo(person2.getName()));
			personList.forEach(System.out::println);
			Collections.sort(personList,Comparator.comparing(Person::getName));
			personList.forEach(System.out::println);
			System.out.println("==============using stream============");
			personList.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
			
			
			
		}
	

}
