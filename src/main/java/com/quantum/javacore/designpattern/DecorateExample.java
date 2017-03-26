package com.quantum.javacore.designpattern;

interface Car {
	public void assemble();
}

class CarDecorator implements Car {

	protected Car car;
	
	public CarDecorator(Car c){
		this.car=c;
	}
	
	public void assemble() {
		this.car.assemble();
	}

}

class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.println("Basic Car feature.");
	}

}

class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}

	public void assemble(){
		super.assemble();
		System.out.println("Adding features of Sports Car.");
	}
}

class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}
	
	public void assemble(){
		 super.assemble();
		 System.out.println("Adding features of Luxury Car");
	}
	
}

public class DecorateExample {
	
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		Car luxuryCar=new SportsCar(new BasicCar());
		luxuryCar.assemble();
	}
	
	
	

}
