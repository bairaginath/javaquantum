package com.quantum.algorithm.dp;

import java.util.Arrays;

public class FibonacciSeries {
	
	public static int lookup[]=new int[10];
	
	public static int fibonacciTopDownAppoarch(int n){
		if(n<=1){
			lookup[0]=1;
			lookup[1]=1;
			return 1;
		}
		lookup[n]=fibonacciTopDownAppoarch(n-1)+fibonacciTopDownAppoarch(n-2);
	    return lookup[n];
	}
	
	public static int [] fibonacciButtomUpAppoarch(int n){
		int fibo[]=new int[n];
		fibo[0]=1;fibo[1]=1;
		for(int i=2;i<n;i++){
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		return fibo;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(fibonacciButtomUpAppoarch(10)));		
		fibonacciTopDownAppoarch(9);
		System.out.println(Arrays.toString(lookup));
	}

}
