package com.quantum.javacore.collections;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class User {
	 private String name;
	 private int age;
	 private String email;
	 
	
}

public class MyTest {
	
	
	
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		User user=new User();
		user.setName("bairagi");
		user.setAge(23);
		user.setEmail("bairagi.java@gmail.com");
		System.out.println(user.getName());
		
	}

}
