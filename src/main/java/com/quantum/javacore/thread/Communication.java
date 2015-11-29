/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.javacore.thread;

import java.util.LinkedList;

/**
 *
 * @author canvera
 */
public class Communication {
 
    public static void main(String[] args) {
         Productor d=new Productor();
         Consumer c=new Consumer(d);
         c.start();
         d.start();
        
       
       
        
    }
    
}
