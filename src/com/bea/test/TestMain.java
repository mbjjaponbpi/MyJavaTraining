package com.bea.test;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using with argument constructor
		Car car1 = new Car("Toyota Vios", 4);
		car1.refuel();
		car1.startEngine();
		destroyVehicle(car1);

		System.out.println();
		//using no argument constructor
		Truck truck1 = new Truck();
		truck1.setBrand("Isuzu truck");
		truck1.setNumberOfWheels(16);
		truck1.getVehicleAttributes();
		truck1.refuel();
		truck1.startEngine();
		destroyVehicle(truck1);
	}

	private static void destroyVehicle (Vehicle vehicle) {
		vehicle.destroy();
	}
}
