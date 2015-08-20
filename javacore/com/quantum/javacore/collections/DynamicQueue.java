package com.quantum.javacore.collections;


import java.util.Arrays;


public class DynamicQueue <T>{
    int capacity=1;
    int front=-1,rear=-1;    
    Object array[]=new Object[this.capacity];
    
    
    void enQueue(T value)
    {
      if(isFull()==true)
          doubleCapacity();

      this.array[++this.rear]=value;
    }
    T deQueue()
    {
        if(isEmpty()==true)
        {
            System.out.println("Sorry,Stack is Empty");
            return null;
        }
        T value=(T)array[++this.front];        
     return value;   
    }
    boolean isFull()
    { 
        if(this.rear==capacity-1)
            return true;
        
       return false; 
    }
    boolean isEmpty()
    {
        if(this.rear==this.front)
            return true;
       return false; 
    }
    void doubleCapacity()
    {
        this.capacity=this.capacity*2;
        this.array=Arrays.copyOf(this.array, this.capacity);
    }
    
    public static void main(String[] args) {
        DynamicQueue<Integer> ob=new DynamicQueue<Integer>();
        ob.enQueue(1);
        ob.enQueue(2);
        ob.enQueue(3);
        System.out.println(ob.deQueue());
        System.out.println(ob.deQueue());
        System.out.println(ob.deQueue());
        
        
        DynamicQueue<String> ob1=new DynamicQueue<String>();
        ob1.enQueue("bairagi");
        ob1.enQueue("kuna");
        ob1.enQueue("julu");
        System.out.println(ob1.deQueue());
        System.out.println(ob1.deQueue());
        System.out.println(ob1.deQueue());
    }
}
