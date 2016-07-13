package com.quantum.ds.heap;

import java.util.Arrays;

public class PriorityQueue {
	 int heapArray[]=null;
	 
	  public PriorityQueue(int heapArray[]){
		  MaxHeapArray.buildMaxHeap(heapArray);
		  this.heapArray=heapArray;
	  }

	public int heapMaximum() {
		return heapArray[0];
	}
	
	
	
	public int heapExtractMax(){
		if(heapArray.length==0){
		  throw new RuntimeException("No elements on heap");	
		}
		int max=heapArray[0];
		heapArray[0]=heapArray[heapArray.length-1];
		heapArray=Arrays.copyOf(heapArray,heapArray.length-1);
		MaxHeapArray.maxHeapify(heapArray,0);
		return max;
	}
	
	public void heapIncreaseKey(int index,int key){
		
		if(key<heapArray[index]){
			throw new RuntimeException("new key is smaller then current key");
		}
		heapArray[index]=key;
		while(index > 0 && heapArray[MaxHeapArray.parent(heapArray,index)]< heapArray[index]){
			MaxHeapArray.swap(heapArray,MaxHeapArray.parent(heapArray,index),index);
			index=MaxHeapArray.parent(heapArray,index);
		}
		
	}
	
	public void maxHeapInsert(int key){
		int newHeapArray[]=new int[heapArray.length+1];
		newHeapArray=Arrays.copyOf(heapArray,heapArray.length);
		heapArray=newHeapArray;
		heapArray[heapArray.length-1]=Integer.MIN_VALUE;
		heapIncreaseKey(heapArray.length-1,key);
		
		
	}
	
	public static void main(String[] args) {
		int heapArray[]=new int[]{1,2,3,4,6,7};
		PriorityQueue pq=new PriorityQueue(heapArray);
		System.out.println(Arrays.toString(pq.heapArray));
		pq.heapExtractMax();
		System.out.println(Arrays.toString(pq.heapArray));
		pq.maxHeapInsert(5);
	    System.out.println(Arrays.toString(pq.heapArray));
		
	}
}




