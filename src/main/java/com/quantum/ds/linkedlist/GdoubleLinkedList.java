package com.quantum.ds.linkedlist;
import java.util.Iterator;


interface ReverseIterator<E>
{
	boolean hasPrev();
	E prev();
}
public class GdoubleLinkedList<E> implements Iterator<E>,ReverseIterator<E>  {
	



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
		  Node prev;
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
		  tailer.next.prev=tailer;
		  tailer=tailer.next;
		  return true;
	  }
	  public static void main(String[] args) {
		GdoubleLinkedList<Integer> glist=new GdoubleLinkedList<>();
		glist.add(1);
		glist.add(2);
		glist.add(3);
		glist.add(4);
		glist.add(5);
		System.out.println("Insertion order Iteration");
		Iterator<Integer> it=glist.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		System.out.println("Reverse Insertion order Iteration");
		ReverseIterator<Integer> rit=glist.reverseIterator();
		while (rit.hasPrev())
			System.out.println(rit.prev());
		
		
		
		
		
	}
	  
	  
	  public ReverseIterator<E> reverseIterator() {
			current=tailer;
			return this;
		}

	@Override
	public boolean hasPrev() {
		if(current!=null)
			return true;
		return false;
	}

	@Override
	public E prev() {
		E e=current!=null?current.e:null;
		current=e!=null ? current.prev:null;
		return e;
	}
	  
		



}
