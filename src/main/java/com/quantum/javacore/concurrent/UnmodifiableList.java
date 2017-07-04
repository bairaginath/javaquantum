package com.quantum.javacore.concurrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {

	    List<String> list = new ArrayList<String>();

	    public void add(String s) {
	        list.add(s);
	    }

	    public List<String> getList() {
	        return Collections.unmodifiableList(list);
	    }
	    
	    public static void main(String[] args) {
			UnmodifiableList uml=new UnmodifiableList();
			uml.add("bairagi");
			uml.add("tapan");
			List<String> umList=uml.getList();
			umList.add("world"); //throws UnsupportedOperationException
		}
	

}


	



