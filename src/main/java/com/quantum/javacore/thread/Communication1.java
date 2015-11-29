/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.thread;

/**
 *
 * @author BAIRAGI
 */
public class Communication1 {
    public static void main(String[] args) {
        
        Productor1 p=new Productor1();
        Consumer1 c=new Consumer1(p);
        c.start();
        p.start();
    }
}
