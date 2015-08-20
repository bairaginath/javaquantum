package com.quantum.javacore.designpattern;

import com.sun.xml.internal.ws.encoding.soap.DeserializationException;
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class SingleTone implements Cloneable, Serializable{
     
    public volatile static SingleTone st;
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
    private SingleTone()
    {
       // System.out.println("in side singletone constuctor"); 
    }
    public static SingleTone getInstance()
    {
        if(st==null)
           return st=new SingleTone();
        else
          return st; 
    }

    	protected Object readResolve() {
           
		return st;
	}

   
    protected Object clone() throws CloneNotSupportedException {
        return st;
    }
    
    
}
class LLL implements Serializable
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingleTone ll=SingleTone.getInstance();
        //System.out.println(ll);
        try{
        SingleTone l1=(SingleTone)ll.clone();
            System.out.println(l1.getName());
        }catch(Exception e){} 
       
        
        try{
        FileOutputStream fos=new FileOutputStream("C:\\Users\\BAIRAGI\\Desktop\\mytext.txt",true);
         ObjectOutputStream oos=new ObjectOutputStream(fos);
        FileInputStream fis=new FileInputStream("C:\\Users\\BAIRAGI\\Desktop\\mytext.txt");
          ObjectInputStream ois=new ObjectInputStream(fis);
          ll.setName("bairagi");
           // System.out.println(ll.getName());
          oos.writeObject(ll);
          //SingleTone ss=(SingleTone)ois.readObject();
            System.out.println("dfsafd");
            //System.out.println(ll+"  "+ss);
          ois.close();
          oos.close();
        }catch(IOException ioe){}
        
          
         
          
    }
}