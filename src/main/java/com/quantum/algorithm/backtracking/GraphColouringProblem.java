package com.quantum.algorithm.backtracking;

import java.util.Arrays;

public class GraphColouringProblem {
	
	public static boolean changeColor(int graph[][],int vertex1,int vertex2,int colorList[]){
		if(graph[vertex1][vertex2]==1 && colorList[vertex1]==colorList[vertex2]){
			return true;
		}
		return false;
	}
	
	public static boolean graphColouring(int graph[][],int result[],int noOfColor,int complete){
		
		if(complete==graph.length-1 && noOfColor>=0 ){
			return true;
		}
		for(int i=0;i<graph.length;i++){
			if(i!=complete && changeColor(graph,complete,i,result)){
				result[i]=result[i]+1;
				if(graphColouring(graph,result,noOfColor-1,complete+1)){
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int graph[][] = {{0, 1, 1, 1},{1, 0, 1, 0},{1, 1, 0, 1},{1, 0, 1, 0}};
		int graph3[][]={{0,1,0,1},{1,0,1,0},{0,1,0,1},{1,0,1,0}};
		int result[]=new int[graph.length];
		Arrays.fill(result,1);
		graphColouring(graph, result,3,0);
		System.out.println(Arrays.toString(result));
		Arrays.fill(result,1);
		graphColouring(graph3, result,3,0);
		System.out.println(Arrays.toString(result));
	}

}
