package com.quantum.ds.linkedlist;

class sll
{
    int data;
    sll next=null;
    
    
    public int getData() {
		return data;
	}
    public void setData(int data) {
		this.data = data;
	}
    
    public sll getNext() {
		return next;
	}
    
    public void setNext(sll next) {
		this.next = next;
	}
    
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
    sll reverse(sll current)
    {
    	 if(current.getNext()==null)
             return current;
         sll next,prev=null;
        next=current; 
          while(current!=null){
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
         }         
         return prev;
        
    }
}
public class LinkedListReverseOptimize 
{
   public static void main(String[] args) {
    sll head=new sll();
    head.data=1;
    head.insert(head, 2);
    head.insert(head, 3);
    head.insert(head, 4);
    head.insert(head, 5);    
    head.display(head); 
    head=head.reverse(head);
    System.out.println("Reverse order");
    head.display(head);
}
}