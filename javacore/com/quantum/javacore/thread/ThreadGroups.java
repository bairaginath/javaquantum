package com.quantum.javacore.thread;

class Reservation extends Thread {
	public void run(){
		System.out.println("In Side Reservation");
	}
}

class Cancellation extends Thread {
	public void run(){
		System.out.println("In Side Cancellation");
	}
}

public class ThreadGroups {
	
	public static void main(String[] args) {
		
		
		Reservation res=new Reservation();
		Cancellation can=new Cancellation();
		ThreadGroup tg=new ThreadGroup("FirstGroup");
		Thread t1=new Thread(tg,res,"FirstThread");
		Thread t2=new Thread(tg,res,"SecondThread");
		
		ThreadGroup tg1=new ThreadGroup(tg,"SecondGroup");
		Thread t3=new Thread(tg1,can,"ThirdThread");
		Thread t4=new Thread(tg1,can,"FourThread");
		System.out.println("parent of tg1=   "+tg1.getParent());
		tg1.setMaxPriority(7);
		System.out.println("ThreadGroup of t1  "+t1.getThreadGroup());
		System.out.println("ThreadGroup of t3  "+t3.getThreadGroup());
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("No of Threads activity in tg = "+tg.activeCount());
		System.out.println("No of Threads activity in tg1 = "+tg1.activeCount());
		
		
	}

}
