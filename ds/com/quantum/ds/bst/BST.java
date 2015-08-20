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
public class BST {
    
   public int data;
   public BST left;
   public BST right;

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(BST left) {
        this.left = left;
    }

    public void setRight(BST right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public BST getLeft() {
        return left;
    }

    public BST getRight() {
        return right;
    }
   
    public BST(int data){
        this.data=data;
    }
    
}
