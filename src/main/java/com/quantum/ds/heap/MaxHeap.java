package com.quantum.ds.heap;

import java.util.ArrayList;

public class MaxHeap {
	
	ArrayList<Integer> heapArray;
	public MaxHeap(){
		heapArray=new ArrayList<Integer>();
	}
	private void swap(int x,int y){
		int temp=heapArray.get(x);
		heapArray.set(x,heapArray.get(y));
		heapArray.set(y,temp);
		
	}
	private void heapify(){
		int i=heapArray.size()-1;
		int root;
		while(i>0){
			if(i%2==0)
				{root=(i-2)>>1;}
			else
				{root=(i-1)>>1;}
		if(heapArray.get(root)<heapArray.get(i))
		{
					swap(root,i);					
		}
		i=root;
		
		}
	
		
	   
	}
	
	public void insertHeap(int data){
		heapArray.add(data);
		heapify();		
	}
	public int getMaximum(){
		return heapArray.get(0);
	}
	
	public static void main(String[] args) throws Exception {
		MaxHeap mh=new MaxHeap();
		mh.insertHeap(2);
     	mh.insertHeap(3);
		mh.insertHeap(1);
		mh.insertHeap(7);
		System.out.println(mh.getMaximum());
	}
	
}
