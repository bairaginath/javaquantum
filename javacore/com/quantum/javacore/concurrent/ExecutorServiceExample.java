package com.quantum.javacore.concurrent;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class ExecutorServiceExample {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		

		executorService.execute(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task");
		        System.out.println(Thread.currentThread().getName());
		    }
		});
		
		Future future = executorService.submit(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task with Submit");
		        System.out.println(Thread.currentThread().getName());
		    }
		});
		try{
		 System.out.println(future.get());  //returns null if the task has finished correctly.
		}catch(Exception ie){}
		
		Future futureCallable = executorService.submit(new Callable(){
		    public Object call() throws Exception {
		        System.out.println("Asynchronous Callable with Submit");
		        System.out.println(Thread.currentThread().getName());
		        return "Callable Result";
		    }
		});
        try{
		System.out.println("future.get() at Callable = " + futureCallable.get());
        }catch(Exception ie){}
        
        
        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        
        
        try {
        String result = executorService.invokeAny(callables);
        System.out.println("result for invokeAny = " + result);
        }catch(Exception ie){}
        
        try{
        List<Future<String>> futures = executorService.invokeAll(callables);
        for(Future<String> eachFuture : futures){        	
            System.out.println("invokeAll future.get = " + eachFuture.get());        	
        }
        }catch(Exception e){}

		

		executorService.shutdown();
	}

}
