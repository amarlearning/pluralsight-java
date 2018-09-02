package com.monotonic;

public interface ProductLookupTable {

	Product lookupById(int id);
	
	void addNewProduct(Product productToAdd);
	
	void clear();
}
