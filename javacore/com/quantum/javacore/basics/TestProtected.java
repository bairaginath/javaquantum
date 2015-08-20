/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.basics;

import com.quantum.javacore.oops.Access;

/**
 *
 * @author BAIRAGI
 */


enum Days { SUNDAY,MONDAY,THUDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATRADAY };
public class TestProtected extends Access{
   public final int x;

    public TestProtected(int p) {
        this.x=p;
    }
    
    
    public static void main(String[] args) {
        
       // Access a=new Access();
        TestProtected t=new TestProtected(5);
        TestProtected t1=new TestProtected(6);
        System.out.println(t1.x);
        t.display1();
        
        
        
    }
    
}
