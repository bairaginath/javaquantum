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
public class HashMapRetriveTechnique {
     String name;
     HashMapRetriveTechnique(String name){
         this.name=name;
     }
//     public int hashCode(){
//         return name.length();
//     }
//     public boolean equals(Object O){
//         if((O instanceof HashMapRetriveTechnique)&& (((HashMapRetriveTechnique)O).name==name))
//             return true;
//         else 
//             return false;
//     }
     public int hashCode(){
         return this.name.hashCode();
     }
     public boolean equals(Object O){
         return this.hashCode()==O.hashCode();
     }
     public static void main(String[] args) {
        HashMapRetriveTechnique t=new HashMapRetriveTechnique("bairagi");
         System.out.println(t.hashCode());
         HashMap hm=new HashMap();
         hm.put(t,5);
         //t.name="kuna";
         System.out.println(t.hashCode());
         System.out.println(hm.get(new HashMapRetriveTechnique("bairagi")));
         //System.out.println(t.equals(new Test("kuna")));
    }
    
}
