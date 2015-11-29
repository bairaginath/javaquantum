/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.ds.bst;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author BAIRAGI
 */
public class BSTest {
    
    public static void main(String[] args) {
        int a[]={1,3,4,5,6,8};
        int b[]={8,6,5,4,3,1};
        System.out.println(Arrays.binarySearch(a,2));
        System.out.println(Arrays.binarySearch(b,2));
        System.out.println(Arrays.binarySearch(a,7));
        System.out.println(Arrays.binarySearch(b,4));
        
        List l1=Arrays.asList(b);
       // System.out.println(Collections.binarySearch(l1,8));
        int x[]=new int[5];
        int y[]=new int[6];
        char z[]=new char[7];
        x=y;
        System.out.println(x.length);
       // x=z;

    }
    
}
