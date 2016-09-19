package com.quantum.ds.binarytree;

//please visit http://www.geeksforgeeks.org/clone-binary-tree-random-pointers/ for better solution

public class CloneBTwithRandomPointer {
	
	static class Node{
		int data;
		Node left;
		Node right;
		Node random;
		Node(int data){
			this.data=data;
		}
		@Override
		public String toString() {
		    String nodeString="["+this.hashCode()+" "+data+","+((random==null)?"null":random.data)+" "+((random==null)?"null":random.hashCode())+"]";
			return nodeString;
		}
	}
	
	
	public static void restoreTreeLeftNode(Node treeNode, Node cloneNode)
	{
	    if (treeNode == null)
	        return;
	    if (cloneNode.left != null)
	    {
	        Node cloneLeft = cloneNode.left.left;
	        treeNode.left = treeNode.left.left;
	        cloneNode.left = cloneLeft;
	    }
	    else
	        treeNode.left = null;
	 
	    restoreTreeLeftNode(treeNode.left, cloneNode.left);
	    restoreTreeLeftNode(treeNode.right, cloneNode.right);
	}
	
	public static void combineBinaryTree(Node node){
		if(node==null)
			return;
		Node left=node.left;
		Node right=node.right;
		combineBinaryTree(left);
		Node cloneNode=new Node(node.data);
		cloneNode.random=node.random;
		node.left=cloneNode;
//		node.right=null;
		cloneNode.left=left;
		Node rightClone=right==null?null:new Node(right.data);
		cloneNode.right=rightClone;
		//right.left=rightClone;
		combineBinaryTree(right);
		
	}

	public static void inorder(Node root){
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root);
		inorder(root.right);
	}
	public static void clone(Node root){
		combineBinaryTree(root);
		Node cloneRoot=root.left;
		restoreTreeLeftNode(root,cloneRoot);
		System.out.println("original binary tree inorder");
		inorder(root);
		System.out.println("cloned binary tree inorder");
		inorder(cloneRoot);
	}
	public static void main(String[] args) {
		Node one=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		Node five=new Node(5);
		one.left=two;
		one.right=three;
		two.left=four;
		two.right=five;
		one.random=five;
		four.random=one;
		five.random=three;
        clone(one);	
	}

}
