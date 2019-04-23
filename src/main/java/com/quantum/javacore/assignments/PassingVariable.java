/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.assignments;

/**
 *
 * @author BAIRAGI
 */
public class PassingVariable {
    
    int x;

    public PassingVariable(int x) {
       this.x=x;
    }
    
    
     void display(PassingVariable ob){
         ob.x++;
     }
     static void primitiveSwap(int a,int b){
    	 a=a+b;
    	 b=a-b;
    	 a=a-b;
    	 
     }
     static void objectHashCode(PassingVariable ob){
    	    System.out.println(ob);
     }
     
     static void swapObject(PassingVariable ob1,PassingVariable ob2){
        PassingVariable temp=ob1;
        ob1=ob2;
        ob2=temp;
     }
     static void swap(PassingVariable ob1,PassingVariable ob2){
         ob1.x=ob1.x+ob2.x;
         ob2.x=ob1.x-ob2.x;
         ob1.x=ob1.x-ob2.x;
    	   
     }
     static void changeVariableValueOfObject(PassingVariable ob){
    	 ob.x=36;
     }
     public static void main(String[] args) {
        
         PassingVariable ob=new PassingVariable(7);
         ob.display(ob);
         System.out.println(ob.x);         
         PassingVariable ob1=new PassingVariable(1);
         PassingVariable ob2=new PassingVariable(2);
         System.out.println("variable in side object can be swap");
         swap(ob1,ob2);
         System.out.println(ob1.x +"   "+ob2.x);
         PassingVariable ob3=new PassingVariable(3);
         PassingVariable ob4=new PassingVariable(4);
         System.out.println("direct swap between object can't be swap");
         swapObject(ob3,ob4);
         System.out.println(ob3.x +"   "+ob4.x);
         PassingVariable op=new PassingVariable(55);
         changeVariableValueOfObject(op);
         System.out.println(op.x);
         
         int a=4;
         int b=5;
         System.out.println("before swap a= "+a+" b="+b);
         primitiveSwap(a, b);
         System.out.println("after swap a= "+a+" b="+b);
         
         PassingVariable ob5=new PassingVariable(5);
         System.out.println(ob5);
         objectHashCode(ob5);
         
         
         

         
    }
    
}
