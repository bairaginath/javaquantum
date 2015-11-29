package com.quantum.javacore.basics;

public class CallByValueVsReference {
	
	 class Person{
		Integer age;
		String name;
		public Person() {
			// TODO Auto-generated constructor stub
		}
		Person(Integer age,String name){
			this.age=age;
			this.name=name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	public void callByReference(Person p){
		System.out.println("Inside method  "+p.hashCode());
		//p=new Person(55,"rajib"); //no change in callable
		p.setAge(10); //if above line is uncomment it will not change in callable,if above line 
		               // commented it will change age value
	}
	
	public void changeValue(int a){
		a=77;
	}
	public void changeValue(Integer a){
		a=77;
	}
	
	public void changeValue(String S){
		S="string";
	}
	
	public void changeValue(StringBuffer S){
		S=new StringBuffer("StringBuffer");
	}
	
	
	public void changeValue(int a[]){
		a[0]=6;
	}
	
	public static void main(String[] args) {
		CallByValueVsReference callByValueVsReference=new CallByValueVsReference();
		int a[]={1,2,3};
		callByValueVsReference.changeValue(a);
		System.out.println(a[0]);
		int number=5;
		callByValueVsReference.changeValue(number);
		System.out.println(number);
		Integer integerNumber=new Integer(5);
		callByValueVsReference.changeValue(integerNumber);
		System.out.println(integerNumber);
		String name="James";
		callByValueVsReference.changeValue(name);
		System.out.println(name);
		StringBuffer lastName=new StringBuffer("Bairagi");
		callByValueVsReference.changeValue(lastName);
		System.out.println(lastName);
		
		Person p=callByValueVsReference.new Person(44,"bairagi");
		System.out.println("hashcode before "+p.hashCode());		
		callByValueVsReference.callByReference(p);
		System.out.println("After callByValueReference  "+    p.getAge()+" "+p.getName());
		
	}

}
