package com.quantum.javacore.collections;


import java.util.Arrays;


public class DynamicStack <T>{
    int top=-1;
    int capacity=1;
    Object array[]=new Object[this.capacity];
    
    
    void push(T value)
    {
      if(isFull()==true)
          doubleCapacity();

      array[++top]=value;
    }
    T pop()
    {
        if(isEmpty()==true)
        {
            System.out.println("Sorry,Stack is Empty");
            return null;
        }
        T value=(T)array[this.top];
        this.top--;
     return value;   
    }
    boolean isFull()
    { 
        if(this.top==capacity-1)
            return true;
        
       return false; 
    }
    boolean isEmpty()
    {
        if(this.top==-1)
            return true;
       return false; 
    }
    void doubleCapacity()
    {
        this.capacity=this.capacity*2;
        this.array=Arrays.copyOf(this.array, this.capacity);
    }
    
    public static void main(String[] args) {
        DynamicStack<Integer> ob=new DynamicStack<Integer>();
        ob.push(1);
        ob.push(2);
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        
        DynamicStack<String> ob1=new DynamicStack<String>();
        ob1.push("bairagi");
        ob1.push("kuna");
        System.out.println(ob1.pop());
        System.out.println(ob1.pop());
    }
}
