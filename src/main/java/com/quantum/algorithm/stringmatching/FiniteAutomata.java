package com.quantum.algorithm.stringmatching;

import java.util.Arrays;

public class FiniteAutomata {
	
	public static int getNextState(char []pattern,int state,int charNumber){
		 // If the character c is same as next character in pattern,then simply increment state
	    if (state < pattern.length && charNumber == pattern[state])
	        return state+1;
	    // next state finally contains the longest prefix which is also suffix  in "pat[0..state-1]c"
	    // Start from the largest possible value and stop when you find a prefix which is also suffix
	    int i;
	    for (int nextState = state; nextState > 0; nextState--)
	    {
	        if(pattern[nextState-1] == charNumber)
	        {
	            for(i = 0; i < nextState-1; i++)
	            {
	                if (pattern[i] != pattern[state-nextState+1+i])
	                    break;
	            }
	            if (i == nextState-1)
	                return nextState;
	        }
	    }
	    return 0;
	}
	
	public static int[][] computeTransitionFunction(char[] pattern){
		int  NO_OF_CHARS=256;
		int TF[][]=new int[pattern.length+1][NO_OF_CHARS];
	    for (int state = 0; state <= pattern.length; ++state)
	    {
	    	for (int x = 0; x < NO_OF_CHARS; ++x)
	    		TF[state][x] = getNextState(pattern,state, x);
	    }
		return TF;
		}
	public static void stringMatching(String text,String pattern){
		 int i, state=0;
		 int TF[][]=computeTransitionFunction(pattern.toCharArray());
		    for (i = 0; i < text.length(); i++)
		    {
		       state = TF[state][text.charAt(i)];
		       if (state == pattern.length())
		       {
		         System.out.println("patterb found at index "+(i-pattern.length()+1));
		       }
		    }		
	}
	
	
	public static void main(String[] args) {
		stringMatching("AABAACAADAABAAABAA","AABA");
	}

}
