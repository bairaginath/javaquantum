/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.ds.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author BAIRAGI
 */
public class WordBreak {
   static String output="";
   String Dict[]={"how","are","you","my","god","ware","ho","howa","re","you"};
   static String temp="";
  static List<String> l;
    WordBreak(){
        l=Arrays.asList(Dict);
    }
   static boolean  myDictionary(char a[],int first,int last){
       String temp2="";
       if(first==last)
           return true;
        temp+=a[first];
        if(l.contains(temp)){
            output=output+temp+" ";
            //System.out.println(output);
            temp2=temp;
            temp="";
            if(myDictionary(a, first+1, last)){
                if(output.length()<a.length)
                    return false;
                   System.out.println(output);                            
               }
            output="";
            temp=temp2;
        }
        
        
        return myDictionary(a,first+1,last);
        
      }
    
    public static void main(String[] args) {
        char x[]="howareyou".toCharArray();
        new WordBreak();
        myDictionary(x,0,x.length);
    }
    
}
