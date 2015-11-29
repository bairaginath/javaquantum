package com.quantum.javacore.concurrent;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanExample
{
	public static void main(String[] args)
	{
		final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		new Thread("T1")
		{
			public void run()
			{
				while(true){
							System.out.println(Thread.currentThread().getName() 
                                 +" Waiting for T2 to set Atomic variable to true. Current value is "
                                 +atomicBoolean.get());
							
//							The method compareAndSet() allows you to compare the current value of 
//the AtomicBoolean to an expected value, and if current value is equal to the expected value, a new value can be set on the AtomicBoolean
							if(atomicBoolean.compareAndSet(true, false))
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
						System.out.println(Thread.currentThread().getName() +"  "+atomicBoolean.get()); 
						System.out.println(Thread.currentThread().getName()
                                +" is setting the variable to true ");
						atomicBoolean.set(true);
						System.out.println(Thread.currentThread().getName() +"  "+atomicBoolean.get()); 
			};
		}.start();
}
}
