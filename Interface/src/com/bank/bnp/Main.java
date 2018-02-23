package com.bank.bnp;

public class Main {
	
	public static void main (String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(100);
		System.out.println(account.withdraw(100));
		System.out.println(account.withdraw(2000));
	}

}
