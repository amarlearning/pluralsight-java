package com;

public class Car {
	
	private int regNo;
	private double milage;
	private int capacity;

	public Car(int regNo, double milage, int capacity) {
		super();
		this.regNo = regNo;
		this.milage = milage;
		this.capacity = capacity;
	}
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
}
