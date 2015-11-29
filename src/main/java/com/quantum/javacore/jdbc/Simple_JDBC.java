package com.quantum.javacore.jdbc;


import java.sql.*;
import java.util.ListIterator;
//import com.mysql.jdbc.Driver;

public class Simple_JDBC {
    
    Connection con = null;
        String url = "jdbc:mysql://localhost:3306/";
        String db = "login";
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String pass = "root";
  public  Connection getConnection() throws Exception
    {
       
        
        try {
            
           Class.forName(driver);
            
            con = DriverManager.getConnection(url + db, user, pass);
            if(con!=null)  //Check for Connection database
            System.out.println("connection successfully");
        else
            System.out.println("connection  failure");
            
        } catch (Exception s) {
            System.out.println(s);
        } 
        return con;
        
    }
  
  public void setInsert(String Query) throws Exception
          
  {
      Statement stmt=con.createStatement();
       int norow=stmt.executeUpdate(Query);
       System.out.println("No of row affected   "+ norow);
       if(norow==0)
           System.out.println("no data inserted");
  }
  
  
  public ResultSet getDetails(String Query)throws Exception
  {
      ResultSet rs=null;
      Statement stmt=con.createStatement();
      rs=stmt.executeQuery(Query);
      return rs;
  }
 public void closeConnection() throws Exception
 {
     con.close();
 }
 
 
    
    }
        
    

