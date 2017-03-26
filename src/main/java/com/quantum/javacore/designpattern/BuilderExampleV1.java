package com.quantum.javacore.designpattern;

import com.quantum.javacore.designpattern.Computer.ComputerBuilder;

class MyComputer {
	//required parameters
	private String HDD;
	private String RAM;
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}
	
	public String toString(){
		return "HDD="+this.HDD+",RAM="+this.RAM+",isGraphicsCardEnabled="+this.isGraphicsCardEnabled+",isBluetoothEnabled="+this.isBluetoothEnabled;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	private MyComputer(String HDD,String RAM) {
		this.HDD=HDD;
		this.RAM=RAM;
	}
	
	//Builder Class
	public static class ComputerBuilder{

		MyComputer myComputer;
		public ComputerBuilder(String hdd, String ram){
			this.myComputer=new MyComputer(hdd,ram);
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.myComputer.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.myComputer.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public MyComputer build(){
			return this.myComputer;
		}

	}

}


public class BuilderExampleV1 {
	
	public static void main(String[] args) {
		MyComputer computer1=new MyComputer.ComputerBuilder("100GB","4GB").setGraphicsCardEnabled(true)
				.setBluetoothEnabled(true).build();
		MyComputer computer2=new MyComputer.ComputerBuilder("100GB","4GB").setGraphicsCardEnabled(true)
				.setBluetoothEnabled(false).build();
		
		System.out.println(computer1);
		System.out.println(computer2);
	}
}
