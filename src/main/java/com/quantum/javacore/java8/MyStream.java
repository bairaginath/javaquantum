/**
 * 
 */
package com.quantum.javacore.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyStream {
	
	public static void main(String args[]){

		String arr[]={"7","9","8","5","10"};
		int x[]=Arrays.stream(arr).parallel()
		.mapToInt(e->Integer.parseInt(e))
		            .toArray();
		
		

		 
		Function<Integer,Integer> fun=(Integer e)->e;
		
		Map<Integer,String> map=Arrays.stream(x)
		.boxed()
		.collect(Collectors.toMap(fun,
			(Integer e)->"element"));

		System.out.println(map);

			}

}