package com;

public class Item {

	private int itemId;
	private String itemName;
	private double itemPrice;
	private double itemDiscount;
	
	public Item(int itemId, String itemName, double itemPrice, double itemDiscount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemDiscount = itemDiscount;
	}
	
	public int getItemId() {
		return this.itemId;
	}
	
	public String getItemName() {
		return this.itemName;
	}
	
	public double getItemPrice() {
		return this.itemPrice;
	}
	
	public double getItemDiscount() {
		return this.itemDiscount;
	}
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public void setItemDiscount(double itemDiscount) {
		this.itemDiscount = itemDiscount;
	}
	
}
