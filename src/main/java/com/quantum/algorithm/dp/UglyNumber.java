package com.quantum.algorithm.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UglyNumber {
	
	
	public static int uglyNumber(int n)
	{
		int arr[]=new int[n];
		arr[0]=1;
		int i2=0,i3=0,i5=0;
		int nextMultiTwo=2;
		int nextMultiThree=3;
		int nextMultiFive=5;
		int nextUglyNumber=1;
		for(int i=1;i<n;i++){
			nextUglyNumber=Math.min(nextMultiTwo,Math.min(nextMultiThree,nextMultiFive));
			arr[i]=nextUglyNumber;
			if(nextUglyNumber==nextMultiTwo){
				i2++;
				nextMultiTwo=arr[i2]*2;
			}
			
			if(nextUglyNumber==nextMultiThree){
				i3++;
				nextMultiThree=arr[i3]*3;
			}
			
			if(nextUglyNumber==nextMultiFive){
				i5++;
				nextMultiFive=arr[i5]*5;
			}
		}

     return nextUglyNumber;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(uglyNumber(150));
		
	}

}
