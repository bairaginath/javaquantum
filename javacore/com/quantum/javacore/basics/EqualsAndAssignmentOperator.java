package com.quantum.javacore.basics;



public class EqualsAndAssignmentOperator {
	
	String name;
	int age;
	public EqualsAndAssignmentOperator(String name,int age) {
       this.name=name;
       this.age=age;
	}

	public static void main(String[] args) {
		EqualsAndAssignmentOperator bairagi=new EqualsAndAssignmentOperator("Bairagi",33);
		EqualsAndAssignmentOperator kuna=new EqualsAndAssignmentOperator("Bairagi",33);		
		System.out.println(bairagi==kuna);
		System.out.println(bairagi.equals(kuna));
		String world=new String("World");
		String earth="World";
		String planet=new String("World");
		String india="World";
		System.out.println("using ==");
		System.out.println(world==earth);
		System.out.println(world==planet);
		System.out.println(earth==india);
		System.out.println("using equals() method");
       
		System.out.println(world.equals(earth));
		System.out.println(world.equals(planet));
		System.out.println(earth.equals(india));
		
		
	}

}
