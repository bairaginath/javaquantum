/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.thread;

import java.util.Map;

/**
 *
 * @author BAIRAGI
 */
class MyThread extends Thread {

    public void run() {
        System.out.println("In side Run method");
        
    }
}

public class AllStackTrances extends MyThread {

    public static void main(String[] args) {
        AllStackTrances t = new AllStackTrances();
        Thread tt = new Thread(t,"bairagiThread");
        tt.start();
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        
        
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            System.out.println("****************************");
            System.out.println("Thread name  "+entry.getKey().getName());
            for (StackTraceElement ste : entry.getValue()) {
                System.out.println("StackTraceElements " + ste.toString());
            }
            System.out.println("===================================");
        }
    }
}
