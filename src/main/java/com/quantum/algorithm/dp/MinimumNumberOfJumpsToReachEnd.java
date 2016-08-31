package com.quantum.algorithm.dp;

import java.util.Arrays;

public class MinimumNumberOfJumpsToReachEnd {
	
	public static int minimumNumberOfJumpsToReachEnd(int arr[]){
		
		int memo[]=new int[arr.length];
		for(int i=arr.length-2;i>=0;i--){
			double min=Double.POSITIVE_INFINITY;
			for(int j=i+1,jumpsFromI=0;(j<arr.length)&& (jumpsFromI < arr[i]);j++,jumpsFromI++){
				min=1+Double.min(min,memo[j]);				
			}

//			}
			memo[i]=(int)min;
			
			System.out.println(Arrays.toString(memo));
			
		}
		
		return memo[0];
	}
	
	
	
	public static void main(String[] args) {
		int arr[]={1, 3, 5, 8, 9, 2, 6, 0, 6, 8, 9};
		System.out.println(minimumNumberOfJumpsToReachEnd(arr));
		
	}

}
