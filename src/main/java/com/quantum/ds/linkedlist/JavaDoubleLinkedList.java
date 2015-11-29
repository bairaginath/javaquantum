package com.quantum.ds.linkedlist;

import java.util.List;
import java.util.LinkedList;






public class JavaDoubleLinkedList<E> {
	
	 transient int size = 0;	   
	 transient Node<E> first;
	 transient Node<E> last;

	
	private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
	 void linkLast(E e) {
	        final Node<E> l = last;
	        final Node<E> newNode = new Node<E>(l, e, null);
	        last = newNode;
	        if (l == null)
	            first = newNode;
	        else
	            l.next = newNode;
	        size++;
	        
	    }
	 public boolean add(E e) {
	        linkLast(e);
	        return true;
	    }
	 Node<E> node(int index) {       

	        if (index < (size >> 1)) {
	            Node<E> x = first;
	            for (int i = 0; i < index; i++)
	                x = x.next;
	            return x;
	        } else {
	            Node<E> x = last;
	            for (int i = size - 1; i > index; i--)
	                x = x.prev;
	            return x;
	        }
	    }
	 private boolean isPositionIndex(int index) {
	        return index >= 0 && index <= size;
	    }
	 private String outOfBoundsMsg(int index) {
	        return "Index: "+index+", Size: "+size;
	    }

	 private void checkPositionIndex(int index) {
	        if (!isPositionIndex(index))
	            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
	    }

	 public void add(int index, E element) {
	        checkPositionIndex(index);

	        if (index == size)
	            linkLast(element);
	        else
	            linkBefore(element, node(index));
	    }
	 void linkBefore(E e, Node<E> succ) {
	        // assert succ != null;
	        final Node<E> pred = succ.prev;
	        final Node<E> newNode = new Node<E>(pred, e, succ);
	        succ.prev = newNode;
	        if (pred == null)
	            first = newNode;
	        else
	            pred.next = newNode;
	        size++;
	    }
	    public void forwardTravels(){
	    	Node<E> node=first;
	    	while(node!=null){
	    		System.out.println(node.item);
	    		node=node.next;
	    	}
	    }
	    public void backwardTravels(){
	    	Node<E> node=last;
	    	while(node!=null){
	    		System.out.println(node.item);
	    		node=node.prev;
	    	}
	    }
	    
	    E unlink(Node<E> x) {
	        // assert x != null;
	        final E element = x.item;
	        final Node<E> next = x.next;
	        final Node<E> prev = x.prev;

	        if (prev == null) {
	            first = next;
	        } else {
	            prev.next = next;
	            x.prev = null;
	        }

	        if (next == null) {
	            last = prev;
	        } else {
	            next.prev = prev;
	            x.next = null;
	        }

	        x.item = null;
	        size--;
	        return element;
	    }
	    
	    public boolean remove(Object o) {
	        if (o == null) {
	            for (Node<E> x = first; x != null; x = x.next) {
	                if (x.item == null) {
	                    unlink(x);
	                    return true;
	                }
	            }
	        } else {
	            for (Node<E> x = first; x != null; x = x.next) {
	                if (o.equals(x.item)) {
	                    unlink(x);
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	
	public static void main(String[] args) {
		JavaDoubleLinkedList<Integer> javaDoubleLinkedList=new JavaDoubleLinkedList<Integer>();
		javaDoubleLinkedList.add(1);
		javaDoubleLinkedList.add(2);
		javaDoubleLinkedList.add(3);
		javaDoubleLinkedList.add(4);
		javaDoubleLinkedList.add(5);
		javaDoubleLinkedList.add(6);
		javaDoubleLinkedList.add(4,65);	
		System.out.println("Forward Travels");
		javaDoubleLinkedList.forwardTravels();
		System.out.println("Backward Travels");
		javaDoubleLinkedList.backwardTravels();
		javaDoubleLinkedList.remove(5);	
		System.out.println("Forward Travels");
		javaDoubleLinkedList.forwardTravels();
		System.out.println("Backward Travels");
		javaDoubleLinkedList.backwardTravels();
		
	}

}
