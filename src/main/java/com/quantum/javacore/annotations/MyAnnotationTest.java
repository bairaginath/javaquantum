package com.quantum.javacore.annotations;

import java.lang.reflect.Method;

//for more info http://www.javatpoint.com/custom-annotation

@MyAnnotation
@interface MySubInterfaceAnnotation{
	//http://stackoverflow.com/questions/1624084/why-is-not-possible-to-extend-annotations-in-java
	String name() default "";
}
@MyAnnotation(value=4)
class MyClass {

}

class MySubClass extends MyClass{
  
	public void mySubClassTest(){
		System.out.println("in side mySubClass");
	}
}


public class MyAnnotationTest {
	
	@MyAnnotation(value=9)
	public void myAnnotationTest(){
		System.out.println("inside myAnnotation Method");
	}
	
	@MySubInterfaceAnnotation(name="bairagi")
	public void mySubInterfaceAnnotationTest(){
		System.out.println("inside mySubInterfaceAnnotation");
	}


	
	public static void main(String[] args)throws Exception {
		MyAnnotationTest mat=new MyAnnotationTest();
		mat.myAnnotationTest();
		Method m=mat.getClass().getMethod("myAnnotationTest");  
		MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
		System.out.println("value is: "+manno.value());
		
		mat.mySubInterfaceAnnotationTest();
		Method mm=mat.getClass().getMethod("mySubInterfaceAnnotationTest");
		MySubInterfaceAnnotation msia=mm.getAnnotation(MySubInterfaceAnnotation.class);  
		System.out.println("value is: "+(msia==null?"null":msia.name()));
		
		MySubClass msc=new MySubClass();
		msc.mySubClassTest();
		MyAnnotation mss=msc.getClass().getAnnotation(MyAnnotation.class);  
		System.out.println("value is: "+mss.value());
	}

}
