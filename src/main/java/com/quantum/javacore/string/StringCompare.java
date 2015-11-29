package com.quantum.javacore.string;

public  class StringCompare
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
        
        System.out.println(x==p);
        System.out.println(x==y);        
        System.out.println(x==xx);
        System.out.println("p==xx ");
        System.out.println(p==xx);
        
        System.out.println(x.equals(p));
        System.out.println(x.equals(y));        
        System.out.println(x.equals(xx));
        
        System.out.println("In side StringBuffer");
        StringBuffer sb1=new StringBuffer("bairagi");
        StringBuffer sb2=new StringBuffer("bairagi");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2)); //equals method is not override from object equals method
        
        System.out.println("In side StringBuilder");
        StringBuilder sb3=new StringBuilder("bairagi");
        StringBuilder sb4=new StringBuilder("bairagi");
        System.out.println(sb3==sb4);
        System.out.println(sb3.equals(sb4)); //equals method is not override from object equals method
        
}
}