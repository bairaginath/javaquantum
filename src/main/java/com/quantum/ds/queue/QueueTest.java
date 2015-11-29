/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.ds.queue;

import java.util.LinkedList;

/**
 *
 * @author canvera
 */
public class QueueTest {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.offer(1);
        ll.offer(2);
        ll.offer(3);
        ll.offer(4);
        ll.offer(5);
        System.out.println(ll.poll());
        System.out.println(ll.poll());
        System.out.println(ll.poll());
        System.out.println(ll.poll());
        System.out.println(ll.poll());
        System.out.println(ll.poll());
        
    }
    
}
