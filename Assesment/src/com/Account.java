package com;

public class Account {
	
	private int accountId;
	private int coustmerId;
	private double balance;
	
	public Account(int coustmerId, double balance) {
		this.accountId = IDGenerator.id++;
		this.coustmerId = coustmerId;
		this.balance = balance;
	}
	
	public int getCoustmerId() {
		return this.coustmerId;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getAccountId() {
		return this.accountId;
	}
	
	public void setCoustmerId(int coustmerId) {
		this.coustmerId = coustmerId;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
