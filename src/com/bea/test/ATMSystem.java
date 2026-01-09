package com.bea.test;

public class ATMSystem {

	static double[] accounts = {10000, 15000, 20000};
	
	
	static void processWithdrawal(String accountIndex, String amountInput) {
		try {
			
			System.out.println(String.format("Account=%s, Amount=%s", accountIndex, amountInput));
			
			int acctind = Integer.parseInt(accountIndex);
			Double balance = accounts[acctind];
			Double amount = Double.parseDouble(amountInput);
			
			System.out.println(String.format("Current balance: ₱%.2f", balance));
			System.out.println(String.format("Withdrawal : ₱%.2f", amount));
			
			
			if (amount > balance) {
				System.out.println(String.format("Insufficient funds! Cannot withdraw ₱%.2f", amount));
			} else {
				Double newbalance = balance - amount;
				System.out.println(String.format("New balance: ₱%.2f", newbalance));
				System.out.println("Withdrawal successful!");
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid input! \nPlease enter valid numbers.");
			
		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("Error: Account not found! \nInvalid account index.");
			
		} catch (Exception  e) {
			System.out.println("Transaction failed");

		} 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=== ATM WITHDRAWAL SYSTEM ===");
		
		System.out.println("\n--- Test 1: Valid Withdrawal ---");
		processWithdrawal("1", "5000");

		System.out.println("\n--- Test 2: Invalid account index ---");
		processWithdrawal("abc", "5000");

		System.out.println("\n--- Test 3: Account not found ---");
		processWithdrawal("10", "5000");

		System.out.println("\n--- Test 4: Insufficient funds ---");
		processWithdrawal("1", "20000");
		
		System.out.println("\n=== All tests completed!");
		
	}

}
