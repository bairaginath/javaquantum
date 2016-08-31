package com.quantum.algorithm.dp;

public class MinimumInitialPointsToReachDestination {
	
	

	

	public static boolean validMove(int row, int column, int x, int y) {

		return (x < row && y < column);
	}

	public static int minimumInitialPointUtils(int[][] points, int memo[][],
			int x, int y) {

		if (!validMove(points.length, points[0].length, x, y)) {
			return 0;
		}
		System.out.println("x= "+x+" y= "+y+" points "+points[x][y]+" memo "+memo[x][y]);
		if (memo[x][y] != 0) {
			return memo[x][y];
		}
		int min = Integer.MAX_VALUE;
		min=Math.min(min,points[x][y]+minimumInitialPointUtils(points, memo, x+1, y));
		min=Math.min(min,points[x][y]+minimumInitialPointUtils(points, memo, x, y+1));
		memo[x][y]=min;              
		return memo[x][y];
	}

	public static int minimumInitialPointToReachDestination(int points[][]) {
		int memo[][] = new int[points.length][points[0].length];

		return minimumInitialPointUtils(points, memo, 0, 0);
	}

	public static void main(String[] args) {
		int[][] points = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 }, };
		System.out.println(minimumInitialPointToReachDestination(points));
	}
}
