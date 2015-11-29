package com.quantum.ds.binarytree;

public class CheckForBST {
	
	private static int temp=-9999;
	
	public static boolean checkBST(BinaryTree root){
		
		 if(root==null){
			 return true;
		 }
		 boolean left=checkBST(root.getLeft());
		 if(temp>root.getData()){
			return false; 
		 }
		 temp=root.getData();		
		 boolean right=checkBST(root.getRight());
		
		return left && right;
	}
	
	
	public static void main(String[] args) {
		int A[]={0,1,2,3,4,5,6,7,8,9};
		BinaryTree root=ArrayToBT.convertArrayToBinaryTree(A);
		System.out.println(checkBST(root));
		int B[]={4,2,6,1,3,5,7};
		temp=-9999;
		BinaryTree root1=ArrayToBT.convertArrayToBinaryTree(B);
		System.out.println(checkBST(root1));
		
	}

}
