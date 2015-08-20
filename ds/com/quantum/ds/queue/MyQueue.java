/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.ds.queue;

import java.util.Arrays;

/**
 *
 * @author canvera
 */
public class MyQueue {
        public static Object Buffer[]=null;
    public static int pointer=-1;
    public static int capacity=3;
    public static int poll_pointer=0;
    MyQueue(){
        Buffer=new Object[capacity];
    }
    
   public void offer(Object O){       
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
       
     public  Object poll(){
         if(poll_pointer>=pointer)
             return null;
         return Buffer[poll_pointer++];
     }
     
     public static void main(String[] args) {
       
         MyQueue ms=new MyQueue();
         ms.offer(1);
         ms.offer(2);
         ms.offer(3);
         ms.offer(4);
         ms.offer(5);
         ms.offer(6);
         System.out.println(ms.poll());
         System.out.println(ms.poll());
         System.out.println(ms.poll());
         System.out.println(ms.poll());
         System.out.println(ms.poll());
         System.out.println(ms.poll());
         System.out.println(ms.poll());
         
         
         
    }
    }
    

