package com.quantum.javacore.jdbc;

import org.apache.commons.dbcp.BasicDataSource;
import java.sql.Connection;

public class ConnectionPooling {
public static void main(String[] args) throws Exception {
BasicDataSource bds = new BasicDataSource();
bds.setDriverClassName("com.mysql.jdbc.Driver");
bds.setUrl("jdbc:mysql://localhost:3306/login");
bds.setUsername("root");
bds.setPassword("root");
     try {
       Connection con = bds.getConnection();
       if(con!=null)
             System.out.println("connection is sucessfully");
       else
             System.out.println("connection failure");
       } catch (Exception e) {
           e.printStackTrace();
           }
}
}
