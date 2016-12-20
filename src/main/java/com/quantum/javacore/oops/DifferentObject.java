package com.quantum.javacore.oops;


import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAIRAGI
 */
class a
{
    int p=5;
    void display()
    {
        System.out.println(p);
    }
}
class b
{
    int p=7;
    void display1()
    {
        System.out.println(p);
    }
}
public class DifferentObject {
    
    
    public static void main(String[] args) {
        List<Object> l=new Vector<Object>();
          l.add(new a());
          l.add(new b());
          l.add(new a());
         //Object ob=new Object(); 
          
          
          for(Object ob:l)
          {  
              if(ob instanceof a)
                   ((a)ob).display();
              if(ob instanceof b)
                  ((b)ob).display1();
          }
          
          
      /* 
        ListIterator li=l.listIterator();while(li.hasNext())
          {  
               Object ob=li.next();
              if(ob instanceof a)
                   ((a)ob).display();
              if(ob instanceof b)
                  ((b)ob).display1();
          } */
          
         
   /*     for(Object ob1:l)
        {
            if(ob1 instanceof a)
                ob1.*/
        }
    }
    

