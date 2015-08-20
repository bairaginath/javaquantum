/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.memory;
import java.util.Date;

/**
 *
 * @author BAIRAGI
 */
public class CheckGC {
    public void finalize(){
        System.out.println("finalize method called");
    }
    
    public static void main(String[] args) throws Throwable{
        
        CheckGC ss=new CheckGC();
        System.out.println(ss);
       // ss.finalize();
        System.out.println(ss);
        Runtime rt=Runtime.getRuntime();
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
        Date d=null;
        for(int i=0;i<10;i++){
          d=new Date();
          rt.gc();
        System.out.println("free memory"+rt.freeMemory());
         // d=null;
        }
        System.out.println(rt.freeMemory());
        rt.gc();
        System.out.println(rt.freeMemory());
    }
    
}
