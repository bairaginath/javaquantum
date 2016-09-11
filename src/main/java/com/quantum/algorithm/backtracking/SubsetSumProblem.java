package com.quantum.algorithm.backtracking;

import java.util.Arrays;

public class SubsetSumProblem {
	
	public static boolean subSetSum(int arr[],int result[],int sum,int index){
		if(sum<0){
			return false;
		}
		if(sum==0){
			return true;
		}
		if(index<arr.length){
			result[index]=1;
			if(subSetSum(arr,result,sum-arr[index],index+1)){
				return true;
			}else{
				result[index]=0;
			}
			if(subSetSum(arr,result,sum,index+1)){
				return true;
			}else{
				result[index]=0;
			}
		}
		return false;
	}
	 
	public static void main(String[] args) {
		int arr[]={15,22,14,26,32,9,16,8};
		int result[]=new int[arr.length];
		subSetSum(arr,result,53,0);
		System.out.println(Arrays.toString(result));
	}

}
