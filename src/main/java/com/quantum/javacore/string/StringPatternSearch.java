package com.quantum.javacore.string;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPatternSearch {
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("aba");
		//System.out.println(p.pattern());
		Matcher m = p.matcher("abababa"); 
		//In general, a regex search runs from left to right, and once a source's character has been used in a match, it cannot be reused
		while(m.find()){
			System.out.println(m.start());
		}
		
		Pattern pp=null;
		pp=Pattern.compile("f\\dc"); //integer between f and c
		//pp=Pattern.compile("ab|de");
		Matcher mm=pp.matcher("abcdef3ce");
		while(mm.find()){
			System.out.println(mm.start());
		}
		
		Scanner scanner=new Scanner(System.in);
		
		String pattern="\\d\\d";
		String token;
		do {
			token=scanner.findInLine(pattern);
			System.out.println("found "+token);
		}while(token!=null);
		
		
		StringTokenizer st = new StringTokenizer("my name is khan"," ");  
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());  
	     }  
		
		
	}

}
