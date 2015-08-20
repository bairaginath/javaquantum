package com.quantum.javacore.basics;

class parents
{
    int x=5;
    void display()
    {
        System.out.println("parents");
    }
    void display_parents()
    {
        System.out.println("display parents");
    }
}
class child extends parents
{
    int x=6;
    int y=7;
    void display()
    {
        System.out.println("child");
    }
    void display_child()
    {
        System.out.println("display child");
    }
}

public class Type_Casting
{
    public static void main(String[] args)throws Exception {
        
        child c=new child();
        parents p=new child();
        p.display();
        p.display_parents();
    //    p.display_child();   // can't access child methods
        System.out.println(p.x);
       // parents l=new parents();
        //child o=(child) new parents();
        //System.out.println(o.x);
       Object O=(child)new child();
        child  li=(child)O;
        System.out.println(li.x);
        
        
    }
}
