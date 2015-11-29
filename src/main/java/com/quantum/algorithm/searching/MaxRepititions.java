package com.quantum.algorithm.searching;

import java.util.Arrays;

public class MaxRepititions {
	
	public static void maxRepitions(int A[]){
		int max=0;
		int maxIndex=0;
		int n=A.length;
		for(int i=0;i<n;i++){
			A[A[i]%n]+=n;
			System.out.println(Arrays.toString(A));
		}
		for(int i=0;i<n;i++){
			if(A[i]/n > max){
				max=A[i]/n;
				maxIndex=i;
			}
		}
		System.out.println(maxIndex);
	}
	
	
	public static void main(String[] args) {
		int A[]={2,3,1,2,4,3,1,1};
		maxRepitions(A);
	}

}
