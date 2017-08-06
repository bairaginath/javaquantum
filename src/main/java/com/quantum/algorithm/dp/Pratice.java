package com.quantum.algorithm.dp;

public class Pratice {
	
	
	
	public static void main(String[] args) {
		
		
		int arr[]={-2,-3,4,-1,-2,1,5,-3};
		//int arr[]={-2,-3,-4,-1,-2,-1,-5,-3};
		
		int maxGlobal=arr[0];
		int maxUpto=-arr[0];
		int start=0;
		int end=0;
		
		for(int i=1;i<arr.length;i++){
			int pre=maxUpto;
			maxUpto=Math.max(arr[i],maxUpto+arr[i]);
			if(arr[i]==maxUpto)
				start=i;
			if(pre<maxUpto)
				end=i;
			maxGlobal=Math.max(maxUpto,maxGlobal);
			
		}
		System.out.println(maxGlobal);
		System.out.println(start);
		System.out.println(end);
	}

}
