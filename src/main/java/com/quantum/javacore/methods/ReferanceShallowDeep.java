package com.quantum.javacore.methods;

class Test implements Cloneable
{
	int value;
	Test(){
		
	}
	Test(int value){
		this.value=value;
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	

	
}

public class ReferanceShallowDeep {
	
	public static void main(String[] args) throws Exception{
		
		Test ori=new Test(4);
		Test ref=ori;
		System.out.println(ori+" "+ref);
		System.out.println(ori.hashCode()+"  "+ref.hashCode());
        ref.value=7;
		System.out.println(ori.value+" "+ref.value);
		Test clone=(Test)ori.clone(); //shallow copy
		System.out.println(ori+" "+clone);
		System.out.println(ori.hashCode()+"  "+clone.hashCode());
        clone.value=77;
        clone=new Test();
		System.out.println(ori.value+" "+clone.value);
		
	}
	

}
