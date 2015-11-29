package com.quantum.javacore.collections;

import java.util.*;

public class HashMapKeyAsList {
	
   public static void main(String[] args) {
	  
	    Map map=new HashMap();
	    List list=new ArrayList();
	    List x=list;
	    map.put(list,"abcd");
	    list.add(1);
	    List xx=list;
	    map.put(list,"bairagi");
	    list.add(2);
	    List xxx=list;
	    map.put(list,"world");
	    System.out.println(map.size());
	    System.out.println(map.get(x));
	    System.out.println(map.get(xx));
	    System.out.println(map.get(xxx));
	    System.out.println(x.hashCode()+" "+xx.hashCode()+" "+xxx.hashCode());
	    
	    
}
}
