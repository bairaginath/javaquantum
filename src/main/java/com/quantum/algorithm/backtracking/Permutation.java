package com.quantum.algorithm.backtracking;

public class Permutation {
	
	public static String swap(char arr[],int x,int y){
		char temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
		
		return new String(arr);
	}
	
	public static void permutation(String str,int first,int last){
		
		if(last-first==1){
			System.out.println(str);
			str=swap(str.toCharArray(),first,last);
			System.out.println(str);
		}
		for(int i=first;i<str.length();i++){
			str=String.valueOf(str.charAt(i))+str.replaceFirst(String.valueOf(str.charAt(i)),"");
			permutation(str,first+1,last);
		}

		
		
	}
	
	
	public static void main(String[] args) {
        String str="abcd";
		permutation(str,0,str.length()-1);
		
	}

}
