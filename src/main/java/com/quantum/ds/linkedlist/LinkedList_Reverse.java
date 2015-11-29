package com.quantum.ds.linkedlist;

class sll
{
    int data;
    sll next=null;
    
    void insert(sll head,int value)
    {
        if(head.next==null){
            head.next=new sll();
            head.next.data=value;
            return;
        }        
        insert(head.next,value);
    }
    void display(sll head)
    {
        if(head==null)
            return;
        System.out.println(head.data);
        display(head.next);
    }
    void reverse(sll head)
    {
        
    }
}
public class LinkedList_Reverse 
{
   public static void main(String[] args) {
    sll head=new sll();
    head.data=1;
    head.insert(head, 2);
    head.insert(head, 3);
    head.insert(head, 4);
    head.insert(head, 5);    
    head.display(head);     
}
}