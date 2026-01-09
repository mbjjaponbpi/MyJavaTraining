package com.bea.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ATMTransaction {

	
	static void checkBalance(String accountNumber, double balance) {
		System.out.println("Processing balance inquiry...");

		
		try {
			Integer.parseInt(accountNumber);
			
			 char accountType = accountNumber.charAt(0);
			 if (accountType == '1') {
				 System.out.println("Account Type    : Savings");
			 } else if (accountType == '2') {
				 System.out.println("Account Type    : Checking");
			 } else {
				 System.out.println("Account Type    : Unknown");
			 }
		
			 
			 System.out.println("Account number  : " + accountNumber);
			 System.out.println(String.format("Current balance : ₱%.2f", balance));
			 System.out.println("Balance inquiry successful!");

		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid account number format! Account numbers must be numeric.");
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: Account number is empty or invalid!");

		} finally {
			System.out.println
				("\n========== RECEIPT ==========" + 
				"\nTransaction Date: " + LocalDate.now().format(DateTimeFormatter.ofPattern("MMMM dd, yyyy")) + 
				"\nTransaction Type: Balance Inquiry" + 
				"\nATM Location    : Main Branch" + 
				"\nThank you for banking with us!" +
				"\n==============================\n");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=== ATM BALANCE INQUIRY SYSTEM ===");
		
		System.out.println("\n--- Test Case 1: Valid Savings Account ---");
		checkBalance("100123456", 15000.00); // Valid Savings account, 	(success)

		System.out.println("\n--- Test Case 2: Valid Checking Account ---");
		checkBalance("200987654", 25000.00); // Valid Checking account, (success)
		
		System.out.println("\n--- Test Case 3: Invalid account number format ---");
		checkBalance("ABC12345", 15000.00);  // NumberFormatException, (invalid format)
		
		System.out.println("\n--- Test Case 4: Empty account number ---");
		checkBalance("", 15000.00);  // StringIndexOutOfBoundsException, (empty string)
		
	}

}
