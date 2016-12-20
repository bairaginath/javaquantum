package com.quantum.ds.array;

public class MaximumProductSubarray {
	
	public static int maximumProductSubarray(int array[]){
		 int max_fwd = Integer.MIN_VALUE, max_bkd = Integer.MIN_VALUE;
		 int max_till_now = 1;
		 
		 for (int i=0; i<array.length; i++)
		    {
		        max_till_now = max_till_now*array[i];
		        if (max_till_now == 0)
		        {
		             max_till_now = 1;
		            continue;
		        }
		        if (max_fwd < max_till_now) 
		        	max_fwd = max_till_now;
		    }
		     max_till_now = 1;
		     for (int i=array.length-1; i>=0; i--)
		     {
		         max_till_now = max_till_now * array[i];
		         if (max_till_now == 0)
		         {
		             max_till_now = 1;
		             continue;
		         }
		         // update max_bkd
		         if (max_bkd < max_till_now)
		             max_bkd = max_till_now;
		     }
		     int res =  Math.max(max_fwd, max_bkd);
		  
		     // Product should not be nagative.
		     // (Product of an empty subarray is
		     // considered as 0)
		     return Math.max(res, 0);
		
	}
	public static void main(String[] args) {
		int arr[] = {6, -3, -10, 0, 2};
		System.out.println(maximumProductSubarray(arr));
	}

}
