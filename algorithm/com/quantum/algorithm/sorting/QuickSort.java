package com.quantum.algorithm.sorting;

import java.util.Arrays;

public class QuickSort {
	
	private static void swap(int A[],int x,int y){
		int temp=A[x];
		A[x]=A[y];
		A[y]=temp;
		
	}
	private static int partition(int A[],int start,int end){
		int pivot = A[end]; // choose pivot end of array
		int i = start-1; // Index of smaller element

		for (int j = start; j <= end- 1; j++)
		{
			// If current element is smaller than or equal to pivot 
			if (A[j] <= pivot)
			{
				i++; // increment index of smaller element
//				System.out.println("i "+i+" j "+j);
				swap(A,i,j); // Swap current element with index
			}
		}
		swap(A,i + 1,end); 
		return (i + 1);
	}
	private static void quickSort(int A[],int start,int end){
		if(start<end){
			int p=partition(A,start,end);
			quickSort(A,start,p-1);
			quickSort(A,p+1,end);
		}
	}
	
	public static void quickSort(int A[]){
		quickSort(A,0,A.length-1);
		
		
	}
	
	
	public static void main(String[] args) {
		
		int A[]={5,3,7,2,9,6,1,4,10,8,0,11};
		quickSort(A);
		System.out.println(Arrays.toString(A));		
		
		
	}

}
