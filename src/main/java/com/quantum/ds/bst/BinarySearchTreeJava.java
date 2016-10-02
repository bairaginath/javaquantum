package com.quantum.ds.bst;

import java.util.LinkedList;

public class BinarySearchTreeJava<E> {

	private Node<E> root;

	public Node<E> getRoot() {
		return root;
	}

	public Node<E> insert(Node<E> root,E value) {
      if(root==null){
    	  return null;
      }
      if(root.compareTo(value)>0){
    	  if(root.left!=null){
    		 return insert(root.left,value);
    	  }
    	  else{
    		  root.left=new Node<E>(value,null,null);
    		  return root.left;
    	  }
      }
      else{
    	  if(root.right!=null){
    		 return insert(root.right,value);
    	  }
    	  else{
    		  root.right=new Node<E>(value,null,null);
    		  return root.right;
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
		
		Node(){
			
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

	public Node<E> add(E value) {
		if(root==null){
			root=new Node<E>(value,null,null);
			return root;
		}
		return insert(root,value);
	}

	public static void main(String[] args) {
		BinarySearchTreeJava<Integer> btj = new BinarySearchTreeJava<Integer>();
		System.out.println(btj.add(4).data);
		System.out.println(btj.add(2).data);
		System.out.println(btj.add(6).data);
		System.out.println(btj.add(1).data);
		System.out.println(btj.add(3).data);
		System.out.println(btj.add(5).data);
		System.out.println(btj.add(7).data);
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
