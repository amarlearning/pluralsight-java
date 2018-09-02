package com.monotonic.test;

import com.monotonic.Product;
import com.monotonic.Supplier;

public class ProductFixtures {

	public static Product door = new Product("Wooden Door", 25);
	public static Product floor = new Product("Mapple Floor", 35);
	public static Product window = new Product("Glass Window", 10);

	public static Supplier bob = new Supplier("Bob");
	public static Supplier kane = new Supplier("Kane");

	static {

		bob.getProducts().add(door);
		bob.getProducts().add(floor);

		kane.getProducts().add(floor);
		kane.getProducts().add(window);

	}

}
