/**
 * 
 */
package com.quantum.algorithm.sorting;

import java.util.Arrays;

import java.util.*;
import java.lang.*;


public class MergeSortV1
{
	public static void swap(int arr[],int i,int j){

		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
	}
  public static int [] merge(int left[],int right[]){
        int m=left.length;
        int n=right.length;
        int temp[]=new int[m+n];
        int i=0,j=0,k=0;
      for( ;i<m && j<n && k<m+n;k++){
          if(left[i]<right[j])
           { temp[k]=left[i];
            i++; 
          }else {
            temp[k]=right[j];
            j++;
          }
      }
            if(i<m){
        for(;i<m && k<m+n;i++,k++){
          temp[k]=left[i];
          }
      }
      if(j<n){
        for(;j<n&& k<m+n;j++,k++){
          temp[k]=right[j];
          }
      }
      
      return temp;
   
  }


	  public static int [] mergeSort(int arr[]){
          if(arr.length<2)
               return arr;
          if(arr.length==2){
            if(arr[0]>arr[1])
                swap(arr,0,1);
            return arr;
          }
        int mid=arr.length>>1;
        int left[]=Arrays.copyOfRange(arr,0,mid);
        int right[]=Arrays.copyOfRange(arr,mid,arr.length);
         left=mergeSort(left);
        right=mergeSort(right);
        return merge(left,right);

    }


        public static void main(String args [])
        {
        	int arr[]={6,2,3,7,5,9,1,8,4};;
        	System.out.println(Arrays.toString(mergeSort(arr)));
           
        }

	}
	
