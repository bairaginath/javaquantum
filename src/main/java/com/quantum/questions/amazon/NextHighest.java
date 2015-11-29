package com.quantum.questions.amazon;


import java.util.Arrays;

public class NextHighest
{
    public static void main(String[] args) { 
     //int x=15432;
      int x=45321;
     String temp="";
     
     String p=Integer.toString(x);
     char s[]=p.toCharArray();
     for(int i=s.length-1;i>=0;i--)
     {
         if(s[i]>s[i-1])
         {
              
             Arrays.sort(s, i, s.length);
             System.out.println(s);
             for(int j=i;j<s.length;j++)
             {   
                 System.out.println(i+"  "+j);
                 if(s[i-1]<s[j])
                 {
                     char c=s[i-1];
                     s[i-1]=s[j];
                     s[j]=c;
                     break;
                 }
                
             }
           break;
         }
         
     }
     System.out.println(s);
     
    }
}