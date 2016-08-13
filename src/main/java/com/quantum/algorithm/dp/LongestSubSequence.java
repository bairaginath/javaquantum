package com.quantum.algorithm.dp;

import java.util.Arrays;

public class LongestSubSequence {
	
	public static int [][] longestSubSequencePreprocessing(char x[],char y[]){
		int[][] seqMatrix=new int[x.length+1][y.length+1];
		for(int i=1;i<=x.length;i++){
			for(int j=1;j<=y.length;j++){				
				if(x[i-1]==y[j-1]){
					seqMatrix[i][j]=seqMatrix[i-1][j-1]+1;					
				}
				else if(seqMatrix[i-1][j]>=seqMatrix[i][j-1]){
					seqMatrix[i][j]=seqMatrix[i-1][j];
				}
				else{
					seqMatrix[i][j]=seqMatrix[i][j-1];
					
				}
			}
		}
		
	return seqMatrix;	
	}
	
	public static void printLCS(int[][]preProcessingMatrix,char x[],int i,int j){
		
		
		if(i==0 || j==0){
			return;
		}

	if(preProcessingMatrix[i][j]-1==preProcessingMatrix[i-1][j-1]){
		printLCS(preProcessingMatrix,x,i-1,j-1);
			System.out.print(x[i-1]);
		}
		else if (preProcessingMatrix[i-1][j]>=preProcessingMatrix[i][j-1]){
			printLCS(preProcessingMatrix,x,i-1,j);
			
		}
		else{
			printLCS(preProcessingMatrix,x,i,j-1);
		}
		
	}
	public static void main(String[] args) {
		String x="ABCBDAB";
		String y="BDCABA";
		int preProcessingMatrix[][]=longestSubSequencePreprocessing(x.toCharArray(),y.toCharArray());
		System.out.println(Arrays.deepToString(preProcessingMatrix));
		printLCS(preProcessingMatrix,x.toCharArray(),x.length(),y.length());
	}

}
