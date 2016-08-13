package com.quantum.algorithm.dp;

import java.util.Arrays;

import sun.security.util.Length;

public class MinimumCostToReachDestination {
	
	public static int mininumCostToReachDestination(int [][]costMatrix,int source,int destination,int[][]optimizedCostMatrix){
		
		if(destination==source){
			return 0;
		}
		if(destination-source==1){
			return costMatrix[source][destination];
		}
		if (optimizedCostMatrix[source][destination]<costMatrix[source][destination])
		{
			return optimizedCostMatrix[source][destination];
		}
		int sum=mininumCostToReachDestination(costMatrix,source,source+1)+ mininumCostToReachDestination(costMatrix,source+1,destination) ;
		costMatrix[source][destination]=Integer.min(sum,costMatrix[source][destination]);
	    optimizedCostMatrix[source][destination]=costMatrix[source][destination];
	
	return optimizedCostMatrix[source][destination]; 
}
	

	

	
	public static int mininumCostToReachDestination(int [][]costMatrix,int source,int destination){
		
		if(destination==source){
			return 0;
		}
		if(destination-source==1){
			return costMatrix[source][destination];
		}
		int sum=mininumCostToReachDestination(costMatrix,source,source+1)+ mininumCostToReachDestination(costMatrix,source+1,destination) ;
		costMatrix[source][destination]=Integer.min(sum,costMatrix[source][destination]);
	   
	
	return costMatrix[source][destination]; 
}
	
	

    public static void main(String[] args) {
    	int INF=Integer.MAX_VALUE;
		int [][] costMatrix={ {0, 15, 80, 60},{INF, 0, 40, 50},{INF, INF, 0, 4},{INF, INF, INF, 0}};
		int N=costMatrix.length;
		int [][] optimizedCostMatrix=new int [N][N];
		for(int i=0;i<N;i++){
		Arrays.fill(optimizedCostMatrix[i],Integer.MAX_VALUE);
		}
		
		long startTime = System.nanoTime();
        System.out.println(mininumCostToReachDestination(costMatrix,0,3));
        long endTime = System.nanoTime();
        System.out.println("Time take without DP :"+(endTime-startTime));
        
        startTime = System.nanoTime();
		System.out.println(mininumCostToReachDestination(costMatrix,0,3,optimizedCostMatrix));
		endTime = System.nanoTime();
		System.out.println("Time take with DP :"+(endTime-startTime));
		
	}
}
