package com.quantum.javacore.exceptions;


class CustomError extends Error {
	
	public CustomError() {
        super();
    }
	
}

public class CustomErrorExample {
	
	
  public static void main(String[] args) {
	  
		try {
			throw new CustomError();
		}
		catch(Error e){
			System.out.println("inside error catch");
			e.printStackTrace();
		}
		catch(Throwable e){
			e.printStackTrace();
		}

	
}
 

}
