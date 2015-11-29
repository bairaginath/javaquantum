/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.math.numbers;

import java.util.Arrays;

/**
 *
 * @author BAIRAGI
 */
public class Permutation {
    
    void swap(char a[],int x,int y){
         char temp=a[x];
         a[x]=a[y];
         a[y]=temp;
    }
    
    static int counter=0;
    static int p=0;
    static char x[]="abcdef".toCharArray();
    
    void permutation(char a[],int first,int last){
        
           if(last-first==1)
           {
               System.out.print(++counter);
               System.out.print(" ");
               System.out.println(a);
               swap(a,first,last);
               System.out.print(++counter);
               System.out.print(" ");
               System.out.println(a);
               return;
           }
           for(int i=first;i<a.length;i++){
             permutation(a, first+1, last);
             swap(a,first,last);
             //permutation(a,first,last-1);
           }
         // permutation(a,first+1,last);
       
    }
    
    
    
    public static void main(String[] args) {
       
        
        new Permutation().permutation(x,0,x.length-1);
        
    }
    
}
