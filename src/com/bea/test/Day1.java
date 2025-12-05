package com.bea.test;

import java.util.Scanner;

public class Day1 {

	//Scanner object
	Scanner input = new Scanner(System.in);
	

	public void runday1activity1() {
		
		
		//***** ACTIVITY 1 *****:
		//Read user input - Name
		System.out.println("Pls input your name: ");
		String strName = input.nextLine();   //whole line
		System.out.println("Hello " + strName);
		
		
/*		System.out.println("Pls input any amount: ");
		Double dblInput = input.nextDouble();  // reads Double input
		System.out.println("Amount inputted: " + dblInput);

		System.out.println("Pls input any comments: ");
		String strInput = input.next();  // reads single word
		System.out.println("Your inputted comment: " + strInput);
*/		
		
		
		

		
		
	}
	
	public void runday1activity2() {
		
		
		//TYPECASTING
		/*
		int num = 10;
		double result = num; //int converted to double automatically
		System.out.println(result);
		
		
		double x = 10.99999999;
		int y = (int) x;
		System.out.println(y);
		*/

		
		
		//***** ACTIVITY 2 *****:
		//Read user input - Age
		System.out.println("Pls input your age: ");
		//Integer intAge = input.nextInt();  // reads integer input
		String strAge = input.nextLine();
		int intAge = Integer.parseInt(strAge);
		System.out.println("Your age as integer input: " + intAge);
		
		double dblAge = intAge;
		System.out.println("Your age as double: " + dblAge);
//		int intAge = (Integer) strAge;
		
	}
	
	
	
	public void runday1activity3() {

		//***** ACTIVITY 3 *****:
		//OPERATORS

		System.out.println("Pls input first integer: ");
		Integer intFirst = input.nextInt();  // reads integer input
		
		System.out.println("Pls input second integer: ");
		Integer intSecond = input.nextInt();  // reads integer input

		computeSum(intFirst,intSecond);
		computeDifference(intFirst,intSecond);
		computeProduct(intFirst,intSecond);
		
		
	}

	public void computeSum(Integer intFirst, Integer intSecond ) {
		int intSum = intFirst + intSecond;
		System.out.println("Sum: " + intSum);
	}
	
	public void computeDifference(Integer intFirst, Integer intSecond ) {
		int intDiff = intFirst - intSecond;
		System.out.println("Difference: " + intDiff);
	}

	public void computeProduct(Integer intFirst, Integer intSecond ) {
		int intProduct = intFirst * intSecond;
		System.out.println("Product: " + intProduct);
	}
	
	
	
	
	
	public void runday1activity4() {
		//***** ACTIVITY 4 *****:
		//CONTROL STRUCTURES

		System.out.println("Pls input your age: ");
		//Integer intAge = input.nextInt();  // reads integer input
		String strAge = input.nextLine();
		int intAge = Integer.parseInt(strAge);
//		System.out.println("Your age: " + intAge);

		if (intAge < 18) {
			System.out.println("Minor");
		} else if ((intAge >= 18) && (intAge <= 59)) {
			System.out.println("Adult");
		} else if (intAge > 59) {
			System.out.println("Senior");
		}
		
		
	}

	
	
	public void runday1activity5() {

		
	}


}
