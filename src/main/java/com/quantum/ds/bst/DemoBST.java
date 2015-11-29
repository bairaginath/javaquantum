/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.ds.bst;




class BSTREE{
    int data;
    BSTREE left=null;
    BSTREE right=null;

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(BSTREE left) {
        this.left = left;
    }

    public void setRight(BSTREE right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public BSTREE getLeft() {
        return left;
    }

    public BSTREE getRight() {
        return right;
    }
    
    BSTREE(int data){
        this.data=data;
    }
   static  BSTREE createBST(int root){
       return new BSTREE(root);
   }
   
   void insert(BSTREE bst,int value){
       
       if(bst.getData()<value){
           if(bst.getRight()==null)
           {   bst.setRight(new BSTREE(value)); return;}
           insert(bst.getRight(),value);
       }else{
           if(bst.getLeft()==null)
           {bst.setLeft(new BSTREE(value)); return ; }
           insert(bst.getLeft(),value);
       }
       
   }
   void inorder(BSTREE bst){
       if(bst==null)
           return;
       inorder(bst.getLeft());
       System.out.println(bst.getData());
       inorder(bst.getRight());
   }
 
   
   int bstHeight(BSTREE bst){
      
       if(bst==null)
        return -1;
    int left=bstHeight(bst.getLeft())+1; 
    int right=bstHeight(bst.getRight())+1;
    
    if(left>right){
        hnode=bst.getData();
        return left;
    }
    else {
        hnode=bst.getData();
        return right;
    }
   }
   static int hnode;
int heightNode(BSTREE bst){   
    
    bstHeight(bst);
    return hnode;
}

static int depth;
int bstDepth(BSTREE bst){
    
    if(bst==null){
        return depth;
    }
    
    int left=bstDepth(bst);
    ++depth;
    int right=bstDepth(bst);
    
    return left<right ? right : left;
}
}



public class DemoBST {   
    
    
    
    public static void main(String[] args) {
        BSTREE bst=BSTREE.createBST(4);
        bst.insert(bst,2);
        bst.insert(bst,3);
        bst.insert(bst,1);
        bst.insert(bst,6);
        bst.insert(bst,5);
        bst.insert(bst,7);
        bst.insert(bst,0);        
        bst.inorder(bst);
        System.out.println("Height of BST  "+bst.bstHeight(bst));
        System.out.println("Height Node    "+bst.heightNode(bst));
        System.out.println("Depth of BST   "+bst.bstDepth(bst));
        
        
    }
    
}
