/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author BAIRAGI
 */
class BBB
{
    public int hashCode(){
        return 5;
    }
//    public boolean equals(Object o){
//        return true;
//    }
}
public class HashMapPutMethod {
    
    static int hash(int h) {
        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
    
    
    
    public static void main(String[] args) {
        
       Map<BBB,Integer> m=new HashMap<BBB, Integer>();
       BBB p1=new BBB();
       BBB p2=new BBB();
       m.put(p1,1);
        System.out.println( m.put(p2,2));
        System.out.println(m.get(p1));
        System.out.println(m.get(p2));
        System.out.println(p1.hashCode());
        System.out.println(HashMapPutMethod.hash(p1.hashCode()));
        System.out.println(HashMapPutMethod.hash(p2.hashCode()));
        
    }
    
}
