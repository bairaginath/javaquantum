package com.quantum.algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	private static void swap(int A[],int x,int y){
		int temp=A[x];
		A[x]=A[y];
		A[y]=temp;
		
	}
	public static void bubbleSort(int A[]){
		for(int i=A.length-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(A[j]>A[j+1]){
					swap(A,j,j+1);
				}
			}
		}
	}
	
	public static void bestCaseBubbleSort(int A[]){
		boolean swapped=true;
		for(int i=A.length-2;i>=0 && swapped;i--){
			swapped=false;
			for(int j=0;j<i;j++){
				if(A[j]>A[j+1]){
					swap(A,j,j+1);
					swapped=true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int A[]={5,3,7,2,9,6,1,4,10,8,0,11};
		bubbleSort(A);
		System.out.println(Arrays.toString(A));
		
		//To improve algorithm for bestcase  Complexity i.e sorted array no needed to n^2,it takes n
		bestCaseBubbleSort(A);
		System.out.println(Arrays.toString(A));
		
	}

}
