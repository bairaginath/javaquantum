/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.basics;

/**
 *
 * @author BAIRAGI
 */
public class Immutable {
   final int x;
    Immutable(int x){
        this.x=x;
    }
    
    public static void main(String[] args) {
        
        Immutable a=new Immutable(1);
        Immutable b=a;
        //a=new Immutable(2);
        System.out.println(a.x);
        System.out.println(b.x);
        //a.x=5;
        System.out.println(a.x);
        System.out.println(b.x);
        
    }
    
}
