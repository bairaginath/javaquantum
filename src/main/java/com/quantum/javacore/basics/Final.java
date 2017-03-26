package com.quantum.javacore.basics;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAIRAGI
 */
public class Final {
     final int x;

    public Final(int x) {
        this.x=x;
        
    }
    
    
     public static void main(String[] args) {
        Final ob=new Final(5);
//        Final ob1=new Final(6);
//        ob.x=7;
//         System.out.println(ob.x);
       //ob.x++; final variable can't assigned
     }
     
           
     
     
    
}

class Emp{
    Emp(){
        System.out.println("sfdjgkfsjg:");
    }
Emp(Integer x){
    System.out.println("X:"+x);
          
       
}
    public static void main(String[] args) {
        Emp e= new Emp(5);
    }

}
