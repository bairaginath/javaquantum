package com.quantum.algorithm.searching;

public class CheckForDuplicate {
	
	public static void checkForDuplicate(int A[]){
		for(int i=0;i<A.length;i++){
			if(A[Math.abs(A[i])]<0){
				System.out.println("Duplicate is there");
				return;
			}
			else {
				
				A[Math.abs(A[i])]=-A[Math.abs(A[i])];
			}
		}
		System.out.println("No Duplicate");
	}
	public static void main(String[] args) {
		int A[]={2,3,4,1,7,9,5,10,6,0,8};
		int B[]={2,3,1,2,4};
		checkForDuplicate(A);
		
		checkForDuplicate(B);
	}

}
