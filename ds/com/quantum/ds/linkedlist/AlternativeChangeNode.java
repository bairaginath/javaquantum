package com.quantum.ds.linkedlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author canvera
 */
public class AlternativeChangeNode {
    
    
    public static void swap(SingleLinkedList first,SingleLinkedList second){
        second.setNext(first);
        first.setNext(null);
    }
 public static void alternativeChangeNode1(SingleLinkedList sll){
       
       SingleLinkedList first,mid,last;
       first=sll;
       mid=sll;
       last=mid.getNext();
       while( last.getNext()!=null){
           mid.setNext(first);
           first.setNext(last.getNext());
           first=last;
           mid=first.getNext();
           last=mid.getNext();
           
       }
       mid.setNext(null);
       last.setNext(mid);
       
   }
    
   public static void alternativeChangeNode(SingleLinkedList sll){
       
       SingleLinkedList first,mid,last;
       first=sll;
       mid=sll.getNext();
       last=mid.getNext();       
       while(last!=null && last.getNext()!=null){
           mid.setNext(first);
           first.setNext(last.getNext());
           first=last;
           mid=first.getNext();
           last=mid.getNext();
           
       }
       first.setNext(last);
       mid.setNext(first);
       
   }
   
   public static SingleLinkedList alternativeChangeNode2(SingleLinkedList sll){
       
       SingleLinkedList first,mid,last,temp;
       first=sll;
       mid=sll.getNext();
       temp=mid;
       last=mid.getNext();       
       while(last!=null && last.getNext()!=null){
           mid.setNext(first);
           first.setNext(last.getNext());
           first=last;
           mid=first.getNext();
           last=mid.getNext();           
       }
       first.setNext(last);
       mid.setNext(first);
       return temp;       
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
        sll.travelLinkedList(sll);
        System.out.println("alternatively Change Nodes");
        SingleLinkedList sss=sll.next;
//        alternativeChangeNode(sll);
//        sll.travelLinkedList(sss);
        sll=alternativeChangeNode2(sll);
        sll.travelLinkedList(sll);
    }
    
}
