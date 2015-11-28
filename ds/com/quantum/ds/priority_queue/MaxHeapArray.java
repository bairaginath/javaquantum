package com.quantum.ds.priority_queue;

import java.util.Arrays;

public class MaxHeapArray {
	
	private static void swap(int A[],int x,int y){
		int temp=A[x];
		A[x]=A[y];
		A[y]=temp;
		
	}
	
	

	  
	  

  public static void maxHeapify(int A[],int i){
	  int left=2*i+1;
	  int right=2*i+2;
	  if(left<=0 || right <=0 )
		  return ;
	  System.out.println("left "+left+" right "+right);
	  int largest;
	  if (left<A.length && A[left]>A[right]){
		   largest=left;
	  }
	  else {
		  largest=i;
	  }
	  if (right<A.length && A[right]< A[largest]){
		  largest=right;
	  }
	  System.out.println(largest);
	  if(largest!=i){
		  swap(A,i,largest);
		  maxHeapify(A,largest);
	  }
  }
  
  
  public static void buildMaxHeap(int A[]){
	  for(int i=(A.length>>1)-1;i>=0;i--){
		  System.out.println("index "+i);
		  maxHeapify(A,i-1);
	  }
  }
  
  public static void main(String[] args) {
	int A[]={5,3,7,2,9,6,1,4,10,8,0,11};
    buildMaxHeap(A);
     System.out.println(Arrays.toString(A));
}

}
