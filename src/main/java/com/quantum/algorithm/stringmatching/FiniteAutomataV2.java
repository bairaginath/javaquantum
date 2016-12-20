package com.quantum.algorithm.stringmatching;
//for read more details  got to http://www.geeksforgeeks.org/pattern-searching-set-5-efficient-constructtion-of-finite-automata/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class FiniteAutomataV2 {
	

	public static int[][] computeTransitionFunction(char[] pattern,Map<Character,Integer> mapChar){
		int TF[][]=new int[pattern.length+1][mapChar.size()];
	    int longestPrefixSuffix=0;
	    TF[0][0]=1;
	    // Fill entries in other rows
	    for (int i = 1; i<=pattern.length; i++)
	    {
	    	final int finalI=i;
	    	final int finalLongestPrefixSuffix=longestPrefixSuffix;
	        // Copy values from row at index lps
	    	mapChar.forEach((k,v)-> TF[finalI][v] = TF[finalLongestPrefixSuffix][v]);
	        // Update the entry corresponding to this character
	    	if(i<pattern.length)
	          TF[i][mapChar.get(pattern[i])] = i + 1;
	        // Update lps for next row to be filled
	        if (i < pattern.length)
	          longestPrefixSuffix = TF[longestPrefixSuffix][mapChar.get(pattern[i])];
	    }
		
		return TF;
		}
	public static Map<Character,Integer> distinctChars(String pattern){
		Map<Character,Integer> charMap=new HashMap<>();
		int counter=0;
		for(int i=0;i<pattern.length();i++){
			char c=pattern.charAt(i);
			if(charMap.get(c)==null)
				  charMap.put(c,counter++);
				
		}
		return charMap;
	}
	public static void stringMatching(String text,String pattern){
		 int i, state=0;
		 Map<Character,Integer> mapChar=distinctChars(pattern);
		 int TF[][]=computeTransitionFunction(pattern.toCharArray(),mapChar);
		 System.out.println(Arrays.deepToString(TF));
		    for (i = 0; i < text.length(); i++)
		    {
		       Integer index=mapChar.get(text.charAt(i));
		       if(index!=null){
		       state = TF[state][index];
		       if (state == pattern.length())
		       {
		         System.out.println("pattern found at index "+(i-pattern.length()+1));
		       }
		       }
		    }		
	}
	
	
	public static void main(String[] args) {
		stringMatching("AABAACAADAABAAABAA","AABA");
	}

}
