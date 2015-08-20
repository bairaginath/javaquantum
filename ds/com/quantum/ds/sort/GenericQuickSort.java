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
public class GenericQuickSort {
    
     <T extends Comparable<T>>T[] genericQuickSort(T A[]){
          int length=A.length;
          if(length<=1)
              return A;
          int pivot=(int)Math.floor(Math.random()*length);
          List<T> left=new ArrayList<T>();
          List<T> right=new ArrayList<T>();
          for(int index=0;index<A.length;index++)
          {
              if(pivot!=index){
                  if(A[pivot].compareTo(A[index])>=0)
                      left.add(A[index]);  
                  else
                      right.add(A[index]);
              
              }
          }
          
          T left1[]=(T[])Arrays.copyOfRange(A,0,left.size());
          T right1[]=(T[])Arrays.copyOfRange(A,0,right.size());
          left1=genericQuickSort(left.toArray(left1));
          right1=genericQuickSort(right.toArray(right1));
          
          return merge(left1,A[pivot],right1);
      }
      
      <T extends Comparable<T>> T[] merge(T[]  left,T   pivot,T[]   right){
          int  counter=left.length;
          left=Arrays.copyOf(left,left.length+right.length+1);
          left[counter]=pivot;
          for(int i=0;i<right.length;i++)
              left[++counter]=right[i];          
         
          return left;
      }
      
      public static void main(String[] args) {
        
          Integer a[]={6,2,9,5,1,8,4,0,3,7};
          GenericQuickSort ms=new GenericQuickSort();
         Integer b[]= ms.genericQuickSort(a);
         
         for(int x:b)
          System.out.println(x);
         
         String name[]={"kuna","rabi","mrutu","zobra","bairagi","amit","tapan"};
         String sortname[]=ms.genericQuickSort(name);
         for(String x:sortname){
             System.out.println(x);
         }
    }
    
}
