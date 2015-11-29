package com.quantum.javacore.basics;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAIRAGI
 */
class A
{
   void display()
   {
       System.out.println("In side A");
   }
}

class B extends A
{
    void display()
    {
        super.display();
        System.out.println("In side B");
    }
}

class C extends B
{
    void display()
    {
        super.display();
        System.out.println("In side C");
    }
}
public class Super {
    public static void main(String[] args) {
        C ob=new C();
        ob.display();
        
    }
    
}
