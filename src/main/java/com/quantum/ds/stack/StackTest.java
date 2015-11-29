/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.ds.stack;

import java.util.LinkedList;

/**
 *
 * @author canvera
 */
public class StackTest {
    
    public static void main(String[] args) {
            LinkedList<Integer> ll=new LinkedList<Integer>();
            ll.push(1);
            ll.push(2);
            ll.push(3);
            ll.push(4);
            ll.push(5);
            System.out.println(ll.pop());
            System.out.println(ll.pop());
            System.out.println(ll.pop());
            System.out.println(ll.pop());
            System.out.println(ll.pop());
            System.out.println(ll.peek());
    }
     
}
