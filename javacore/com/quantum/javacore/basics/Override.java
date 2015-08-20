/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BAIRAGI
 */

class Abc
{
    void display(){
        System.out.println("Abc");
    }
}
public class Override extends Abc {
    
    void display() throws NullPointerException {
        
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input the data");
            br.readLine();
        }catch(IOException e){
        
        }
    }   
        public static void main(String[] args) {
             
            Abc ob=new Override();
            ob.display();
    }
    
    
}
