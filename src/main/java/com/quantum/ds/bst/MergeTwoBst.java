package com.quantum.ds.bst;

//for better solution please visit to www.geeksforgeeks.org/merge-two-balanced-binary-search-trees/

import java.util.Stack;

import com.quantum.ds.bst.BinarySearchTreeJava.Node;

public class MergeTwoBst {
	
	
	   public static Node<Integer> mergeTwoBst(Node<Integer> node1,Node<Integer>node2){
		   Node<Integer> current1=node1;
		   Node<Integer> current2=node2;
		   Stack<Node<Integer>> stack1=new Stack<>();
		   Stack<Node<Integer>> stack2=new Stack<>();
		   boolean first1=false;
		   boolean first2=false;
		   Node<Integer> current3=null;
		   Node<Integer> temp=null;
		   boolean breakFlag=true;
		   while(current1!=null || current2!=null){
			   while(current1!=null && !first1 && current1.left!=null)
			   {
				   stack1.push(current1);
				   current1=current1.left;
			   }
			   while(current2!=null && !first2 && current2.left!=null)
			   {
				   stack2.push(current2);
				   current2=current2.left;
			   }
			   System.out.println((current1==null?"null":current1.data)+"  "+(current2==null?"null":current2.data));
			   if(current1.right!=null){
				   current1=current1.right; 
			   }else{
				   current1=!stack1.isEmpty()?stack1.pop():null;
				   first1=true;
			   }
			   if(current2.right!=null){
				   current2=current2.right;
			   }else{
				   current2=!stack2.isEmpty()?stack2.pop():null;
//				   current2=!stack2.isEmpty()?stack2.pop():current1==null?null:current2;
				   first2=true;
			   }
			   
		   }
		   return current3;
	   }
	   
	   public static void inorder(Node<Integer> node){
		   if(node==null)
			   return;
		   inorder(node.left);
		   System.out.println(node.data);
		   inorder(node.right);
		      
	   }
	
	public static void main(String[] args) {
		BinarySearchTreeJava<Integer> bst1=new BinarySearchTreeJava<>();
		bst1.add(4);
		bst1.add(1);
		bst1.add(6);
      	//bst1.add(0);
		BinarySearchTreeJava<Integer> bst2=new BinarySearchTreeJava<>();
		bst2.add(3);
		bst2.add(2);
		bst2.add(5);
		bst2.add(0);
		Node<Integer> mergeRoot=mergeTwoBst(bst1.getRoot(), bst2.getRoot());
		//System.out.println("inorder of new bst "+mergeRoot.data);
		//inorder(mergeRoot);
		//bst1.inorder();
	}

}
