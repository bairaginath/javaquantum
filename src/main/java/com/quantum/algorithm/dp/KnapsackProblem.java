package com.quantum.algorithm.dp;

import java.util.Arrays;

//https://www.youtube.com/watch?v=8LusJS5-AGo

public class KnapsackProblem {
	
	
	public static void  knapsackProblem(int weight[],int value[],int totalWeight){
		
		int table[][]=new int[weight.length+1][totalWeight+1];
		for(int i=1;i<=value.length;i++){
			for(int j=1;j<=totalWeight;j++){
				if(weight[i-1]>j)
					table[i][j]=table[i-1][j];
				else
				{
					table[i][j]=Math.max(value[i-1]+table[i-1][j-weight[i-1]],table[i-1][j]);
				}
			  	
			}
		}
		System.out.println(Arrays.deepToString(table));
	    int  i=value.length;
		int  j=totalWeight;
		while(i>0){
			if(table[i][j]==table[i-1][j])
				i--;
			else {
				System.out.println(weight[i-1]);
				totalWeight=totalWeight-weight[i-1];
				i--;
				j=totalWeight;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
	  
		int weight[]={1,3,4,5};
		int value[]={1,4,5,7};
		int totalWeight=7;
		knapsackProblem(weight,value,totalWeight);
		
	}

}
