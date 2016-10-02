package com.quantum.ds.heap;


import java.util.Arrays;

public class MaxHeapV1 {
	
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
	private static Integer root(int A[],int length){
		return parent(A,length);
	}
	private static Integer left(int A[],int length,int i){
		if(2*i+1<length){
			return 2*i+1;
		}
		return null;
	}
   private static Integer right(int A[],int length,int i){
	   if(2*i+2<length){
		   return 2*i+2;
	   }
	   return null;
   }

  public static void maxHeapify(int A[],int length,int i){
	  Integer left=left(A,length,i);
	  Integer right=right(A,length,i);
	  if (left==null && right==null){
		  return;
	  }

	  int largest;
	  if (left!=null && left<length && A[left]>A[i]){
		   largest=left;
	  }
	  else {
		  largest=i;
	  }
	  if (right!=null && right<length && A[right]> A[largest]){
		  largest=right;
	  }
	   if(largest!=i){
		  swap(A,i,largest);
		  maxHeapify(A,length,largest);
	  }
  }
  
  
  public static void buildMaxHeap(int A[]){
	  for(int i=root(A,A.length);i>=0;i--){
		  		  maxHeapify(A,A.length,i);
	  }
  }
  

  
  public static int[] heapSort(int A[]){
	  buildMaxHeap(A);
      for(int i=0;i<A.length;i++){
    	  swap(A,0,A.length-1-i);
    	  maxHeapify(A,A.length-1-i,0);
      }
	  
	  return A;
  }
  
  public static void main(String[] args) {
   int B[]={5,3,7,2,9,6,1,4,10,8,0,11,12};	
   System.out.println(Arrays.toString(heapSort(B)));
}

}

