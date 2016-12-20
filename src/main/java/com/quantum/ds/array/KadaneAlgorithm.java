package com.quantum.ds.array;

public class KadaneAlgorithm {
	
	
	public static void kadaneAlgorithm(int array[]){
		
		int maxSoFar=0;
		int maxUpTo=0;
		for(int i=0;i<array.length;i++){
			if(array[i]<0){
				maxUpTo=maxUpTo+array[i]<0?0:maxUpTo+array[i];
			}else{
				maxUpTo=Math.max(maxUpTo,maxUpTo+array[i]);
			}
			maxSoFar=Math.max(maxUpTo,maxSoFar);
		}
		System.out.println(maxSoFar);
	}
	
	public static void main(String[] args) {
		int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
		kadaneAlgorithm(arr);
		
	}

}
