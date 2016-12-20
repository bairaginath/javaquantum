package com.quantum.algorithm.stringmatching;

import java.util.Arrays;

public class BoyerMoore {
	
	static void badCharHeuristic(char []pattern,int [] badchar){
		  int i;
		    // Initialize all occurrences as -1
		    for (i = 0; i < badchar.length; i++)
		         badchar[i] = -1;
		    // Fill the actual value of last occurrence of a character
		    for (i = 0; i < pattern.length; i++)
		         badchar[(int) pattern[i]] = i;
	}
	
	static void search( char []text,  char [] pattern)
	{
	    int m = pattern.length;
	    int n = text.length;
	    int NO_OF_CHARS=256;
	    int badchar[]=new int[NO_OF_CHARS];
	    badCharHeuristic(pattern, badchar);
	    System.out.println(Arrays.toString(badchar));
	    int s = 0;  
	    while(s <= (n - m))
	    {
	        int j = m-1;
	        while(j >= 0 && pattern[j] == text[s+j])
	            j--;
	        if (j < 0)
	        {
	            System.out.println("pattern occurs at shift ="+s);
	            s += (s+m < n)? m-badchar[text[s+m]] : 1;
	 
	        }
	        else
	            s += Math.max(1, j - badchar[text[s+j]]);
	    }
	}
	  
	
	public static void main(String[] args) {
		search("AABAACAADAABAAABAA".toCharArray(),"AABA".toCharArray());
		//worst case
		search("AAAAAAAAAAAAAAAAAA".toCharArray(), "AAAAA".toCharArray());
	}

}
