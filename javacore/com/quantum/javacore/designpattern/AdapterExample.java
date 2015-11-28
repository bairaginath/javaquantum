package com.quantum.javacore.designpattern;

interface ABC {
	void show();
}
interface XYZ {
	void display();
}
abstract class PQR implements XYZ,ABC {
	abstract void output();
	void result(){
		System.out.println("In side Result method");
	}
}

class MyAdapter extends PQR {

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("In side display method");
		
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In side show method");
	}

	
	void output() {
		// TODO Auto-generated method stub
		System.out.println("In side output method");
	}
	
}

public class AdapterExample extends MyAdapter implements ABC,XYZ {
	
	public static void main(String[] args) {
		AdapterExample ae=new AdapterExample();
		ae.display();
		ae.show();
		ae.output();
		ae.result();
	}

}
