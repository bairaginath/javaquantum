package com.quantum.ds.trie;

public class PhoneDirectorySearch {
	
	
	static class Node{
		
		char data;
		Node children[];
		boolean isLeaf;
		Node(char data){
			this.data=data;
			this.children=new Node[10];
		}
		
		@Override
		public String toString() {
			return ""+this.data+"";
		}
	}
	
	public static void insert(Node root,String phoneNumber){
		Node temp=root;
		for(int i=0;i<phoneNumber.length();i++){
			int number=Character.getNumericValue(phoneNumber.charAt(i));
			temp.children[number]=temp.children[number]==null?new Node(phoneNumber.charAt(i)):temp.children[number];
			temp=temp.children[number];
		}
		temp.isLeaf=true;
	}
	
	public static void printAllNumbers(String prefix,String suffix,Node node){
		
		if( node==null || node.isLeaf==true)
		{	
			System.out.println(prefix+suffix);
		    return;
		}
		for(int i=0;i<node.children.length;i++){
			if(node.children[i]!=null)
			{	
				printAllNumbers(prefix,suffix+node.children[i].data,node.children[i]);
			}
		}
	}
	
	public static void search(Node root,String prefix){
		Node temp=root;
		for(int i=0;i<prefix.length();i++){
			int number=Character.getNumericValue(prefix.charAt(i));
			temp=temp.children[number];
			if(temp==null){
				System.out.println("number is not preseent");
			    return;
			}
		}
		System.out.println("=================");
		printAllNumbers(prefix,"",temp);
		System.out.println("=================");
		
	}
	
	public static void main(String[] args) {
		
		Node root=new Node('0');
		insert(root,"8867887364");
		insert(root,"8867887394");
		insert(root,"8867564334");
		search(root,"8867");
		search(root,"88679");
		search(root,"88675");
		
		
	}

}
