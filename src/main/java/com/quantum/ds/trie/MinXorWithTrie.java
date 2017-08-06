package com.quantum.ds.trie;

public class MinXorWithTrie {
	
	
	public static final int INT_SIZE=32;
	
	static class Node {
		int data;
		Node[] child;
		boolean isLeaf;
		Node(int data){
			this.data=data;
			this.child=new Node[2];
		}
	}
	
	public static int getCurrentBit(int key,int position){
		return (key >> position) & 1;
	}
	
	public static void insert(Node root,int key){
		Node temp=root;
		for(int i=INT_SIZE-1;i>=0;i--){
			int currentBit=getCurrentBit(key,i);
			temp.child[currentBit]=temp.child[currentBit]==null?new Node(currentBit):temp.child[currentBit];
		    temp=temp.child[currentBit];
		}
		temp.data=key;
	}
	
	public static int minXorUtils(Node root,int key){
		Node temp=root;
		for(int i=INT_SIZE-1;i>=0;i--){
			int currentBit=getCurrentBit(key,i);
			if(temp.child[currentBit]!=null)
				temp=temp.child[currentBit];
			else if(temp.child[1-currentBit]!=null)
				temp=temp.child[1-currentBit];
			
		}
		return key^temp.data;
	}
	
	public static void main(String[] args) {
		
		Node root=new Node(8888888);
		//int arr[] = {9, 5, 3};
		int arr[] = {1, 2, 3, 4, 5};
		//int arr[] = {3,3,3,3,3,3};
		insert(root,arr[0]);
		int minXor=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++){
			minXor=Math.min(minXor,minXorUtils(root,arr[i]));
			insert(root,arr[i]);
		}
		System.out.println(minXor);
		
	}
	

}
