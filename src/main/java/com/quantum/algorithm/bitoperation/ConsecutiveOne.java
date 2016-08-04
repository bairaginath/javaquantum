package com.quantum.algorithm.bitoperation;

public class ConsecutiveOne {
	
	
	public static int notConsecutiveOne(int n)
	{
		int a=1,b=1;
		for(int i=1;i<n;i++){
			
			int temp=a;
			a=a+b;
			b=temp;
		}
		return a+b;
	}
	
	public static int consecutiveOne(int n)
	{
		return (1<<n)-notConsecutiveOne(n);
	}
	public static void main(String[] args) {
		System.out.println(notConsecutiveOne(5));
		System.out.println(consecutiveOne(5));
		
	}
}
