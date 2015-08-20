package com.quantum.javacore.oops;

abstract class College
{
    String rollno;
    College(String rollno)
    {
        this.rollno=rollno;
    }
    abstract void  subject_taken();
    
}

