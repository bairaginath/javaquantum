/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.collections;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class SortByName implements Comparator<TestComparator>
{
    public int compare(TestComparator o1, TestComparator o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}

class SortById implements Comparator<TestComparator>
{
    public int compare(TestComparator o1, TestComparator o2) {
        return o1.getId().compareTo(o2.getId());
    }
    
}

public class TestComparator 
{
   private String name;
   private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    TestComparator(String id,String name){
        this.name=name;
        this.id=id;
    }
    
    public static void main(String[] args) {
        
        TestComparator t1=new TestComparator("5","bairagi");
        TestComparator t2=new TestComparator("2","amit");
        TestComparator t3=new TestComparator("3","ajit bhai");
        ArrayList<TestComparator> ar=new ArrayList<TestComparator>();
        ar.add(t1);
        ar.add(t2);
        ar.add(t3);
        Collections.sort(ar,new SortByName());
        for(TestComparator t:ar)
           System.out.println(t.getName());
        
        Collections.sort(ar,new SortById());
        for(TestComparator t:ar)
           System.out.println(t.getId());
        
        
       
       }

    
    
        
         
    
}
