package com.quantum.algorithm.dp;

import java.util.Arrays;

public class LongestSubStringNonRepeatChar {
	
	
	static int noOfChar=256;
	
	public static int longestSubStringNonRepeatChar(String s){
		
		int visit[]=new int[noOfChar];
		Arrays.fill(visit,-1);
		int maxLength=1;
		int currentLength=1;
		visit[s.charAt(0)]=0;
		for(int i=1;i<s.length();i++){
			int prevIndex=visit[s.charAt(i)];
			if(prevIndex==-1 || i - currentLength > prevIndex ){
				currentLength++;
			}
			else {
				if(currentLength> maxLength)
					maxLength=currentLength;
				currentLength=i-prevIndex;
			}
			visit[s.charAt(i)]=i;
		}
		if(currentLength> maxLength)
			maxLength=currentLength;		
		return maxLength;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(longestSubStringNonRepeatChar("geeksforgeeks"));
		
	}

}
