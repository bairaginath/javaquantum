package com.quantum.javacore.collections;

public class EqualsOverride {
	int regdNo;
	String name;
	public EqualsOverride(int regdNo,String name) {
		this.regdNo=regdNo;
		this.name=name;
		
	}
	@Override
	public int hashCode() {
		
		return regdNo*name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof EqualsOverride){
		   EqualsOverride eo=(EqualsOverride)obj;
		   if(this.hashCode()==eo.hashCode() && this.regdNo==eo.regdNo && this.name.equals(eo.name)){
			return true;   
		   }
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		EqualsOverride eo=new EqualsOverride(0,"Bairagi");
		EqualsOverride eo1=new EqualsOverride(0,"Bairagi");
		EqualsOverride eo2=new EqualsOverride(0,"Kuna");
		System.out.println("eo.hashCode()==eo1.hashCode()  "+(eo.hashCode()==eo1.hashCode()));
		System.out.println("eo2.hashCode()==eo1.hashCode()  "+(eo2.hashCode()==eo1.hashCode()));
		System.out.println("eo.equals(eo1)  "+eo.equals(eo1));
		System.out.println("eo2.equals(eo1) "+eo2.equals(eo1));
		System.out.println("eo==eo1 "+(eo==eo1));
		System.out.println("eo2==eo1 "+(eo2==eo1));
		
		
	}
	
}