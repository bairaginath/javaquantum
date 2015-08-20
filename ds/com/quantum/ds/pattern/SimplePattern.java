/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.ds.pattern;

/**
 *
 * @author BAIRAGI
 */
public class SimplePattern {
    
   static void patternMatching(String S,String pattern){
        
       // S=S.toUpperCase();
        //pattern=pattern.toUpperCase();
        int p=pattern.length();
        int counter=0;
        for(int index=0;index<=S.length()-p;index++){
            
            String sub=S.substring(index,p+index);
            //System.out.println(sub);
            if(sub.equalsIgnoreCase(pattern))
                counter++;
            
        }
        
        System.out.println(counter);
        
    }
    public static void main(String[] args) {
       patternMatching("bairaginath Behera nath","behera");
    }
    
}
