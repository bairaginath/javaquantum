package com.quantum.javacore.file;


import java.io.Serializable;


public class LoginFile implements Serializable
{
    String name;
    String password;
    LoginFile(String name,String password)
    {
        this.name=name;
        this.password=password;
    }
    void display()
    {
        System.out.println("name   "+name+"     password   "+password);
    }
    
    
}