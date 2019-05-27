package com.quantum.javacore.java8;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface AppendValue<T>{
	
	T apply(T t);
	

}

interface AppendList<T>  {
	
	default  List<T> appendAllValueOnList(List<T> list,AppendValue<T> function){
		List<T> appendList=new ArrayList<>();
		for(T t : list ){
		appendList.add(function.apply(t));
		}
		return appendList;
	}

	
	
}

class AppendArrayList<T> implements AppendList<T> {
	
}

public class MyTest  {
	
	
	
	public static void main(String[] args) {
		
		new Thread(()->{System.out.println("james");}).start();
		List<String> list=new ArrayList<>();
		list.add("bairagi");
		list.add("apple");
		list.add("james");
		/*list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});*/
		list.sort((String s1,String s2)->{return s1.compareTo(s2);});
		System.out.println(list);
		
		AppendList<String> alist=new AppendArrayList<>();
		List<String> output=alist.appendAllValueOnList(list,(String s)-> {return s+s.length();});
		System.out.println(output);
		
		java.util.function.Function<String,String> function=(String name)->{return name+name.length();};
		System.out.println(function.apply("bairagi"));
		
		
		
	}

}
