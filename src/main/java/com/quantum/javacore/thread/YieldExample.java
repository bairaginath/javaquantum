package com.quantum.javacore.thread;

public class YieldExample {
	
	static class ProducerWithoutYield extends Thread
	{
	   public void run()
	   {
	      for (int i = 0; i < 5; i++)
	      {
	         System.out.println("I am Producer : Produced Item " + i);
	         
	      }
	   }
	}
	
	static class ConsumerWithoutYield extends Thread
	{
	   public void run()
	   {
	      for (int i = 0; i < 5; i++)
	      {
	         System.out.println("I am Consumer : Consumed Item " + i);
	         
	      }
	   }
	}
	
	
	static class ProducerWithYield extends Thread
	{
	   public void run()
	   {
	      for (int i = 0; i < 5; i++)
	      {
	         System.out.println("I am Producer : Produced Item " + i);
	         Thread.yield();
	      }
	   }
	}
	
	static class ConsumerWithYield extends Thread
	{
	   public void run()
	   {
	      for (int i = 0; i < 5; i++)
	      {
	         System.out.println("I am Consumer : Consumed Item " + i);
	         Thread.yield();
	      }
	   }
	}
	   
	   public static void main(String[] args)
	   {
	     /* Thread producerWithoutYield = new ProducerWithoutYield();
	      Thread consumerWithoutYield = new ConsumerWithoutYield();        
	      producerWithoutYield.setPriority(Thread.MIN_PRIORITY); //Min Priority
	      consumerWithoutYield.setPriority(Thread.MAX_PRIORITY); //Max Priority	      
	      producerWithoutYield.start();
	      consumerWithoutYield.start();*/
	      
	      Thread producerWithYield = new ProducerWithYield();
	      Thread consumerWithYield = new ConsumerWithYield();
	      producerWithYield.setPriority(Thread.MIN_PRIORITY); //Min Priority
	      consumerWithYield.setPriority(Thread.MAX_PRIORITY); //Max Priority
	      producerWithYield.start();
	      consumerWithYield.start();
	      
	   }
	   
	   
	

}
