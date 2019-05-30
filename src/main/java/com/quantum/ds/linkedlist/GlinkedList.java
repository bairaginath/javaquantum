/**
 * 
 */
package com.quantum.ds.linkedlist;

import java.util.Iterator;

/**
 * @author bairagi 27-May-2019 10:04:29 PM GlinkedList.java
 *
 */
public class GlinkedList<E> implements Iterator<E> {

	@Override
	public boolean hasNext() {
		if(current!=null)
			return true;
		return false;
	}

	@Override
	public E next() {
		E e=current!=null?current.e:null;
		current=e!=null ? current.next:null;
		return e;
	}
	
	public Iterator<E> iterator() {
		current=header;
		return this;
	}
	
	public Iterator<E> iterator(Node<E> header) {
		current=header;
		return this;
	}
	
  class Node<E> {
	  E e;
	  Node next;
	      public Node(E e){
	    	  this.e=e;
	      }
  }
  
  Node<E> header;
  Node<E> tailer;
  Node<E> current;
  
  public boolean add(E e){
	  if(header==null){
		  header=new Node<>(e);
		  tailer=header;
		  return true;
		  
	  }
	  tailer.next=new Node<>(e);
	  tailer=tailer.next;
	  return true;
  }
  
    public  Node<E> reverse(Node<E> node){
    	   Node<E> first,mid,last;
    	   first=node;
    	   mid=first.next;
    	   first.next=null;
    	   if(mid.next==null){
    		   mid.next=first;
    		   first.next=null;
    		   return mid;
    	   }else {
    		   while (mid!=null){
    			   last=mid.next;
    			   mid.next=first;
    			   first=mid;
    			   mid=last;
    		   }
    		   return first;
    	   }
    	
    }
  
  
  public static void main(String[] args) {
	GlinkedList<Integer> glist=new GlinkedList<>();
	glist.add(1);
	glist.add(2);
	glist.add(3);
    glist.add(4);
    glist.add(5);
	
	Iterator<Integer> it=glist.iterator();
	while (it.hasNext())
		System.out.println(it.next());
	
	GlinkedList.Node first=glist.reverse(glist.header);
	
	System.out.println("revese with linear time");
	
	it=glist.iterator(first);
	while (it.hasNext())
		System.out.println(it.next());
	
	
	
	
	
}
  
	

}
