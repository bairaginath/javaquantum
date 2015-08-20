package com.quantum.questions.amazon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author canvera
 */
public class EqualNoStarAndHash {
         static int currentStartPoint=0;
         static int currentEndPoint=0;
         static int currentDiff=0;
         static int previousStartPoint=0;
         static int previousEndPoint=0;
         static int previousDiff=0;
         
   public static int findLongArray(char s[],int start,int end){
       return 9;
       
   }
    
   public static String longestEqualNoStarAndHashSubArray(char s[]){

         for(int i=0;i<s.length;i++){
             if(s[i]=='#' || s[i]=='*')
             {                  
                 currentStartPoint=i;
                 while(i<s.length &&((s[i]=='#' || s[i]=='*')))
                 {    i++;  }
                 currentEndPoint=i-1;
                 currentDiff=findLongArray(s,currentStartPoint,currentEndPoint);
                 System.out.println(currentStartPoint+"  "+currentEndPoint);
                     
             }
             
         }
        
        return null;
    }
    public static void main(String[] args) {
        String s="32332**##44343*#**##";
        longestEqualNoStarAndHashSubArray(s.toCharArray());
        
        
    }
}
