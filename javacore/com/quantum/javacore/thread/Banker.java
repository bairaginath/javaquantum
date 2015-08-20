/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quantum.javacore.thread;

/**50
 *
 * @author canvera
 */
public class Banker {
    
    public static void main(String[] args) {
        Deposite d=new Deposite();
        Withdraw w=new Withdraw(d);
        d.start();
        w.start();
         
       
    }
    
}
