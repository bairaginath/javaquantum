package com.quantum.javacore.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ComparableVsComparatorExample {
	
	
	public static class Person implements Comparable<Person>{
        int age;
        String name;
        Person(int age,String name){
        	this.age=age;
        	this.name=name;
        	
        }
        
         public int getAge(){
        	 return this.age;
         }
		public int compareTo(Person person) {
			if(this.age<person.age)
			{
				return -1;
			}
			else if (this.age>person.age){
				return 1;
			}
			else {
				return 0;
			}
		
	}
	}
	public static void iterList(List<Person> personList){
		for(Person person:personList){
			System.out.println(person.age+"  "+person.name);
		}
	}
	public static void main(String[] args) {
		List<Person> personList=new ArrayList<Person>();
		personList.add(new Person(33,"prakash"));
		personList.add(new Person(27,"bairagi"));
		personList.add(new Person(55,"gyana"));
		//it will sort according only age ,if you want sort by name we can't sort it
		Collections.sort(personList); //it sorted by using Comparable
		iterList(personList);
		
		// by using comparator,you can sort by name 
		Collections.sort(personList,new Comparator<Person>() {

			public int compare(Person person1, Person person2) {
				return person1.name.compareToIgnoreCase(person2.name);
				
			}
			
		});
		
		iterList(personList);
		
		//in java 8
		Comparator<Person> compareByAge=Comparator.comparing(Person::getAge);
		
		Collections.sort(personList,compareByAge);
		
		iterList(personList);
		
		
		
		
		
		
		
		
	}

}
