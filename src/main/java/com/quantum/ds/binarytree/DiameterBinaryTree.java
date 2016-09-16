package com.quantum.ds.binarytree;


//Optimized implementation: http://www.geeksforgeeks.org/diameter-of-a-binary-tree/

import com.quantum.ds.binarytree.BinaryTreeJava.Node;

public class DiameterBinaryTree {
	
	public static int heightBinaryTree(Node node){
		if(node==null){
			return -1;
		}
		int leftHeight=1+heightBinaryTree(node.left);
		int rightHeight=1+heightBinaryTree(node.right);
		return leftHeight>=rightHeight?leftHeight:rightHeight;
	}
	

	
	public static int diameterBinaryTree(Node node){
		
		if(node==null){
			return -1;
		}
		int leftHeight=1+heightBinaryTree(node.left);
		int rightHeight=1+heightBinaryTree(node.right);
		int nodeDiameter=1+leftHeight+rightHeight;
		int max=Math.max(diameterBinaryTree(node.left),diameterBinaryTree(node.right));
		return nodeDiameter>=max?nodeDiameter:max;
	}
	
	public static void main(String[] args) {
		BinaryTreeJava btj=new BinaryTreeJava();
		btj.add(4);
		btj.add(2);
		btj.add(6);
		btj.add(1);
		btj.add(3);
		btj.add(5);
		btj.add(7);
		Node root=btj.getRoot();
		System.out.println(heightBinaryTree(root));
		System.out.println(diameterBinaryTree(root));
		
		
		//testing
		Node one=new Node(1,null,null);
		Node two=new Node(2,null,null);
		Node three=new Node(3,null,null);
		Node four=new Node(4,null,null);
		Node five=new Node(5,null,null);
		Node six=new Node(6,null,null);
		Node seven=new Node(7,null,null);
		Node eight=new Node(8,null,null);
		Node nine=new Node(9,null,null);
		one.left=two;
		one.right=three;
		two.left=four;
		two.right=five;
		four.right=six;
		six.left=eight;
		five.left=seven;
		seven.right=nine;
		System.out.println(diameterBinaryTree(one));
	}

}
