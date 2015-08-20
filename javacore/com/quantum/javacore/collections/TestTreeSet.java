/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author BAIRAGI
 */
class Emp implements Comparable<Emp>
{
    String name;
    int id;
    int sal;
    public int compareTo(Emp o) {
          return  getName().compareTo(o.getName()) ;
    }
    Emp(){
        
    }
    Emp(String name,int id,int sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }
}
public class TestTreeSet {
    
    public static void main(String[] args) {
        
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(3);
        ts.add(2);
        ts.add(5);
        ts.add(1);
        ts.add(4);
        Iterator it=ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        TreeSet<Emp> ite=new TreeSet<Emp>();
        Emp e1=new Emp("bairagi",101,45000);
        Emp e2=new Emp("julu",88,44320);
        Emp e3=new Emp("amit",333,88993);
        ite.add(e1);
        ite.add(e2);
        ite.add(e3);
        Iterator its=ite.iterator();
        while(its.hasNext()){
            System.out.println(((Emp)its.next()).getName());
        }
        
       }

    
    
    
    
}
    
    

