package com.bea.test;

public class Car {

	private String make;
	private String model;
	private String color;
	
	//no argument constructor
	public Car() {
		
	}
	//parameterized constructor
	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getCarAttributes() {
		String ret = "Car is " + this.getMake() + " with model " + this.getModel() + " and color " + this.getColor();
		return ret;
	}
	
}
