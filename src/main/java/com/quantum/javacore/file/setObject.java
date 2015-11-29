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
          LoginFile ob1=new LoginFile("rabindra","lokesh");
          LoginFile ob2=new LoginFile("sibaram","ramesh");
          oos.writeObject(ob1);
          oos.writeObject(ob2);
          oos.close();
          
          
          

     
}
    
}
