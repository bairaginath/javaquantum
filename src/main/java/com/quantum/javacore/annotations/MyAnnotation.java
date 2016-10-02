package com.quantum.javacore.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.ANNOTATION_TYPE})  
@Inherited
public @interface MyAnnotation{  
   int value() default 1;  
}  

