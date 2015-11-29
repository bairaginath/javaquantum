package com.quantum.ds.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayToBT {
	
	public static BinaryTree convertArrayToBinaryTree(int A[]){
//		LinkedList<BinaryTree> queue=new LinkedList<BinaryTree>(); // it does not maintaining insertion order
		ArrayList<BinaryTree> queue=new ArrayList<BinaryTree>(); //it maintaining insertion order
		if(A.length==0)
			return null;
		queue.add(new BinaryTree(A[0]));
		for(int i=1;i<A.length;i++){
			  int rootIndex=(i-1)>>1;		      
			  BinaryTree root=queue.get(rootIndex);			  
			  BinaryTree newNode=new BinaryTree(A[i]);
			  if(i%2==1){				  
				  root.setLeft(newNode);				  
			  }else {
				  root.setRight(newNode);
				  
			}
			  queue.add(newNode);
			
		}
      return queue.get(0); 
	}
	
	public static void main(String[] args) {
		int A[]={0,1,2,3,4,5,6,7,8,9};
		BinaryTree root=convertArrayToBinaryTree(A);
		System.out.println(root.getLeft().data+"   "+root.getRight().data);
	}

}

