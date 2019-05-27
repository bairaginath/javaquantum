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
	
	
}
  
	

}
