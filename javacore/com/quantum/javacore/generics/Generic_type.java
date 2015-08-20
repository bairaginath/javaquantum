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

    
public class Generic_type<T> implements fruits<T>
{
  
    public void tellTeste( Object fruits) {
   
         if (fruits.getClass().toString().equals("Banana"))
              System.out.println(((Banana)fruits).teste);
         else 
             System.out.println(((Orange)fruits).teste);
    }

    public static void main(String[] args) {
       Banana b=new Banana();
       Generic_type<Banana> ob1=new Generic_type<Banana>();
        ob1.tellTeste(b);
        Orange o=new Orange();
        Generic_type<Orange> ob2=new Generic_type<Orange>();
        ob2.tellTeste(o);
    }
        
    }
    
