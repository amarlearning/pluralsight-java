package com.monotonic;

public class Product {

	private final int id;
	private final String name;
	private final int weight;

	public Product(int id, String name, int weight) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", weight=" + weight + "]";
	}
}
