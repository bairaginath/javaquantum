package com.quantum.javacore.oops;

class CSE extends College
{
    CSE(String x){
        super(x);
    }
            
    @Override
    void subject_taken() {
        System.out.println(rollno);
        System.out.println("CSE");
    }
    
}