package com.monotonic;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProductCatalogue implements Iterable<Product> {

	private final SortedSet<Product> products = new TreeSet<>(Product.BY_WEIGHT);

	public void isSupplied(Supplier supplier) {
		products.addAll(supplier.getProducts());
	}

	@Override
	public Iterator<Product> iterator() {
		return products.iterator();
	}

	public Set<Product> lightVanProducts() {
		Product heaviestLightVanProduct = findheaviestLightVanProduct();
		return products.headSet(heaviestLightVanProduct);
	}

	public Set<Product> heavyVanProducts() {
		Product heaviestLightVanProduct = findheaviestLightVanProduct();
		return products.tailSet(heaviestLightVanProduct);
	}

	private Product findheaviestLightVanProduct() {

		for (Product product : products) {
			if (product.getWeight() > 20) {
				return product;
			}
		}
		return products.last();
	}

}
