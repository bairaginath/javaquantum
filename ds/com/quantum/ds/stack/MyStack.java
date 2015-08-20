/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.ds.stack;

import java.util.Arrays;

/**
 *
 * @author canvera
 */
public class MyStack {
    
    public static Object Buffer[]=null;
    public static int pointer=-1;
    public static int capacity=3;
    MyStack(){
        Buffer=new Object[capacity];
    }
    
   public void push(Object O){       
        if(++pointer>=capacity){
             Buffer=enhanceCapacity();
             Buffer[pointer]=O;
        }
        else {        
           Buffer[pointer]=O;
        
        }
    }
        
       public Object[] enhanceCapacity(){
           capacity=capacity*2;           
           Buffer=Arrays.copyOf(Buffer,capacity);
           return Buffer;
       }
       
     public  Object pop(){
         if(pointer<0)
             return null;
         return Buffer[pointer--];
     }
     
     public static void main(String[] args) {
        
         MyStack ms=new MyStack();
         ms.push(1);
         ms.push(2);
         ms.push(3);
         ms.push(4);
         ms.push(5);
         ms.push(6);
         System.out.println(ms.pop());
         System.out.println(ms.pop());
         System.out.println(ms.pop());
         System.out.println(ms.pop());
         System.out.println(ms.pop());
         System.out.println(ms.pop());
         System.out.println(ms.pop());
         
         
         
    }
    }
    

