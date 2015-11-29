/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.ds.bst;

import java.util.Arrays;

/**
 *
 * @author BAIRAGI
 */
public class BinarySearch {
    
    <T extends Comparable<T>>  boolean binarySearchIndex( T A[],T element,int low,int high){
        
        if(low==high-1 && A[low].compareTo(element)!=0)
        return false;

        int mid=(low+high)>>>1;
        //System.out.println(mid);
        if(A[mid].compareTo(element)==0)
        {   return true; }
        else if(A[mid].compareTo(element)>0)
        {
           return binarySearchIndex(A,element,low,mid); 
        }
        else if(A[mid].compareTo(element)<0)
        {   return binarySearchIndex(A, element,mid, high); }
        
        return false;
    }
    
    
  <T extends Comparable<T>>  boolean binarySearch( T A[],T element){      

      return binarySearchIndex(A, element,0,A.length);
    }
  
    public static void main(String[] args) {
        
        Integer A[]={1,2,3,4,5,6,7};
        System.out.println(new BinarySearch().binarySearch(A,6));
    }
    
}
