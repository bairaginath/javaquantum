/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.ds.linkedlist;

/**
 *
 * @author BAIRAGI
 */
public class CDLL {
    int data;
    CDLL next=null;
    CDLL prev=null;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(CDLL next) {
        this.next = next;
    }

    public void setPrev(CDLL prev) {
        this.prev = prev;
    }

    public CDLL getNext() {
        return next;
    }

    public CDLL getPrev() {
        return prev;
    }
    CDLL(int data){
        this.data=data;
    }
    
    CDLL insert(CDLL node,int value){     
        
        if(node.getNext()==null)
        {  
            CDLL temp=new CDLL(value);
            node.setNext(temp);
            temp.setPrev(node);
            return temp;
        }
       return insert(node.getNext(),value);        
        
    }
     static CDLL creatDoubleLinkedList(int data)
    {
        return new CDLL(data);
    }
     
     void forword(CDLL l){
         if(l.getNext()==null)
         {  System.out.println(l.getData());
             System.out.println("==================");
             l.backword(l);
             return; 
         }
         System.out.println(l.getData());
         forword(l.getNext());
     }
     void backword(CDLL l){
         if(l==null)
             return;
         System.out.println(l.getData());
         backword(l.getPrev());
     }
     static int x=0;
     void display(CDLL l){
         
         if(x==10)
            return;
         ++x;
         System.out.println(l.getData());
         display(l.getNext());
     }
    public static void main(String[] args) {
        
        CDLL dll=creatDoubleLinkedList(1);
        dll.insert(dll,2);
        dll.insert(dll,3);
        dll.insert(dll,4);
       CDLL cdll= dll.insert(dll,5);
       cdll.setNext(dll);
       dll.setPrev(cdll);
       dll.display(dll);
       // dll.forword(dll);
       // dll.backword(dll);
       
    }
            
    
}

