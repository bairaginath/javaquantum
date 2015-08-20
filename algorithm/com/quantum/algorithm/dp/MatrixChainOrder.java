/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.algorithm.dp;

import java.util.Arrays;

/**
 *
 * @author canvera
 */
public class MatrixChainOrder {
    
    public static void printOptimalParens(int s[][],int i,int j){
        
        if(i==j){
            System.out.print("A"+i);
            return;
        }   
         //System.out.println("i= "+i+" j= "+j);
            System.out.print("(");
            printOptimalParens(s,i,s[i-1][j-1]);
            printOptimalParens(s,s[i-1][j-1]+1,j);
            System.out.print(")");
        
    }
    
    
    
    public static void matrixChainOrder(int p[])
    {
        int n=p.length-1;
        int m[][]=new int[n][n];
        int s[][]=new int[n][n];
        for(int i=0;i<n;i++)
            m[i][i]=0;
        for(int l=2;l<=n;l++)
        {            
         for(int i=1;i<=n-l+1;i++)
            {
                int j=i+l-1;                  
                m[i-1][j-1]=9999999; 
                   
                   for(int k=i;k<=j-1;k++)
                   {                        
                       int q=m[i-1][k-1]+m[k+1-1][j-1]+p[i-1]*p[k]*p[j];
                       if(q<m[i-1][j-1])
                       {
                           m[i-1][j-1]=q;
                           s[i-1][j-1]=k;
                       }
                       System.out.println("q="+q+"m[i][j]"+m[i-1][j-1]);
                       
                   }
           }
           // System.out.println(Arrays.toString(m[0]));
           // System.out.println(Arrays.toString(s[0]));
        }
        System.out.println("=====================cost matrix=================");        
       for(int i=0;i<n;i++)
       {
           for(int j=i;j<n;j++)
           {
               System.out.print(m[i][j]+" ");
           }
           System.out.println();
       }
       System.out.println("=====================Parens matrix=================");        
       for(int i=0;i<n;i++)
       {
           for(int j=i;j<n;j++)
           {
               System.out.print(s[i][j]+" ");
           }
           System.out.println();
       }  
       
        printOptimalParens(s,1,6);
  }
    
    public static void main(String[] args) {
        
      // Integer  MatrixDimension[][]=new Integer[][]{{30,35},{35,15},{15,5},{5,10},{10,20},{20,25}};
        //int p[]=new int[]{30,35,15,5,10,20,25};
        int p[]=new int[]{5,10,3,12,5,50,6};
       matrixChainOrder(p);
    }
    
}
