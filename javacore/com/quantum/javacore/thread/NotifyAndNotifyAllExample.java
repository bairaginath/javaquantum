package com.quantum.javacore.thread;

import java.util.concurrent.CountDownLatch;

public class NotifyAndNotifyAllExample {
    static final int N_THREADS = 10;
    static final char[] lock = new char[0];
    static final CountDownLatch latch = new CountDownLatch(N_THREADS);

    public static void main(String[] args) {
        for (int i = 0; i < N_THREADS; i++) {
            final int id = i;
            new Thread() {
                @Override public void run() {
                    synchronized (lock) {
                        System.out.println("waiting: " + id);
                       latch.countDown();
                        try { lock.wait(); }
                        catch (InterruptedException e) {
                            System.out.println("interrupted: " + id);
                        }
                        System.out.println("awake: " + id);
                    }
                }
            }.start();
        }

        try { latch.await(); }
        catch (InterruptedException e) {
            System.out.println("latch interrupted");
        }
        //notify to only one thread
        //synchronized (lock) { lock.notify(); }
        //notify to all 
        //synchronized (lock) { lock.notifyAll(); }
    }
}
