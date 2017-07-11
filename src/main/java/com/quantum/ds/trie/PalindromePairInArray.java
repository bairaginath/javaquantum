package com.quantum.ds.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePairInArray {
	
	
	static class Node {
		int id;
		List<Integer> pos;
		Node children[];
		boolean isLeaf;
		Node(){
			this.children=new Node[26];
			pos=new ArrayList<>();
		}
	}
		
		static int getIndex(char data){
			return Character.toLowerCase(data)-97;
		}
		
		
		static boolean isPalindrome(String str, int i, int len)
		{
		    while (i < len)
		    {
		        if (str.charAt(i) != str.charAt(len))
		            return false;
		        i++ ; len--;
		    }
		 
		    return true;
		}
		
		static void insert(Node root, String key, int id)
		{
		    Node pCrawl = root;
		 
		    for (int level = key.length()-1; level >=0; level--)
		    {
		        int index = getIndex(key.charAt(level));
		        if (pCrawl.children[index]==null)
		            pCrawl.children[index] = new Node();
		        if (isPalindrome(key, 0, level))
		            pCrawl.pos.add(id);
		        pCrawl = pCrawl.children[index];
		    }
		    pCrawl.id = id;
		    pCrawl.pos.add(id);
		    pCrawl.isLeaf = true;
		}
		
		static void search(Node root, String key,
	            int id, List<List<Integer> > result)
	{
	   Node  pCrawl = root;
	    for (int level = 0; level < key.length(); level++)
	    {
	        int index = getIndex(key.charAt(level));

	        if (pCrawl.id >= 0 && pCrawl.id != id &&
	            isPalindrome(key, level, key.length()-1))
	            result.add(Arrays.asList(new Integer[]{id, pCrawl.id}));
	 
	        // If not present then return
	        if (pCrawl.children[index]==null)
	            return;
	 
	        pCrawl = pCrawl.children[index];
	    }
	 
	    for (int i: pCrawl.pos)
	    {
	        if (i == id)
	            continue;
	        result.add(Arrays.asList(new Integer[]{id, i}));
	    }
	}
		
		
		static boolean checkPalindromePair(String[] vect)
		{
		    // Construct trie
		    Node root = new Node();
		    for (int i = 0; i < vect.length; i++)
		        insert(root, vect[i], i);
		 
		    // Search for different keys
		    List<List<Integer> > result=new ArrayList<>();
		    for (int i=0; i<vect.length; i++)
		    {
		        search(root, vect[i], i, result);
		        if (result.size() > 0)
		           return true;
		    }
		 
		    return false;
		}
		
		public static void main(String[] args) {
		   String arr[]={"geekf", "geeks", "or","keeg", "abc", "bc"};
		   System.out.println(checkPalindromePair(arr));
		   
		}
		 
	

}
