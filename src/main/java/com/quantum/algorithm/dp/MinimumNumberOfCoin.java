package com.quantum.algorithm.dp;

public class MinimumNumberOfCoin {
	
	public static int getMinimumValue(int array[]){
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
		    if (array[i] < min) {
		      min = array[i];
		    }
		}
		
		return min;
	}
	
	private static int minimumNumberOfCoin(int coins[],int memo[],int target){
		
		if(target==0){
			return 1;
		}
		if(target<0){
			return 0;
		}
		
		if(memo[target-1]!=0){
			return memo[target-1];
		}
		
		int temp[]=new int[coins.length];
		for(int i=0;i<coins.length;i++){
			temp[i]=1+minimumNumberOfCoin(coins,memo,target-coins[i]);
		}
		memo[target-1]=getMinimumValue(temp);
		
		
		
		return memo[target-1];
	}
	
	public static int minimumNumberOfCoin(int coins[],int target){		
		
		int memo[]=new int[target];
		
		
		return minimumNumberOfCoin(coins,memo,target);
	}
	
	public static void main(String[] args) {
		
		int coins[]={11,9,6,1};
		System.out.println(minimumNumberOfCoin(coins,48));
		
	}

}
