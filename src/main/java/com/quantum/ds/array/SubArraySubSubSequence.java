package com.quantum.ds.array;

import java.util.Arrays;

public class SubArraySubSubSequence {
	
	
	public static void subArray(int arr[])
	{
		int n=arr.length;
	    for (int i=0; i <n; i++)
	    {
	        for (int j=i; j<n; j++)
	        {
	           int temp[]=Arrays.copyOfRange(arr,i,j+1);
	           System.out.println(Arrays.toString(temp));
	        }
	    }
	}
	
	public static void subSequence(int arr[])
		{
            int n=arr.length;		
		    /* Number of subsequences is (2**n -1)*/
		    int opsize =(int) Math.pow((double)2,(double)n);
		    /* Run from counter 000..1 to 111..1*/
		    for (int counter = 0; counter < opsize; counter++)
		    {
		        for (int j = 0; j < n; j++)
		        {
		            /* Check if jth bit in the counter is set
		                If set then print jth element from arr[] */
		            if ((counter & (1<<j))==0)
		                System.out.print(arr[j]);
		        }
		        System.out.println();
		    }
		}

	
	public static void main(String[] args) {
		int arr[]={1,2,3,4};
		subArray(arr);
		System.out.println("SubSequence of Array ");
		subSequence(arr);
	}
	 

}
