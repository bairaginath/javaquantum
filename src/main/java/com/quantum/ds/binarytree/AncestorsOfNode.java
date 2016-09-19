package com.quantum.ds.binarytree;

//for better solution please visit www.geeksforgeeks.org/print-ancestors-of-a-given-node-in-binary-tree/

import java.util.Stack;

import com.quantum.ds.binarytree.BinaryTreeJava.Node;

public class AncestorsOfNode {
	
	public static void ancestorOfNode(Node node,int value,Stack<Integer> stack){
		if(node==null)
			return;
		stack.push(node.data);
		if((node.left!=null &&node.left.data==value) ||(node.right!=null && node.right.data==value))
		{
			System.out.println(stack.toString());
			return;
		}
		ancestorOfNode(node.left, value,stack);
		ancestorOfNode(node.right, value,stack);
		stack.pop();
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
		btj.add(0);
		btj.add(8);
		btj.add(9);
		ancestorOfNode(btj.getRoot(),9,new Stack<Integer>());
	}

}
