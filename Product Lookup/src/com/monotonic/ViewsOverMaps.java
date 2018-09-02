package com.monotonic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewsOverMaps {

	public static void main(String[] args) {

		final Map<Integer, Product> idToProducts = new HashMap<>();

		idToProducts.put(1, ProductFixtures.door);
		idToProducts.put(2, ProductFixtures.floor);
		idToProducts.put(3, ProductFixtures.window);

		final Set<Integer> ids = idToProducts.keySet();
		final Collection<Product> products = idToProducts.values();

		System.out.println(ids);
		System.out.println(products);
		System.out.println();

		ids.remove(1);
		products.remove(ProductFixtures.window);

		System.out.println(ids);
		System.out.println(products);
		System.out.println();

		Set<Map.Entry<Integer, Product>> entrySet = idToProducts.entrySet();
		System.out.println(entrySet.getClass().getName());
		System.out.println(entrySet);
		System.out.println();

		for (Map.Entry<Integer, Product> entry : entrySet) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
