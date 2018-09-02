package com.monotonic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

	private static final int LIGHT_VAN_MAX_WEIGHT = 20;

	private final int PRODUCT_NOT_PRESENT = -1;

	private List<Product> lightVanProducts;
	private List<Product> heavyVanProducts;

	private final List<Product> products = new ArrayList<>();

	public void addNewProduct(Product product) {
		products.add(product);
	}

	public void replaceProduct(Product oldProduct, Product newProduct) {
		final int index = products.indexOf(oldProduct);
		if (index != PRODUCT_NOT_PRESENT) {
			products.set(index, newProduct);
		}
	}

	public void prepare() {

		// sort the product
		products.sort(Product.BY_WEIGHT);
		// find the index to separate light and heavy product
		final int index = findSplitPoint();
		// assign products to respective list
		lightVanProducts = products.subList(0, index);
		heavyVanProducts = products.subList(index, products.size());
	}

	private int findSplitPoint() {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getWeight() > LIGHT_VAN_MAX_WEIGHT) {
				return i;
			}
		}
		return 0;
	}

	public List<Product> getLightVanProducts() {
		return lightVanProducts;
	}

	public List<Product> getHeavyVanProducts() {
		return heavyVanProducts;
	}

	@Override
	public Iterator<Product> iterator() {
		return products.iterator();
	}

}
