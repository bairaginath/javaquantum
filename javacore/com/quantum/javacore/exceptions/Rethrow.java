package com.quantum.javacore.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Rethrow
{
    static void uncheckedMethod()
    {
        try{
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
          throw e; 
        }
     }
    static void errorMethod()
    {
       try{
        }
        catch(Error err)
        {
          throw err;  
          
        } 
    }
    
    static void checkedMethod() throws IOException 
    {      
         try{  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String ss=br.readLine();
         }catch(IOException e){
             throw e;
         }
  
       
        
    }
    
    
    public static void main(String[] args) throws IOException {
        errorMethod();
        uncheckedMethod();
        checkedMethod();
        
        System.out.println("bairagi".substring(0,3).charAt(5));
        
        
    }
    
    

}
