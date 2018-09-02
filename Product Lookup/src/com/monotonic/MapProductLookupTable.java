package com.monotonic;

import java.util.HashMap;
import java.util.Map;

public class MapProductLookupTable implements ProductLookupTable {

	private final Map<Integer, Product> idToProduct = new HashMap<>();

	@Override
	public Product lookupById(int id) {
		return idToProduct.get(id);
	}

	@Override
	public void addNewProduct(Product productToAdd) {

		if (idToProduct.containsKey(productToAdd.getId())) {
			throw new IllegalArgumentException("Element already present in list, can't add duplicates");
		}
		idToProduct.put(productToAdd.getId(), productToAdd);
	}

	@Override
	public void clear() {
		idToProduct.clear();
	}

}
