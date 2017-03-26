package com.quantum.javacore.string;

public  class StringCompare
{
    public static void main(String[] args) {
   
        String ref1="bairagi";
        String strObj1=new String("bairagi");
        String strObj2=new String("bairagi");
        String ref2="bairagi";
        String intern=new String("bairagi").intern();
        System.out.println(ref1.hashCode());
        System.out.println(ref2.hashCode());
        System.out.println(strObj1.hashCode());
        System.out.println(strObj2.hashCode()); 
        System.out.println(intern.hashCode());
        
        System.out.println("ref1==ref2 "+(ref1==ref2));
        System.out.println("ref1==strObj1 "+(ref1==strObj1));        
        System.out.println("ref2==strObj1 "+(ref2==strObj1));
        System.out.println("strObj1==strObj2 "+(strObj1==strObj2));
        System.out.println("ref1==intern"+(ref1==intern));
        System.out.println("intern==strObj1"+(intern==strObj1));
        
        System.out.println("ref1.equals(ref2)"+ref1.equals(ref2));
        System.out.println("ref1.equals(strObj1)"+ref1.equals(strObj1));        
        System.out.println("ref2.equals(strObj2)"+ref2.equals(strObj2));
        System.out.println("strObj1.equals(strObj2)"+strObj1.equals(strObj2));
       
        
        
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