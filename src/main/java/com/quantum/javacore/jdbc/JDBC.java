package com.quantum.javacore.jdbc;



import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC
{
    public static void main(String[] args) {
   try{
        Simple_JDBC sj=new Simple_JDBC();
        sj.getConnection();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter the password");
        String password=sc.next();      
        
        String Query="insert into login.login values('%s','%s')";
               Query=Query.format(Query,name,password);         
               sj.setInsert(Query);  // insert into database
        
            Query="select * from login.login where username='%s'"; 
            System.out.println("Enter the username");
            name=sc.next();
            Query=Query.format(Query,name);
           ResultSet rs= sj.getDetails(Query);
           if(rs!=null)
           {
             while(rs.next())
             { 
                 System.out.println(rs.getString(1));
                 System.out.println(rs.getString(2));
                 System.out.println("----------------");
             }
           }
           else 
               System.out.println("No infromation in Database");
             
       sj.closeConnection();
        
        
   }
   catch(Exception e)
   { System.out.println(e);}
   
        
}
}