package com;

public class Customer {
	
	private int custId;
	private int accId;
	private double creditCardCharges;
	
	public Customer(int custId, int accId, double creditCardCharges) {
		this.custId = custId;
		this.accId = accId;
		this.creditCardCharges = creditCardCharges;
	}
	
	public int getCustId() {
		return this.custId;
	}
	
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	public int getAccId() {
		return this.accId;
	}
	
	public void setAccId(int accId) {
		this.accId = accId;
	}

	public double getCreditCardCharges() {
		return this.creditCardCharges;
	}
	
	public void setCreditCardCharges(double creditCardCharges) {
		this.creditCardCharges = creditCardCharges;
	}
	
}
