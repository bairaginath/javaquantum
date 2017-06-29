package com.quantum.ds.trie;

import java.util.Arrays;

public class Trie {
	
	
	static class Node{
		char data;
		Node[] childern;
		boolean isLeaf;
		Node(char data){
			this.data=data;
			this.childern=new Node[26];
		}
		
		@Override
		public String toString() {
			
			return ""+this.data+"";
		}
		
	}
	
	static Node createRoot(){
		return new Node('^');
	}
	
	static int getIndex(char data){
		return Character.toLowerCase(data)-97;
	}

	static Node  insertNode(Node root,char data){
		int index=getIndex(data);
		if(root.childern[index]==null)
			root.childern[index]=new Node(data);
		return root.childern[index];
	}
	
	static void insert(Node root,String key){
		Node temp=root;
		for(int i=0;i<key.length();i++){
			temp=insertNode(temp,key.charAt(i));
		}
		temp.isLeaf=true;
	}
	
	static boolean searchKey(Node root,String key){
		Node temp=root;
		for(int i=0;i<key.length();i++){			
			temp=temp.childern[getIndex(key.charAt(i))];			
			if(temp==null)
				return false;
		}		
		return temp.isLeaf==true?true:false;
	}
	
	
	public static void main(String[] args) {
		
		Node root=createRoot();
		String keys[]= {"the", "a", "there", "answer", "any","by", "bye", "their"};
		for(String key:keys)
			insert(root,key);	
	System.out.println(searchKey(root,"The"));
	System.out.println(searchKey(root,"these"));
	System.out.println(searchKey(root,"Their"));
	System.out.println(searchKey(root,"Thaw"));
	
	
	
	}
}
