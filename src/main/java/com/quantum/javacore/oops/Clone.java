package com.quantum.javacore.oops;


public  class Clone implements Cloneable {
    int x = 5;
    public static void main(String[] args) throws Exception {
        Clone ob=new Clone();
        Clone ob1=(Clone)ob.clone();
        Clone ob3=ob;
        ob3.x=50;
        System.out.println(ob3.x+"=========="+ob.x);
        System.out.println(ob1.hashCode()+"=========="+ob.hashCode());
        ob1.x++;
        Clone ob2=ob;
        ob2.x+=5;
        System.out.println(ob +"    "+ob.x);
        System.out.println(ob1 +"   "+ob1.x);
        System.out.println(ob2 +"   "+ob2.x);
        System.out.println(ob.hashCode()==ob.clone().hashCode());
    }
}
