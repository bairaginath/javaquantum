package com.quantum.algorithm.dp;

import java.io.*;
import java.util.Arrays;

public class LeastCost {
    
    static int leastCost(int arr[],int k){
        int cost[]=new int[arr.length];
        cost[arr.length-1]=0;
        System.out.println(arr.length);
        for(int i=arr.length-2;i>=0;i--){
            int minValue=9999;
            for(int j=1;j<=k & j+i<arr.length;j++){
               minValue=Math.min(minValue,Math.abs(arr[i]-arr[i+j])+cost[i+j]);
               System.out.println("i ="+i+" j="+j+" minValue="+minValue);
            }
            cost[i]=minValue;
            System.out.println(Arrays.toString(cost));
        }
        return 0;
    }
	public static void main (String[] args) {
	    
          //leastCost(new int[]{10, 30, 40, 50, 20},3);
	    leastCost(new int[]{40, 10, 20, 70, 80, 10},4);
	}
}
