package com.quantum.algorithm.dp;

import java.util.Arrays;

public class PalindromePartitioning {
	
	public static int checkAndCountPalindrom(char arr[],int from,int to){
		
		if(to-from==1 && arr[from]!=arr[to]){
			return 2;
		}
		int mid=(from+to)>>1;
		for(int i=from,j=to;i<=mid && j>=mid;i++,j--){
			if(arr[i]!=arr[j]){
				return (to-from)+1;
			}
		}
		
		
		return 1;
	}
	
	  public static int getMiniumPalindromePartitioning(char arr[]){
		  
		  int memo[]=new int[arr.length+1];
		  for(int i=0;i<=arr.length;i++)
		  {
			  memo[i]=i;
		  }
		  for(int i=1;i<=arr.length;i++){
			  int min=Integer.MAX_VALUE;
			  for(int j=i;j>0;j--){
				  int partition=checkAndCountPalindrom(arr,j-1,i-1);
				  min=Integer.min(min,memo[j-1]+partition);
				  System.out.println("i= "+i+" j="+j+" partiton= "+partition+" min="+min);
				  }
			  memo[i]=min;
			  System.out.println(Arrays.toString(memo));
		  }

		  return memo[arr.length];
	  }
	
	public static void main(String[] args) {
		
		System.out.println(getMiniumPalindromePartitioning("ababbbabbababa".toCharArray()));
		//System.out.println(getMiniumPalindromePartitioning("ababbbabbaba".toCharArray()));
		//System.out.println(checkAndCountPalindrom("ababbbabbaba".toCharArray(),0,"ababbbabbaba".length()-1));
		
		
	}

}
