package com.quantum.ds.sort;

import java.util.Arrays;

class MergeSort
{
    
      int[] mergeSort(int A[]){
          int length=A.length;
          if(length<=1)
              return A;
          int mid=(int)Math.ceil(length/2);
          
          int left[]=Arrays.copyOfRange(A,0, mid);
          int right[]=Arrays.copyOfRange(A,mid,length);
          //System.out.println(right[4]);
          left=mergeSort(left);
          right=mergeSort(right);
          
          return merge(left,right);
      }
      
      int[] merge(int left[],int right[]){
          int temp[]=new int[left.length+right.length];
          int counter=-1;
          for(int i=0,j=0;i<left.length || j<right.length;)
          {
              if(left[i]>right[j]){
                  temp[++counter]=right[j];
                  j++;
              }else
              {
                  temp[++counter]=left[i];
                  i++;
              }
              if(i>=left.length){
                  while(j<right.length)
                      temp[++counter]=right[j++];
              }
              if(j>=right.length){
                  while(i<left.length)
                      temp[++counter]=left[i++];
              }
          }
          return temp;
      }
      
      public static void main(String[] args) {
        
          int a[]={6,2,9,5,1,8,4,0,3,7};
          MergeSort ms=new MergeSort();
         int b[]= ms.mergeSort(a);
         
         for(int x:b)
          System.out.println(x);
    }
}