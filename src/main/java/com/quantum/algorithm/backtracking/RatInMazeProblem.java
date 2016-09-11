package com.quantum.algorithm.backtracking;

import java.util.Arrays;

public class RatInMazeProblem {
	
	public static boolean isValidMove(int maze[][],int x,int y){
		
		return (0<=x&&x< maze.length && 0<=y&&y< maze.length && maze[x][y]==1);
	}
	
	public static boolean ratInMazeProblem(int maze[][],int result[][],int x,int y){
		if(x==maze.length-1 && y==maze.length-1){
			return true;
		}
		if(isValidMove(maze,x+1,y)){
			result[x+1][y]=1;
			if(ratInMazeProblem(maze,result,x+1,y)){
				return true;
			}else {
				result[x+1][y]=0;
			}
		}
		if(isValidMove(maze,x,y+1)){
			result[x][y+1]=1;
			if(ratInMazeProblem(maze,result,x,y+1)){
				return true;
			}else {
				result[x][y+1]=0;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
	int maze[][]={ {1, 0, 0, 0},{1, 1, 0, 1},{1, 1, 1, 0},{1, 0, 1, 1}};
	int result[][]=new int[maze.length][maze.length];
	result[0][0]=1;
	ratInMazeProblem(maze,result,0,0);
	System.out.println(Arrays.deepToString(result));
	}
}
