package com.quantum.algorithm.stringmatching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class FiniteAutomataV1 {
	
	public static int getNextState(char []pattern,int presentState,char input){
		 // If the character c is same as next character in pattern,then simply increment state
	    if (presentState < pattern.length && input == pattern[presentState])
	        return presentState+1;
	    // next state finally contains the longest prefix which is also suffix  in "pat[0..state-1]c"
	    // Start from the largest possible value and stop when you find a prefix which is also suffix
	    int i;
	    for (int nextState = presentState; nextState > 0; nextState--)
	    {
	        if(pattern[nextState-1] == input)
	        {
	            for(i = 0; i < nextState-1; i++)
	            {
	            	System.out.println(pattern[i]+"  "+pattern[presentState-nextState+1+i]);
	                if (pattern[i] != pattern[presentState-nextState+1+i])
	                    break;
	            }
	            if (i == nextState-1)
	                return nextState;
	        }
	    }
	    return 0;
	}
	
	public static int[][] computeTransitionFunction(char[] pattern,Map<Character,Integer> mapChar){
	    
		int TF[][]=new int[pattern.length+1][mapChar.size()];
	    for (int state = 0; state <= pattern.length; ++state)
	    {
	    	for(Map.Entry<Character,Integer> e:mapChar.entrySet()){
	    		TF[state][e.getValue()] = getNextState(pattern,state,e.getKey());
	    	}
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
	    System.out.println();
		stringMatching("AABAACAADAABAAABAA","AABA");
	}

}
