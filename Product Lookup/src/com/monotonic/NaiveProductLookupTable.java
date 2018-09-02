package com.monotonic;

import java.util.ArrayList;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable {

	private final List<Product> products = new ArrayList<>();

	@Override
	public Product lookupById(int id) {

		for (Product product : products) {
			if (product.getId() == id) {
				return product;
			}
		}

		return null;
	}

	@Override
	public void addNewProduct(Product productToAdd) {

		for (Product product : products) {
			if (product.getId() == productToAdd.getId()) {
				throw new IllegalArgumentException("Element already present in list, can't add duplicates");
			}
		}
		products.add(productToAdd);
	}

	@Override
	public void clear() {
		products.clear();
	}

}
