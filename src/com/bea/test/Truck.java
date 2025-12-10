package com.bea.test;

public class Truck extends Vehicle implements Refuelable {

	//no argument constructor
	public Truck () {
		
	}
	
	//constructor
	public Truck (String brand, Integer numberOfWheels) {
		this.setNumberOfWheels(numberOfWheels);
		this.setBrand(brand);
		//verify the input
		this.getVehicleAttributes();

	}
	
	//from abstract Vehicle
	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Starting truck engine of " + this.getBrand() + "...");
	}

	//from interface Refuelable
	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("Truck with brand " + this.getBrand() + " is being refuelled");
	}

	
	public void getVehicleAttributes() {
		System.out.println("You have supplied truck with brand name " + this.getBrand() + " and with " + this.getNumberOfWheels() +" wheels.");
	}

}
