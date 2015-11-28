package com.quantum.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	private static void swap(int A[],int x,int y){
		int temp=A[x];
		A[x]=A[y];
		A[y]=temp;
		
	}
	
	public static void selectionSort(int A[]){
		for(int i=1;i<A.length;i++){
			for(int j=0;j<i;j++){
				if(A[i]<A[j]){
					swap(A,i,j);
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		int A[]={5,3,7,2,9,6,1,4,10,8,0,11};
		selectionSort(A);
		System.out.println(Arrays.toString(A));		
		
	}

}


