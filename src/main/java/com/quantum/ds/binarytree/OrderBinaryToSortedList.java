package com.quantum.ds.binarytree;

public class OrderBinaryToSortedList {
	

	static class Node {
	    int data;
	    Node small;
	    Node large;
	    
	    public Node(int data) {
	        this.data = data;
	        small = null;
	        large = null;
	    }
	}


	    public static void join(Node a, Node b) {
	        a.large = b;
	        b.small = a;
	    }

	    public static Node append(Node a, Node b) {
	        // if either is null, return the other
	        if (a==null) return(b);
	        if (b==null) return(a);
	        
	        // find the last node in each using the .previous pointer
	        Node aLast = a.small;
	        Node bLast = b.small;
	        
	        // join the two together to make it connected and circular
	        join(aLast, b);
	        join(bLast, a);
	        
	        return(a);
	    }

	    public static Node treeToList(Node root) {
	        // base case: empty tree -> empty list
	        if (root==null) return(null);
	        
	        // Recursively do the subtrees (leap of faith!)
	        Node aList = treeToList(root.small);
	        Node bList = treeToList(root.large);
	        
	        // Make the single root node into a list length-1
	        // in preparation for the appending
	        root.small = root;
	        root.large = root;
	        
	        // At this point we have three lists, and it's
	        // just a matter of appending them together
	        // in the right order (aList, root, bList)
	        aList = append(aList, root);
	        aList = append(aList, bList);
	        
	        return(aList);
	    }

	    public static void treeInsert(Node root, int newData) {
	        if (newData<=root.data) {
	            if (root.small!=null) treeInsert(root.small, newData);
	            else root.small = new Node(newData);
	        }
	        else {
	            if (root.large!=null) treeInsert(root.large, newData);
	            else root.large = new Node(newData);
	        }
	    }

	    public static void printTree(Node root) {
	        if (root==null) return;
	        printTree(root.small);
	        System.out.print(Integer.toString(root.data) + " ");
	        printTree(root.large);
	    }
	    
	    
	    // Do a traversal of the list and print it out
	    public static void printList(Node head) {
	        Node current = head;
	        
	        while (current != null) {
	            System.out.print(Integer.toString(current.data) + " ");
	            current = current.large;
	            if (current == head) break;
	        }
	        
	        System.out.println();
	    }
	            

	    public static void main(String[] args) {

	        Node root = new Node(4);
	        treeInsert(root, 2);
	        treeInsert(root, 1);
	        treeInsert(root, 3);
	        treeInsert(root, 5);
	        
	        System.out.println("tree:");
	        printTree(root);   // 1 2 3 4 5
	        System.out.println();
	        
	        System.out.println("list:");
	        Node head = treeToList(root);
	        printList(head);   // 1 2 3 4 5   yay!
	    }
	}
	
	


