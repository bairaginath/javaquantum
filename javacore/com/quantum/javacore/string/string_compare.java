package com.quantum.javacore.string;

public  class string_compare
{
    public static void main(String[] args) {
   
        String p="bairagi";
        String x=new String("bairagi");
        String y=new String("bairagi");
        String xx="bairagi";
        System.out.println(p.hashCode());
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(xx.hashCode());
        System.out.println(x+"  "+y);
        
        System.out.println(x==y);
        System.out.println(x.hashCode()==y.hashCode());
        System.out.println(x==xx);
        System.out.println(x.hashCode()==xx.hashCode());
}
}