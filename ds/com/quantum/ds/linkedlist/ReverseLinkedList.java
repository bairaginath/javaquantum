/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.ds.linkedlist;

/**
 *
 * @author canvera
 */
public class ReverseLinkedList {
    
    public static SingleLinkedList reverseLinkedList(SingleLinkedList sll){
        if(sll.getNext()==null)
            return sll;
        SingleLinkedList first,mid,last;
        first=sll;
        mid=sll.getNext();
        last=mid.getNext();
        first.setNext(null);
        while(last!=null){
           mid.setNext(first);           
           first=mid;
           mid=last;
           last=last.getNext();
        }
        mid.setNext(first);
        return mid;
        
    }
    
    
    public static void main(String[] args) {
        SingleLinkedList sll=SingleLinkedList.createLinkedList(1);
        sll.insertLinkedList(sll,2);
        sll.insertLinkedList(sll,3);
        sll.insertLinkedList(sll,4);
        sll.insertLinkedList(sll,5);
        sll.insertLinkedList(sll,6);
        sll.travelLinkedList(sll);
        sll=reverseLinkedList(sll);
        System.out.println("in reverse order");
        sll.travelLinkedList(sll);
        
    }
    
}
