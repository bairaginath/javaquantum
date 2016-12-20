package com.quantum.javacore.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Streams {
	
	public static void forEachExample(){
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(System.out::println);

	}
	public static void doubleColonList(int x){
		System.out.println(x);
	}
	
	public static void doubleColonMap(int x,int y){
		System.out.println(x+" "+y);
	}
	
	public static void filterAndCollectorExample(){
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered.toString());
	}
	
   public static void mapAndCollectorExample(){
	   List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	   List<Integer> squares=numbers.stream().map(i->i*i).collect(Collectors.toList());
	   System.out.println(squares.toString());
   }
   public static void reduceExample(){
	   System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().reduce( (a,b) -> a + b)); 
	   System.out.println(Arrays.asList("bairagi","nath","behera").stream().reduce((a,b) -> a +","+ b)); 
   }
   
   public static void limitExample(){
	   Random random = new Random();
	   random.ints().limit(10).forEach(System.out::println);
   }
   
   public static void sortedExample(){
	   List<Integer> list=Arrays.asList(5,7,4,9,6,8,3,10,1,2);
	   list.stream().sorted().forEach(System.out::println);
   }
   public static void distinctExample(){
	   Arrays.asList(5,7,4,9,6,8,1,3,10,1,2,5).stream().distinct().forEach(System.out::println);
   }
   
   
   public static void main(String[] args) {
		forEachExample();
		Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(Java8Streams::doubleColonList);
		Map<Integer,Integer> map=new HashMap<>();
		map.put(4,8);
		map.put(3, 6);
		map.put(1,2);
		map.forEach(Java8Streams::doubleColonMap);
		filterAndCollectorExample();
		mapAndCollectorExample();
		limitExample();
		sortedExample();
		distinctExample();
		System.out.println("count = "+ Arrays.asList(5,7,4,9,6,8,1,3,10,1,2,5).stream().count());
		System.out.println("max = "+Arrays.asList(5,7,4,9,6,8,1,3,10,1,2,5).stream().max(Comparator.comparing(Integer::intValue)));
		System.out.println("min = "+Arrays.asList(5,7,4,9,6,8,1,3,10,1,2,5).stream().min(Comparator.comparing(Integer::intValue)));
		reduceExample();
   }

}
