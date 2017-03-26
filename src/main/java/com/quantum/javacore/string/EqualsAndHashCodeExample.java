package com.quantum.javacore.string;

class OApp
{
	
}

public class EqualsAndHashCodeExample {
	
	//x.equals(y)==true means x.hashCode() must be y.hashCode()
	//x.hashCode()==y.hashCode() doesn't mean that x.equals(y)==true
	
	@Override
	public int hashCode() {
		return 27;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		return this.hashCode()==((EqualsAndHashCodeExample)obj).hashCode();
	}
  
	public static void main(String[] args) {
		EqualsAndHashCodeExample eh1=new EqualsAndHashCodeExample();
		EqualsAndHashCodeExample eh2=new EqualsAndHashCodeExample();
		System.out.println(eh1.hashCode());
		System.out.println(eh2.hashCode());
		System.out.println(eh1==eh2); //compare the memory address
		System.out.println(eh1.equals(eh2));
		OApp oapp=new OApp();
		
		System.out.println(Integer.toHexString(oapp.hashCode()));
		System.out.println(oapp);
	}
	
}
