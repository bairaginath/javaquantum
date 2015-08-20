package com.quantum.ds.sort;

import java.util.Arrays;

class GenericMergeSort
{
    
     <T extends Comparable<T>> T[] genericMergeSort(T A[]){
          int length=A.length;
          if(length<=1)
              return A;
          int mid=(int)Math.ceil(length/2);
          
          T left[]=Arrays.copyOfRange(A,0, mid);
          T right[]=Arrays.copyOfRange(A,mid,length);
          //System.out.println(right[4]);
          left=genericMergeSort(left);
          right=genericMergeSort(right);
          
          return merge(left,right);
      }
      
      <T extends Comparable<T>> T[] merge(T left[],T right[]){
          T temp[]=Arrays.copyOf(left,left.length+right.length);
          int counter=-1;
          for(int i=0,j=0;i<left.length || j<right.length;)
          {
              if(left[i].compareTo(right[j])>=0){
                  temp[++counter]=right[j];
                  j++;
              }
              else
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
        
          Integer a[]={6,2,9,5,1,8,4,0,3,7};
          GenericMergeSort ms=new GenericMergeSort();
         Integer b[]= ms.genericMergeSort(a);
         
         for(int x:b)
          System.out.println(x);
         
         String name[]={"kuna","rabi","mrutu","zobra","bairagi","amit","tapan"};
         String sortname[]=ms.genericMergeSort(name);
         for(String x:sortname)
             System.out.println(x);

    }
}