/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.ds.bst;

/**
 *
 * @author canvera
 */

public class BSTOperation {
    
   public static BST createBST(int data){
       return new BST(data);
   }
   public static BST insertBST(BST bst,int data){

       if(bst.getData()<data){
           if(bst.getRight()==null)
           {  
               bst.setRight(new BST(data));
               return bst;
           
           }
           return insertBST(bst.getRight(),data);
       }
       else{
           if(bst.getLeft()==null){
              bst.setLeft(new BST(data));
              return bst;
           }
               
         return insertBST(bst.getLeft(),data);  
       }
   
       
   }
   public static void inOrderTravels(BST bst){
       if(bst==null){
           return;
       }
       inOrderTravels(bst.getLeft());
       System.out.println(bst.getData());
       inOrderTravels(bst.getRight());
   }
   public static int degreeOfBST(BST bst){
      
       if(bst==null)
       return -1;
     int left_degree=degreeOfBST(bst.getLeft())+1;
     int right_degree=degreeOfBST(bst.getRight())+1;
     if(left_degree<right_degree){
         return right_degree;
     }
     else{
         return left_degree;
     }
   }
   public static int longestPathOfBST(BST bst){
       if (bst==null)
          return -1;
       int leftPath=degreeOfBST(bst.getLeft())+1;
       int rightPath=degreeOfBST(bst.getRight())+1;
       return leftPath+rightPath;
   }
   
   public static BST binaryTreeToDoubleLinkedList(BST bst){
       BST left=null,right=null;
       if(bst==null)
           return bst;
     
       if(bst.getLeft()!=null)
       { 
            left=binaryTreeToDoubleLinkedList(bst.getLeft()); 
            while(left.getRight()!=null)
            {
               left=left.getRight();
            }
       bst.setLeft(left);
        left.setRight(bst);
       }
       if(bst.getRight()!=null){
           right=binaryTreeToDoubleLinkedList(bst.getRight());
           while(right.getLeft()!=null)
           {
            right=right.getLeft();
           }              
           bst.setRight(right);
           right.setLeft(bst);
       }      

          
       
       return bst; 
   }
   
  public static BST threadBST(BST bst){
      BST left=null,right=null;
      if(bst==null)
          return bst;
      left=threadBST(bst.getLeft());
      bst.setLeft(left);
      right=threadBST(bst.getRight());
  
      
      return bst;
     
  }
 public static void travelsBSTasLinkedListForward(BST bst){
     
     if(bst.getRight()==null)
         return;
     System.out.println(bst.getData());
     travelsBSTasLinkedListForward(bst.getRight());
     
 }
 public static void travelsBSTasLinkedListBackward(BST bst){
     
     if(bst.getLeft()==null)
         return;
     System.out.println(bst.getData());
     travelsBSTasLinkedListBackward(bst.getRight());
     
 }
  
    public static void main(String[] args) {
//        BST bst=createBST(2);
//        insertBST(bst,1);
//        insertBST(bst,6);
//        insertBST(bst,5);
//        insertBST(bst,4);
//        insertBST(bst,3);  
//        insertBST(bst,7);
//        insertBST(bst,8);
//        insertBST(bst,0);
//        insertBST(bst,-1);
//        inOrderTravels(bst);
//        System.out.println("degree of BST   "+ degreeOfBST(bst)); 
//        System.out.println("longest Path Of BST  "+longestPathOfBST(bst));
        BST root=createBST(4);
        BST two=insertBST(root,2);
        BST six=insertBST(root,6);
        BST one=insertBST(root,1);
        BST three=insertBST(root,3);
        BST five=insertBST(root,5);
        BST seven=insertBST(root,7);
        binaryTreeToDoubleLinkedList(root);
        System.out.println("three.left "+three.left.getData()  +"three.right "+three.right.data);
//        threadBST(root);
        //inOrderTravels(root);
        System.out.println("one"+one.data);
      travelsBSTasLinkedListForward(one);
      //travelsBSTasLinkedListBackward(six);
//       System.out.println(zero.left.getData());        
    }
     
}
