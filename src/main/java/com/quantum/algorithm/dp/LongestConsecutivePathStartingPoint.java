package com.quantum.algorithm.dp;

import java.util.Arrays;

public class LongestConsecutivePathStartingPoint {
	
	 public static boolean validMove(int row,int column,int x,int y){
		 
		  
		 return (x<row && x>=0 && y< column && y>=0)?true:false;
		 
	 }
	
	
	  public static int lengthOfConsecutivePath(int arr[][],int memo[][],int startPoint,int x,int y){
		  
		  
		  if(!validMove(arr.length,arr[0].length,x,y)){			  
			  return 0;
		  }
		  if(memo[x][y]!=0)
		  {
			  return memo[x][y];
		  }
		  int max=1;

		  if(validMove(arr.length,arr[0].length,x,y+1)&& arr[x][y+1]-arr[x][y]==1){ 
			  max=Integer.max(max,1+lengthOfConsecutivePath(arr, memo,arr[x][y+1], x, y+1));
		  }
		  if(validMove(arr.length,arr[0].length,x,y-1) && arr[x][y-1]-arr[x][y]==1){ 
			  max=Integer.max(max,1+lengthOfConsecutivePath(arr, memo,arr[x][y-1], x, y-1));
		  }
		  if(validMove(arr.length,arr[0].length,x+1,y) && arr[x+1][y]-arr[x][y]==1){ 
			  max=Integer.max(max,1+lengthOfConsecutivePath(arr, memo,arr[x+1][y], x+1, y));
		  }
		  if(validMove(arr.length,arr[0].length,x-1,y) && arr[x-1][y]-arr[x][y]==1){ 
			  max=Integer.max(max,1+lengthOfConsecutivePath(arr, memo,arr[x-1][y], x-1, y));
		  }
		  if(validMove(arr.length,arr[0].length,x+1,y+1) && arr[x+1][y+1]-arr[x][y]==1){ 
			  max=Integer.max(max,1+lengthOfConsecutivePath(arr, memo,arr[x+1][y+1], x+1, y+1));
		  }
		  if(validMove(arr.length,arr[0].length,x-1,y-1) && arr[x-1][y-1]-arr[x][y]==1){ 
			  max=Integer.max(max,1+lengthOfConsecutivePath(arr, memo,arr[x-1][y-1], x-1, y-1));
		  }
		  if(validMove(arr.length,arr[0].length,x-1,y+1) && arr[x-1][y+1]-arr[x][y]==1){ 
			  max=Integer.max(max,1+lengthOfConsecutivePath(arr, memo,arr[x-1][y+1], x-1, y+1));
		  }
		  if(validMove(arr.length,arr[0].length,x+1,y-1) && arr[x+1][y-1]-arr[x][y]==1){ 
			  max=Integer.max(max,1+lengthOfConsecutivePath(arr, memo,arr[x+1][y-1], x+1, y-1));
		  }
		  
		  memo[x][y]=max;		  
		  return memo[x][y];
	  }
	
	public static int longestConsecutivePath(int arr[][],int startPoint){
		
		int memo[][]=new int[arr.length][arr[0].length];
		int max=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==startPoint){
				max=Integer.max(lengthOfConsecutivePath(arr,memo,startPoint,i,j),max);
				}
			}
		}
		
		return max;
	}
	
	
	
	
	public static void main(String[] args) {
		int arr[][]={ {'a', 'c', 'd'},
                {'h', 'b', 'e'},
                {'i', 'g', 'f' }};
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(longestConsecutivePath(arr,'e'));
		
		int arr1[][]={{'j','i','g','f'},{'k','h','b','e'},{'l','i','g','f'},{'e','e','e','e'}};
		System.out.println(longestConsecutivePath(arr1,'e'));
	   
		
		
	}

}
