package com.quantum.javacore.io;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HackerEarthIO {
	
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());
		System.out.println(br.read());
	}

}