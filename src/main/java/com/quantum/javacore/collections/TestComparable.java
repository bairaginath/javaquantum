package com.quantum.javacore.collections;

import java.util.ArrayList;
import java.util.Collections;

class TestComparable implements Comparable<TestComparable>
{
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    TestComparable(String Name){
        this.name=Name;
    }
    
    public static void main(String[] args) {
        
        TestComparable t1=new TestComparable("bairagi");
        TestComparable t2=new TestComparable("amit");
        TestComparable t3=new TestComparable("ajit bhai");
        ArrayList<TestComparable> ar=new ArrayList<TestComparable>();
        ar.add(t1);
        ar.add(t2);
        ar.add(t3);
        Collections.sort(ar);
        for(TestComparable t:ar)
           System.out.println(t.getName());
        
        
       
       }

    
    public int compareTo(TestComparable o) {
      return  getName().compareTo(o.getName());
    }
        
         
    
}