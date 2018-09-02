package com.monotonic;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancement {

	public static void main(String[] args) {

		final Map<Integer, Product> idToProducts = new HashMap<>();

		idToProducts.put(1, ProductFixtures.door);
		idToProducts.put(2, ProductFixtures.floor);
		idToProducts.put(3, ProductFixtures.window);
	}

}
