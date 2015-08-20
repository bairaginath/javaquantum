package com.quantum.javacore.jdbc;



import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Photo_Insert {
    
    public static void main(String[] args) {
        Simple_JDBC ob=new Simple_JDBC();
        
        try{
            Object ob1=new Object();
            
        
         Connection con=ob.getConnection();
        File f=new File("C:\\Users\\BAIRAGI\\Desktop\\320.jpg");
        FileInputStream fis=new FileInputStream(f);
            PreparedStatement stmt=con.prepareStatement("insert into login.photo_insert values(?,?)");
            stmt.setInt(1, 1);
            stmt.setBinaryStream(2, fis,(int)f.length());
             System.out.println(stmt.executeUpdate());
                    }catch(Exception e)
        { System.out.println(e); }
        finally
        { 
            try{
             ob.closeConnection();
            }catch(Exception e){}
            
        }
    }
    
}
