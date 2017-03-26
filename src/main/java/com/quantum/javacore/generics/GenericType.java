package com.quantum.javacore.generics;

class Banana
{
    String teste="sweet";
}
class Orange
{
    String teste="sour";
}

interface fruits<T>
{
    
   <T> void tellTeste(T fruits);
}

    
public class GenericType<T> implements fruits<T>
{
  
    public void tellTeste( Object fruits) {
   
         if (fruits.getClass().toString().equals("Banana"))
              System.out.println(((Banana)fruits).teste);
         else 
             System.out.println(((Orange)fruits).teste);
    }

    public static void main(String[] args) {
       Banana b=new Banana();
       GenericType<Banana> ob1=new GenericType<Banana>();
        ob1.tellTeste(b);
        Orange o=new Orange();
        GenericType<Orange> ob2=new GenericType<Orange>();
        ob2.tellTeste(o);
    }
        
    }
    
