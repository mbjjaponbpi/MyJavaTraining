package com.bea.test;

public class Tree {

	String name;
	String leafType;
	int heightInches;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLeafType() {
		return leafType;
	}
	public void setLeafType(String type) {
		this.leafType = type;
	}
	public int getHeightInches() {
		return heightInches;
	}
	public void setHeightInches(int height) {
		this.heightInches = height;
	}

	public void getTreeProperties() {
		System.out.println("The " + this.name + " tree is with " + 
				this.leafType + " leaf type and with current height of " + this.heightInches + " inches.");
		
	}
	
}
