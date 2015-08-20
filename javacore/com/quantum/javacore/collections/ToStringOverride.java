package com.quantum.javacore.collections;

public class ToStringOverride {
	
  private	String name;
  private int age;
  public ToStringOverride(String name,int age){
	  this.name=name;
	  this.age=age;
	  
  }
  @Override
	public String toString() {
		
		return "name"+" "+this.name+" age"+" "+this.age;
	}
  public static void main(String[] args) {
	  
	  ToStringOverride tso=new ToStringOverride("Bairagi",55);
	  System.out.println(tso);
	
}
	

}
