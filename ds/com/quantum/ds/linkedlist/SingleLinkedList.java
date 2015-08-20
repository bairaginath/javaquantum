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
public class SingleLinkedList {
    
   int data;
   SingleLinkedList next=null;

    public int getData() {
        return data;
    }

    public SingleLinkedList getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(SingleLinkedList next) {
        this.next = next;
    }
  public static SingleLinkedList createLinkedList(int x)
   {
       return new SingleLinkedList(x);
   }
  public SingleLinkedList(int data)
   {
        this.data=data;
   }
    public SingleLinkedList(){
        
    }
    
    public SingleLinkedList insertLinkedList(SingleLinkedList sll,int data)
    {
        if(sll.getNext()==null)
        {
            sll.setNext(new SingleLinkedList(data));
            return sll;
        }
        
        return insertLinkedList(sll.getNext(),data);
            
    }
    
   public void travelLinkedList(SingleLinkedList sll){
      
       if(sll==null)
           return;
       System.out.println(sll.getData());
       travelLinkedList(sll.getNext());
       
   }
}
