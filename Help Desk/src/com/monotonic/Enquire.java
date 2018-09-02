package com.monotonic;

public class Enquire {

	public final Customer customer;
	public final Category category;
	
	public Enquire(final Customer customer, final Category category) {
		super();
		this.customer = customer;
		this.category = category;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Category getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Enquire [customer=" + customer + ", category=" + category + "]";
	}
}
