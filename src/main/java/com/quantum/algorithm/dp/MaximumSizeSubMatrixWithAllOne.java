package com.quantum.algorithm.dp;

import java.util.Arrays;

public class MaximumSizeSubMatrixWithAllOne {
	
	
	public static int[][] getMaximumSizeSubMatrixWithAllOne(int M[][]){
		int result[][]=null;
		int m=M.length;
		int n=M[0].length;
		int S[][]=new int[m][n];
		for(int i=0;i<m;i++)
			S[i][0]=M[i][0];
		for(int i=0;i<n;i++)
			S[0][i]=M[0][i];
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				if(M[i][j]==1)
				  S[i][j]=Math.min(S[i-1][j],Math.min(S[i][j-1],S[i-1][j-1]))+1;
				else
					S[i][j]=0;
			}
		}
		
		int maxI=0,maxJ=0;
		int maxlength=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(S[i][j]>maxlength){
					maxlength=S[i][j];
					maxI=i;
					maxJ=j;
				}
					
			}
		}
		System.out.println(Arrays.deepToString(S));
		result=new int[maxlength][maxlength];
		int p=0;
		for(int i=maxI-(maxlength-1);i<=maxI;i++){
			int q=0;
			for(int j=maxJ-(maxlength-1);j<=maxJ;j++){
				result[p][q]=M[i][j];
				q++;
			}
			p++;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int M[][]={
				{0, 1, 1, 0, 1},
				{1, 1, 0, 1, 0},
				{0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}
                };
		
		System.out.println(Arrays.deepToString(getMaximumSizeSubMatrixWithAllOne(M)));
		
		
	}

}
