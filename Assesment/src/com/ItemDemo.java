package com;

public class ItemDemo {
	
	public static Item getLeastPriceItem(Item[] itemArray) {
		
		if(itemArray == null)
			return null;
		
		if(itemArray.length == 0)
			return null;
		
		int itemIndex = 0;
		double minAmount = Double.MAX_VALUE;
		
		for(int itr = 0; itr < itemArray.length; itr++) {
			
			if(itemArray[itr] instanceof Item) {
				
				double tempAmount = itemArray[itr].getItemPrice() - ((itemArray[itr].getItemPrice() * itemArray[itr].getItemDiscount()) / 100);
				
				if(tempAmount < minAmount) {
					minAmount = tempAmount;
					itemIndex = itr;
				}
			}
		}
		
		return itemArray[itemIndex];
	}
		

	public static void main(String[] args) {
		
	}

}
