package com.quantum.algorithm.backtracking;

//for better solution visit  http://www.geeksforgeeks.org/backtracking-set-3-n-queen-problem/

import java.util.Arrays;

public class NQueenProblem {

	public static boolean checkValidPlace(int a[][], int x, int y) {
		int n = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[x][i] == 1 || a[i][y] == 1) {
				return false;
			}
		}

		for (int i = x, j = y; i >= 0 && j >= 0; i--, j--) {
			if (a[i][j] == 1)
				return false;
		}
		for (int i = x, j = y; i < a.length && j < a.length; i++, j++) {
			if (a[i][j] == 1)
				return false;
		}
		for (int i = x, j = y; i >= 0 && j < a.length; i--, j++) {
			if (a[i][j] == 1)
				return false;

		}
		for (int i = x, j = y; i < a.length && j >= 0; i++, j--) {
			if (a[i][j] == 1)
				return false;

		}

		return true;
	}

	public static int[][] nQueenProblem(int n) {
		int complete = 0;
		int temp[][] = new int[n][n];
		for (int k = 0; k < n; k++) {
			if (complete == n - 1) {
				return temp;
			}
			complete = 0;
			temp = new int[n][n];
			temp[0][k] = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; i < n && j < n; j++) {
					if (checkValidPlace(temp, i, j)) {
						temp[i][j] = 1;
						i++;
						j = 0;
						complete++;
					}
				}

			}
		}
		return temp;
	}

	public static void main(String[] args) {
		int temp[][] = nQueenProblem(4);
		System.out.println(Arrays.deepToString(temp));

	}

}
