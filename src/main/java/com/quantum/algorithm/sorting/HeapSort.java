package com.quantum.algorithm.sorting;

import java.util.*;
import java.lang.*;


public class HeapSort
{
	public static void swap(int arr[],int i,int j){

		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
	}

	public static void maxHeapify(int arr[],int length){
        for(int i=length>>1;i>=0;i--){
            int root=i;
            int left=2*root+1;
            int right=2*root+2;
           int large=root;
          if(left<length && arr[left]> arr[large])
          	   large=left;
          if(right<length && arr[right]> arr[large])
          	   large=right;
          if(large!=root)
          	 swap(arr,root,large);


        }
    }

       static  int [] sortByIncreseOrder(int arr[]){
        	for(int i=0;i<arr.length-1;i++){
        	maxHeapify(arr,arr.length-i);
        	//System.out.println(Arrays.toString(arr));
        	swap(arr,0,arr.length-i-1);
            
        	        }
        	return arr;
        }

  	public static void minHeapify(int arr[],int length){
        for(int i=length>>1;i>=0;i--){
            int root=i;
            int left=2*root+1;
            int right=2*root+2;
           int small=root;
          if(left<length && arr[left]< arr[small])
          	   small=left;
          if(right<length && arr[right]< arr[small])
          	   small=right;
          if(small!=root)
          	 swap(arr,root,small);


        }
    }

       static  int [] sortByDecreseOrder(int arr[]){
        	for(int i=0;i<arr.length-1;i++){
        	minHeapify(arr,arr.length-i);
        	//System.out.println(Arrays.toString(arr));
        	swap(arr,0,arr.length-i-1);
            
        	        }
        	return arr;
        }


        public static void main(String args [])
        {
        	int arr[]={6,2,3,7,5,9,1,8,4};
        	int arr1 []=arr;
        	System.out.println(Arrays.toString(sortByIncreseOrder(arr)));
            System.out.println(Arrays.toString(sortByDecreseOrder(arr1)));
        	
        }

	}
	
