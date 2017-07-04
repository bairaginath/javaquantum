package com.quantum.ds.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrieSuffixes {
	
	static class Node{
		char data;
		Node[] children;
		List<Integer> indexes;
		Node(char data){
			this.data=data;
			this.children=new Node[26];
			indexes=new ArrayList<>();
		}
		@Override
		public String toString() {
			return ""+this.data+"";
		}
	}
	
	static int getIndex(char data){
		return Character.toLowerCase(data)-97;
	}
	
	static void insert(Node node,String text,int startIndex,int endIndex){
		
		if(endIndex>=text.length())
			return;
		int position=getIndex(text.charAt(endIndex));
		node.children[position]=node.children[position]==null?new Node(text.charAt(endIndex)):node.children[position];
		node.children[position].indexes.add(startIndex);
		insert(node.children[position],text,startIndex,endIndex+1);
		
	}
	
	static void createTrieSuffixes(Node root,String text){
		
		
		for(int i=0;i<text.length();i++){
			insert(root,text,i,i);
		}
	}
	
	static String searchPattern(Node root,String pattern){
		Node temp=root;
		for(int i=0;i<pattern.length();i++){
			int index=getIndex(pattern.charAt(i));
			temp=temp.children[index];
			if(temp==null)
				return "pattern is not present";
		}
		
		return "pattern is present at "+Arrays.deepToString(temp.indexes.toArray());
		
	}
	
	public static void main(String[] args) {
		Node root=new Node('^');
		createTrieSuffixes(root,"geeksforgeeks");
		System.out.println(Arrays.deepToString(root.children));
		System.out.println(searchPattern(root,"g"));
		
	}
	
	
	

}
