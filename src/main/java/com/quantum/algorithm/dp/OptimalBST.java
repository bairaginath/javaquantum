package com.quantum.algorithm.dp;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author veradocs-web
 */
public class OptimalBST {    

    
public double optimalBST(double p[], double q[], int n)
{	
    /* Create an auxiliary 2D matrix to store results of subproblems */
    double e[][]=new double[n][n];
    int root[][]=new int[n][n];
    double w[][]=new double[n][n]; 
    /* e[i][j] = Optimal cost of binary search tree that can be
       formed from keys[i] to keys[j].
       e[0][n-1] will store the resultant cost */
 
    // For a single key, cost is equal to frequency of the key
    for (int i = 0; i < n; i++)
    {    e[i][i] = q[i]; w[i][i] = q[i];
    }
    // Now we need to consider chains of length 2, 3, ... .
    // L is chain length.
    for (int L=2; L<=n; L++)
    {
        // i is row number in cost[][]
        for (int i=0; i<n-L+1; i++)
        {
            // Get column number j from row number i and chain length L
            int j = i+L-1;
            System.out.println(L+" "+i+"  "+j);
            
            e[i][j] = Double.MAX_VALUE;
            w[i][j]=w[i][j-1]+p[j]+q[j];
 
            // Try making all keys in doubleerval keys[i..j] as root
            for (int r=i; r<j; r++)
            {
               // c = cost when keys[r] becomes root of this subtree
               double c=e[i][r]+e[r+1][j]+w[i][j];
               if (c < e[i][j]){
                  e[i][j] = c;
                  root[i][j]=r+1;
                   
            }
        }            
    }
    }
    System.out.println(root[0][n-1]);
    return e[0][n-1];
} 



int sum(double freq[], int i, int j)
{
    int s = 0;
    for (int k = i; k <j; k++)
       s += freq[k];
    return s;
}

    public static void main(String[] args) {
        OptimalBST obst=new OptimalBST();
//        int keys[] = {1,2,3,4,5};
        double p[] = {0,0.15,0.10,0.05,0.10,0.20};
        double q[]={0.05,0.10,0.05,0.05,0.05,0.10};
        double cost=obst.optimalBST(p,q,q.length);
        System.out.println(cost);
    }
}