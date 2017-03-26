package com.quantum.javacore.oops;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/*The argument list must exactly match that of the overridden method. If they
don't match, you can end up with an overloaded method you didn't intend.
■ The return type must be the same as, or a subtype of, the return type declared
in the original overridden method in the superclass. (More on this in a few
pages when we discuss covariant returns.)
■ The access level can't be more restrictive than the overridden method's.
■ The access level CAN be less restrictive than that of the overridden method.
■ Instance methods can be overridden only if they are inherited by the subclass.
A subclass within the same package as the instance's superclass can override
any superclass method that is not marked private or final. A subclass in a
different package can override only those non-final methods marked public
or protected (since protected methods are inherited by the subclass).
■ The overriding method CAN throw any unchecked (runtime) exception,
regardless of whether the overridden method declares the exception. (More
in Chapter 5.)
■ The overriding method must NOT throw checked exceptions that are new
or broader than those declared by the overridden method. For example, a
method that declares a FileNotFoundException cannot be overridden by a
method that declares a SQLException, Exception, or any other non-runtime
exception unless it's a subclass of FileNotFoundException.
■ The overriding method can throw narrower or fewer exceptions. Just because
an overridden method "takes risks" doesn't mean that the overriding subclass'
exception takes the same risks. Bottom line: an overriding method doesn't 
have to declare any exceptions that it will never throw, regardless of what the
overridden method declares.
■ You cannot override a method marked final.
■ You cannot override a method marked static. We'll look at an example in a
few pages when we discuss static methods in more detail.
■ If a method can't be inherited, you cannot override it. Remember that
overriding implies that you're reimplementing a method you inherited! For
example, the following code is not legal, and even if you added an eat()
method to Horse, it wouldn't be an override of Animal's eat() method.*/


class Parents {
	public Parents covariantReturn(){
		System.out.println("In side Parents CovariantReturn");
		return new Parents();
	}
	public synchronized void synchronizedMethod(){
		System.out.println("In side Parent SynchronizedMethod");
	}
	
	public strictfp void strictfpMethod(){
		System.out.println("In side Parent strictfp method");
	}
	
	public final void finalMethod(){
		System.out.println("In side Parent final method");
	}
	
	public static void staticMethod(){
		System.out.println("In side Parent static method");
	}
	
	public void display(){
		System.out.println("Inside Parents Display Method");
	}
	public void show(){
		System.out.println("Inside Parents Show Method");
	}
	public void checkedException() throws IOException
	{
	  System.out.println("In side Parents ExecptionCheck");	
	}
	public void unCheckedException() throws NullPointerException
	{
	  System.out.println("In side Parents UnCheckedExecption");	
	}
	
	public void noExceptionThrows(){
		
	}
}

class Child extends Parents {
	//public void checkedException() throws SQLException //error
	//public void checkedException() throws IOException //override
	//public void checkedException() throws Exception //not override,error 
	public void checkedException() throws FileNotFoundException //override
	{
	  System.out.println("In side child ExecptionCheck");	
	}
	
	//public void unCheckedException() throws Exception //error
	
	//public void unCheckedException() throws RuntimeException //override
	//public void unCheckedException() throws ArithmeticException //override
	//public void unCheckedException() //override
	public void unCheckedException() throws IllegalArgumentException //override not related to parents method runtime exception
	{
	  System.out.println("In side child UnCheckedExecption");	
	}
	
	public void display(){
		System.out.println("Inside Child Display Method");
	}
	public void parentsDisplay(){
		super.display();
	}
	
	//public final void finalMethod() //can't override final method from parents
	//public void finalMethod() //can't override final method form parents
	/*{ 
		System.out.println("In side final method");
	}*/
	
	public static void staticMethod() //not override but we can redefine
	//public void staticMethod() //This instance method can't override parents  static method
	{
		System.out.println("In side static method"); 
	}
	
//covariant Return type example
	//public Child covariantReturn() //override it doesn't depends on parents return type
	public Parents covariantReturn() //override 
	{
        System.out.println("Inside Child Covareint Return");
		return new Child();
	}
	
//	public synchronized void synchronizedMethod() //override
	public void synchronizedMethod() //override
	{
		System.out.println("In side Child SynchronizedMethod");
	}
	
//	public strictfp void strictfpMethod() //override
	public void strictfpMethod() //override
	{
		System.out.println("In side Child strictfp method");
	}
	
	//public void noExceptionThrows() throws IOException {  //no override
	public void noExceptionThrows() throws NullPointerException { //override 
		
	}
	
	
	
	
}

public class OverriddenExample {
	
	public static void main(String[] args) {
		Parents parents=new Child();
		parents.display();	
		parents.show();
		try{
		parents.checkedException();
		}catch(Exception e){}
		
		parents.unCheckedException();
		//parents.parentsDisplay(); we can't access non-override child method from parents instance
		new Child().parentsDisplay(); //we can access parents display method
		
		parents.finalMethod();
		parents.staticMethod();
		parents.covariantReturn();
		
		parents.synchronizedMethod();
		parents.strictfpMethod();
	}

}
