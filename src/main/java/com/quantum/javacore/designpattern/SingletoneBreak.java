package com.quantum.javacore.designpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

class Singleton implements Cloneable,Serializable{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1353875237693800276L;
	static Singleton INSTANCE;
	
	private Singleton(){
		if (INSTANCE != null) {
	           throw new IllegalStateException("Singleton" +" instance already created.");
	        }
	}	
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public synchronized static Singleton getObject(){
		if(INSTANCE==null)
			INSTANCE=new Singleton();
		return INSTANCE;			
		}
	
	
	private Object readResolve() throws ObjectStreamException         {
        return INSTANCE;
}
private Object writeReplace() throws ObjectStreamException {
        return INSTANCE;
}
	
//System.out.println(instance.hashCode());

	}


	
public class SingletoneBreak {
	
    public static void main(String[] args) {
		
    	
    	new Thread(new Runnable() {
			public void run() {
				Singleton instance=Singleton.getObject();
				System.out.println("Before Serialize :"+instance.hashCode());
				try{
				FileOutputStream fos=new FileOutputStream("mytext.txt",true);
		         ObjectOutputStream oos=new ObjectOutputStream(fos);		         
		         oos.writeObject(instance);
		         oos.close();
		         System.out.println("Oject serialized");
				}catch(Exception e){e.printStackTrace();}
				try{
				FileInputStream fis=new FileInputStream("mytext.txt");
		        ObjectInputStream ois=new ObjectInputStream(fis);
		        Singleton singleton=(Singleton)ois.readObject();
		        System.out.println("After Deserialize :"+singleton.hashCode());
				}catch(Exception e){e.printStackTrace();}
			}
		},"Thread-1").start();
    	
//    	new Thread(new Runnable() {
//			public void run() {
//				
//				System.out.println(Singleton.getObject().hashCode());
//				
//			}
//		},"Thread-2").start();
	
    
    
    }
	

}
