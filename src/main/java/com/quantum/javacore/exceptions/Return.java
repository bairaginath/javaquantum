/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.exceptions;

/**
 *
 * @author BAIRAGI
 */
public class Return {
    
    static int display(){
        try{
            System.out.println("in side try block");
            
           int x=5/0;
            //System.exit(0);
            return 5;
        }catch(Exception e){
        	int x=5/0;
            System.out.println("in side catch block");
            
            return 2;
        }
        finally{
            System.out.println("in side finally block"); 
            return 3;
        }
        
    }

public static void main(String[] args) {
    int x=display();
    System.out.println(x);
    System.out.println( display());
    
   
}
    
}
