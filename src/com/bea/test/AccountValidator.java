package com.bea.test;

public class AccountValidator {

	
	static void validateAccountNumber(String accountNumber) throws Exception{
		
		if (accountNumber == null) {
			throw new NullPointerException("Cannot be null");
			
		} else if (accountNumber.length() != 10) {
			throw new Exception("Must be 10 digits");
		
		} else {
			System.out.println(String.format("Valid account: %s", accountNumber));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			validateAccountNumber("1234567890");  // (valid - should pass)
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		try {
			validateAccountNumber("123");         // (invalid - too short)
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		try {
			validateAccountNumber(null);          // (invalid - null));
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		
	}

}
