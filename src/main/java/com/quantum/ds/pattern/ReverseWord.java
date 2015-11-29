/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.ds.pattern;

/**
 *
 * @author BAIRAGI
 */
public class ReverseWord {
    
    public String toString(){
       
        return "bairagi";
    }
    
    public static void main(String[] args) {
        
        String s="i am bairagi bandua";
        String ss[]=s.split(" ");
       // System.out.println(ss.toString());
        String temp="";
        for(int i=ss.length-1;i>=0;i--){
            temp=temp+ss[i]+" ";
        }
        ReverseWord rw=new ReverseWord();
        System.out.println(temp);
        System.out.println(rw);
    }
}
