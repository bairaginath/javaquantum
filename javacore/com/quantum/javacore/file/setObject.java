package com.quantum.javacore.file;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAIRAGI
 */
public class setObject {
    
    public static void main(String[] args) throws Exception {
        
       
         FileOutputStream fos=new FileOutputStream("C:\\Users\\BAIRAGI\\Desktop\\mytext.txt",true);
         ObjectOutputStream oos=new ObjectOutputStream(fos);
          Login_file ob1=new Login_file("rabindra","lokesh");
          Login_file ob2=new Login_file("sibaram","ramesh");
          oos.writeObject(ob1);
          oos.writeObject(ob2);
          oos.close();
          
          
          

     
}
    
}
