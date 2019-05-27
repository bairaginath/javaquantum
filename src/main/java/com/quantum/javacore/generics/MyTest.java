package com.quantum.javacore.generics;

import java.util.List;



public class MyTest {
	
	static class ABC<T extends Number>{
	   
		T t;
		List< ? extends Number> number;
		 ABC(T t){
			this.t=t;
		}
		 
		 T getValue(){
			 return this.t;
		 }
		
	   <E> E setValue(E e){
		   return e;
	   }
	   <T extends Number, E extends Animal > E getValue(T t){
		   E e=null;
		   return e;
		   
	   }
	}
	
	
//	@Override
//	public int hashCode() {
//		return 7;
//	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	 /* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("inside finalze method");
		super.finalize();
	}
	
	class BetterthenFinalize implements AutoCloseable {

		/* (non-Javadoc)
		 * @see java.lang.AutoCloseable#close()
		 */
		@Override
		public void close() throws Exception {
              System.out.println("inside clone method");			
		}
		
	}
	
   public static void main(String[] args) {
	ABC<Integer> abc=new ABC<>(5);
	System.out.println(abc.getValue());
	System.out.println(abc.setValue("bairagi"));
	
	Runnable r=()->{ System.out.println("bairagi");};
	Object o=r;
	System.out.println(new String("bairagi")==new String("bairagi"));
	Object obj=new FruitTeste();
	System.out.println(new FruitTeste().getClass().isInstance(obj));
	new Object() { void getResult(){System.out.println("bairagi");}}.getResult();
	
	MyTest my1=new MyTest();
	MyTest my2=new MyTest();
	System.out.println(my1.hashCode()==my2.hashCode());
	System.out.println(my1.equals(my2));
	System.out.println(java.util.Objects.hash("bairagi", "007"));
	try{
	    my1.finalize();
	}catch(Throwable e){System.out.println(e);}
	System.out.println(my1);
	
	System.gc();
	
	System.out.println(my1);
	
	MyTest.BetterthenFinalize btf=new MyTest().new BetterthenFinalize();
	System.gc();
	System.out.println(btf);
	
	
	
	

}	

}
