/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.ds.binarytree;


import java.util.LinkedList;

/**
 *
 * @author canvera
 */
public class BinaryTreeOperation {
     public static LinkedList<BinaryTree> queue=null;
      public static LinkedList<BinaryTree> getQueue() {
        return queue;
    }
    
    public static BinaryTree createBinaryTree(int data){
        queue=new LinkedList<BinaryTree>();
        BinaryTree bt=new BinaryTree(data);
        queue.add(bt);
        return bt;
    }
    
    public static void insertBinaryTree(int data){
        
      LinkedList<BinaryTree> queue=getQueue();
      BinaryTree parent=queue.peekFirst();
      BinaryTree bt=new BinaryTree(data);
      if(parent.getLeft()==null){
         parent.setLeft(bt);
        }
      else{
          parent.setRight(bt);
          queue.pollFirst();          
      }
      queue.offerLast(bt);
    }
    
   public static void inorderTravels(BinaryTree bt){
       if(bt==null)
           return;
       inorderTravels(bt.getLeft());
       System.out.println(bt.getData());
       inorderTravels(bt.getRight());
        
    }
    
    public static void main(String[] args) {
        BinaryTree bt=createBinaryTree(4);
        insertBinaryTree(2);
        insertBinaryTree(6);
        insertBinaryTree(1);
        insertBinaryTree(3);
        insertBinaryTree(5);
        insertBinaryTree(7);
        System.out.println("inorder travels");
        inorderTravels(bt);      
        
    }
    
}
