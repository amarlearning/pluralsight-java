package com;

public class Customers {
	
	private int custId;
	private char gender;
	private String name;
	private double age;
	
	public Customers(int custId, char gender, String name, double age) {
		super();
		this.custId = custId;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}
	
}
