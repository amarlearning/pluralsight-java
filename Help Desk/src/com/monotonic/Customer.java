package com.monotonic;

public class Customer {

	private final String name;

	public Customer(final String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}

	public void reply(final String message) {
		System.out.printf("%s : %s\n", this.name, message);
	}

}
