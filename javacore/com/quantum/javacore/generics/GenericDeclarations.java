package com.quantum.javacore.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDeclarations<E> {
	
	public <T> void makeArrayList(T t){


    }
    
	public static <T> List  makeList(T[ ] t){
	     List<T> list=new ArrayList<T>();
	     for(T p:t){ list.add(p); }
	     return list;
	     }
	
	public static <T extends Number> List  makeList (T[] t){
		return null;
	}





}

