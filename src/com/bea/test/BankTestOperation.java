package com.bea.test;

@FunctionalInterface 
public interface BankTestOperation {

	public void execute() throws InvalidAmountException, InsufficientFundsException;
	
	
}
