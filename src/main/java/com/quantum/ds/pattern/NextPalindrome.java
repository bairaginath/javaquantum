/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.ds.pattern;

import java.util.Scanner;

/**
 *
 * @author BAIRAGI
 */
public class NextPalindrome {
    
   static boolean allnines(int S[]){
        for(int x:S)
        {
            if(x!=9)
                return false;
        }
        return true;
    }
    
         static void nextPalindrome(int S[]){
             
              if(allnines(S))
              {
                  System.out.println("all nines");
                  return;
              }
             
            int n=S.length;
            
            int mid=n>>>1;
            int i=mid-1;
            int j=n%2==1 ? mid+1 : mid;
            boolean leftsmaller=false;
             
             while (i >= 0 && S[i] == S[j])
             {  i--;j++; }
             //System.out.println(i+"  " +j);
             if ( i < 0 || S[i] < S[j])
              leftsmaller = true;
            while (i >= 0)
            {
              S[j] = S[i];
              j++;
              i--;
           }
    if (leftsmaller == true)
    {
        int carry = 1;
        i = mid - 1;
        if (n%2 == 1)
        {
            S[mid] += carry;
            carry = S[mid] / 10;
            S[mid] %= 10;
            j = mid + 1;
        }
        else
            j = mid;
 
        while (i >= 0)
        {
            S[i] += carry;
            carry = S[i] / 10;
            S[i] %= 10;
            S[j++] = S[i--]; // copy mirror to right
        }
    }
            
            for(int xx:S){
            System.out.print(xx);
        }
             System.out.println();
            
        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int IntArray[]=new int[S.length()];
        for(int i=0;i<S.length();i++)
            IntArray[i]=S.charAt(i)-48;       
        
        nextPalindrome(IntArray);       
    }    
}
