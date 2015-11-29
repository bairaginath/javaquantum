package com.quantum.ds.bst;



import java.util.HashMap;


class BST_NULL {

    int data;
    BST_NULL left = null;
    BST_NULL right = null;

    BST_NULL(int value) {
        this.data = value;
    }
    BST_NULL()
    {
        
    }

    void insert(BST_NULL root, int value) {
        
        if(root==null){
            root=new BST_NULL(value);
            return;
            
        }
        
        if (root.data < value) {
            if (root.right != null) {
                insert(root.right, value);
            } else {
                root.right = new BST_NULL(value);
            }
        } else {
            if (root.left != null) {
                insert(root.left, value);
            } else {
                root.left = new BST_NULL(value);
            }

        }

    }

    void inorder(BST_NULL root) {
        //System.out.println(root.data);
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    
    void verticalSum(BST_NULL root,int column, HashMap hm){
        
        if(root==null)
            return;
        verticalSum(root.left, column-1,hm);
        hm.put(column, root.data);
        int temp=(Integer)hm.get(column);
        hm.put(column,temp+root.data);
        verticalSum(root.right,column+1, hm);
    }

   static BST_NULL createTree(int data){
        
        BST_NULL root= new BST_NULL(data);
        return root;
    }


    public static void main(String arags[]) {
        //BST_NULL root = new BST_NULL(4);
        BST_NULL root=createTree(4);
        //root.insert(root,4);
        root.insert(root, 2);
        root.insert(root, 3);
        root.insert(root, 1);
        root.insert(root, 6);
        root.insert(root, 5);
        root.insert(root, 7);
        root.inorder(root);
        HashMap <Integer,Integer> hm=new HashMap<Integer, Integer>();
        root.verticalSum(root,0, hm);
        System.out.println(hm.entrySet());
    }
}