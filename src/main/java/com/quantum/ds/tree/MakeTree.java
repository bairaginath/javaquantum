package com.quantum.ds.tree;


public class MakeTree {
    
    MakeTree left;
    MakeTree right;
    String data;
    static int index; 
    char ch;
    
    MakeTree(String s)
    {
        this.data=s;
    }
    
   static MakeTree preorderToMakeTree(String A[])
    {
        MakeTree newTree=new MakeTree(A[index]);
        if(A.length==0)
            return null;
        if("L".equals(A[index]))
        {
            return newTree;
        }
        if("I".equals(A[index]))
        {
            index++;
            newTree.left=preorderToMakeTree(A);
            index++;
            newTree.right=preorderToMakeTree(A);
            return newTree;
            
        }
        
        
             return null;
        } 
    
        
        void preorder(MakeTree ob)
        {
            if(ob==null)
                return;
            System.out.println(ob.data);
            preorder(ob.left);
            preorder(ob.right);
            
        }
    
    
    public static void main(String[] args){
        
        String S[]={"I","I","L","L","I","L","L"};
        MakeTree tree=preorderToMakeTree(S);
        tree.preorder(tree);
    }
    
}
