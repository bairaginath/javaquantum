package com.quantum.ds.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeJava {
	
	private Node root;
	
	public Node getRoot() {
		return root;
	}
	
	void insertUtils(int value, Queue<Node> queue) {
		Node node = queue.poll();
		if(node==null){
			return;
		}
		if (node.left == null) {
			node.left = new Node(value, null, null);
			return;
		} else if (node.right == null) {
			node.right = new Node(value, null, null);
			return;
		} else {
			queue.add(node.left);
			queue.add(node.right);
			insertUtils(value, queue);
		}
	}

	
	void insert(int value) {
		Queue<Node> queue=new LinkedList<Node>();
		if(root==null){
			root=new Node(value,null,null);
			return;
		}
		queue.add(root);
		insertUtils(value,queue);
	}

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

	

	}

	private  void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public void inorder(){
		inorder(root);
	}
	
	
	public  boolean add(int value){
		insert(value);
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("inside main method");
		BinaryTreeJava btj=new BinaryTreeJava();
		btj.add(4);
		btj.add(2);
		btj.add(6);
		btj.add(1);
		btj.add(3);
		btj.add(5);
		btj.add(7);
		btj.inorder();
}
}
