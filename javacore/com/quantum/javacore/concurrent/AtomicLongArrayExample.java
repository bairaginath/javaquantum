package com.quantum.javacore.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLongArray;


//http://tutorials.jenkov.com/java-util-concurrent/atomiclongarray.html
public class AtomicLongArrayExample {
	
	
	public static class IncrementUpdateTask implements Runnable {
		
		private AtomicLongArray atomicLongArray;

		public IncrementUpdateTask(AtomicLongArray atomicLongArray) {
			super();
			this.atomicLongArray = atomicLongArray;
		}

		public void run() {

			try {
				for (int i = 0; i < atomicLongArray.length(); i++) {
					System.out.println("Increment element "+ i +" by 1");
					atomicLongArray.getAndIncrement(i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();

			} finally {
				System.out.println("Increment task was done !!!");
			}
		}
	}
		
		
		public static class DecrementUpdateTask implements Runnable {
			
			private AtomicLongArray atomicLongArray;

			public DecrementUpdateTask(AtomicLongArray atomicLongArray) {
				super();
				this.atomicLongArray = atomicLongArray;
			}

			public void run() {

				try {
					for (int i = 0; i < atomicLongArray.length(); i++) {
						System.out.println("Decrement element" + i +" by 1");
						atomicLongArray.getAndDecrement(i);
						Thread.sleep(1000);
					}
				} catch (InterruptedException ie) {
					ie.printStackTrace();

				} finally {
					System.out.println("Decrement task was done !!!");
				}
			}

		}

	
	
	private static final int ARRAY_SIZE = 10;

	
	public static void main(String[] args) {

		// Create a new long array of 10 element
		long[] longArray = new long[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++) {
			longArray[i] = i + 1;
		}

		// Create a new AtomicLongArray with the predefined long array
		AtomicLongArray atomicLongArray = new AtomicLongArray(longArray);

		System.out.println("atomicLongArray before running tasks:\n"
				+ atomicLongArray);

		System.out.println("Start running increment/decrement tasks ...");
		// Create a new ExecutorService with 2 thread to Increment and Decrement
		// AtomicLongArray
		ExecutorService executor = Executors.newFixedThreadPool(2);

		// Start AtomicLongArray increment task
		Future futureIncrementTask = executor
				.submit(new IncrementUpdateTask(atomicLongArray));

		// Start AtomicLongArray Decrement task
		Future futureDecrementTask = executor
				.submit(new DecrementUpdateTask(atomicLongArray));

		while (true) {

			if (futureIncrementTask.isDone() && futureDecrementTask.isDone()) {
				System.out
				.println("Finish running increment/decrement tasks !!!");
				System.out.println("atomicLongArray after running tasks:\n"
						+ atomicLongArray);
				executor.shutdown();
				break;
			}
		}


}
}
