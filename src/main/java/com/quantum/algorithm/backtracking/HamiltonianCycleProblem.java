package com.quantum.algorithm.backtracking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;




public class HamiltonianCycleProblem {
	
	public static boolean pathExist(int graph[][],List<Integer>path,int presentVertex,int toDestination){
		return (graph[presentVertex][toDestination]==1 && !path.contains(toDestination));
	}
	
	public static boolean hamiltonianCycle(int graph[][],List<Integer>path,int startVertex,int presentVertex){
		if( path.size()==graph.length && graph[presentVertex][startVertex]==1){
		    path.add(startVertex);
			return true;
	   }
	   for(int i=0;i<graph.length;i++){
		   if(pathExist(graph,path,presentVertex,i)){
			   path.add(i);
			   if(hamiltonianCycle(graph, path, startVertex,i)){
				   return true;
			   }else if(i!=presentVertex){
				   path.remove((Object)i);
			   }
			   
		   }
	   }
		return false;
	}
	
	
	public static void main(String[] args) {
		
		int graph1[][] = {{0, 1, 0, 1, 0},{1, 0, 1, 1, 1},{0, 1, 0, 0, 1},{1, 1, 0, 0, 1},{0, 1, 1, 1, 0},};
		int graph2[][] = {{0, 1, 0, 1, 0},{1, 0, 1, 1, 1},{0, 1, 0, 0, 1},{1, 1, 0, 0, 0},{0, 1, 1, 0, 0},};
		int graph3[][]={{0,1,1,1},{1,0,1,0},{1,1,0,1},{1,0,1,0}};
		List<Integer>path=new ArrayList<>();
		path.add(0);
		hamiltonianCycle(graph3, path,0,0);
		System.out.println(path.toString());
	}

}
