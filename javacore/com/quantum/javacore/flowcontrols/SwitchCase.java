package com.quantum.javacore.flowcontrols;

public class SwitchCase {
	//If there is no break, execution flows through into the next case
	
	public static void checkSwitchCase(int x){
		
		switch(x){
		default :{
			System.out.println("at default");
			break;
		}
		case 1:{
			System.out.println("at 1");
			break;
		  }
		case 2:{
			System.out.println("at 2");
			break;
		  
		}
		case 3:{
			System.out.println("at 3");
			break;
		  
		}
		
	}
	}
	
	public static void main(String[] args) {
		checkSwitchCase(2);
		checkSwitchCase(5);
	
}
}
