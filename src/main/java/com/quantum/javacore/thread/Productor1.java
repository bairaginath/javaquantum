/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author BAIRAGI
 */
public class Productor1 extends Thread{
    
   List<Employee> l=new ArrayList<Employee>();
   public void run(){
       Scanner sc=new Scanner(System.in);
       synchronized(this.l){
           for(int i=0;i<5;i++){
               System.out.println("enter the employee name");
               String name=sc.next();
               System.out.println("enter the employee sal");
               int sal=sc.nextInt();
              l.add(new Employee(name,sal));
           }
           l.notify();
       }
   }
}
