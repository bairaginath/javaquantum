package com.quantum.algorithm.dp;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author canvera
 */
public class Fibonacci {
    
   public static void fibonacci(int n,int first,int last,boolean flag){
        if(n==1){
//            System.out.println(first);
//            System.out.println(last);
//            first=last;
            return;
        }
        if(flag==true)
        {
            //System.out.println(first);
            System.out.println(last);
            System.out.println(first+last);
        }else{
        System.out.println(first+last);
        }
        fibonacci(n-1,last,first+last,false);
        
//        int temp=first;
//        first=last;
//        last=temp+first;
    }
   
static void multiply(int F[][], int M[][])
{
  int x =  F[0][0]*M[0][0] + F[0][1]*M[1][0];
  int y =  F[0][0]*M[0][1] + F[0][1]*M[1][1];
  int z =  F[1][0]*M[0][0] + F[1][1]*M[1][0];
  int w =  F[1][0]*M[0][1] + F[1][1]*M[1][1];
 
  F[0][0] = x;
  F[0][1] = y;
  F[1][0] = z;
  F[1][1] = w;
}
 public static void power(int F[][], int n)
{
  if( n == 0 || n == 1)
      return ;
  int M[][] = new int[][]{{1,1},{1,0}};
    
  power(F, n/2);
  multiply(F, F); 
  if (n%2 != 0)
     multiply(F, M);
}
   
   public static int fibonacciLogN(int n){
       int F[][] =new int[][]{{1,1},{1,0}};
       if (n == 0)
           return 0;
       power(F, n-1);
  return F[0][0];
   }
    
    public static void main(String[] args) {
        
       // fibonacci(15,0,1,true);
        System.out.println(fibonacciLogN(15));
//        int M[][] = new int[][]{{1,1},{1,0}};
//         int F[][] = new int[][]{{1,1},{1,0}};
//        multiply(M, M);
//        System.out.println(Arrays.toString(M[0]));
//        multiply(M,F);
//        System.out.println(Arrays.toString(M[0]));
//        multiply(M,M);
//        System.out.println(Arrays.toString(M[0]));
//        multiply(M,F);
//        System.out.println(Arrays.toString(M[0]));
//        multiply(M,M);
//        System.out.println(Arrays.toString(M[0]));
        
    }
    
}
