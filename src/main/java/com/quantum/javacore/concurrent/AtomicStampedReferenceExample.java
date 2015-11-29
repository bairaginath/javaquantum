package com.quantum.javacore.concurrent;

import java.util.concurrent.atomic.AtomicStampedReference;


// read more http://tutorials.jenkov.com/java-util-concurrent/atomicstampedreference.html

public class AtomicStampedReferenceExample {
	
	
	AtomicStampedReference<String> asr= new AtomicStampedReference<String>("ref",10);
	
	class Worker implements Runnable{
 
		
		public void run() {
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
			System.out.println(Thread.currentThread().getName());
			int stampArray[]={10};
			System.out.println(asr.getReference() +"  "+asr.getStamp() +"  "+asr.get(stampArray));
		//if current reference is "ref" then initial stamp is chnaged to 20 
		asr.attemptStamp("ref",20);
		
		//if current value is ref, then it is set as newref
		asr.weakCompareAndSet("ref","newref",20,30);
	 }
		
	}
	
   public static void main(String... args){
	   new Thread(new AtomicStampedReferenceExample().new Worker()).start();
	   new Thread(new AtomicStampedReferenceExample().new Worker()).start();
   }

}
