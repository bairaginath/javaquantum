package com.quantum.algorithm.stringmatching;

public class BruteForce {
	
	public static boolean stringMatching(String text,String pattern){
		
		for(int i=0;i<text.length();i++){
			int j=0;
			int k=i;
			int count=0;
			while(i<text.length() && j< pattern.length() && pattern.charAt(j)==text.charAt(k)){
			    count++;
			    j++;
			    k++;
			    if(count==pattern.length()){
			    	return true;
			    }
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(stringMatching("bairagi nath behera","nath"));
	}

}
