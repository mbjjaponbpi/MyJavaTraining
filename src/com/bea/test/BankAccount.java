package com.bea.test;

import java.util.HashMap;
import java.util.Map;

public class BankAccount {

	static Map<String, String> accountMap = new HashMap<>();

	
	public String getAccountName(String accountNumber) {
		String name = null;
		
		if (accountMap.containsKey(accountNumber)) {
			name = accountMap.get(accountNumber);
		}
		
		return name;

	}
	
	 public static void testCase(String accountNumber){
		 BankAccount bankAcct = new BankAccount();
		 System.out.println("\nLooking up account: " + accountNumber);
		 
		 String name = bankAcct.getAccountName(accountNumber);

		 try {
			 System.out.println(name.toUpperCase());
		 } catch (NullPointerException e) {
			 System.out.println("Error: Account not found!");
		 }
		 
	 }
 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		accountMap.put("ACC-001", "Juan Dela Cruz");
		accountMap.put("ACC-002", "Maria Santos");

		System.out.println("=== BANK ACCOUNT NAME DISPLAY ===");
		testCase("ACC-001");
		testCase("ACC-999");
		System.out.println("\n\n=== Program completed successfully! ===");
		
		accountMap = null;
	}
}
