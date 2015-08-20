package com.quantum.javacore.file;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAIRAGI
 */
public class getObject {
    
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:\\Users\\BAIRAGI\\Desktop\\mytext.txt");
          ObjectInputStream ois=new ObjectInputStream(fis);
        
          try {
              Login_file T;
              
              while((T=(Login_file)ois.readObject())!=null)
              {
                  T.display();
              }
              
              
          }catch(Exception E)
          { System.out.println(E);  }
          finally {
              ois.close();
          }
          
    }
    
}
