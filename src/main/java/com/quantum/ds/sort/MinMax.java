/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.ds.sort;

import java.util.Arrays;
import static java.util.Arrays.copyOfRange;

/**
 *
 * @author BAIRAGI
 */
public class MinMax  {
    
    
    <T extends Comparable<T>> T[] findMinMax(T a[]){
        
        T min;
        T max;
        if((a[0].compareTo(a[1]))>0){
            min=a[0];
            max=a[1];
        }else{
            min=a[1];
            max=a[0];
        }
        for(int index=2;index<a.length;index++){
            
            if(max.compareTo(a[index])<0)
                max=a[index];
            if((min.compareTo(a[index]))>0)
               min=a[index];                 
        } 
        
        System.out.println(min);
        System.out.println(max);
        T[] aux = (T[])Arrays.copyOfRange(a,0,2);
        aux[0]=min;
        aux[1]=max;        
        return aux;
    }   
    
    public static void main(String[] args) {
        
        MinMax ob=new MinMax();
        Integer a[]={4,2,7,3,9,5,1,6,8,9};
       Integer I[]=ob.findMinMax(a);        
        String name[]={"kuna","tapan","bairagi","zobra","amit"};
        try{
        ob.findMinMax(name);
        }catch(Exception e){}
    }
}
