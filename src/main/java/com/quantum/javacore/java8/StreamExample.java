package com.quantum.javacore.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
	
	   static  boolean checkPrime(int n){
		   //System.out.println(Thread.currentThread().getName());
	    	  if(n==2)
	    		  return true;
	    	  for(int i=2;i<=Math.sqrt(n);i++){
	    		  if(n%i==0)
	    			  return false;
	    	  }
	    	  
	    	  return true;
	    }
	
	public static void main(String[] args) {
		   long count=IntStream.range(1,10000).parallel()
				   .filter(n -> checkPrime(n)==true)
				   .count();
		   System.out.println(count);
		   List<String> list=new ArrayList<String>() {{add("bairagi");add("james");add("bairagi");}}; 
		  Map<String, Long> result = list.stream()
			 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		  
		  result.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
		  
		  Map<Boolean,List<String>> result1=list.stream()
		  .collect(Collectors.partitioningBy(s -> s.length()>5));
		  
		  result1.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));		   
		   
		  
		   
		
      	}

}
