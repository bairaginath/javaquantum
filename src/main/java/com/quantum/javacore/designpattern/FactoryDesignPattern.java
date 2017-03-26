package com.quantum.javacore.designpattern;

interface Vehicle {
	
    void register();
    void howToDrive();
}

class Car1 implements Vehicle {
	
	public void register(){
		System.out.println("In Side Car register");
	}
	
	public void howToDrive(){
		System.out.println("In Side Car Drive Mechanism");
	}
	
}

class Bus implements Vehicle {
	
	public void register(){
		System.out.println("In Side Bus register");
	}
	
	public void howToDrive(){
		System.out.println("In Side Bus Drive Mechanism");
	}
	
}

class VehicleFactory{
	static Vehicle getVehicleInstance(String objectName){
		   if(objectName.equalsIgnoreCase("car")){
			   return new Car1();
		   }
		   if(objectName.equalsIgnoreCase("bus")){
			   return new Bus();
		   }
		   else {
			   throw new IllegalArgumentException("Object name is not valid");
		   }
}
}

public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		Vehicle car=VehicleFactory.getVehicleInstance("Car");
		car.register();
		car.howToDrive();
		
		Vehicle bus=VehicleFactory.getVehicleInstance("bus");
		bus.register();
		bus.howToDrive();
	}

}
