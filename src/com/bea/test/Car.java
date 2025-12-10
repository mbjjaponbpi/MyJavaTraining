package com.bea.test;

public class Car extends Vehicle implements Refuelable {

	//no argument constructor
	public Car () {
		
	}
	
	//constructor
	public Car (String brand, Integer numberOfWheels) {
		this.setNumberOfWheels(numberOfWheels);
		this.setBrand(brand);
		//verify the input
		System.out.println("You have supplied car with brand name " + this.getBrand() + " and with " + this.getNumberOfWheels() +" wheels.");
	}
	
	//from abstract Vehicle
	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Starting car engine of " + this.getBrand() + "...");
	}

	//from interface Refuelable
	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("Car with brand " + this.getBrand() + " is being refuelled.");
		
	}

	
}
