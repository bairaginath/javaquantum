package com.quantum.javacore.concurrent;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;


public class AtomicReferenceExample2 {
	
	 
	
	public static void main(String[] args) {
		final AtomicReference<String> atomicReference=new AtomicReference<String>("world");
		
		
		new Thread("T1")
		{
			public void run()
			{
				while(true){
							System.out.println(Thread.currentThread().getName() 
          +" Waiting for T2 to set Atomic variable to india. Current value is "+atomicReference.get());
							if(atomicReference.compareAndSet("india","world"))
							{								
									System.out.println("Finally I can die in peace!");
									break;
							}
			}};
		}.start();
		new Thread("T2")
		{
			public void run()
			{
						System.out.println(Thread.currentThread().getName() +"  "+atomicReference.get()); 
						System.out.println(Thread.currentThread().getName()
                                +" is setting the variable to true ");
						atomicReference.set("india");
						System.out.println(Thread.currentThread().getName() +"  "+atomicReference.get()); 
			};
		}.start();
	}
	
	

}
