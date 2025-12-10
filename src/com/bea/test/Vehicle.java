package com.bea.test;

public abstract class Vehicle {

	private int numberOfWheels;
	private String brand;
	
	//for model
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if (brand != null) {
			this.brand = brand;
		}
	}

	
	
	//abstract method
	abstract void startEngine(); 
	
	public void destroy() {
		System.out.println("Destroyed " + this.brand);
	}
	
	
}
