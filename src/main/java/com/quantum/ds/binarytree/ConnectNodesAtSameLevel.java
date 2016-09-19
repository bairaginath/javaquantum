package com.quantum.ds.binarytree;

//please visit method-1 for not complete binary tree. http://www.geeksforgeeks.org/connect-nodes-at-same-level/

public class ConnectNodesAtSameLevel {
	
	static class Node{
		int data;
		Node left;
		Node right;
		Node nextRight;
		Node(int data){
			this.data=data;
		}
	}
	public static void levelOrderNodeJoin(Node node){
		if(node==null)
			return;
		Node leftNode=node.left;
		Node rightNode=node.right;
		if(leftNode==null)return;
		if(rightNode==null)return;
		leftNode.nextRight=rightNode;
		rightNode.nextRight=node.nextRight==null?null:(node.nextRight.left==null)?node.nextRight.right:node.nextRight.left;
		levelOrderNodeJoin(node.left);
		levelOrderNodeJoin(node.right);
	}
	
	public static void levelOrderTravels(Node node){
		Node current=node;
		while(current!=null){
		 Node temp=current;
		 while(temp!=null){
			 System.out.println(temp.data);
			 temp=temp.nextRight;
		 }
		 current=current.left;
		}
	}
	
	
    public static void main(String[] args) {
		Node one=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		Node five=new Node(5);
		Node six=new Node(6);
		Node seven=new Node(7);
		one.left=two;
		one.right=three;
		two.left=four;
		two.right=five;
		three.left=six;
		three.right=seven;
		levelOrderNodeJoin(one);
		levelOrderTravels(one);
	}
}
