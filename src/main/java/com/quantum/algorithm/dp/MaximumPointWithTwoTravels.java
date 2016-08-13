package com.quantum.algorithm.dp;

import java.util.Arrays;

public class MaximumPointWithTwoTravels {
	
	
	public static int getMaxUtil(int arr[][],int memo[][][],int x,int y,int z){
		int R=arr.length;
		int C=arr[0].length;
		if(!isValid(x,y,z,R,C)){
			return Integer.MIN_VALUE;
		}
		 if (x == R-1 && y == 0 && z == C-1)
		 {      return arr[x][y] + arr[x][z]; }
		 if (x == R-1) { return Integer.MIN_VALUE; }
		 
		    if (memo[x][y][z] != -1) {return memo[x][y][z];}
		    
		    
		    int ans = Integer.MIN_VALUE;
		 
		    
		    int temp = (y == z)? arr[x][y]: arr[x][y] + arr[x][z];
		 
		 
		    ans = Integer.max(ans, temp + getMaxUtil(arr, memo, x+1, y, z-1));
		    ans = Integer.max(ans, temp + getMaxUtil(arr, memo, x+1, y, z+1));
		    ans = Integer.max(ans, temp + getMaxUtil(arr, memo, x+1, y, z));
		 
		    ans = Integer.max(ans, temp + getMaxUtil(arr, memo, x+1, y-1, z));
		    ans = Integer.max(ans, temp + getMaxUtil(arr, memo, x+1, y-1, z-1));
		    ans = Integer.max(ans, temp + getMaxUtil(arr, memo, x+1, y-1, z+1));
		 
		    ans = Integer.max(ans, temp + getMaxUtil(arr, memo, x+1, y+1, z));
		    ans = Integer.max(ans, temp + getMaxUtil(arr, memo, x+1, y+1, z-1));
		    ans = Integer.max(ans, temp + getMaxUtil(arr, memo, x+1, y+1, z+1));
		 
		    return (memo[x][y][z] = ans);

	}
	
	public static boolean isValid(int x, int y, int z,int row,int column)
	{
	    return (x >= 0 && x < row && y >=0 &&
	            y < column && z >=0 && z < column);
	}
	public static int geMaxCollection(int [][]arr){
      int R=arr.length;
      int C=arr[0].length;
      int memo[][][]=new int[R][C][C];
      for(int i=0;i<R;i++){
    	  for(int j=0;j<C;j++){
    	    Arrays.fill(memo[i][j],-1);
      }
      }
      System.out.println(Arrays.deepToString(memo));
		return getMaxUtil(arr,memo,0,0,C-1);
	}
	
	
	public static void main(String[] args) {
		 int arr[][] = {{3, 6, 8, 2},{5, 2, 4, 3}, {1, 1, 20, 10}, {1, 1, 20, 10},{1, 1, 20, 10}};
		 System.out.println(geMaxCollection(arr));
	}

}
