/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.javacore.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author canvera
 */


public class MixOfGenericAndNonGeneric {    
  public  static void inserter(List list){
       list.add(new String("bairagi"));
    }    
    public static void main(String[] args) {
        
       List<Integer> integerList=new ArrayList<Integer>();
       integerList.add(1);
       integerList.add(2);
       integerList.add(3);
       inserter(integerList); 
       for(Integer x:integerList)
            System.out.println(x);
    }    
}
