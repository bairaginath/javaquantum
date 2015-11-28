package com.quantum.algorithm.sorting;

import java.util.Arrays;

public class MergeSort {

	private static void swap(int A[],int x,int y){
		int temp=A[x];
		A[x]=A[y];
		A[y]=temp;
		
	}
	

	 
	/* Function to merge the two haves arr[l..m] and arr[m+1..r] of array arr[] */
	private static void merge(int arr[], int l, int m, int r)
	{
	    int i, j, k;
	    int n1 = m - l + 1;
	    int n2 =  r - m;
	 
	    /* create temp arrays */
	    int L[]=new int[n1];
	    int  R[]=new int[n2];
	 
	    /* Copy data to temp arrays L[] and R[] */
	    for (i = 0; i < n1; i++)
	        L[i] = arr[l + i];
	    for (j = 0; j < n2; j++)
	        R[j] = arr[m + 1+ j];
	 
	    /* Merge the temp arrays back into arr[l..r]*/
	    i = 0;
	    j = 0;
	    k = l;
	    while (i < n1 && j < n2)
	    {
	        if (L[i] <= R[j])
	        {
	            arr[k] = L[i];
	            i++;
	        }
	        else
	        {
	            arr[k] = R[j];
	            j++;
	        }
	        k++;
	    }
	 
	    /* Copy the remaining elements of L[], if there are any */
	    while (i < n1)
	    {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }
	 
	    /* Copy the remaining elements of R[], if there are any */
	    while (j < n2)
	    {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }
	}
	
	private static void mergeSort(int A[],int start,int end){
		
		
		
		if(start<end){
		   int mid=(start+end)>>1;
		   mergeSort(A,start,mid);
		   mergeSort(A,mid+1,end);
		   merge(A,start,mid,end);
		}
		
		
	}
	
	public static void mergeSort(int A[]){
		mergeSort(A,0,A.length-1);
	}
	public static void main(String[] args) {
		int A[]={5,3,7,2,9,6,1,4,10,8,0,11};
		mergeSort(A);
		System.out.println(Arrays.toString(A));
	
	}
}
