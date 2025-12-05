package com.bea.test;

public class House {

	String houseNumber = "214";
	String houseColor = "yellow";
	String houseType = "bungalow";
	
	public String getHouseNumber() {
		System.out.println("House number is: " + houseNumber);
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getHouseColor() {
		System.out.println("House color is: " + houseColor);
		return houseColor;
	}
	public void setHouseColor(String houseColor) {
		this.houseColor = houseColor;
	}
	public String getHouseType() {
		System.out.println("House type is " + houseType);
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	

}
