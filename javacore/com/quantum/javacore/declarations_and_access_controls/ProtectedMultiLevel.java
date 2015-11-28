package com.quantum.javacore.declarations_and_access_controls;

import com.quantum.javacore.private_protected.PrivateAndProtected;

class ProtectedSubClass extends PrivateAndProtected {
	public int publicInt=5;
	ProtectedSubClass(){
		System.out.println(x+" "+y);
	}

}
   public class ProtectedMultiLevel extends ProtectedSubClass {
	   
	   public ProtectedMultiLevel() {
		   System.out.println(x+" "+y);
	}
	   
	   public static void main(String[] args) {
		ProtectedMultiLevel pml=new ProtectedMultiLevel();
		System.out.println(pml.x +"  "+pml.y);
		
	}

}
