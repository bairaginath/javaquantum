/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.oops;

/**
 *
 * @author BAIRAGI
 */
public class ObjectPass {
    
    int x;

    public ObjectPass(int x) {
       this.x=x;
    }
    
    
     void display(ObjectPass ob){
         ob.x++;
     }
     static void swapObject(ObjectPass ob1,ObjectPass ob2){
        ObjectPass temp=ob1;
        ob1=ob2;
        ob2=temp;
     }
     static void swap(ObjectPass ob1,ObjectPass ob2){
         ob1.x=ob1.x+ob2.x;
         ob2.x=ob1.x-ob2.x;
         ob1.x=ob1.x-ob2.x;
     }
     public static void main(String[] args) {
        
         ObjectPass ob=new ObjectPass(7);
         ob.display(ob);
         System.out.println(ob.x);         
         ObjectPass ob1=new ObjectPass(2);
         ObjectPass ob2=new ObjectPass(3);
         //swap(ob1,ob2);
         System.out.println(ob1.x +"   "+ob2.x);
         swapObject(ob1,ob2);
         System.out.println(ob1.x +"   "+ob2.x);
         

         
    }
    
}
