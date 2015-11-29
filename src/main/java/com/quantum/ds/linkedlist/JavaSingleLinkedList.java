package com.quantum.ds.linkedlist;





public class JavaSingleLinkedList<E>{
	
	 transient int size = 0;	   
	 transient Node<E> first;
	 transient Node<E> last;

	
	private static class Node<E> {
        E item;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }
	 void linkLast(E e) {
	        final Node<E> l = last;
	        final Node<E> newNode = new Node<E>(e, null);
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
		 if (index < size ) {
	            Node<E> x = first;
	            for (int i = 0; i < index; i++)
	                x = x.next;
	            return x;
		 }
		 return null;
	 }

	       /* 
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
	        } */
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
	        {   linkLast(element);}
	        else if(index==0)
	        { linkFirst(element);   }	
	        else
	        {  linkAfter(element, node(index-1));}
	    }
	 void linkFirst(E e){
		 final Node<E> newNode=new Node<E>(e,first);
		 first=newNode;
		 size++;
		 
	 }
	 void linkAfter(E e, Node<E>  pred) {
	        // assert succ != null;
	        final Node<E> succ = pred.next;
	        final Node<E> newNode = new Node<E>(e,null);
	        pred.next=newNode;
	        if (succ== null)
	            last = newNode;
	        else
	            newNode.next = succ;
	        size++;
	    }
	    public int size(){
	    	return size;
	    }
	    public Node<E> getFirst(){
	    	return first;
	    }
	    public Node<E> getLast(){
	    	return last;
	    }
	    public void forwardTravels(){
	    	Node<E> node=first;
	    	while(node!=null){
	    		System.out.println(node.item);
	    		node=node.next;
	    	}
	    }
	    
	    public boolean remove(Object o){
	    	if(o.equals(first.item)){
	    		first=first.next;
	    		size--;
	    		return true;
	    	}
	    	
	    	for (Node<E> x = first; x.next != null; x = x.next) {
                if (o.equals(x.next.item)) {
                    unlink(x);
                    return true;
                }
               
	       }  
	    	return false;
	    		
	    	}
	    void unlink(Node<E>prevNode){
    		Node<E> deleteNode=prevNode.next;
    		prevNode.next=deleteNode.next;
    		if(deleteNode.next==null){
    			last=prevNode;
    		}
    		deleteNode=null;
    		size--;
    	}
	    
	    public static void main(String[] args) {
	    	JavaSingleLinkedList<Integer> jsll=new JavaSingleLinkedList<Integer>();
		    jsll.add(1);
		    jsll.add(2);
		    jsll.add(3);
		    jsll.add(4);
		    jsll.add(5);
		    jsll.add(6);
		    System.out.println("Adding with out index "+jsll.size()+"  "+jsll.first.item+"  "+jsll.last.item);
		    jsll.forwardTravels();
		    jsll.add(0,0);
		    jsll.add(4,65);
		    jsll.add(jsll.size(),88);
		    System.out.println("Adding with index "+jsll.size()+"  "+jsll.first.item+"  "+jsll.last.item);
		    jsll.forwardTravels();
		    System.out.println("Before remove "+jsll.size()+"  "+jsll.first.item+"  "+jsll.last.item);
		    jsll.forwardTravels();
		    jsll.remove(88);
		    jsll.remove(0);
		    jsll.remove(3);
		    System.out.println("After remove "+jsll.size()+"  "+jsll.first.item+"  "+jsll.last.item);
		    jsll.forwardTravels();
		    
			
		}
	    
	    

	    
	    
	   

}
