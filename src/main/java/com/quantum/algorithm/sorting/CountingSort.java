package com.quantum.algorithm.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class CountingSort {
	static int RANGE=255;
	public static void countSort(int A[]){
		int count[]=new int[A.length];
		for(int i=0;i<A.length;i++){
		  count[A[i]]=count[A[i]]+1;
		}
		
		// Change count[i] so that count[i] now contains actual position of
	    // this character in output array
	    for (int i = 1; i <count.length; ++i)
	        count[i] += count[i-1];
	    
	    int output[]=new int[A.length];
	    for (int i = 0;i<A.length; ++i)
	    {
	        output[count[A[i]]-1] = A[i];
	        //decrement the counter
	        --count[A[i]];
	    }
	    // Copy the output array to str, so that str now
	    // contains sorted characters
	    for (int i = 0;i<A.length; ++i)
	        A[i] = output[i];

	}
	
	
	public static void countSort(char str[])
	{
	    // The output character array that will have sorted str
	    char output[]=new char[str.length];
	 
	    // Create a count array to store count of inidividul characters and
	    // initialize count array as 0
	    int count[]=new int [RANGE+1];
	    int i;
	
	 
	    // Store count of each character
	    for(i = 0;i<str.length; ++i)
	        ++count[str[i]];
	 
	    // Change count[i] so that count[i] now contains actual position of
	    // this character in output array
	    for (i = 1; i <= RANGE; ++i)
	        count[i] += count[i-1];
	 
	    // Build the output character array
	    for (i = 0;i<str.length; ++i)
	    {
	        output[count[str[i]]-1] = str[i];
	        --count[str[i]];
	    }
	 
	    // Copy the output array to str, so that str now
	    // contains sorted characters
	    for (i = 0;i<str.length; ++i)
	        str[i] = output[i];
	}
	public static void main(String[] args) {
		
		//In CountingSort,it must be provide the range of elements.
		String str = "geeksforgeeks";
		char str1[]=str.toCharArray();
		countSort(str1);
		System.out.println(Arrays.toString(str1));
		
		int A[]={3,4,3,1,2,5,2,1,9,3,7,4};
		countSort(A);
		System.out.println(Arrays.toString(A));

	}
}
