package com.bank.bnp;

public class BankAccount implements BankAccountSpecification {

		int balance;
		
	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		int deposit = balance + amount;
		System.out.println(deposit);
	}

	@Override
	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		
		return false;
	}

}
