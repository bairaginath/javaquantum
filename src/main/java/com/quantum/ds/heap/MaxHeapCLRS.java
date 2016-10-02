package com.quantum.ds.heap;

import java.util.Arrays;

public class MaxHeapCLRS {
	
	public static void swap(int A[],int x,int y){
		int temp=A[x];
		A[x]=A[y];
		A[y]=temp;		
	}
	
	public static Integer parent(int A[],int i){
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
  

  
  public static int[] heapSort(int A[]){
	  int output[]=new int[A.length];
	  int count=0;
	  buildMaxHeap(A);	 //O(n) 
	  for(int i=A.length-1;i>1;i--){ //O(n*logn)
		  swap(A,0,i);
		  output[count++]=A[A.length-1];
		  A=Arrays.copyOf(A,i);
		  maxHeapify(A,0);		 
	  }
	  output[count++]=A[0];
	  output[count]=A[1];
	  return output; 
  }
  
  public static void main(String[] args) {
   int A[]={5,3,7,2,9,6,1,4,10,8,0,11};
   buildMaxHeap(A);
   System.out.println(Arrays.toString(A));
   int B[]={5,3,7,2,9,6,1,4,10,8,0,11,12};	
   heapSort(B);
   System.out.println(Arrays.toString(heapSort(B)));
}

}
