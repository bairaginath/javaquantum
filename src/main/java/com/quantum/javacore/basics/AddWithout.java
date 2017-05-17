package com.quantum.javacore.basics;


public class AddWithout
{
   static int add(int a, int b)
    {
      if (a==0)
         return b;
        System.out.println("value of a & b  "+ ((a&b)<<1)   +"   a^b  "+ (a^b));
      return add((a & b) << 1, a ^ b);
}


    public static void main(String[] args) {
   
        int a=99;
        int b=40;
        //System.out.println((a&b)<<1);
        System.out.println(add(a,b)); 
        
}
}