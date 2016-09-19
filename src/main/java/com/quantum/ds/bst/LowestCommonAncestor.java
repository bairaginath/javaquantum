package com.quantum.ds.bst;

import com.quantum.ds.bst.BinarySearchTreeJava.Node;

public class LowestCommonAncestor {
	
	public static boolean search(Node<Integer> root,int item){
		if(root==null){
			return false;
		}
		if(root.data==item){
			return true;
		}
		if(root.data>item)
			return search(root.left,item);
		else
			return search(root.right,item);
	}
	
	
	public static boolean lowestCommonAncestor(Node<Integer> node,int item1,int item2){
		
		if(node==null){
			return false;
		}
		if((item1<node.data && item2>node.data && search(node.left,item1)&&search(node.right,item2))||(item1>node.data && item2<node.data)&& search(node.right,item1)&&search(node.left,item2)){
			System.out.println(node.data);
			return true;
		}
		else if(item1<node.data && item2<node.data && lowestCommonAncestor(node.left, item1, item2)){
			System.out.println(node.data);
			return true;
		}
		else if(item1>node.data && item2>node.data && lowestCommonAncestor(node.right, item1, item2)){
			System.out.println(node.data);
			return true;
		}else if(item1==node.data && item1<item2 && search(node.right,item2)){
			return true;
		}
		else if (item2==node.data && item2<item1 && search(node.right,item1))
			return true;
		else if(item1==item2 && (item1==node.data)){
			return true;
		}
		else{
			return false;
		}

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
		lowestCommonAncestor(btj.getRoot(),2,0);
		System.out.println(search(btj.getRoot(),0));
	}

}
