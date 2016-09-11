package com.quantum.algorithm.backtracking;

import java.util.Arrays;

public class KnightTour {
	
	static int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
    static int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
	
	public static boolean isValidPlace(int board[][],int x,int y){
		if(0<=x && x<board.length&& 0<=y && y<board.length&&board[x][y]==-1){
			return true;
		}
		
		return false;
	}
	
	
	public static boolean knightTour(int board[][],int x,int y,int moveComplete){
		

		
		if(moveComplete==board.length*board.length){
			return true;
		}
        for (int k = 0; k < 8; k++) {
            int nextX = x + xMove[k];
            int nextY = y + yMove[k];
            if (isValidPlace(board, nextX, nextY)) {
                board[nextX][nextY] = moveComplete;
                if (knightTour(board,nextX,nextY,moveComplete+1))
                    return true;
                else
                    board[nextX][nextY] = -1;// backtracking
            }
        }
		return false;
	}
	
	public static void nKnightTour(int n){
	    int board[][]=new int[n][n];
	    for(int i=0;i<n;i++){
	    	Arrays.fill(board[i],-1);
	    }
	    board[0][0]=0;
		knightTour(board,0,0,1);
		System.out.println(Arrays.deepToString(board));
	}

	public static void main(String[] args) {
		nKnightTour(8);
	}
	

}
