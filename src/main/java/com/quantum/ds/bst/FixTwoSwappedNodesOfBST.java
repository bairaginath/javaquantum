package com.quantum.ds.bst;

import com.quantum.ds.bst.BinarySearchTreeJava.Node;

//for better solution http://www.geeksforgeeks.org/fix-two-swapped-nodes-of-bst/

public class FixTwoSwappedNodesOfBST {

	public static Node<Integer> prevNode;
	public static Node<Integer> incorrectNode;
	public static boolean firstFlag = false;

	public static void swapValuesOfNode(Node<Integer> node1, Node<Integer> node2) {
		node1.data = node1.data + node2.data;
		node2.data = node1.data - node2.data;
		node1.data = node1.data - node2.data;
	}

	public static void correctOfBST(Node<Integer> node) {
		if (node == null)
			return;
		correctOfBST(node.left);
		int prevData = prevNode == null ? -9999 : prevNode.data;
		if (prevData > node.data) {	
			if (!firstFlag) {
				incorrectNode =prevNode;
				firstFlag = !firstFlag;
			} else {
				System.out.println("incorrect nodes are "+incorrectNode.data + "  " + node.data);
				swapValuesOfNode(incorrectNode, node);
				return;
			}
		}
		prevNode = node;
		correctOfBST(node.right);
	}

	public static void correctOfBST(Node<Integer> node,Node<Integer>prevNode,Node<Integer> firstInCorrectNode,boolean firstFlag) {
		if (node == null)
			return;
		correctOfBST(node.left,prevNode,firstInCorrectNode,firstFlag);
		System.out.println("firstInCorrectNode "+((firstInCorrectNode==null)?"null":firstInCorrectNode.data));
		int prevData = prevNode == null ? -9999 : prevNode.data;
		if (prevData > node.data) {
			if (!firstFlag) {
				firstInCorrectNode = prevNode;
				firstFlag = !firstFlag;
			} else {
				System.out.println(firstInCorrectNode.data + "  " + node.data);
				swapValuesOfNode(firstInCorrectNode,node);
			}
		}
		prevNode = node;
		correctOfBST(node.right,prevNode,firstInCorrectNode,firstFlag);
	}

	public static void main(String[] args) {
		BinarySearchTreeJava<Integer> btj = new BinarySearchTreeJava<Integer>();
		Node<Integer> four = btj.add(4);
		Node<Integer> two = btj.add(2);
		Node<Integer> six = btj.add(6);
		Node<Integer> one = btj.add(1);
		Node<Integer> three = btj.add(3);
		Node<Integer> five = btj.add(5);
		Node<Integer> seven = btj.add(7);
		two.left = five;
		six.left = one;
		btj.inorder();
		correctOfBST(btj.getRoot());
		btj.inorder();
		//correctOfBST(btj.getRoot(),null,null,false);
		//btj.inorder();
		//object reference example as following 
		Node<Integer> x=new Node<Integer>(66,null,null);
		Node<Integer> y=x;
		System.out.println(x.hashCode()+" "+y.hashCode()+" "+x.data+" "+y.data);
		x.data=75;
		System.out.println(x.hashCode()+" "+y.hashCode()+" "+x.data+" "+y.data);
		x=new Node<Integer>(56,null,null);
		System.out.println(x.hashCode()+" "+y.hashCode()+" "+x.data+" "+y.data);
	}

}
