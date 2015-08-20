/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author BAIRAGI
 */
public class Test {
    
    public static void main(String[] args) throws Exception{
        
        String DriverName="";
        String url="";
        String username=" ";
        String password=" ";
        Class.forName("DriverName");
        Connection con= DriverManager.getConnection(url,username, password);
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from login.login");
        
        
                
    }
    
}
