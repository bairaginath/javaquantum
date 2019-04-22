package com.quantum.algorithm.dp;

import java.util.Arrays;

public class CompsiteSummized {
	
	public static int summized(int n,int memo[]){
		if(n%2==1)
			return -1;
		if(n<4)
			return -1;
		if(memo[n-1]==-1)
			return -1;
		if(n==4 || n==6)
			return 1;
		int temp=summized(n-4,memo);
		System.out.println(Arrays.toString(memo));
		if(temp>0)
			{
			memo[n]=1+temp;
			return memo[n];
			}
		
		
		return -1;
	}
	  public static void main(String args[]){
		  
		  int n=26;
		  int memo[]=new int[n+1];
		  System.out.println(summized(n,memo));
		  
		     
	  }
	

}
