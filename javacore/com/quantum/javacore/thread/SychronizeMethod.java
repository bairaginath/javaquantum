/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.thread;

class Account {
	private int balance=50;
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount){
		balance=balance-amount;
	}
}

public class SychronizeMethod implements Runnable {
	private Account account=new Account();
	private synchronized  void  makeWithDraw(int amount){
		if (amount<=account.getBalance()){
			System.out.println(Thread.currentThread().getName()+"   Going To Withdraw");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+"    Completed the Withdraw");
		}else {
			System.out.println("Not enough in account for "+Thread.currentThread().getName()+ "  to Withdraw  "+account.getBalance());
		}
		
	}
	
	public void run(){
		for(int i=0;i<5;i++){
			makeWithDraw(10);
			if(account.getBalance()<0){
				System.out.println("account is overdrawn !");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		SychronizeMethod sm=new SychronizeMethod();
		Thread one=new Thread(sm,"Fred");
		Thread two=new Thread(sm,"Lucy");
		one.start();
		two.start();
		
		
	}
	
}