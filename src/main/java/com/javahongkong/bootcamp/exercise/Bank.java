package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts; // object reference
	private static long accountNumCount = 0L;

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<>();
	}

	@Override
	public Account getAccount(Long accountNumber) {
		// complete the function
		if (!(this.accounts.containsKey(accountNumber))) {
			throw new IllegalArgumentException("Invalid account number.");
		}
		return this.accounts.get(accountNumber);
	}

	@Override
	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		Account newCommercialAccount = new CommercialAccount(company, ++Bank.accountNumCount, pin, startingDeposit);
		this.accounts.put(Bank.accountNumCount, newCommercialAccount);
		return Bank.accountNumCount;
	}

	@Override
	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		Account newConsumerAccount = new ConsumerAccount(person, ++Bank.accountNumCount, pin, startingDeposit);
		this.accounts.put(Bank.accountNumCount, newConsumerAccount);
		return Bank.accountNumCount;
	}

	@Override
	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		if (this.accounts.get(accountNumber).getPin() == pin) {
			return true;
		}
		return false;
	}

	@Override
	public double getBalance(Long accountNumber) {
		// complete the function
		return this.accounts.get(accountNumber).getBalance();
	}

	@Override
	public void credit(Long accountNumber, double amount) {
		// complete the function
		this.getAccount(accountNumber).creditAccount(amount);
	}

	@Override
	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		if (this.accounts.get(accountNumber).getBalance() < amount) {
			return false;
		}
		return this.getAccount(accountNumber).debitAccount(amount);
	}
}
