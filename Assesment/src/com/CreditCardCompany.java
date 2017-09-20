package com;

public class CreditCardCompany {
	
	public double getPaybackAmount(Customer C) {
		
		double paybackAmount = 0.0;
		double creditCardCharges = C.getCreditCardCharges();
		
		while(creditCardCharges > 0) {
			
			if(creditCardCharges > 0 && creditCardCharges <= 500) {
				
				paybackAmount += (0.25 * creditCardCharges) / 100;
				creditCardCharges -= creditCardCharges;
			}
			
			if (creditCardCharges > 500) {
				
				paybackAmount += (0.25 * 500) / 100;
				creditCardCharges -= 500;
				
			}
			
			if (creditCardCharges > 500 && creditCardCharges <= 1500) {
				
				paybackAmount += (0.50 * creditCardCharges) / 100;
				creditCardCharges -= creditCardCharges;
				
			}
			
			if (creditCardCharges > 1500 && creditCardCharges <= 2500) {
				
				paybackAmount += (0.75 * creditCardCharges) / 100;
				creditCardCharges -= creditCardCharges;
				
			}
			
			if (creditCardCharges > 2500) {
				
				paybackAmount += creditCardCharges / 100;
				creditCardCharges -= creditCardCharges;
				
			}
			
		}
		
		return paybackAmount;
	}
	
}
