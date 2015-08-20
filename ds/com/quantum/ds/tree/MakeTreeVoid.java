package com.quantum.ds.tree;


public class MakeTreeVoid {
    
    MakeTreeVoid left;
    MakeTreeVoid right;
    String data;
    static int index=0; 
    char ch;
    
    MakeTreeVoid(String s)
    {
        this.data=s;
    }
    
   static void preorderToMakeTreeVoid(String A[],MakeTreeVoid tree)
    {
        if(tree==null){
                    return;
        }
        
        if(A.length==0)
            return ;
        if("L".equals(A[index]))
        {
            if(tree.data==null){
                tree.data=A[index];
                
                return;
            }
            if(tree.data==null){
                tree.data=A[index];
        
                return; }
        }
        if("I".equals(A[index]))
        {
            index++;
            tree.left=new MakeTreeVoid(A[index]);
            preorderToMakeTreeVoid(A,tree.left);
            index++;
            tree.right=new MakeTreeVoid(A[index]);
            preorderToMakeTreeVoid(A,tree.right);
            
        }
        
        
        } 
    
        
        void preorder(MakeTreeVoid ob)
        {
            if(ob==null)
                return;
            System.out.println(ob.data);
            preorder(ob.left);
            preorder(ob.right);
            
        }
    
    
    public static void main(String[] args){
        
        String S[]={"I","I","L","L","I","L","L"};
        MakeTreeVoid tree=new MakeTreeVoid(S[index]);
        preorderToMakeTreeVoid(S,tree);
        tree.preorder(tree);
    }
    
}
