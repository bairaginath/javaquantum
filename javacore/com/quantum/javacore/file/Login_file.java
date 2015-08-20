package com.quantum.javacore.file;


import java.io.Serializable;


public class Login_file implements Serializable
{
    String name;
    String password;
    Login_file(String name,String password)
    {
        this.name=name;
        this.password=password;
    }
    void display()
    {
        System.out.println("name   "+name+"     password   "+password);
    }
    
    
}