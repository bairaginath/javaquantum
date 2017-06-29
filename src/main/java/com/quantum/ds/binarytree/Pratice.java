package com.quantum.ds.binarytree;

public class Pratice {
	
	
	static class Node {
		int data;
		Node left;
		Node right;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	static Node lca(Node node,int n1,int n2){
		if(node==null)
			return null;
		
		if(node.data==n1 || node.data==n2)
			return node;
		
		Node leftNode=lca(node.left,n1,n2);
		Node rightNode=lca(node.right,n1,n2);
		
		if(leftNode!=null && rightNode!=null)
			return  node;
		
		return leftNode!=null?leftNode:rightNode;
	}
	
	
	static void inOrder(Node node){
		if(node==null)
			return;
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
		
	}
	
	static Node inOrderNext(Node node){
		if(node==null)
			return null;
		inOrderNext(node.left);
		System.out.println(node.data);
		return inOrderNext(node.right);
		
	}
	
	
	static int sumTree(Node node){
		if(node==null)
			return 0;
		int oldData=node.data;
		node.data=sumTree(node.left)+sumTree(node.right);
		return oldData+node.data;
		
	}
  
	
	public static void main(String[] args) {
		Node one=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		Node five=new Node(5);
		Node six=new Node(6);
		Node seven=new Node(7);
		four.left=two;
		four.right=six;
		two.left=one;
	    two.right=three;
	    six.left=five;
	    six.right=seven;
	    System.out.println(lca(four,3,5).data);
	    System.out.println(sumTree(four));
	    inOrder(four);
		
		
		
	}
}
