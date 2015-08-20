/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.oops;

/**
 *
 * @author BAIRAGI
 */


class Test
{
   protected void display1(){
        System.out.println("Test");
    }
}
public class Access extends Test {
    
     protected void display(){
        System.out.println("Access"); 
    }
    public static void main(String[] args) {
        
        Test ob=new Access();
        Access ob1=new Access();
        ob1.display();
        ob.display1();
        
    }
}
