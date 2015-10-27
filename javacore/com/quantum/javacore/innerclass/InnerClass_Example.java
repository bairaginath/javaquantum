package com.quantum.javacore.innerclass;


interface Inner
{ 
    int id=5;
    void display();
}



public class InnerClass_Example
{
  static  Inner o= new Inner() {

        
         public void display() {
             System.out.println("bairagi");
         }
        
     };
    // Inner ob=(Inner)this.o;
     //ob.display();
    
   
   
    public static void main(String[] args) throws Exception {
         //InnerClass_Example ob=new InnerClass_Example();
         InnerClass_Example.o.display();
         
         
    }

}
   


    


