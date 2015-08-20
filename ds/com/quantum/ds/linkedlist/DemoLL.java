/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.ds.linkedlist;
/**
 *
 * @author BAIRAGI
 */

class LL
{
    int data;
    LL next=null;

    public LL getNext() {
        return next;
    }

    public void setNext(LL next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    
    
    LL(int data){
        this.data=data;
    }
     void insert(LL node,int value){     
        
        if(node.getNext()==null)
        {  
            node.setNext(new LL(value));
            return;
        }
        insert(node.getNext(),value);        
        
    }
     
     void insertIndex(LL node,int index,int value){
         
         if(node==null)
         {
             System.out.println("out of length");
             return;
         }
         if(index==1){
             LL temp=new LL(value);
             temp.setNext(node.getNext());
             node.setNext(temp);
             return;
         }
         
         insertIndex(node.getNext(),index-1,value);
     }
     
     void removeNode(LL node,int index){
         
         if(node==null)
         {
             System.out.println("out of length");
             return;
         }
         if(index==1){
             LL temp=node.getNext();
             //temp=temp.getNext();
             node.setNext(temp.getNext());
             return;
         }
         removeNode(node.getNext(),index-1);
     }
     static LL creatLinkedList(int data)
    {
        return new LL(data);
    }
     
     void display(LL l){
         if(l==null)
             return;
         System.out.println(l.getData());
         display(l.getNext());
     }
}
public class DemoLL {   
   
    
    public static void main(String[] args) {
        
        LL ll=LL.creatLinkedList(1);
        ll.insert(ll,2);
        ll.insert(ll,3);
        ll.insert(ll,4);
        ll.insert(ll,5);
        ll.display(ll);
        ll.insertIndex(ll,2,0);
        ll.display(ll);
        ll.removeNode(ll,2);
        ll.display(ll);
    }
}
