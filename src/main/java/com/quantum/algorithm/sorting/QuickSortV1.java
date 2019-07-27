/**
 * 
 */
package com.quantum.algorithm.sorting;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author bairagi 27-Jul-2019 5:58:14 PM QuickSortV1.java
 *
 */
//This code alway took O(nlogn) time and logn space complixity at all senario


public class QuickSortV1 {
	
	public static void swap(int arr[],int i,int j){

		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
	}

	
	
	  public static int partition(int a[]){
		  
		 int r=a.length>>1;
		  swap(a,r,a.length-1);
		  	
		  int i=0,j=a.length-2;
		  
		  for(;i<j;){
			  while(i<j && a[i]<a[a.length-1])
				   i++;
			  while(i<j & a[j]>a[a.length-1])
				  j--;
			  if(i<j)
			  swap(a,i,j);
			  
		  }
		  swap(a,j,a.length-1);
		  return j; 
	  }
	  
	 public static int [] quickSort(int a[]){
		  if(a.length<=1)
			  return a;
		  if(a.length==2) {
			  if(a[0]> a[1])
				  swap(a,0,1);
			  return a;
		  }
		  
		  int pivot=partition(a);
		  int left[]=Arrays.copyOfRange(a,0,pivot);
		  int right[]=Arrays.copyOfRange(a, pivot+1, a.length);
		  left=quickSort(left);
		  right=quickSort(right);
		  System.arraycopy(left,0, a, 0,left.length);
		  System.arraycopy(right,0, a, pivot+1,right.length);
		  return a;
		  
		       
		 
	 }
	  
	  public static void main(String[] args) {
		  int arr[]={6,2,3,7,5,9,1,10,8,4};
      	System.out.println(Arrays.toString(quickSort(arr)));
	}

}
