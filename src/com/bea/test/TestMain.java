/**
 * 
 */
package com.bea.test;

/**
 * 
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello wonderful world!!");
		
		//Day 4 activity2
		//M2_ACTIVITY3
		//Java Objects and Classes
		
		Car car1 = new Car();
		car1.setMake("Suzuki");
		car1.setModel("Jimny");
		car1.setColor("White");
		System.out.println(car1.getCarAttributes());
		

		Car car2 = new Car("Toyota", "Innova", "White Pearl");
		System.out.println(car2.getCarAttributes());
		car2.setColor("Black");
		System.out.println("Updated car attributes: " + car2.getCarAttributes());
		
		
	}

}
