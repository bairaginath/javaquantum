/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.ds.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author canvera
 */
public class BinaryTree {
    public BinaryTree left=null;
    public BinaryTree right=null;
    public int data;
    public BinaryTree(int data){
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public BinaryTree getLeft() {
        return left;
    }

   

    public BinaryTree getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }
    
   
    
}
