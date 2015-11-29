package com.quantum.algorithm.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	
	private static void swap(int A[],int x,int y){
		int temp=A[x];
		A[x]=A[y];
		A[y]=temp;
		
	}
	
	public static void insertionSort(int A[]){
		for(int i=1;i<A.length;i++){
			int v=A[i];
			int j=i;
			while(j>0 && A[j-1]> v ){
				A[j]=A[j-1];
				j--;
			}
			A[j]=v;
		}
	}
	
	
	
	public static void main(String[] args) {
		int A[]={5,3,7,2,9,6,1,4,10,8,0,11};
		insertionSort(A);
		System.out.println(Arrays.toString(A));		
		
	}

}
