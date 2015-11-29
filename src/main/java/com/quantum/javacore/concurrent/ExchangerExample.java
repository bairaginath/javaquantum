package com.quantum.javacore.concurrent;

import java.util.concurrent.Exchanger;

public class ExchangerExample implements Runnable {
	
	Exchanger exchanger = null;
    Object    object    = null;

    public ExchangerExample(Exchanger exchanger, Object object) {
        this.exchanger = exchanger;
        this.object = object;
    }

    public void run() {
        try {
            Object previous = this.object;

            this.object = this.exchanger.exchange(this.object);

            System.out.println(
                    Thread.currentThread().getName() +
                    " exchanged " + previous + " for " + this.object
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
    	Exchanger exchanger = new Exchanger();

    	ExchangerExample exchangerRunnable1 = new ExchangerExample(exchanger, "A");

    	ExchangerExample exchangerRunnable2 = new ExchangerExample(exchanger, "B");

    	new Thread(exchangerRunnable1).start();
    	new Thread(exchangerRunnable2).start();
	}

}
