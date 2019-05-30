package com.quantum.ds.linkedlist;
import java.util.Iterator;

import com.quantum.ds.linkedlist.GlinkedList.Node;


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
	  int size=0;
	  
	  public int length(){
	       return size;
	  }
	  
	  
	  
	  public boolean add(E e){
		  if(header==null){
			  header=new Node<>(e);
			  tailer=header;
			  size++;
			  return true;
			  
		  }
		  tailer.next=new Node<>(e);
		  tailer.next.prev=tailer;
		  tailer=tailer.next;
		  size++;
		  return true;
	  }
	  
	  
	  public boolean checkIndex(int index){
		  if(index<0 || index>=size)
			  throw new IndexOutOfBoundsException();
		   return true;
	  }
	  
	  public boolean remove(int index){
		  if(checkIndex(index))
		  {
			  current=header;
			  for(int i=0;i<index-1;i++)
				    current=current.next;
			  if(index==0){
			        header=current.next;
			        header.prev=null;
			        current=null;
			  }
			  else if (current.next!=null && current.next.next!=null)
			  {
			      current.next=current.next.next;
			      current.next.prev=current;
			  }else {
			      current.next=null;
		      tailer=current;
			  }
			      
			  size--;
		  }
		  return true;
	  }
	  
	  public boolean add(int index,E e){
		  if(size==index || checkIndex(index))
		  {
			  Node<E> node=new Node(e);
			  current=header;
			  for(int i=0;i<index-1;i++)
				    current=current.next;
			  if(index==0)
			  {  
				    node.next=header;
				    header.prev=node;
			        header=node;
			  }
			  else { 		      
			      node.next=current.next;
			      current.next=node;
			      node.prev=current;
			      if(node.next==null)
			    	      tailer=node;
			      else
			    	  node.next.prev=node;
			  }
			  size++;
		  }
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
		
		glist.remove(3);
		System.out.println("length "+ glist.length()+" elements are ");
		it=glist.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		System.out.println("Reverse Insertion order Iteration");
		rit=glist.reverseIterator();
		while (rit.hasPrev())
			System.out.println(rit.prev());
		
		
		glist.add(3,7);
		System.out.println("length "+ glist.length()+" elements are ");
		it=glist.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		System.out.println("Reverse Insertion order Iteration");
		rit=glist.reverseIterator();
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
