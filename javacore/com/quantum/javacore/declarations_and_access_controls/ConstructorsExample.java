package com.quantum.javacore.declarations_and_access_controls;

public class ConstructorsExample {
	
	class Foo2 {
		// legal constructors
		Foo2() { }
		private Foo2(byte b) { }
		Foo2(int x) { }
		Foo2(int x, int... y) { }
//		
//		
//		// illegal constructors
//		void Foo2() { } // it's a method, not a constructor
//		//Foo() { } // not a method or a constructor
//		//Foo2(short s); // looks like an abstract method
//		static Foo2(float f) { } // can't be static
//		final Foo2(long x) { } // can't be final
//		abstract Foo2(char c) { } // can't be abstract
//		Foo2(int... x, int t) { } // bad var-arg syntax
//		
	
	}

}
