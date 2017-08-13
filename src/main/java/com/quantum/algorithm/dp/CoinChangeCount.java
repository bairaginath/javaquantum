package com.quantum.algorithm.dp;

import java.util.Arrays;

public class CoinChangeCount {
	
	static int coinChangecount( int S[], int m, int n )
	{
	    int table[]=new int[n+1];
	    Arrays.fill(table,0);
	    table[0] = 1;
	    for(int i=0; i<m; i++)
	        for(int j=S[i]; j<=n; j++){
	        	System.out.println(Arrays.toString(table)+" i="+i+" j="+j);
	            table[j] += table[j-S[i]];
	        }
	 
	    return table[n];
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3};
	    int m = arr.length;
	    int n = 4;
	    System.out.println(coinChangecount(arr, m, n));
		
	}

}
