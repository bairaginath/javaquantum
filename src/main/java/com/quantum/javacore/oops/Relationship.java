package com.quantum.javacore.oops;


/*
 Association (Association is a relationship where all object have their own lifecycle and there is no owner.)
===========
Multiple students can associate with single teacher and single student can associate with multiple teachers 
but there is no ownership between the objects and 
both have their own lifecycle. Both can create and delete independently.
one-to-one, one-to-many, many-to-one, many-to-many

Aggregation 
===========
Aggregation is a specialised form of Association where all objects have their own lifecycle, but there is ownership and child objects can not belong to another parent object.
Let’s take an example of Department and teacher. A single teacher can not belong to multiple departments, but if we delete the department teacher object will not be destroyed. 
We can think about it as a “has-a” relationship.

Composition
===========
Composition is again specialised form of Aggregation and we can call this as a “death” relationship.
 It is a strong type of Aggregation. Child object does not have its lifecycle 
and if parent object is deleted, all child objects will also be deleted.
House can contain multiple rooms - there is no independent life of room and 
any room can not belong to two different houses. If we delete the house - room will automatically be 
deleted. Let’s take another example relationship between Questions and Options. 
Single questions can have multiple options and option can not belong to multiple questions. 
If we delete questions options will automatically be deleted.
 */

import java.util.*;



public class Relationship {
	
	class Student{
		
		void oneToOneAssociation(Teacher teacher){
			
		}
        void oneToManyAssociation(List<Teacher> teacher){
			
		}
		
		
	}
	class Teacher{
		
		void oneToOneAssociation(Student student){
			
		}
		void oneToManyAssociation(Student student){
			
		}
		
		
		
	}
	class Department{
		//Aggregation 
		private Teacher teacher;
		Department(Teacher teacher){
			this.teacher=teacher;
		}
		
	}
	class Question{
		//Composition 
		private Options options=new Options();
		
	}
	class Options{
		
	}
	
   



}
