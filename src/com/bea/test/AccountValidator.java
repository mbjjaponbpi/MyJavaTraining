package com.bea.test;

public class AccountValidator {

	
	
	static void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException {
		
		if (accountNumber == null) {
			throw new NullPointerException("Account number cannot be null");
		} else if (!isNumeric(accountNumber)) {
			throw new InvalidAccountFormatException("Account number must contain only digits");
		} else if (accountNumber.length() != 10) {
			throw new InvalidAccountNumberException("Account number must be exactly 10 digits");
		} else {
			System.out.println(String.format("Valid account number: %s", accountNumber));
		}
		
	}
	
	
	static void testValidation(String testName, String accountNumber) {

		try {
			System.out.println(testName);
			validateAccountNumber(accountNumber);
		} catch (InvalidAccountNumberException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InvalidAccountFormatException e) {
			System.out.println("Warning: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Warning: " + e.getMessage());
		}

	}
	
	
	
    private final static boolean isNumeric(String string) {
		boolean result = true;

		for (char c : string.toCharArray())  {
			if (!Character.isDigit(c)) {
				result = false;
				break;
			}
		}
		return result;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=== ACCOUNT NUMBER VALIDATION TEST ===");
		testValidation("\nTest 1: Valid account (1234567890)", "1234567890"); //- valid (10 digits)
		testValidation("\nTest 2: Too short (123)", "123"); //- too short
		testValidation("\nTest 3: Contains letters (12345ABC90)", "12345ABC90"); //- contains letters
		testValidation("\nTest 4: Contains space (1234 567890)", "1234 567890"); //- contains space
		testValidation("\nTest 5: Null value", null);  //- null value
		
		
	}

}
