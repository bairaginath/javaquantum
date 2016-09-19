package com.quantum.ds.bst;

import java.util.LinkedList;

public class BinarySearchTreeJava<E> {

	private Node<E> root;

	public Node<E> getRoot() {
		return root;
	}

	public void insert(Node<E> root,E value) {
      if(root==null){
    	  return;
      }
      if(root.compareTo(value)>0){
    	  if(root.left!=null){
    		  insert(root.left,value);
    	  }
    	  else{
    		  root.left=new Node<E>(value,null,null);
    		  return;
    	  }
      }
      else{
    	  if(root.right!=null){
    		  insert(root.right,value);
    	  }
    	  else{
    		  root.right=new Node<E>(value,null,null);
    		  return;
    	  }
      }
	}

	static class Node<E> implements Comparable<E> {
		E data;
		Node<E> left;
		Node<E> right;

		Node(E data, Node<E> left, Node<E> right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

		@Override
		public int compareTo(E o) {
			return ((Comparable)this.data).compareTo(o);
		}
	}

	private void inorder(Node<E> root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public void inorder() {
		inorder(root);
		System.out.println();
	}

	public boolean add(E value) {
		if(root==null){
			root=new Node<E>(value,null,null);
			return true;
		}
		insert(root,value);
		return true;
	}

	public static void main(String[] args) {
		BinarySearchTreeJava<Integer> btj = new BinarySearchTreeJava<Integer>();
		btj.add(4);
		btj.add(2);
		btj.add(6);
		btj.add(1);
		btj.add(3);
		btj.add(5);
		btj.add(7);
		btj.inorder();
		BinarySearchTreeJava<Double> btj1 = new BinarySearchTreeJava<Double>();
		btj1.add(4.0);
		btj1.add(2.0);
		btj1.add(6.0);
		btj1.add(1.0);
		btj1.add(3.0);
		btj1.add(5.0);
		btj1.add(7.0);
		btj1.inorder();
		
	}


}
