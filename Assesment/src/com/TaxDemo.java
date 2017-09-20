package com;

public class TaxDemo {
	
	public static double calculateNetIncome(double totalSalary, double taxPercentage) {
		double incomeReduction = (totalSalary * taxPercentage) / 100;
		return (totalSalary - incomeReduction);
	}

	public static void main(String[] args) {

	}
	
}
