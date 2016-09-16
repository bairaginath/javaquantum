package com.quantum.ds.binarytree;

import java.util.Stack;

import com.quantum.ds.binarytree.BinaryTreeJava.Node;

public class InorderWithoutRecursion {

	
	public static void inorderWithoutRecursion(Node root){
		Stack<Node> stack=new Stack<>();
		stack.push(null);
		Node temp=root;
		boolean leftVisit=false;
	    do{
	    	while(temp.left!=null && !leftVisit){
	    		stack.push(temp);
	    		temp=temp.left;
	    	}
	    	System.out.println(temp.data);
	    	if(temp.right!=null){
	    		temp=temp.right;
	    		leftVisit=false;
	    		continue;
	    		
	    	}
        temp=stack.pop();
        leftVisit=true;
	    }while(!stack.isEmpty());
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
		inorderWithoutRecursion(root);
		
	}

}
