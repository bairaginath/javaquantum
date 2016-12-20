package com.quantum.algorithm.stringmatching;

import java.util.Arrays;
import java.util.Comparator;

import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

//better alogrithm http://www.geeksforgeeks.org/suffix-array-set-2-a-nlognlogn-algorithm/

class Suffix{
	 int index;
	 String suffix;
	 
	 String getSuffix(){
		 return this.suffix;
	 }
	 @Override
	public String toString() {
		 return index+" "+getSuffix();
	}
}

public class SuffixArray {
	
	static void search(String text,String pattern, int []suffixArray)
	{
	    int m = pattern.length();
	    int n= text.length();
	    int l = 0, r = n-1;
	    while (l <= r)
	    {
	        int mid = l + ((r - l)>>1);
	        int beginIndex=suffixArray[mid];
	        int res = pattern.compareTo(text.substring(beginIndex,beginIndex+m>n?n:beginIndex+m));
	        if (res == 0)
	        {
	            System.out.println("Pattern found at index "+suffixArray[mid]);
	            return;
	        }
	        else if (res < 0) r = mid - 1;
	        else l = mid + 1;
	    }
	    System.out.println("Pattern not found");
	}
	
	
	static int [] buildSuffixArray(String text)
	{
	    Suffix suffixes[]=new Suffix[text.length()];
	    for (int i = 0; i < text.length(); i++)
	    {
	    	suffixes[i]=new Suffix();
	        suffixes[i].index = i;
	        suffixes[i].suffix = text.substring(i);
	    }
	    Arrays.sort(suffixes,Comparator.comparing(Suffix::getSuffix));
	    System.out.println(Arrays.deepToString(suffixes));
	    int suffixArr[] = new int[text.length()];
	    for (int i = 0; i < text.length(); i++)
	        suffixArr[i] = suffixes[i].index;
	    return  suffixArr;
	}
	
	public static void main(String[] args) {
//		String text="banana";
		String text="AABAACAADAABAAABAA";
//		String pattern="nan";
		String pattern="AABA";
		int [] suffixArray=buildSuffixArray(text);
		System.out.println(Arrays.toString(suffixArray));
		search(text,pattern,suffixArray);
		
	}

}
