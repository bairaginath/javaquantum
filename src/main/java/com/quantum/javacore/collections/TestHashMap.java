/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.collections;

import java.util.HashMap;

/**
 *
 * @author BAIRAGI
 */
public class TestHashMap {
    
    int id;
    String name;

    public TestHashMap(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
   public int hashCode()
   {
       
       return 5;
   }   
   
   public boolean equals(Object O){
     
       return this.hashCode()==O.hashCode();
   }
    
    public static void main(String[] args) {
        
        TestHashMap t1=new TestHashMap(6,"bairagi");
        TestHashMap t2=new TestHashMap(6,"bairagi");
        HashMap<TestHashMap,Integer> hm=new HashMap<TestHashMap,Integer>();
        hm.put(t1,66);
        System.out.println(hm.get(t2));
        System.out.println(t2.hashCode());
        System.out.println(t1.hashCode());
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.equals(t2));
    }
    
}
