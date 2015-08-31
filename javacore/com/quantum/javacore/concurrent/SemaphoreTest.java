package com.quantum.javacore.concurrent;

import java.util.concurrent.*;

//There are 4 threads try to aquire 2 semaphores. 
//Two threads have to wait for a semaphore to be released.
public class SemaphoreTest {
 
   public static void main(String args[]) {
      Semaphore semaphore=new Semaphore(2);
      MyThread mt1 = new MyThread(semaphore);
      MyThread mt2 = new MyThread(semaphore);
      MyThread mt3 = new MyThread(semaphore);
      MyThread mt4 = new MyThread(semaphore);
      mt1.start();
      mt2.start();
      mt3.start();
      mt4.start();
   }
}
 
class MyThread extends Thread {
 
   Semaphore semaphore;
 
   MyThread(Semaphore semaphore){
      this.semaphore = semaphore;
   }
 
   public void run() {
      try {
         semaphore.acquire();
         System.out.println("Hello " + this.getName());
         try {
            sleep(2000);
         } catch (Exception e) {}
      } catch (InterruptedException ie) {
      } finally {
         semaphore.release();
         System.out.println("Goodbye " + this.getName());
      }
   }
}
