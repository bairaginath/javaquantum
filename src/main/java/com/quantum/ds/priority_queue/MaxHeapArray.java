package com.quantum.ds.priority_queue;

import java.util.Arrays;

public class MaxHeapArray {
	
	private static void swap(int A[],int x,int y){
		int temp=A[x];
		A[x]=A[y];
		A[y]=temp;
		
	}
	
	private static Integer parent(int A[],int i){
        if(i==0){
        	return null;
        }
		return i>>1;
	}
	private static Integer root(int A[]){
		return parent(A,A.length);
	}
	private static Integer left(int A[],int i){
		if(2*i+1<A.length){
			return 2*i+1;
		}
		return null;
	}
   private static Integer right(int A[],int i){
	   if(2*i+2<A.length){
		   return 2*i+2;
	   }
	   return null;
   }

  public static void maxHeapify(int A[],int i){
	  Integer left=left(A,i);
	  Integer right=right(A,i);
	  if (left==null && right==null){
		  return;
	  }

	  int largest;
	  if (left!=null && left<A.length && A[left]>A[i]){
		   largest=left;
	  }
	  else {
		  largest=i;
	  }
	  if (right!=null && right<A.length && A[right]> A[largest]){
		  largest=right;
	  }
	   if(largest!=i){
		  swap(A,i,largest);
		  maxHeapify(A,largest);
	  }
  }
  
  
  public static void buildMaxHeap(int A[]){
	  for(int i=root(A);i>=0;i--){
		  		  maxHeapify(A,i);
	  }
  }
  
  public static void main(String[] args) {
	int A[]={5,3,7,2,9,6,1,4,10,8,0,11};
	int B[]={5,3,7,2,9,6,1,4,10,8,0,11,12};
	buildMaxHeap(A);
    System.out.println(Arrays.toString(A));
    buildMaxHeap(B);
    System.out.println(Arrays.toString(B));
}

}
