package com.bea.test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BankAccount {
	
	Double balance = (double) 10000;
	static Double maxDepositAmount = (double) 50000;
	
	private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
	
	
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
		
		logger.info("Withdrawal requested: ₱{}", String.format("%.2f", amount));
		
		
			if (amount < 0) {
				logger.error("Invalid withdrawal amount: ₱{}", amount);
				throw new InvalidAmountException (String.format("Invalid withdrawal amount ₱{}", String.format("%.2f", amount)));
				
			} else if (amount > balance) {
				logger.warn("Insufficient funds: ₱{} available", String.format("%.2f", balance));
				throw new InsufficientFundsException("Insufficient funds for withdrawal", balance, amount);

			} else {
				this.balance -= amount;
				logger.info("Withdrawal completed: ₱{}, New balance: ₱{}", String.format("%.2f", amount), String.format("%.2f", balance));
			}
			
	}
	
	
	public void deposit(double amount) throws InvalidAmountException {
		
		logger.info("Deposit requested: ₱{}", String.format("%.2f", amount));
		
			if (amount <= 0) {
				logger.error("Invalid deposit amount: ₱{}", String.format("%.2f", amount));
				throw new InvalidAmountException ("Deposit amount must be positive");
				
			} else {
				
				if (amount > maxDepositAmount) {
					logger.warn("Large deposit: ₱{} - requires verification", String.format("%.2f", amount));
				}
				
				this.balance += amount;
				logger.info("Deposit completed: ₱{}, New balance: ₱{}", String.format("%.2f", amount), String.format("%.2f", balance));
			}
			
			
			
	}

	public void runTest(BankTestOperation operation, String operationName) {

		try {
			operation.execute();
			
			
		} catch (InvalidAmountException e) {
			logger.error("{} failed: {}", operationName, e.getMessage(), e);
		} catch (InsufficientFundsException e) {
			logger.error("{} failed: {}", operationName, e.getMessage(), e);
		} catch (Exception e) {
			logger.error("{} failed: {}", operationName, e.getMessage(), e);
		}
			
	}

	
	
	
	
}
