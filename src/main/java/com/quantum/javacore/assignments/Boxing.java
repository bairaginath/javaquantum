package com.quantum.javacore.assignments;

public class Boxing {
	
//	As of Java 5, boxing allows you to convert primitives to wrappers or to
//	convert wrappers to primitives automatically.
//	 Using == with wrappers created through boxing is tricky; those with the same
//	small values (typically lower than 127), will be ==, larger values will not be ==.
	
	public static void main(String[] args) {
		
		int x=5;
		Integer xI=new Integer(5);
		System.out.println(x==xI);
		
		int y=1480;
		Integer yI=new Integer(1480);
		System.out.println(1480==yI);
		
	}

}
