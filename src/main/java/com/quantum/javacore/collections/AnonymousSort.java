package com.quantum.javacore.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * sort employee objects by empName
 */
/**
 *
 * @author BAIRAGI
 */
class Employee {

    private String name;

    public String getName() {
        return name;
    }

    Employee(String name) {
        this.name = name;
    }
}

 
public class AnonymousSort {
    
   public static void outPut(Object ob){
        
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("julu");
        Employee e2 = new Employee("tapan");
        Employee e3 = new Employee("bairagi");
        Employee e4 = new Employee("raaz");
        Employee e5 = new Employee("amit");
        List ar = new ArrayList();
        ar.add(e1);
        ar.add(e2);
        ar.add(e3);
        ar.add(e4);
        ar.add(e5);
        
        Collections.sort(ar,new Comparator<Employee>(){
        
        public int compare(Employee x,Employee y){
           return x.getName().compareTo(y.getName());
       }    
        
    });
        
      
        
        for (Object o : ar) {
            Employee e = (Employee) o;
            System.out.println(e.getName());
        }



    }
}
