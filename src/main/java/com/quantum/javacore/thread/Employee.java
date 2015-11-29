/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.thread;

/**
 *
 * @author BAIRAGI
 */
public class Employee {
    
    String name;
    int sal;

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
    
  public  Employee(String name,int sal){
        this.name=name;
        this.sal=sal;
    }
    
}
