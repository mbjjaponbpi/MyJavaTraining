package com.bea.test;

public class WhiteBoard {

	private int value1;
	private int value2;
	
	//no argument constructor
	public WhiteBoard() {
		//no argument constructor
	}
	

	int addNumbers(int addend1, int addend2) {
		int sum = addend1 + addend2;
		return sum;
		
	}

	
	//parameterized constructor
	public WhiteBoard(int addend1, int addend2) {
		this.value1 = addend1;
		this.value2 = addend2;
		
	
	}
	
	
	int getSum() {
		int sum = this.value1 + this.value2;
		return sum;
	}
	
}
