package com.quantum.javacore.concurrent;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceExample {

	
	private static Person person;	
	private static AtomicReference<Person> aRperson;
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyRun1());
		Thread t2 = new Thread(new MyRun2());
		
		person = new Person("Phillip", 23);		
		aRperson = new AtomicReference<Person>(person);
		System.out.println("person "+person.toString());
		System.out.println("Atomic Reference of Person is " + aRperson.get().toString());
		t1.start();
		t2.start();
		t1.join();
		t2.join();	
		System.out.println( "Person is " + person.toString());
		System.out.println("Atomic Reference of Person is " + aRperson.get().toString());
	}
		
	static class MyRun1 implements Runnable {

		public void run() {			
			person.setAge(person.getAge()+1);
			person.setName(Thread.currentThread().getName());
			aRperson.getAndSet(new Person(Thread.currentThread().getName(), 1));
			System.out.println( Thread.currentThread().getName() +" Values -" + person.toString());
			System.out.println(Thread.currentThread().getName() +" Atomic References "  + person.toString());
		}		
	}
	
	static class MyRun2 implements Runnable {

		public void run() {
			
			person.setAge(person.getAge()+2);
			person.setName(Thread.currentThread().getName());			
			aRperson.set(new Person(Thread.currentThread().getName(), 2));
			System.out.println( Thread.currentThread().getName() +" Values: " + person.toString());
			System.out.println(Thread.currentThread().getName() +" Atomic References: " 
					 + aRperson.get().toString());
		}		
	}
	
	static class Person {
		
		private String name;
		private int age;
		
		public Person(String name, int age) {
			this.name = name;
			this.age= age;
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
		
		@Override
		public String toString() {
			return "[name " + this.name + ", age " + this.age + "]";
		}
	}
	
}