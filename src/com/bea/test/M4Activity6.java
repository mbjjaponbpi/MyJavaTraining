package com.bea.test;

public class M4Activity6 {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		
		account.runTest(() -> account.deposit(5000), "Deposit");
		account.runTest(() -> account.withdraw(3000), "Withdrawal");
		account.runTest(() -> account.deposit(-500), "Deposit");
		account.runTest(() -> account.withdraw(20000), "Withdrawal");
		account.runTest(() -> account.deposit(60000), "Deposit");
	
	}
				
}
