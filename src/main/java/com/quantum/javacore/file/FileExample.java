package com.quantum.javacore.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileExample {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("/home/bairaginath/Desktop/test.txt");
		System.out.println(f.canExecute());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		f.createNewFile(); //create new file
		
		System.out.println("===========Using OutputStream==============");
		OutputStream outputStream=new FileOutputStream(f);
		outputStream.write("bairaginath".getBytes());
		outputStream.close();
		
		System.out.println("===========Using IntputStream==============");
		InputStream inputStream=new FileInputStream(f);
		int length=inputStream.read();
		byte [] read=new byte[length];
		inputStream.read(read);
		inputStream.close();
		System.out.println(new String(read));
		
		System.out.println("===========Using OutputStreamWriter==============");
		OutputStream outputStream1=new FileOutputStream(f);
		OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream1);
		outputStreamWriter.write("OutputStreamWriter");
		outputStreamWriter.flush();
		
		InputStream inputStream1=new FileInputStream(f);
		InputStreamReader inputStreamReader=new InputStreamReader(inputStream1);
		int character;
		System.out.println("=============Using InputStreamReader============");
		 while ((character = inputStreamReader.read()) != -1) {
             System.out.print((char) character);
         }
		 System.out.println();
		
		
		 System.out.println("===========Using FileWriter==============");
		FileWriter fileWriter=new FileWriter(f);
		fileWriter.write("worldisnotenough");
		fileWriter.flush();
		fileWriter.close();
		
		System.out.println("===========Using FileReader==============");
		FileReader fileReader=new FileReader(f);
		char[] readData=new char[50];
		fileReader.read(readData);
		System.out.println(readData);
		fileReader.close();
		
		System.out.println("===========Using PrintWriter==============");
		FileWriter fileWriter1=new FileWriter(f);
		PrintWriter printWriter=new PrintWriter(fileWriter1);
		printWriter.println("bairagi");
		printWriter.println("nath behera");
		printWriter.flush();
		printWriter.close();
		
		System.out.println("===========Using BufferReader==============");
		FileReader fileReader1=new FileReader(f);
		BufferedReader bufferedReader=new BufferedReader(fileReader1);
		System.out.println(bufferedReader.readLine());
		
		
		
		
		
	}

}
