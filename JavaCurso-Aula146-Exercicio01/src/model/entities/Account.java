package model.entities;

import model.exceptions.WithdrawExceptions;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	// constructors
	
	public Account(){		
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	// getters and setters

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	// methods
	
	// deposit method
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	// withdraw method
	
	public void withdraw(Double amount) throws WithdrawExceptions {
		if (amount > withdrawLimit) {
			throw new WithdrawExceptions("The ammount exceeds withdraw limit");
		} else if (amount > balance) {
			throw new WithdrawExceptions("Not enough balance");
		} else {
			balance -= amount;
		}
		
	}
	
	

}
