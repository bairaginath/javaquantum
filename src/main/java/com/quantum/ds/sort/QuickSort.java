/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.ds.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author BAIRAGI
 */
public class QuickSort {
    
     int[] quickSort(int A[]){
          int length=A.length;
          if(length<=1)
              return A;
          int pivot=(int)Math.floor(Math.random()*length);
          List<Integer> temp1=new ArrayList<Integer>();
          List<Integer> temp2=new ArrayList<Integer>();
          for(int index=0;index<A.length;index++)
          {
              if(pivot!=index){
                  if(A[pivot]>=A[index])
                      temp1.add(A[index]);  
                  else
                      temp2.add(A[index]);
              
              }
          }
          int left[]=new int[temp1.size()];
          int right[]=new int[temp2.size()];
          int leftCounter=-1,rightCounter=-1;
          for(Integer I:temp1)
              left[++leftCounter]=I.intValue();
          for(Integer I:temp2)
              right[++rightCounter]=I.intValue();
              
          //int right[]=Arrays.copyOfRange(A, pivot+1,length);
          left=quickSort(left);
          right=quickSort(right);
          
          return merge(left,A[pivot],right);
      }
      
      int[] merge(int left[],int pivot,int right[]){
          int counter=left.length;
          left=Arrays.copyOf(left,left.length+right.length+1);
          left[counter]=pivot;
          for(int i=0;i<right.length;i++)
              left[++counter]=right[i];          
         
          return left;
      }
      
      public static void main(String[] args) {
        
          int a[]={6,2,9,5,1,8,4,0,3,7};
          QuickSort ms=new QuickSort();
         int b[]= ms.quickSort(a);
         
         for(int x:b)
          System.out.println(x);
    }
    
}
