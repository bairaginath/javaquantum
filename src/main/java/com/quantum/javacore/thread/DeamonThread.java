package com.quantum.javacore.thread;

 public class DeamonThread extends Thread {
	 
	 public void run(){
		 if (Thread.currentThread().isDaemon()){
			 System.out.println("DeamonThread  "+Thread.currentThread().getName());
		 }
		 else {
			 System.out.println("User Thread "+Thread.currentThread().getName());
		 }
	 }
     
     

    public static void main(String args[]){
    	
    	DeamonThread dt=new DeamonThread();
   
       Thread daemonThread = new Thread(dt,"Deamon Thread");
       Thread userThread=new Thread(dt,"User Thread");
           
           
     
       daemonThread.setDaemon(true); //making this thread daemon
       daemonThread.start();
       userThread.start();
     
     
}
 }
