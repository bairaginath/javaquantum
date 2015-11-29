package com.quantum.javacore.declarations_and_access_controls;

class VolatileThread extends Thread {
	private final VolatileExample data;
	
	public VolatileThread(VolatileExample data) {
		this.data = data;
	}
	
	
	public void run() {
		int oldValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getName()
				+ "]: Old value = " + oldValue);
		
        data.increaseCounter();
        
        int newValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getName()
				+ "]: New value = " + newValue);
	}
}

public class VolatileExample {	
		
	//When a field is declared as volatile, then, the Java Memory Model ensures that all 
	//threads will “see” the same consistent value.
		private volatile int counter = 0;
		
		public int getCounter() {
			return counter;
		}
		
		public void increaseCounter() {
			++counter;
		}
		
		private final static int TOTAL_THREADS = 10;
		
		public static void main(String[] args) throws InterruptedException {
			VolatileExample volatileExample = new VolatileExample();
			
			Thread[] threads = new Thread[TOTAL_THREADS];
			for(int i = 0; i < TOTAL_THREADS; ++i)
				threads[i] = new VolatileThread(volatileExample);
			
			//Start all reader threads.
			for(int i = 0; i < TOTAL_THREADS; ++i)
				threads[i].start();
			
			//Wait for all threads to terminate.
			for(int i = 0; i < TOTAL_THREADS; ++i)
				threads[i].join();
		}

}
