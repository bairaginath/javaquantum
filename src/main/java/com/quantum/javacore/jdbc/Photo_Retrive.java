package com.quantum.javacore.jdbc;



import java.io.File;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAIRAGI
 */
public class Photo_Retrive {
    public static void main(String[] args) {
        Simple_JDBC ob=new Simple_JDBC();
        Connection con=null;
        try {
        con=ob.getConnection();
        ResultSet rs=ob.getDetails("select * from login.salary_detail ");
        rs.next();
        Blob b=rs.getBlob(2); 
        byte b1[]=b.getBytes(1,(int)b.length());
        File f=new File("C:\\Users\\BAIRAGI\\Desktop\\321.jpg");
            FileOutputStream fos=new FileOutputStream(f);
            fos.write(b1);
            fos.close();
        }catch(Exception e)
        { System.out.println(e);}
        finally {
            try {
                ob.closeConnection();
            }catch(Exception e){
                System.out.println(e); }
            
        }
    }
    
}
