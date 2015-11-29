/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.ds.linkedlist;

/**
 *
 * @author BAIRAGI
 */
public class DLL {
    int data;
    DLL next=null;
    DLL prev=null;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(DLL next) {
        this.next = next;
    }

    public void setPrev(DLL prev) {
        this.prev = prev;
    }

    public DLL getNext() {
        return next;
    }

    public DLL getPrev() {
        return prev;
    }
    DLL(int data){
        this.data=data;
    }
    
    void insert(DLL node,int value){     
        
        if(node.getNext()==null)
        {  
            DLL temp=new DLL(value);
            node.setNext(temp);
            temp.setPrev(node);
            return;
        }
        insert(node.getNext(),value);        
        
    }
     static DLL creatDoubleLinkedList(int data)
    {
        return new DLL(data);
    }
     
     void forword(DLL l){
         if(l.getNext()==null)
         {  System.out.println(l.getData());
             System.out.println("==================");
             l.backword(l);
             return; 
         }
         System.out.println(l.getData());
         forword(l.getNext());
     }
     void backword(DLL l){
         if(l==null)
             return;
         System.out.println(l.getData());
         backword(l.getPrev());
     }
    public static void main(String[] args) {
        
        DLL dll=creatDoubleLinkedList(1);
        dll.insert(dll,2);
        dll.insert(dll,3);
        dll.insert(dll,4);
        dll.insert(dll,5);
        dll.forword(dll);
       // dll.backword(dll);
    }
            
    
}
