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
public class KthNodeAlternativeReverse {
    public static SingleLinkedList reverseUptoKthNode(SingleLinkedList sll,int k){
        if(sll.getNext()==null)
            return sll;
        SingleLinkedList first,mid,last;
        first=sll;
        mid=sll.getNext();
        last=mid.getNext();
        first.setNext(null);
        while(last!=null && k>2){
           mid.setNext(first);           
           first=mid;
           mid=last;
           last=last.getNext();
           --k;
        }
        mid.setNext(first);
        return mid;
    }
            
  
 
   public static SingleLinkedList kthNodeAlternativeReverse(SingleLinkedList sll,int k){      
      
   
       SingleLinkedList first,mid,last;
     if(sll==null || sll.getNext()==null)
     {   return sll; }      
        
        first=sll;
        mid=sll.getNext();
        last=mid.getNext();        
        int kk=k;
        while(last!=null && kk>2){
           mid.setNext(first);           
           first=mid;
           mid=last;
           last=last.getNext();
           --kk;
        }
        mid.setNext(first);
        first=sll;        
        first.setNext(kthNodeAlternativeReverse(last, k));
        return mid;
}
    public static void main(String[] args) {
        SingleLinkedList sll=SingleLinkedList.createLinkedList(1);
        sll.insertLinkedList(sll,2);
        sll.insertLinkedList(sll,3);
        sll.insertLinkedList(sll,4);
        sll.insertLinkedList(sll,5);
        sll.insertLinkedList(sll,6);
        sll.insertLinkedList(sll,7);
        sll.insertLinkedList(sll,8);
        sll.insertLinkedList(sll,9);
        sll.insertLinkedList(sll,10);
        sll.insertLinkedList(sll,11);
        sll.insertLinkedList(sll,12);
        sll.insertLinkedList(sll,13);
        sll.insertLinkedList(sll,14);
        sll.insertLinkedList(sll,15);
        sll.travelLinkedList(sll);
        System.out.println("Kth node alternative reverse");        
        sll=kthNodeAlternativeReverse(sll,3);        
        sll.travelLinkedList(sll);
}
}

